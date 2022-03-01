package com.example.practice5;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class sem_3 extends SQLiteOpenHelper {
    public sem_3(Context context) {
        super(context, "sem_3.db", null, 6);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table s3english(regid int primary key,internal int,external int)");
        db.execSQL("create table s3telugu(regid int primary key,internal int,external int)");
        db.execSQL("create table s3physics(regid int primary key,internal int,external int)");
        db.execSQL("create table s3maths(regid int primary key,internal int,external int)");
        db.execSQL("create table s3computerscience(regid int primary key,internal int,external int)");
        db.execSQL("create table s3computersciencep(regid int primary key,internal int,external int)");
        db.execSQL("create table s3physicsp(regid int primary key,internal int,external int)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("drop table if exists s3english");
        db.execSQL("drop table if exists s3telugu");
        db.execSQL("drop table if exists s3physics");
        db.execSQL("drop table if exists s3maths");
        db.execSQL("drop table if exists s3computerscience");
        db.execSQL("drop table if exists s3computersciencep");
        db.execSQL("drop table if exists s3physicsp");
        onCreate(db);
    }
    public boolean s3insert(int regid,int internal,int external)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("regid",regid);
        contentValues.put("internal",internal);
        contentValues.put("external",external);
        long res=db.insert("s3english",null,contentValues);
        if(res == -1)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    public boolean s3eupdate(String regid,int internal,int external)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("internal",internal);
        contentValues.put("external",external);
        Cursor cursor=db.rawQuery("select * from s3english where regid=?",new String[] {regid});
        if(cursor.getCount() > 0)
        {
            long res=db.update("s3english",contentValues,"regid=?",new String[] {regid});
            if(res == -1)
            {
                return false;
            }
            else
            {
                return true;
            }
        }
        else {
            return false;
        }
    }
    public Cursor s3eresult(String regid) {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery("select internal,external from s3english where regid=?", new String[]{regid});
        return cursor;
    }
    public boolean s3tinsert(int regid,int internal,int external)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("regid",regid);
        contentValues.put("internal",internal);
        contentValues.put("external",external);
        long res=db.insert("s3telugu",null,contentValues);
        if(res == -1)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    public boolean s3tupdate(String regid,int internal,int external)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("internal",internal);
        contentValues.put("external",external);
        Cursor cursor=db.rawQuery("select * from s3telugu where regid=?",new String[] {regid});
        if(cursor.getCount() > 0)
        {
            long res=db.update("s3telugu",contentValues,"regid=?",new String[] {regid});
            if(res == -1)
            {
                return false;
            }
            else
            {
                return true;
            }
        }
        else {
            return false;
        }
    }
    public Cursor s3tresult(String regid)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor cursor1=db.rawQuery("select internal,external from s3telugu where regid=?",new String[] {regid});
        return cursor1;
    }
    public boolean s3pinsert(int regid,int internal,int external)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("regid",regid);
        contentValues.put("internal",internal);
        contentValues.put("external",external);
        long res=db.insert("s3physics",null,contentValues);
        if(res == -1)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    public boolean s3pupdate(String regid,int internal,int external)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("internal",internal);
        contentValues.put("external",external);
        Cursor cursor=db.rawQuery("select * from s3physics where regid=?",new String[] {regid});
        if(cursor.getCount() > 0)
        {
            long res=db.update("s3physics",contentValues,"regid=?",new String[] {regid});
            if(res == -1)
            {
                return false;
            }
            else
            {
                return true;
            }
        }
        else {
            return false;
        }
    }
    public Cursor s3presult(String regid)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor cursor1=db.rawQuery("select internal,external from s3physics where regid=?",new String[] {regid});
        return cursor1;
    }
    public boolean s3minsert(int regid,int internal,int external)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("regid",regid);
        contentValues.put("internal",internal);
        contentValues.put("external",external);
        long res=db.insert("s3maths",null,contentValues);
        if(res == -1)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    public boolean s3mupdate(String regid,int internal,int external)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("internal",internal);
        contentValues.put("external",external);
        Cursor cursor=db.rawQuery("select * from s3maths where regid=?",new String[] {regid});
        if(cursor.getCount() > 0)
        {
            long res=db.update("s3maths",contentValues,"regid=?",new String[] {regid});
            if(res == -1)
            {
                return false;
            }
            else
            {
                return true;
            }
        }
        else {
            return false;
        }
    }
    public Cursor s3mresult(String regid)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor cursor1=db.rawQuery("select internal,external from s3maths where regid=?",new String[] {regid});
        return cursor1;
    }
    public boolean s3cinsert(int regid,int internal,int external)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("regid",regid);
        contentValues.put("internal",internal);
        contentValues.put("external",external);
        long res=db.insert("s3computerscience",null,contentValues);
        if(res == -1)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    public boolean s3cupdate(String regid,int internal,int external)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("internal",internal);
        contentValues.put("external",external);
        Cursor cursor=db.rawQuery("select * from s3computerscience where regid=?",new String[] {regid});
        if(cursor.getCount() > 0)
        {
            long res=db.update("s3computerscience",contentValues,"regid=?",new String[] {regid});
            if(res == -1)
            {
                return false;
            }
            else
            {
                return true;
            }
        }
        else {
            return false;
        }
    }
    public Cursor s3cresult(String regid)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor cursor1=db.rawQuery("select internal,external from s3computerscience where regid=?",new String[] {regid});
        return cursor1;
    }
    public boolean s3cpinsert(int regid,int internal,int external)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("regid",regid);
        contentValues.put("internal",internal);
        contentValues.put("external",external);
        long res=db.insert("s3computersciencep",null,contentValues);
        if(res == -1)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    public boolean s3cpupdate(String regid,int internal,int external)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("internal",internal);
        contentValues.put("external",external);
        Cursor cursor=db.rawQuery("select * from s3computersciencep where regid=?",new String[] {regid});
        if(cursor.getCount() > 0)
        {
            long res=db.update("s3computersciencep",contentValues,"regid=?",new String[] {regid});
            if(res == -1)
            {
                return false;
            }
            else
            {
                return true;
            }
        }
        else {
            return false;
        }
    }
    public Cursor s3cpresult(String regid)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor cursor1=db.rawQuery("select internal,external from s3computersciencep where regid=?",new String[] {regid});
        return cursor1;
    }
    public boolean s3ppinsert(int regid,int internal,int external)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("regid",regid);
        contentValues.put("internal",internal);
        contentValues.put("external",external);
        long res=db.insert("s3physicsp",null,contentValues);
        if(res == -1)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    public boolean s3ppupdate(String regid,int internal,int external)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("internal",internal);
        contentValues.put("external",external);
        Cursor cursor=db.rawQuery("select * from s3physicsp where regid=?",new String[] {regid});
        if(cursor.getCount() > 0)
        {
            long res=db.update("s3physicsp",contentValues,"regid=?",new String[] {regid});
            if(res == -1)
            {
                return false;
            }
            else
            {
                return true;
            }
        }
        else {
            return false;
        }
    }
    public Cursor s3ppresult(String regid)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor cursor1=db.rawQuery("select internal,external from s3physicsp where regid=?",new String[] {regid});
        return cursor1;
    }
}
