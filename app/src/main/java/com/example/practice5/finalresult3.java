package com.example.practice5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.widget.TextView;

public class finalresult3 extends AppCompatActivity {
    TextView s5m11,s5m12,s5m13,s5m14,s5m21,s5m22,s5m23,s5m24,s5p11,s5p12,s5p13,s5p14,s5p21,s5p22,s5p23,s5p24,s5c11,s5c12,s5c13,s5c14,s5c21,s5c22,s5c23,s5c24,
    s5pp11,s5pp12,s5pp13,s5pp14,s5pp21,s5pp22,s5pp23,s5pp24,s5cp11,s5cp12,s5cp13,s5cp14,s5cp21,s5cp22,s5cp23,s5cp24,
    s6m1,s6m2,s6m3,s6m4,s6p1,s6p2,s6p3,s6p4,s6c1,s6c2,s6c3,s6c4,s6cp11,s6cp12,s6cp13,s6cp14,s6cp21,s6cp22,s6cp23,s6cp24,s6cp31,s6cp32,s6cp33,s6cp34,s6cp1,s6cp2,s6cp3,s6cp4,
    s6pp1,s6pp2,s6pp3,s6pp4,s6ccp11,s6ccp12,s6ccp13,s6ccp14,s6ccp21,s6ccp22,s6ccp23,s6ccp24,s6ccp31,s6ccp32,s6ccp33,s6ccp34,
    textView1,textView2,textView3;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finalresult3);
        getSupportActionBar().hide();
        s5m11=findViewById(R.id.s5m11);s6m1=findViewById(R.id.s6m1);
        s5m11=findViewById(R.id.s5m11);s6m2=findViewById(R.id.s6m2);
        s5m11=findViewById(R.id.s5m11);s6m3=findViewById(R.id.s6m3);
        s5m11=findViewById(R.id.s5m11);s6m4=findViewById(R.id.s6m4);
        s5m12=findViewById(R.id.s5m12);s6p1=findViewById(R.id.s6p1);
        s5m12=findViewById(R.id.s5m12);s6p2=findViewById(R.id.s6p2);
        s5m12=findViewById(R.id.s5m12);s6p3=findViewById(R.id.s6p3);
        s5m12=findViewById(R.id.s5m12);s6p4=findViewById(R.id.s6p4);
        s5m13=findViewById(R.id.s5m13);s6c1=findViewById(R.id.s6c1);
        s5m13=findViewById(R.id.s5m13);s6c2=findViewById(R.id.s6c2);
        s5m13=findViewById(R.id.s5m13);s6c3=findViewById(R.id.s6c3);
        s5m13=findViewById(R.id.s5m13);s6c4=findViewById(R.id.s6c4);
        s5m14=findViewById(R.id.s5m14);s6cp11=findViewById(R.id.s6cp11);
        s5m14=findViewById(R.id.s5m14);s6cp12=findViewById(R.id.s6cp12);
        s5m14=findViewById(R.id.s5m14);s6cp13=findViewById(R.id.s6cp13);
        s5m14=findViewById(R.id.s5m14);s6cp14=findViewById(R.id.s6cp14);
        s5m21=findViewById(R.id.s5m21);s6cp21=findViewById(R.id.s6cp21);
        s5m21=findViewById(R.id.s5m21);s6cp22=findViewById(R.id.s6cp22);
        s5m21=findViewById(R.id.s5m21);s6cp23=findViewById(R.id.s6cp23);
        s5m21=findViewById(R.id.s5m21);s6cp24=findViewById(R.id.s6cp24);
        s5m22=findViewById(R.id.s5m22);s6cp31=findViewById(R.id.s6cp31);
        s5m22=findViewById(R.id.s5m22);s6cp32=findViewById(R.id.s6cp32);
        s5m22=findViewById(R.id.s5m22);s6cp33=findViewById(R.id.s6cp33);
        s5m22=findViewById(R.id.s5m22);s6cp34=findViewById(R.id.s6cp34);
        s5m23=findViewById(R.id.s5m23);s6cp21=findViewById(R.id.s6cp21);
        s5m23=findViewById(R.id.s5m23);s6cp22=findViewById(R.id.s6cp22);
        s5m23=findViewById(R.id.s5m23);s6cp23=findViewById(R.id.s6cp23);
        s5m23=findViewById(R.id.s5m23);s6cp24=findViewById(R.id.s6cp24);
        s5m24=findViewById(R.id.s5m24);s6cp1=findViewById(R.id.s6cp1);
        s5m24=findViewById(R.id.s5m24);s6cp2=findViewById(R.id.s6cp2);
        s5m24=findViewById(R.id.s5m24);s6cp3=findViewById(R.id.s6cp3);
        s5m24=findViewById(R.id.s5m24);s6cp4=findViewById(R.id.s6cp4);
        s5p11=findViewById(R.id.s5p11);s6pp1=findViewById(R.id.s6pp1);
        s5p11=findViewById(R.id.s5p11);s6pp2=findViewById(R.id.s6pp2);
        s5p11=findViewById(R.id.s5p11);s6pp3=findViewById(R.id.s6pp3);
        s5p11=findViewById(R.id.s5p11);s6pp4=findViewById(R.id.s6pp4);
        s5p12=findViewById(R.id.s5p12);s6ccp11=findViewById(R.id.s6ccp11);
        s5p12=findViewById(R.id.s5p12);s6ccp12=findViewById(R.id.s6ccp12);
        s5p12=findViewById(R.id.s5p12);s6ccp13=findViewById(R.id.s6ccp13);
        s5p12=findViewById(R.id.s5p12);s6ccp14=findViewById(R.id.s6ccp14);
        s5p13=findViewById(R.id.s5p13);s6ccp21=findViewById(R.id.s6ccp21);
        s5p13=findViewById(R.id.s5p13);s6ccp22=findViewById(R.id.s6ccp22);
        s5p13=findViewById(R.id.s5p13);s6ccp23=findViewById(R.id.s6ccp23);
        s5p13=findViewById(R.id.s5p13);s6ccp24=findViewById(R.id.s6ccp24);
        s5p14=findViewById(R.id.s5p14);s6ccp31=findViewById(R.id.s6ccp31);
        s5p14=findViewById(R.id.s5p14);s6ccp32=findViewById(R.id.s6ccp32);
        s5p14=findViewById(R.id.s5p14);s6ccp33=findViewById(R.id.s6ccp33);
        s5p14=findViewById(R.id.s5p14);s6ccp34=findViewById(R.id.s6ccp34);
        s5p21=findViewById(R.id.s5p21);textView1=findViewById(R.id.s56frt1);
        s5p21=findViewById(R.id.s5p21);textView2=findViewById(R.id.s56frt2);
        s5p21=findViewById(R.id.s5p21);textView3=findViewById(R.id.s56frt3);
        s5p22=findViewById(R.id.s5p22);
        s5p23=findViewById(R.id.s5p23);
        s5p24=findViewById(R.id.s5p24);
        s5c11=findViewById(R.id.s5c11);
        s5c12=findViewById(R.id.s5c12);
        s5c13=findViewById(R.id.s5c13);
        s5c14=findViewById(R.id.s5c14);
        s5c21=findViewById(R.id.s5c21);
        s5c22=findViewById(R.id.s5c22);
        s5c23=findViewById(R.id.s5c23);
        s5c24=findViewById(R.id.s5c24);
        s5pp11=findViewById(R.id.s5pp11);
        s5pp12=findViewById(R.id.s5pp12);
        s5pp13=findViewById(R.id.s5pp13);
        s5pp14=findViewById(R.id.s5pp14);
        s5pp21=findViewById(R.id.s5pp21);
        s5pp22=findViewById(R.id.s5pp22);
        s5pp23=findViewById(R.id.s5pp23);
        s5pp24=findViewById(R.id.s5pp24);
        s5cp11=findViewById(R.id.s5cp11);
        s5cp12=findViewById(R.id.s5cp12);
        s5cp13=findViewById(R.id.s5cp13);
        s5cp14=findViewById(R.id.s5cp14);
        s5cp21=findViewById(R.id.s5cp21);
        s5cp22=findViewById(R.id.s5cp22);
        s5cp23=findViewById(R.id.s5cp23);
        s5cp24=findViewById(R.id.s5cp24);
        database db=new database(this);
        sem_5 db1=new sem_5(this);
        sem_6 db2=new sem_6(this);
        Intent intent=getIntent();
        String regid=intent.getStringExtra("reg");
        Cursor cursor1=db.getdetails(regid);
        while(cursor1.moveToNext())
        {
            String name=cursor1.getString(0);
            String section=cursor1.getString(3);
            String reg=cursor1.getString(1);
            textView1.setText("Name:"+name);
            textView2.setText("Section"+section);
            textView3.setText("Reg id"+reg);
        }
        Cursor cursor2=db1.s5mresultp1(regid);
        while(cursor2.moveToNext())
        {
            String en1=cursor2.getString(0);
            String en2=cursor2.getString(1);
            int n1=Integer.parseInt(en1);
            int n2=Integer.parseInt(en2);
            s5m11.setText(en1);
            s5m12.setText(en2);
            int n3=n1+n2;
            s5m13.setText(String.valueOf(n3));
            if(n1 >20 && n2>20)
            {
                s5m14.setText("Pass");
            }
            else
            {
                s5m14.setText("Failed");
            }
        }
        Cursor cursor3=db1.s5mresultp2(regid);
        while(cursor3.moveToNext())
        {
            String en1=cursor3.getString(0);
            String en2=cursor3.getString(1);
            int n1=Integer.parseInt(en1);
            int n2=Integer.parseInt(en2);
            s5m21.setText(en1);
            s5m22.setText(en2);
            int n3=n1+n2;
            s5m23.setText(String.valueOf(n3));
            if(n1 >20 && n2>20)
            {
                s5m24.setText("Pass");
            }
            else
            {
                s5m24.setText("Failed");
            }
        }
        Cursor cursor4=db1.s5presultp1(regid);
        while(cursor4.moveToNext())
        {
            String en1=cursor4.getString(0);
            String en2=cursor4.getString(1);
            int n1=Integer.parseInt(en1);
            int n2=Integer.parseInt(en2);
            s5p11.setText(en1);
            s5p12.setText(en2);
            int n3=n1+n2;
            s5p13.setText(String.valueOf(n3));
            if(n1 >20 && n2>20)
            {
                s5p14.setText("Pass");
            }
            else
            {
                s5p14.setText("Failed");
            }
        }
        Cursor cursor5=db1.s5presultp2(regid);
        while(cursor5.moveToNext())
        {
            String en1=cursor5.getString(0);
            String en2=cursor5.getString(1);
            int n1=Integer.parseInt(en1);
            int n2=Integer.parseInt(en2);
            s5p21.setText(en1);
            s5p22.setText(en2);
            int n3=n1+n2;
            s5p23.setText(String.valueOf(n3));
            if(n1 >20 && n2>20)
            {
                s5p24.setText("Pass");
            }
            else
            {
                s5p24.setText("Failed");
            }
        }
        Cursor cursor6=db1.s5cresultp1(regid);
        while(cursor6.moveToNext())
        {
            String en1=cursor6.getString(0);
            String en2=cursor6.getString(1);
            int n1=Integer.parseInt(en1);
            int n2=Integer.parseInt(en2);
            s5c11.setText(en1);
            s5c12.setText(en2);
            int n3=n1+n2;
            s5c13.setText(String.valueOf(n3));
            if(n1 >20 && n2>20)
            {
                s5c14.setText("Pass");
            }
            else
            {
                s5c14.setText("Failed");
            }
        }
        Cursor cursor7=db1.s5cresultp2(regid);
        while(cursor7.moveToNext())
        {
            String en1=cursor7.getString(0);
            String en2=cursor7.getString(1);
            int n1=Integer.parseInt(en1);
            int n2=Integer.parseInt(en2);
            s5c21.setText(en1);
            s5c22.setText(en2);
            int n3=n1+n2;
            s5c23.setText(String.valueOf(n3));
            if(n1 >20 && n2>20)
            {
                s5c24.setText("Pass");
            }
            else
            {
                s5c24.setText("Failed");
            }
        }
        Cursor cursor8=db1.s5presultpp1(regid);
        while(cursor8.moveToNext())
        {
            String en1=cursor8.getString(0);
            String en2=cursor8.getString(1);
            int n1=Integer.parseInt(en1);
            int n2=Integer.parseInt(en2);
            s5pp11.setText(en1);
            s5pp12.setText(en2);
            int n3=n1+n2;
            s5pp13.setText(String.valueOf(n3));
            if(n1 >20 && n2>20)
            {
                s5pp14.setText("Pass");
            }
            else
            {
                s5pp14.setText("Failed");
            }
        }
        Cursor cursor9=db1.s5presultpp2(regid);
        while(cursor9.moveToNext())
        {
            String en1=cursor9.getString(0);
            String en2=cursor9.getString(1);
            int n1=Integer.parseInt(en1);
            int n2=Integer.parseInt(en2);
            s5pp21.setText(en1);
            s5pp22.setText(en2);
            int n3=n1+n2;
            s5pp23.setText(String.valueOf(n3));
            if(n1 >20 && n2>20)
            {
                s5pp24.setText("Pass");
            }
            else
            {
                s5pp24.setText("Failed");
            }
        }
        Cursor cursor10=db1.s5cresultpp1(regid);
        while(cursor10.moveToNext())
        {
            String en1=cursor10.getString(0);
            String en2=cursor10.getString(1);
            int n1=Integer.parseInt(en1);
            int n2=Integer.parseInt(en2);
            s5cp11.setText(en1);
            s5cp12.setText(en2);
            int n3=n1+n2;
            s5cp13.setText(String.valueOf(n3));
            if(n1 >20 && n2>20)
            {
                s5cp14.setText("Pass");
            }
            else
            {
                s5cp14.setText("Failed");
            }
        }
        Cursor cursor11=db1.s5cresultpp2(regid);
        while(cursor11.moveToNext())
        {
            String en1=cursor11.getString(0);
            String en2=cursor11.getString(1);
            int n1=Integer.parseInt(en1);
            int n2=Integer.parseInt(en2);
            s5cp21.setText(en1);
            s5cp22.setText(en2);
            int n3=n1+n2;
            s5cp23.setText(String.valueOf(n3));
            if(n1 >20 && n2>20)
            {
                s5cp24.setText("Pass");
            }
            else
            {
                s5cp24.setText("Failed");
            }
        }
        Cursor cursor12=db2.s6mresult(regid);
        while(cursor12.moveToNext())
        {
            String en1=cursor12.getString(0);
            String en2=cursor12.getString(1);
            int n1=Integer.parseInt(en1);
            int n2=Integer.parseInt(en2);
            s6m1.setText(en1);
            s6m2.setText(en2);
            int n3=n1+n2;
            s6m3.setText(String.valueOf(n3));
            if(n1 >20 && n2>20)
            {
                s6m4.setText("Pass");
            }
            else
            {
                s6m4.setText("Failed");
            }
        }
        Cursor cursor13=db2.s6presult(regid);
        while(cursor13.moveToNext())
        {
            String en1=cursor13.getString(0);
            String en2=cursor13.getString(1);
            int n1=Integer.parseInt(en1);
            int n2=Integer.parseInt(en2);
            s6p1.setText(en1);
            s6p2.setText(en2);
            int n3=n1+n2;
            s6p3.setText(String.valueOf(n3));
            if(n1 >20 && n2>20)
            {
                s6p4.setText("Pass");
            }
            else
            {
                s6p4.setText("Failed");
            }
        }
        Cursor cursor14=db2.s6cresult(regid);
        while(cursor14.moveToNext())
        {
            String en1=cursor14.getString(0);
            String en2=cursor14.getString(1);
            int n1=Integer.parseInt(en1);
            int n2=Integer.parseInt(en2);
            s6c1.setText(en1);
            s6c2.setText(en2);
            int n3=n1+n2;
            s6c3.setText(String.valueOf(n3));
            if(n1 >20 && n2>20)
            {
                s6c4.setText("Pass");
            }
            else
            {
                s6c4.setText("Failed");
            }
        }
        Cursor cursor15=db2.s6cresultc1(regid);
        while(cursor15.moveToNext())
        {
            String en1=cursor15.getString(0);
            String en2=cursor15.getString(1);
            int n1=Integer.parseInt(en1);
            int n2=Integer.parseInt(en2);
            s6cp11.setText(en1);
            s6cp12.setText(en2);
            int n3=n1+n2;
            s6cp13.setText(String.valueOf(n3));
            if(n1 >20 && n2>20)
            {
                s6cp14.setText("Pass");
            }
            else
            {
                s6cp14.setText("Failed");
            }
        }
        Cursor cursor16=db2.s6cresultc2(regid);
        while(cursor16.moveToNext())
        {
            String en1=cursor16.getString(0);
            String en2=cursor16.getString(1);
            int n1=Integer.parseInt(en1);
            int n2=Integer.parseInt(en2);
            s6cp21.setText(en1);
            s6cp22.setText(en2);
            int n3=n1+n2;
            s6cp23.setText(String.valueOf(n3));
            if(n1 >20 && n2>20)
            {
                s6cp24.setText("Pass");
            }
            else
            {
                s6cp24.setText("Failed");
            }
        }
        Cursor cursor17=db2.s6cresultc3(regid);
        while(cursor17.moveToNext())
        {
            String en1=cursor17.getString(0);
            String en2=cursor17.getString(1);
            int n1=Integer.parseInt(en1);
            int n2=Integer.parseInt(en2);
            s6cp31.setText(en1);
            s6cp32.setText(en2);
            int n3=n1+n2;
            s6cp33.setText(String.valueOf(n3));
            if(n1 >20 && n2>20)
            {
                s6cp34.setText("Pass");
            }
            else
            {
                s6cp34.setText("Failed");
            }
        }
        Cursor cursor18=db2.s6cresultp(regid);
        while(cursor18.moveToNext())
        {
            String en1=cursor18.getString(0);
            String en2=cursor18.getString(1);
            int n1=Integer.parseInt(en1);
            int n2=Integer.parseInt(en2);
            s6cp1.setText(en1);
            s6cp2.setText(en2);
            int n3=n1+n2;
            s6cp3.setText(String.valueOf(n3));
            if(n1 >20 && n2>20)
            {
                s6cp4.setText("Pass");
            }
            else
            {
                s6cp4.setText("Failed");
            }
        }
        Cursor cursor19=db2.s6presultp(regid);
        while(cursor19.moveToNext())
        {
            String en1=cursor19.getString(0);
            String en2=cursor19.getString(1);
            int n1=Integer.parseInt(en1);
            int n2=Integer.parseInt(en2);
            s6pp1.setText(en1);
            s6pp2.setText(en2);
            int n3=n1+n2;
            s6pp3.setText(String.valueOf(n3));
            if(n1 >20 && n2>20)
            {
                s6pp4.setText("Pass");
            }
            else
            {
                s6pp4.setText("Failed");
            }
        }
        Cursor cursor20=db2.s6cresultc1p(regid);
        while(cursor20.moveToNext())
        {
            String en1=cursor20.getString(0);
            String en2=cursor20.getString(1);
            int n1=Integer.parseInt(en1);
            int n2=Integer.parseInt(en2);
            s6ccp11.setText(en1);
            s6ccp12.setText(en2);
            int n3=n1+n2;
            s6ccp13.setText(String.valueOf(n3));
            if(n1 >20 && n2>20)
            {
                s6ccp14.setText("Pass");
            }
            else
            {
                s6ccp14.setText("Failed");
            }
        }
        Cursor cursor21=db2.s6cresultc2p(regid);
        while(cursor21.moveToNext())
        {
            String en1=cursor21.getString(0);
            String en2=cursor21.getString(1);
            int n1=Integer.parseInt(en1);
            int n2=Integer.parseInt(en2);
            s6ccp21.setText(en1);
            s6ccp22.setText(en2);
            int n3=n1+n2;
            s6ccp23.setText(String.valueOf(n3));
            if(n1 >20 && n2>20)
            {
                s6ccp24.setText("Pass");
            }
            else
            {
                s6ccp24.setText("Failed");
            }
        }
        Cursor cursor22=db2.s6cresultc3p(regid);
        while(cursor22.moveToNext())
        {
            String en1=cursor22.getString(0);
            String en2=cursor22.getString(1);
            int n1=Integer.parseInt(en1);
            int n2=Integer.parseInt(en2);
            s6ccp31.setText(en1);
            s6ccp32.setText(en2);
            int n3=n1+n2;
            s6ccp33.setText(String.valueOf(n3));
            if(n1 >20 && n2>20)
            {
                s6ccp34.setText("Pass");
            }
            else
            {
                s6ccp34.setText("Failed");
            }
        }
    }
    public void onBackPressed()
    {
        super.onBackPressed();
        overridePendingTransition(R.anim.slide_left,R.anim.slide_out_right);
    }
}