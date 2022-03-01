package com.example.practice5;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class sem_1 extends SQLiteOpenHelper {
    public sem_1(Context context) {
        super(context, "resultdata.db", null, 6);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table english(regid int primary key,internal int,external int)");
        db.execSQL("create table telugu(regid int primary key,internal int,external int)");
        db.execSQL("create table physics(regid int primary key,internal int,external int)");
        db.execSQL("create table maths(regid int primary key,internal int,external int)");
        db.execSQL("create table computerscience(regid int primary key,internal int,external int)");
        db.execSQL("create table computersciencep(regid int primary key,internal int,external int)");
        db.execSQL("create table physicsp(regid int primary key,internal int,external int)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("drop table if exists english");
        db.execSQL("drop table if exists telugu");
        db.execSQL("drop table if exists physics");
        db.execSQL("drop table if exists maths");
        db.execSQL("drop table if exists computerscience");
        db.execSQL("drop table if exists computersciencep");
        db.execSQL("drop table if exists physicsp");
        onCreate(db);
    }
    public boolean insert(int regid,int internal,int external)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("regid",regid);
        contentValues.put("internal",internal);
        contentValues.put("external",external);
        long res=db.insert("english",null,contentValues);
        if(res == -1)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    public boolean eupdate(String regid,int internal,int external)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("internal",internal);
        contentValues.put("external",external);
        Cursor cursor=db.rawQuery("select * from english where regid=?",new String[] {regid});
        if(cursor.getCount() > 0)
        {
            long res=db.update("english",contentValues,"regid=?",new String[] {regid});
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
    public Cursor eresult(String regid)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor cursor=db.rawQuery("select internal,external from english where regid=?",new String[] {regid});
        return cursor;
    }
    public boolean tinsert(int regid,int internal,int external)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("regid",regid);
        contentValues.put("internal",internal);
        contentValues.put("external",external);
        long res=db.insert("telugu",null,contentValues);
        if(res == -1)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    public boolean tupdate(String regid,int internal,int external)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("internal",internal);
        contentValues.put("external",external);
        Cursor cursor=db.rawQuery("select * from telugu where regid=?",new String[] {regid});
        if(cursor.getCount() > 0)
        {
            long res=db.update("telugu",contentValues,"regid=?",new String[] {regid});
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
    public Cursor tresult(String regid)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor cursor1=db.rawQuery("select internal,external from telugu where regid=?",new String[] {regid});
        return cursor1;
    }
    public boolean pinsert(int regid,int internal,int external)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("regid",regid);
        contentValues.put("internal",internal);
        contentValues.put("external",external);
        long res=db.insert("physics",null,contentValues);
        if(res == -1)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    public boolean pupdate(String regid,int internal,int external)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("internal",internal);
        contentValues.put("external",external);
        Cursor cursor=db.rawQuery("select * from physics where regid=?",new String[] {regid});
        if(cursor.getCount() > 0)
        {
            long res=db.update("physics",contentValues,"regid=?",new String[] {regid});
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
    public Cursor presult(String regid)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor cursor1=db.rawQuery("select internal,external from physics where regid=?",new String[] {regid});
        return cursor1;
    }
    public boolean minsert(int regid,int internal,int external)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("regid",regid);
        contentValues.put("internal",internal);
        contentValues.put("external",external);
        long res=db.insert("maths",null,contentValues);
        if(res == -1)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    public boolean mupdate(String regid,int internal,int external)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("internal",internal);
        contentValues.put("external",external);
        Cursor cursor=db.rawQuery("select * from maths where regid=?",new String[] {regid});
        if(cursor.getCount() > 0)
        {
            long res=db.update("maths",contentValues,"regid=?",new String[] {regid});
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
    public Cursor mresult(String regid)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor cursor1=db.rawQuery("select internal,external from maths where regid=?",new String[] {regid});
        return cursor1;
    }
    public boolean cinsert(int regid,int internal,int external)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("regid",regid);
        contentValues.put("internal",internal);
        contentValues.put("external",external);
        long res=db.insert("computerscience",null,contentValues);
        if(res == -1)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    public boolean cupdate(String regid,int internal,int external)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("internal",internal);
        contentValues.put("external",external);
        Cursor cursor=db.rawQuery("select * from computerscience where regid=?",new String[] {regid});
        if(cursor.getCount() > 0)
        {
            long res=db.update("computerscience",contentValues,"regid=?",new String[] {regid});
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
    public Cursor cresult(String regid)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor cursor1=db.rawQuery("select internal,external from computerscience where regid=?",new String[] {regid});
        return cursor1;
    }
    public boolean cpinsert(int regid,int internal,int external)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("regid",regid);
        contentValues.put("internal",internal);
        contentValues.put("external",external);
        long res=db.insert("computersciencep",null,contentValues);
        if(res == -1)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    public boolean cpupdate(String regid,int internal,int external)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("internal",internal);
        contentValues.put("external",external);
        Cursor cursor=db.rawQuery("select * from computersciencep where regid=?",new String[] {regid});
        if(cursor.getCount() > 0)
        {
            long res=db.update("computersciencep",contentValues,"regid=?",new String[] {regid});
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
    public Cursor cpresult(String regid)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor cursor1=db.rawQuery("select internal,external from computersciencep where regid=?",new String[] {regid});
        return cursor1;
    }
    public boolean ppinsert(int regid,int internal,int external)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("regid",regid);
        contentValues.put("internal",internal);
        contentValues.put("external",external);
        long res=db.insert("physicsp",null,contentValues);
        if(res == -1)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    public boolean ppupdate(String regid,int internal,int external)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("internal",internal);
        contentValues.put("external",external);
        Cursor cursor=db.rawQuery("select * from physicsp where regid=?",new String[] {regid});
        if(cursor.getCount() > 0)
        {
            long res=db.update("physicsp",contentValues,"regid=?",new String[] {regid});
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
    public Cursor ppresult(String regid)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor cursor1=db.rawQuery("select internal,external from physicsp where regid=?",new String[] {regid});
        return cursor1;
    }
}
