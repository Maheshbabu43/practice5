package com.example.practice5;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class sem_2 extends SQLiteOpenHelper {
    public sem_2(Context context) {
        super(context, "sem2.db", null, 6);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table s2english(regid int primary key,internal int,external int)");
        db.execSQL("create table s2telugu(regid int primary key,internal int,external int)");
        db.execSQL("create table s2physics(regid int primary key,internal int,external int)");
        db.execSQL("create table s2maths(regid int primary key,internal int,external int)");
        db.execSQL("create table s2computerscience(regid int primary key,internal int,external int)");
        db.execSQL("create table s2computersciencep(regid int primary key,internal int,external int)");
        db.execSQL("create table s2physicsp(regid int primary key,internal int,external int)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("drop table if exists s2english");
        db.execSQL("drop table if exists s2telugu");
        db.execSQL("drop table if exists s2physics");
        db.execSQL("drop table if exists s2maths");
        db.execSQL("drop table if exists s2computerscience");
        db.execSQL("drop table if exists s2computersciencep");
        db.execSQL("drop table if exists s2physicsp");
        onCreate(db);
    }
    public boolean s2insert(int regid,int internal,int external)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("regid",regid);
        contentValues.put("internal",internal);
        contentValues.put("external",external);
        long res=db.insert("s2english",null,contentValues);
        if(res == -1)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    public boolean s2eupdate(String regid,int internal,int external)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("internal",internal);
        contentValues.put("external",external);
        Cursor cursor=db.rawQuery("select * from s2english where regid=?",new String[] {regid});
        if(cursor.getCount() > 0)
        {
            long res=db.update("s2english",contentValues,"regid=?",new String[] {regid});
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
    public Cursor s2eresult(String regid) {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery("select internal,external from s2english where regid=?", new String[]{regid});
        return cursor;
    }
    public boolean s2tinsert(int regid,int internal,int external)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("regid",regid);
        contentValues.put("internal",internal);
        contentValues.put("external",external);
        long res=db.insert("s2telugu",null,contentValues);
        if(res == -1)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    public boolean s2tupdate(String regid,int internal,int external)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("internal",internal);
        contentValues.put("external",external);
        Cursor cursor=db.rawQuery("select * from s2telugu where regid=?",new String[] {regid});
        if(cursor.getCount() > 0)
        {
            long res=db.update("s2telugu",contentValues,"regid=?",new String[] {regid});
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
    public Cursor s2tresult(String regid)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor cursor1=db.rawQuery("select internal,external from s2telugu where regid=?",new String[] {regid});
        return cursor1;
    }
    public boolean s2pinsert(int regid,int internal,int external)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("regid",regid);
        contentValues.put("internal",internal);
        contentValues.put("external",external);
        long res=db.insert("s2physics",null,contentValues);
        if(res == -1)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    public boolean s2pupdate(String regid,int internal,int external)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("internal",internal);
        contentValues.put("external",external);
        Cursor cursor=db.rawQuery("select * from s2physics where regid=?",new String[] {regid});
        if(cursor.getCount() > 0)
        {
            long res=db.update("s2physics",contentValues,"regid=?",new String[] {regid});
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
    public Cursor s2presult(String regid)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor cursor1=db.rawQuery("select internal,external from s2physics where regid=?",new String[] {regid});
        return cursor1;
    }
    public boolean s2minsert(int regid,int internal,int external)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("regid",regid);
        contentValues.put("internal",internal);
        contentValues.put("external",external);
        long res=db.insert("s2maths",null,contentValues);
        if(res == -1)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    public boolean s2mupdate(String regid,int internal,int external)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("internal",internal);
        contentValues.put("external",external);
        Cursor cursor=db.rawQuery("select * from s2maths where regid=?",new String[] {regid});
        if(cursor.getCount() > 0)
        {
            long res=db.update("s2maths",contentValues,"regid=?",new String[] {regid});
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
    public Cursor s2mresult(String regid)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor cursor1=db.rawQuery("select internal,external from s2maths where regid=?",new String[] {regid});
        return cursor1;
    }
    public boolean s2cinsert(int regid,int internal,int external)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("regid",regid);
        contentValues.put("internal",internal);
        contentValues.put("external",external);
        long res=db.insert("s2computerscience",null,contentValues);
        if(res == -1)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    public boolean s2cupdate(String regid,int internal,int external)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("internal",internal);
        contentValues.put("external",external);
        Cursor cursor=db.rawQuery("select * from s2computerscience where regid=?",new String[] {regid});
        if(cursor.getCount() > 0)
        {
            long res=db.update("s2computerscience",contentValues,"regid=?",new String[] {regid});
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
    public Cursor s2cresult(String regid)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor cursor1=db.rawQuery("select internal,external from s2computerscience where regid=?",new String[] {regid});
        return cursor1;
    }
    public boolean s2cpinsert(int regid,int internal,int external)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("regid",regid);
        contentValues.put("internal",internal);
        contentValues.put("external",external);
        long res=db.insert("s2computersciencep",null,contentValues);
        if(res == -1)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    public boolean s2cpupdate(String regid,int internal,int external)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("internal",internal);
        contentValues.put("external",external);
        Cursor cursor=db.rawQuery("select * from s2computersciencep where regid=?",new String[] {regid});
        if(cursor.getCount() > 0)
        {
            long res=db.update("s2computersciencep",contentValues,"regid=?",new String[] {regid});
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
    public Cursor s2cpresult(String regid)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor cursor1=db.rawQuery("select internal,external from s2computersciencep where regid=?",new String[] {regid});
        return cursor1;
    }
    public boolean s2ppinsert(int regid,int internal,int external)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("regid",regid);
        contentValues.put("internal",internal);
        contentValues.put("external",external);
        long res=db.insert("s2physicsp",null,contentValues);
        if(res == -1)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    public boolean s2ppupdate(String regid,int internal,int external)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("internal",internal);
        contentValues.put("external",external);
        Cursor cursor=db.rawQuery("select * from s2physicsp where regid=?",new String[] {regid});
        if(cursor.getCount() > 0)
        {
            long res=db.update("s2physicsp",contentValues,"regid=?",new String[] {regid});
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
    public Cursor s2ppresult(String regid)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor cursor1=db.rawQuery("select internal,external from s2physicsp where regid=?",new String[] {regid});
        return cursor1;
    }
}
