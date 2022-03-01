package com.example.practice5;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class database extends SQLiteOpenHelper {
    public database(Context context) {
        super(context, "sdata.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table student(name text,regid int primary key,dob text,section text,gender text)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("drop table if exists student");
    }
    public boolean sinsert(String name,int regid,String dob,String section,String gender)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("name",name);
        contentValues.put("regid",regid);
        contentValues.put("dob",dob);
        contentValues.put("section",section);
        contentValues.put("gender",gender);
        long res=db.insert("student",null,contentValues);
        if(res == -1)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    public boolean checkregid(String regid)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor cursor=db.rawQuery("select * from student where regid=?",new String[] {regid});
        if(cursor.getCount()>0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public Cursor cursor()
    {
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor cursor=db.rawQuery("select * from student",null);
        return cursor;
    }
    public Cursor getdetails(String regid)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor cursor=db.rawQuery("select * from student where regid=?",new String[] {regid});
        return cursor;
    }
}
