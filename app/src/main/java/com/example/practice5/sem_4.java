package com.example.practice5;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class sem_4 extends SQLiteOpenHelper {
    public sem_4(Context context) {
        super(context, "sem_4.db", null, 6);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table s4english(regid int primary key,internal int,external int)");
        db.execSQL("create table s4telugu(regid int primary key,internal int,external int)");
        db.execSQL("create table s4physics(regid int primary key,internal int,external int)");
        db.execSQL("create table s4maths(regid int primary key,internal int,external int)");
        db.execSQL("create table s4computerscience(regid int primary key,internal int,external int)");
        db.execSQL("create table s4computersciencep(regid int primary key,internal int,external int)");
        db.execSQL("create table s4physicsp(regid int primary key,internal int,external int)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("drop table if exists s4english");
        db.execSQL("drop table if exists s4telugu");
        db.execSQL("drop table if exists s4physics");
        db.execSQL("drop table if exists s4maths");
        db.execSQL("drop table if exists s4computerscience");
        db.execSQL("drop table if exists s4computersciencep");
        db.execSQL("drop table if exists s4physicsp");
        onCreate(db);
    }
    public boolean s4insert(int regid,int internal,int external)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("regid",regid);
        contentValues.put("internal",internal);
        contentValues.put("external",external);
        long res=db.insert("s4english",null,contentValues);
        if(res == -1)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    public boolean s4eupdate(String regid,int internal,int external)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("internal",internal);
        contentValues.put("external",external);
        Cursor cursor=db.rawQuery("select * from s4english where regid=?",new String[] {regid});
        if(cursor.getCount() > 0)
        {
            long res=db.update("s4english",contentValues,"regid=?",new String[] {regid});
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
    public Cursor s4eresult(String regid) {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery("select internal,external from s4english where regid=?", new String[]{regid});
        return cursor;
    }
    public boolean s4tinsert(int regid,int internal,int external)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("regid",regid);
        contentValues.put("internal",internal);
        contentValues.put("external",external);
        long res=db.insert("s4telugu",null,contentValues);
        if(res == -1)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    public boolean s4tupdate(String regid,int internal,int external)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("internal",internal);
        contentValues.put("external",external);
        Cursor cursor=db.rawQuery("select * from s4telugu where regid=?",new String[] {regid});
        if(cursor.getCount() > 0)
        {
            long res=db.update("s4telugu",contentValues,"regid=?",new String[] {regid});
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
    public Cursor s4tresult(String regid)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor cursor1=db.rawQuery("select internal,external from s4telugu where regid=?",new String[] {regid});
        return cursor1;
    }
    public boolean s4pinsert(int regid,int internal,int external)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("regid",regid);
        contentValues.put("internal",internal);
        contentValues.put("external",external);
        long res=db.insert("s4physics",null,contentValues);
        if(res == -1)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    public boolean s4pupdate(String regid,int internal,int external)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("internal",internal);
        contentValues.put("external",external);
        Cursor cursor=db.rawQuery("select * from s4physics where regid=?",new String[] {regid});
        if(cursor.getCount() > 0)
        {
            long res=db.update("s4physics",contentValues,"regid=?",new String[] {regid});
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
    public Cursor s4presult(String regid)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor cursor1=db.rawQuery("select internal,external from s4physics where regid=?",new String[] {regid});
        return cursor1;
    }
    public boolean s4minsert(int regid,int internal,int external)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("regid",regid);
        contentValues.put("internal",internal);
        contentValues.put("external",external);
        long res=db.insert("s4maths",null,contentValues);
        if(res == -1)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    public boolean s4mupdate(String regid,int internal,int external)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("internal",internal);
        contentValues.put("external",external);
        Cursor cursor=db.rawQuery("select * from s4maths where regid=?",new String[] {regid});
        if(cursor.getCount() > 0)
        {
            long res=db.update("s4maths",contentValues,"regid=?",new String[] {regid});
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
    public Cursor s4mresult(String regid)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor cursor1=db.rawQuery("select internal,external from s4maths where regid=?",new String[] {regid});
        return cursor1;
    }
    public boolean s4cinsert(int regid,int internal,int external)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("regid",regid);
        contentValues.put("internal",internal);
        contentValues.put("external",external);
        long res=db.insert("s4computerscience",null,contentValues);
        if(res == -1)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    public boolean s4cupdate(String regid,int internal,int external)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("internal",internal);
        contentValues.put("external",external);
        Cursor cursor=db.rawQuery("select * from s4computerscience where regid=?",new String[] {regid});
        if(cursor.getCount() > 0)
        {
            long res=db.update("s4computerscience",contentValues,"regid=?",new String[] {regid});
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
    public Cursor s4cresult(String regid)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor cursor1=db.rawQuery("select internal,external from s4computerscience where regid=?",new String[] {regid});
        return cursor1;
    }
    public boolean s4cpinsert(int regid,int internal,int external)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("regid",regid);
        contentValues.put("internal",internal);
        contentValues.put("external",external);
        long res=db.insert("s4computersciencep",null,contentValues);
        if(res == -1)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    public boolean s4cpupdate(String regid,int internal,int external)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("internal",internal);
        contentValues.put("external",external);
        Cursor cursor=db.rawQuery("select * from s4computersciencep where regid=?",new String[] {regid});
        if(cursor.getCount() > 0)
        {
            long res=db.update("s4computersciencep",contentValues,"regid=?",new String[] {regid});
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
    public Cursor s4cpresult(String regid)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor cursor1=db.rawQuery("select internal,external from s4computersciencep where regid=?",new String[] {regid});
        return cursor1;
    }
    public boolean s4ppinsert(int regid,int internal,int external)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("regid",regid);
        contentValues.put("internal",internal);
        contentValues.put("external",external);
        long res=db.insert("s4physicsp",null,contentValues);
        if(res == -1)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    public boolean s4ppupdate(String regid,int internal,int external)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("internal",internal);
        contentValues.put("external",external);
        Cursor cursor=db.rawQuery("select * from s4physicsp where regid=?",new String[] {regid});
        if(cursor.getCount() > 0)
        {
            long res=db.update("s4physicsp",contentValues,"regid=?",new String[] {regid});
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
    public Cursor s4ppresult(String regid)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor cursor1=db.rawQuery("select internal,external from s4physicsp where regid=?",new String[] {regid});
        return cursor1;
    }
}
