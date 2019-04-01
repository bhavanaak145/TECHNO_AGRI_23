package com.example.shagun.techno_agri_23;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {

    public  static  final  String DATABASE_NAME="Technoagri.db";
    public  static  final  String TABLE_NAME="registeruser";

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 1); }
    public  static  final  String COL_1="ID";
    public  static  final  String COL_2="Username";
    public  static  final  String COL_3="Password";

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        sqLiteDatabase.execSQL("CREATE TABLE registeruser (ID INTEGER PRIMARY KEY AUTOINCREMENT,Username TEXT, Password TEXT)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

        sqLiteDatabase.execSQL(" DROP TABLE IF EXISTS " + TABLE_NAME );
        onCreate(sqLiteDatabase);

    }

    public long adduser(String user, String  pass)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("Username",user);
        contentValues.put("Password",pass);

        long res = db.insert("registeruser", null, contentValues);

        db.close();
        return  res;
    }


    public boolean chkuser( String Username, String Password)
    {

        String[] columns  =  { COL_1 };
        SQLiteDatabase db = getReadableDatabase();
        String selection =  COL_2 + "=?" + " and " + COL_3 + "=?";
        String[] selectionArgs = { Username, Password };

        Cursor cursor = db.query(TABLE_NAME,columns,selection,selectionArgs,null,null,null);

        int count = cursor.getCount();
        cursor.close();
        db.close();


        if(count > 0)
            return  true;
        else
            return  false;

    }


}
