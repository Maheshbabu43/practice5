package com.example.practice5;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class sem_5 extends SQLiteOpenHelper {
    public sem_5(Context context) {
        super(context, "sem5.db", null, 9);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table s5mathsp1(regid int primary key,internal int,external int)");
        db.execSQL("create table s5mathsp2(regid int primary key,internal int,external int)");
        db.execSQL("create table s5physicsp1(regid int primary key,internal int,external int)");
        db.execSQL("create table s5physicsp2(regid int primary key,internal int,external int)");
        db.execSQL("create table s5computersciencep1(regid int primary key,internal int,external int)");
        db.execSQL("create table s5computersciencep2(regid int primary key,internal int,external int)");
        db.execSQL("create table s5computersciencepp1(regid int primary key,internal int,external int)");
        db.execSQL("create table s5computersciencepp2(regid int primary key,internal int,external int)");
        db.execSQL("create table s5physicspp1(regid int primary key,internal int,external int)");
        db.execSQL("create table s5physicspp2(regid int primary key,internal int,external int)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("drop table if exists s5mathsp1");
        db.execSQL("drop table if exists s5mathsp2");
        db.execSQL("drop table if exists s5physicsp1");
        db.execSQL("drop table if exists s5physicsp2");
        db.execSQL("drop table if exists s5computersciencep1");
        db.execSQL("drop table if exists s5computersciencep2");
        db.execSQL("drop table if exists s5physicspp1");
        db.execSQL("drop table if exists s5physicspp2");
        db.execSQL("drop table if exists s5computersciencepp1");
        db.execSQL("drop table if exists s5computersciencepp2");
        onCreate(db);
    }
    public boolean s5minsertp1(int regid,int internal,int external)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("regid",regid);
        contentValues.put("internal",internal);
        contentValues.put("external",external);
        long res=db.insert("s5mathsp1",null,contentValues);
        if(res == -1)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    public boolean s5mupdatep1(String regid,int internal,int external)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("internal",internal);
        contentValues.put("external",external);
        Cursor cursor=db.rawQuery("select * from s5mathsp1 where regid=?",new String[] {regid});
        if(cursor.getCount() > 0)
        {
            long res=db.update("s5mathsp1",contentValues,"regid=?",new String[] {regid});
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
    public Cursor s5mresultp1(String regid) {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery("select internal,external from s5mathsp1 where regid=?", new String[]{regid});
        return cursor;
    }
    public boolean s5minsertp2(int regid,int internal,int external)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("regid",regid);
        contentValues.put("internal",internal);
        contentValues.put("external",external);
        long res=db.insert("s5mathsp2",null,contentValues);
        if(res == -1)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    public boolean s5mupdatep2(String regid,int internal,int external)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("internal",internal);
        contentValues.put("external",external);
        Cursor cursor=db.rawQuery("select * from s5mathsp2 where regid=?",new String[] {regid});
        if(cursor.getCount() > 0)
        {
            long res=db.update("s5mathsp2",contentValues,"regid=?",new String[] {regid});
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
    public Cursor s5mresultp2(String regid) {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery("select internal,external from s5mathsp2 where regid=?", new String[]{regid});
        return cursor;
    }
    public boolean s5pinsertp1(int regid,int internal,int external)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("regid",regid);
        contentValues.put("internal",internal);
        contentValues.put("external",external);
        long res=db.insert("s5physicsp1",null,contentValues);
        if(res == -1)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    public boolean s5pupdatep1(String regid,int internal,int external)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("internal",internal);
        contentValues.put("external",external);
        Cursor cursor=db.rawQuery("select * from s5physicsp1 where regid=?",new String[] {regid});
        if(cursor.getCount() > 0)
        {
            long res=db.update("s5physicsp1",contentValues,"regid=?",new String[] {regid});
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
    public Cursor s5presultp1(String regid)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor cursor1=db.rawQuery("select internal,external from s5physicsp1 where regid=?",new String[] {regid});
        return cursor1;
    }
    public boolean s5pinsertp2(int regid,int internal,int external)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("regid",regid);
        contentValues.put("internal",internal);
        contentValues.put("external",external);
        long res=db.insert("s5physicsp2",null,contentValues);
        if(res == -1)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    public boolean s5pupdatep2(String regid,int internal,int external)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("internal",internal);
        contentValues.put("external",external);
        Cursor cursor=db.rawQuery("select * from s5physicsp2 where regid=?",new String[] {regid});
        if(cursor.getCount() > 0)
        {
            long res=db.update("s5physicsp2",contentValues,"regid=?",new String[] {regid});
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
    public Cursor s5presultp2(String regid)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor cursor1=db.rawQuery("select internal,external from s5physicsp2 where regid=?",new String[] {regid});
        return cursor1;
    }
    public boolean s5cinsertp1(int regid,int internal,int external)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("regid",regid);
        contentValues.put("internal",internal);
        contentValues.put("external",external);
        long res=db.insert("s5computersciencep1",null,contentValues);
        if(res == -1)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    public boolean s5cupdatep1(String regid,int internal,int external)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("internal",internal);
        contentValues.put("external",external);
        Cursor cursor=db.rawQuery("select * from s5computersciencep1 where regid=?",new String[] {regid});
        if(cursor.getCount() > 0)
        {
            long res=db.update("s5computersciencep1",contentValues,"regid=?",new String[] {regid});
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
    public Cursor s5cresultp1(String regid)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor cursor1=db.rawQuery("select internal,external from s5computersciencep1 where regid=?",new String[] {regid});
        return cursor1;
    }
    public boolean s5cinsertp2(int regid,int internal,int external)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("regid",regid);
        contentValues.put("internal",internal);
        contentValues.put("external",external);
        long res=db.insert("s5computersciencep2",null,contentValues);
        if(res == -1)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    public boolean s5cupdatep2(String regid,int internal,int external)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("internal",internal);
        contentValues.put("external",external);
        Cursor cursor=db.rawQuery("select * from s5computersciencep2 where regid=?",new String[] {regid});
        if(cursor.getCount() > 0)
        {
            long res=db.update("s5computersciencep2",contentValues,"regid=?",new String[] {regid});
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
    public Cursor s5cresultp2(String regid)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor cursor1=db.rawQuery("select internal,external from s5computersciencep2 where regid=?",new String[] {regid});
        return cursor1;
    }
    public boolean s5pinsertpp1(int regid,int internal,int external)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("regid",regid);
        contentValues.put("internal",internal);
        contentValues.put("external",external);
        long res=db.insert("s5physicspp1",null,contentValues);
        if(res == -1)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    public boolean s5pupdatepp1(String regid,int internal,int external)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("internal",internal);
        contentValues.put("external",external);
        Cursor cursor=db.rawQuery("select * from s5physicspp1 where regid=?",new String[] {regid});
        if(cursor.getCount() > 0)
        {
            long res=db.update("s5physicspp1",contentValues,"regid=?",new String[] {regid});
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
    public Cursor s5presultpp1(String regid)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor cursor1=db.rawQuery("select internal,external from s5physicspp1 where regid=?",new String[] {regid});
        return cursor1;
    }
    public boolean s5pinsertpp2(int regid,int internal,int external)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("regid",regid);
        contentValues.put("internal",internal);
        contentValues.put("external",external);
        long res=db.insert("s5physicspp2",null,contentValues);
        if(res == -1)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    public boolean s5pupdatepp2(String regid,int internal,int external)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("internal",internal);
        contentValues.put("external",external);
        Cursor cursor=db.rawQuery("select * from s5physicspp2 where regid=?",new String[] {regid});
        if(cursor.getCount() > 0)
        {
            long res=db.update("s5physicspp2",contentValues,"regid=?",new String[] {regid});
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
    public Cursor s5presultpp2(String regid)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor cursor1=db.rawQuery("select internal,external from s5physicspp2 where regid=?",new String[] {regid});
        return cursor1;
    }
    public boolean s5cinsertpp1(int regid,int internal,int external)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("regid",regid);
        contentValues.put("internal",internal);
        contentValues.put("external",external);
        long res=db.insert("s5computersciencepp1",null,contentValues);
        if(res == -1)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    public boolean s5cupdatepp1(String regid,int internal,int external)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("internal",internal);
        contentValues.put("external",external);
        Cursor cursor=db.rawQuery("select * from s5computersciencepp1 where regid=?",new String[] {regid});
        if(cursor.getCount() > 0)
        {
            long res=db.update("s5computersciencepp1",contentValues,"regid=?",new String[] {regid});
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
    public Cursor s5cresultpp1(String regid)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor cursor1=db.rawQuery("select internal,external from s5computersciencepp1 where regid=?",new String[] {regid});
        return cursor1;
    }
    public boolean s5cinsertpp2(int regid,int internal,int external)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("regid",regid);
        contentValues.put("internal",internal);
        contentValues.put("external",external);
        long res=db.insert("s5computersciencepp2",null,contentValues);
        if(res == -1)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    public boolean s5cupdatepp2(String regid,int internal,int external)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("internal",internal);
        contentValues.put("external",external);
        Cursor cursor=db.rawQuery("select * from s5computersciencepp2 where regid=?",new String[] {regid});
        if(cursor.getCount() > 0)
        {
            long res=db.update("s5computersciencepp2",contentValues,"regid=?",new String[] {regid});
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
    public Cursor s5cresultpp2(String regid)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor cursor1=db.rawQuery("select internal,external from s5computersciencepp2 where regid=?",new String[] {regid});
        return cursor1;
    }
}
