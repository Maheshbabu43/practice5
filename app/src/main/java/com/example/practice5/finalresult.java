package com.example.practice5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class finalresult extends AppCompatActivity {
    TextView textView1,textView2,textView3,m1,m2,m3,m4,p1,p2,p3,p4,c1,c2,c3,c4,e1,e2,e3,e4,t1,t2,t3,t4,pp1,pp2,pp3,pp4,cp1,cp2,cp3,cp4,
    s2m1,s2m2,s2m3,s2m4,s2p1,s2p2,s2p3,s2p4,s2c1,s2c2,s2c3,s2c4,s2e1,s2e2,s2e3,s2e4,s2t1,s2t2,s2t3,s2t4,s2pp1,s2pp2,s2pp3,s2pp4,s2cp1,s2cp2,s2cp3,s2cp4;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finalresult);
        getSupportActionBar().hide();
        e1=findViewById(R.id.e1);
        e2=findViewById(R.id.e2);
        e3=findViewById(R.id.e3);
        e4=findViewById(R.id.e4);
        t1=findViewById(R.id.t1);
        t2=findViewById(R.id.t2);
        t3=findViewById(R.id.t3);
        t4=findViewById(R.id.t4);
        m1=findViewById(R.id.m1);
        m2=findViewById(R.id.m2);
        m3=findViewById(R.id.m3);
        m4=findViewById(R.id.m4);
        p1=findViewById(R.id.p1);
        p2=findViewById(R.id.p2);
        p3=findViewById(R.id.p3);
        p4=findViewById(R.id.p4);
        c1=findViewById(R.id.c1);
        c2=findViewById(R.id.c2);
        c3=findViewById(R.id.c3);
        c4=findViewById(R.id.c4);
        pp1=findViewById(R.id.pp1);
        pp2=findViewById(R.id.pp2);
        pp3=findViewById(R.id.pp3);
        pp4=findViewById(R.id.pp4);
        cp1=findViewById(R.id.cp1);
        cp2=findViewById(R.id.cp2);
        cp3=findViewById(R.id.cp3);
        cp4=findViewById(R.id.cp4);
        s2e1=findViewById(R.id.s2e1);
        s2e2=findViewById(R.id.s2e2);
        s2e3=findViewById(R.id.s2e3);
        s2e4=findViewById(R.id.s2e4);
        s2t1=findViewById(R.id.s2t1);
        s2t2=findViewById(R.id.s2t2);
        s2t3=findViewById(R.id.s2t3);
        s2t4=findViewById(R.id.s2t4);
        s2m1=findViewById(R.id.s2m1);
        s2m2=findViewById(R.id.s2m2);
        s2m3=findViewById(R.id.s2m3);
        s2m4=findViewById(R.id.s2m4);
        s2p1=findViewById(R.id.s2p1);
        s2p2=findViewById(R.id.s2p2);
        s2p3=findViewById(R.id.s2p3);
        s2p4=findViewById(R.id.s2p4);
        s2c1=findViewById(R.id.s2c1);
        s2c2=findViewById(R.id.s2c2);
        s2c3=findViewById(R.id.s2c3);
        s2c4=findViewById(R.id.s2c4);
        s2pp1=findViewById(R.id.s2pp1);
        s2pp2=findViewById(R.id.s2pp2);
        s2pp3=findViewById(R.id.s2pp3);
        s2pp4=findViewById(R.id.s2pp4);
        s2cp1=findViewById(R.id.s2cp1);
        s2cp2=findViewById(R.id.s2cp2);
        s2cp3=findViewById(R.id.s2cp3);
        s2cp4=findViewById(R.id.s2cp4);
        textView1=findViewById(R.id.frt1);
        textView2=findViewById(R.id.frt2);
        textView3=findViewById(R.id.frt3);
        button=findViewById(R.id.frb1);
        database db1=new database(this);
        sem_1 db=new sem_1(this);
        sem_2 db2=new sem_2(this);
        Intent intent=getIntent();
        String regid=intent.getStringExtra("reg");
        Cursor cursor2=db1.getdetails(regid);
        while(cursor2.moveToNext())
        {
            String name=cursor2.getString(0);
            String section=cursor2.getString(3);
            String reg=cursor2.getString(1);
            textView1.setText("Name:"+name);
            textView2.setText("Section:"+section);
            textView3.setText("Reg id:"+reg);
            if(section.equals("ACP"))
            {
                button.setVisibility(View.GONE);
            }
            else
            {
                button.setVisibility(View.VISIBLE);
            }
        }
        Cursor cursor=db.eresult(regid);
        while(cursor.moveToNext())
        {
            String en1=cursor.getString(0);
            String en2=cursor.getString(1);
            int n1=Integer.parseInt(en1);
            int n2=Integer.parseInt(en2);
            e1.setText(en1);
            e2.setText(en2);
            int n3=n1+n2;
            e3.setText(String.valueOf(n3));
            if(n1 >20 && n2>20)
            {
                e4.setText("Pass");
            }
            else
            {
                e4.setText("Failed");
            }
        }
        Cursor cursor1=db.tresult(regid);
        while(cursor1.moveToNext())
        {
            String tn1=cursor1.getString(0);
            String tn2=cursor1.getString(1);
            int b1=Integer.parseInt(tn1);
            int b2=Integer.parseInt(tn2);
            t1.setText(tn1);
            t2.setText(tn2);
            int n3=b1+b2;
            t3.setText(String.valueOf(n3));
            if(b1 >=20 || b2>=20)
            {
                t4.setText("Pass");
            }
            else
            {
                t4.setText("Failed");
            }
        }
        Cursor cursor3=db.presult(regid);
        while(cursor3.moveToNext())
        {
            String tn1=cursor3.getString(0);
            String tn2=cursor3.getString(1);
            int b1=Integer.parseInt(tn1);
            int b2=Integer.parseInt(tn2);
            p1.setText(tn1);
            p2.setText(tn2);
            int n3=b1+b2;
            p3.setText(String.valueOf(n3));
            if(b1 >=20 || b2>=20)
            {
                p4.setText("Pass");
            }
            else
            {
                p4.setText("Failed");
            }
        }
        Cursor cursor4=db.mresult(regid);
        while(cursor4.moveToNext())
        {
            String tn1=cursor4.getString(0);
            String tn2=cursor4.getString(1);
            int b1=Integer.parseInt(tn1);
            int b2=Integer.parseInt(tn2);
            m1.setText(tn1);
            m2.setText(tn2);
            int n3=b1+b2;
            m3.setText(String.valueOf(n3));
            if(b1 >=20 || b2>=20)
            {
                m4.setText("Pass");
            }
            else
            {
                m4.setText("Failed");
            }
        }
        Cursor cursor5=db.cresult(regid);
        while(cursor5.moveToNext())
        {
            String tn1=cursor5.getString(0);
            String tn2=cursor5.getString(1);
            int b1=Integer.parseInt(tn1);
            int b2=Integer.parseInt(tn2);
            c1.setText(tn1);
            c2.setText(tn2);
            int n3=b1+b2;
            c3.setText(String.valueOf(n3));
            if(b1 >=20 || b2>=20)
            {
                c4.setText("Pass");
            }
            else
            {
                c4.setText("Failed");
            }
        }
        Cursor cursor6=db2.s2eresult(regid);
        while(cursor6.moveToNext())
        {
            String tn1=cursor6.getString(0);
            String tn2=cursor6.getString(1);
            int b1=Integer.parseInt(tn1);
            int b2=Integer.parseInt(tn2);
            s2e1.setText(tn1);
            s2e2.setText(tn2);
            int n3=b1+b2;
            s2e3.setText(String.valueOf(n3));
            if(b1 >=20 || b2>=20)
            {
                s2e4.setText("Pass");
            }
            else
            {
                s2e4.setText("Failed");
            }
        }
        Cursor cursor7=db2.s2tresult(regid);
        while(cursor7.moveToNext())
        {
            String tn1=cursor7.getString(0);
            String tn2=cursor7.getString(1);
            int b1=Integer.parseInt(tn1);
            int b2=Integer.parseInt(tn2);
            s2t1.setText(tn1);
            s2t2.setText(tn2);
            int n3=b1+b2;
            s2t3.setText(String.valueOf(n3));
            if(b1 >=20 || b2>=20)
            {
                s2t4.setText("Pass");
            }
            else
            {
                s2t4.setText("Failed");
            }
        }
        Cursor cursor8=db2.s2mresult(regid);
        while(cursor8.moveToNext())
        {
            String tn1=cursor8.getString(0);
            String tn2=cursor8.getString(1);
            int b1=Integer.parseInt(tn1);
            int b2=Integer.parseInt(tn2);
            s2m1.setText(tn1);
            s2m2.setText(tn2);
            int n3=b1+b2;
            s2m3.setText(String.valueOf(n3));
            if(b1 >=20 || b2>=20)
            {
                s2m4.setText("Pass");
            }
            else
            {
                s2m4.setText("Failed");
            }
        }
        Cursor cursor9=db2.s2presult(regid);
        while(cursor9.moveToNext())
        {
            String tn1=cursor9.getString(0);
            String tn2=cursor9.getString(1);
            int b1=Integer.parseInt(tn1);
            int b2=Integer.parseInt(tn2);
            s2p1.setText(tn1);
            s2p2.setText(tn2);
            int n3=b1+b2;
            s2p3.setText(String.valueOf(n3));
            if(b1 >=20 || b2>=20)
            {
                s2p4.setText("Pass");
            }
            else
            {
                s2p4.setText("Failed");
            }
        }
        Cursor cursor10=db2.s2cresult(regid);
        while(cursor10.moveToNext())
        {
            String tn1=cursor10.getString(0);
            String tn2=cursor10.getString(1);
            int b1=Integer.parseInt(tn1);
            int b2=Integer.parseInt(tn2);
            s2c1.setText(tn1);
            s2c2.setText(tn2);
            int n3=b1+b2;
            s2c3.setText(String.valueOf(n3));
            if(b1 >=20 || b2>=20)
            {
                s2c4.setText("Pass");
            }
            else
            {
                s2c4.setText("Failed");
            }
        }
        Cursor cursor11=db.ppresult(regid);
        while(cursor11.moveToNext())
        {
            String tn1=cursor11.getString(0);
            String tn2=cursor11.getString(1);
            int b1=Integer.parseInt(tn1);
            int b2=Integer.parseInt(tn2);
            pp1.setText(tn1);
            pp2.setText(tn2);
            int n3=b1+b2;
            pp3.setText(String.valueOf(n3));
            if(b1 >=20 || b2>=20)
            {
                pp4.setText("Pass");
            }
            else
            {
                pp4.setText("Failed");
            }
        }
        Cursor cursor12=db.cpresult(regid);
        while(cursor12.moveToNext())
        {
            String tn1=cursor12.getString(0);
            String tn2=cursor12.getString(1);
            int b1=Integer.parseInt(tn1);
            int b2=Integer.parseInt(tn2);
            cp1.setText(tn1);
            cp2.setText(tn2);
            int n3=b1+b2;
            cp3.setText(String.valueOf(n3));
            if(b1 >=20 || b2>=20)
            {
                cp4.setText("Pass");
            }
            else
            {
                cp4.setText("Failed");
            }
        }
        Cursor cursor13=db2.s2ppresult(regid);
        while(cursor13.moveToNext())
        {
            String tn1=cursor13.getString(0);
            String tn2=cursor13.getString(1);
            int b1=Integer.parseInt(tn1);
            int b2=Integer.parseInt(tn2);
            s2pp1.setText(tn1);
            s2pp2.setText(tn2);
            int n3=b1+b2;
            s2pp3.setText(String.valueOf(n3));
            if(b1 >=20 || b2>=20)
            {
                s2pp4.setText("Pass");
            }
            else
            {
                s2pp4.setText("Failed");
            }
        }
        Cursor cursor14=db2.s2cpresult(regid);
        while(cursor14.moveToNext())
        {
            String tn1=cursor14.getString(0);
            String tn2=cursor14.getString(1);
            int b1=Integer.parseInt(tn1);
            int b2=Integer.parseInt(tn2);
            s2cp1.setText(tn1);
            s2cp2.setText(tn2);
            int n3=b1+b2;
            s2cp3.setText(String.valueOf(n3));
            if(b1 >=20 || b2>=20)
            {
                s2cp4.setText("Pass");
            }
            else
            {
                s2cp4.setText("Failed");
            }
        }
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1=new Intent(finalresult.this, finalresult2.class);
                intent1.putExtra("reg",regid);
                startActivity(intent1);
                overridePendingTransition(R.anim.slide_right,R.anim.slide_out_left);
            }
        });

    }
    public void onBackPressed()
    {
        super.onBackPressed();
        overridePendingTransition(R.anim.slide_left,R.anim.slide_out_right);
    }
}