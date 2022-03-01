package com.example.practice5;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class sem_6 extends SQLiteOpenHelper {
    public sem_6(Context context) {
        super(context, "sem6.db", null, 10);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table s6maths(regid int primary key,internal int,external int)");
        db.execSQL("create table s6physics(regid int primary key,internal int,external int)");
        db.execSQL("create table s6computerscience(regid int primary key,internal int,external int)");
        db.execSQL("create table s6computersciencec1(regid int primary key,internal int,external int)");
        db.execSQL("create table s6computersciencec2(regid int primary key,internal int,external int)");
        db.execSQL("create table s6computersciencec3(regid int primary key,internal int,external int)");
        db.execSQL("create table s6physicsp(regid int primary key,internal int,external int)");
        db.execSQL("create table s6computersciencep(regid int primary key,internal int,external int)");
        db.execSQL("create table s6computersciencec1p(regid int primary key,internal int,external int)");
        db.execSQL("create table s6computersciencec2p(regid int primary key,internal int,external int)");
        db.execSQL("create table s6computersciencec3p(regid int primary key,internal int,external int)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("drop table if exists s6maths");
        db.execSQL("drop table if exists s6physics");
        db.execSQL("drop table if exists s6computerscience");
        db.execSQL("drop table if exists s6computersciencec1");
        db.execSQL("drop table if exists s6computersciencec2");
        db.execSQL("drop table if exists s6computersciencec3");
        db.execSQL("drop table if exists s6physicsp");
        db.execSQL("drop table if exists s6computersciencecp");
        db.execSQL("drop table if exists s6computersciencec1p");
        db.execSQL("drop table if exists s6computersciencec2p");
        db.execSQL("drop table if exists s6computersciencec3p");
        onCreate(db);
    }
    public boolean s6minsert(int regid,int internal,int external)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("regid",regid);
        contentValues.put("internal",internal);
        contentValues.put("external",external);
        long res=db.insert("s6maths",null,contentValues);
        if(res == -1)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    public boolean s6mupdate(String regid,int internal,int external)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("internal",internal);
        contentValues.put("external",external);
        Cursor cursor=db.rawQuery("select * from s6maths where regid=?",new String[] {regid});
        if(cursor.getCount() > 0)
        {
            long res=db.update("s6maths",contentValues,"regid=?",new String[] {regid});
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
    public Cursor s6mresult(String regid) {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery("select internal,external from s6maths where regid=?", new String[]{regid});
        return cursor;
    }
    public boolean s6pinsert(int regid,int internal,int external)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("regid",regid);
        contentValues.put("internal",internal);
        contentValues.put("external",external);
        long res=db.insert("s6physics",null,contentValues);
        if(res == -1)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    public boolean s6pupdate(String regid,int internal,int external)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("internal",internal);
        contentValues.put("external",external);
        Cursor cursor=db.rawQuery("select * from s6physics where regid=?",new String[] {regid});
        if(cursor.getCount() > 0)
        {
            long res=db.update("s6physics",contentValues,"regid=?",new String[] {regid});
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
    public Cursor s6presult(String regid) {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery("select internal,external from s6physics where regid=?", new String[]{regid});
        return cursor;
    }
    public boolean s6cinsert(int regid,int internal,int external)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("regid",regid);
        contentValues.put("internal",internal);
        contentValues.put("external",external);
        long res=db.insert("s6computerscience",null,contentValues);
        if(res == -1)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    public boolean s6cupdate(String regid,int internal,int external)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("internal",internal);
        contentValues.put("external",external);
        Cursor cursor=db.rawQuery("select * from s6computerscience where regid=?",new String[] {regid});
        if(cursor.getCount() > 0)
        {
            long res=db.update("s6computerscience",contentValues,"regid=?",new String[] {regid});
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
    public Cursor s6cresult(String regid) {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery("select internal,external from s6computerscience where regid=?", new String[]{regid});
        return cursor;
    }
    public boolean s6cinsertc1(int regid,int internal,int external)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("regid",regid);
        contentValues.put("internal",internal);
        contentValues.put("external",external);
        long res=db.insert("s6computersciencec1",null,contentValues);
        if(res == -1)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    public boolean s6cupdatec1(String regid,int internal,int external)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("internal",internal);
        contentValues.put("external",external);
        Cursor cursor=db.rawQuery("select * from s6computersciencec1 where regid=?",new String[] {regid});
        if(cursor.getCount() > 0)
        {
            long res=db.update("s6computersciencec1",contentValues,"regid=?",new String[] {regid});
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
    public Cursor s6cresultc1(String regid) {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery("select internal,external from s6computersciencec1 where regid=?", new String[]{regid});
        return cursor;
    }
    public boolean s6cinsertc2(int regid,int internal,int external)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("regid",regid);
        contentValues.put("internal",internal);
        contentValues.put("external",external);
        long res=db.insert("s6computersciencec2",null,contentValues);
        if(res == -1)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    public boolean s6cupdatec2(String regid,int internal,int external)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("internal",internal);
        contentValues.put("external",external);
        Cursor cursor=db.rawQuery("select * from s6computersciencec2 where regid=?",new String[] {regid});
        if(cursor.getCount() > 0)
        {
            long res=db.update("s6computersciencec2",contentValues,"regid=?",new String[] {regid});
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
    public Cursor s6cresultc2(String regid) {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery("select internal,external from s6computersciencec2 where regid=?", new String[]{regid});
        return cursor;
    }
    public boolean s6cinsertc3(int regid,int internal,int external)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("regid",regid);
        contentValues.put("internal",internal);
        contentValues.put("external",external);
        long res=db.insert("s6computersciencec3",null,contentValues);
        if(res == -1)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    public boolean s6cupdatec3(String regid,int internal,int external)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("internal",internal);
        contentValues.put("external",external);
        Cursor cursor=db.rawQuery("select * from s6computersciencec3 where regid=?",new String[] {regid});
        if(cursor.getCount() > 0)
        {
            long res=db.update("s6computersciencec3",contentValues,"regid=?",new String[] {regid});
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
    public Cursor s6cresultc3(String regid) {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery("select internal,external from s6computersciencec3 where regid=?", new String[]{regid});
        return cursor;
    }
    public boolean s6pinsertp(int regid,int internal,int external)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("regid",regid);
        contentValues.put("internal",internal);
        contentValues.put("external",external);
        long res=db.insert("s6physicsp",null,contentValues);
        if(res == -1)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    public boolean s6pupdatep(String regid,int internal,int external)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("internal",internal);
        contentValues.put("external",external);
        Cursor cursor=db.rawQuery("select * from s6physicsp where regid=?",new String[] {regid});
        if(cursor.getCount() > 0)
        {
            long res=db.update("s6physicsp",contentValues,"regid=?",new String[] {regid});
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
    public Cursor s6presultp(String regid) {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery("select internal,external from s6physicsp where regid=?", new String[]{regid});
        return cursor;
    }
    public boolean s6cinsertp(int regid,int internal,int external)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("regid",regid);
        contentValues.put("internal",internal);
        contentValues.put("external",external);
        long res=db.insert("s6computersciencep",null,contentValues);
        if(res == -1)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    public boolean s6cupdatep(String regid,int internal,int external)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("internal",internal);
        contentValues.put("external",external);
        Cursor cursor=db.rawQuery("select * from s6computersciencep where regid=?",new String[] {regid});
        if(cursor.getCount() > 0)
        {
            long res=db.update("s6computersciencep",contentValues,"regid=?",new String[] {regid});
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
    public Cursor s6cresultp(String regid) {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery("select internal,external from s6computersciencep where regid=?", new String[]{regid});
        return cursor;
    }
    public boolean s6cinsertc1p(int regid,int internal,int external)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("regid",regid);
        contentValues.put("internal",internal);
        contentValues.put("external",external);
        long res=db.insert("s6computersciencec1p",null,contentValues);
        if(res == -1)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    public boolean s6cupdatec1p(String regid,int internal,int external)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("internal",internal);
        contentValues.put("external",external);
        Cursor cursor=db.rawQuery("select * from s6computersciencec1p where regid=?",new String[] {regid});
        if(cursor.getCount() > 0)
        {
            long res=db.update("s6computersciencec1p",contentValues,"regid=?",new String[] {regid});
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
    public Cursor s6cresultc1p(String regid) {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery("select internal,external from s6computersciencec1p where regid=?", new String[]{regid});
        return cursor;
    }
    public boolean s6cinsertc2p(int regid,int internal,int external)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("regid",regid);
        contentValues.put("internal",internal);
        contentValues.put("external",external);
        long res=db.insert("s6computersciencec2p",null,contentValues);
        if(res == -1)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    public boolean s6cupdatec2p(String regid,int internal,int external)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("internal",internal);
        contentValues.put("external",external);
        Cursor cursor=db.rawQuery("select * from s6computersciencec2p where regid=?",new String[] {regid});
        if(cursor.getCount() > 0)
        {
            long res=db.update("s6computersciencec2p",contentValues,"regid=?",new String[] {regid});
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
    public Cursor s6cresultc2p(String regid) {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery("select internal,external from s6computersciencec2p where regid=?", new String[]{regid});
        return cursor;
    }
    public boolean s6cinsertc3p(int regid,int internal,int external)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("regid",regid);
        contentValues.put("internal",internal);
        contentValues.put("external",external);
        long res=db.insert("s6computersciencec3p",null,contentValues);
        if(res == -1)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    public boolean s6cupdatec3p(String regid,int internal,int external)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("internal",internal);
        contentValues.put("external",external);
        Cursor cursor=db.rawQuery("select * from s6computersciencec3p where regid=?",new String[] {regid});
        if(cursor.getCount() > 0)
        {
            long res=db.update("s6computersciencec3p",contentValues,"regid=?",new String[] {regid});
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
    public Cursor s6cresultc3p(String regid) {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery("select internal,external from s6computersciencec3p where regid=?", new String[]{regid});
        return cursor;
    }
}
