package com.example.practice5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class finalresult2 extends AppCompatActivity {
    TextView textView1,textView2,textView3,s3m1,s3m2,s3m3,s3m4,s3p1,s3p2,s3p3,s3p4,s3c1,s3c2,s3c3,s3c4,s3e1,s3e2,s3e3,s3e4,s3t1,s3t2,s3t3,s3t4,s3pp1,s3pp2,s3pp3,s3pp4,s3cp1,s3cp2,s3cp3,s3cp4,
            s4m1,s4m2,s4m3,s4m4,s4p1,s4p2,s4p3,s4p4,s4c1,s4c2,s4c3,s4c4,s4e1,s4e2,s4e3,s4e4,s4t1,s4t2,s4t3,s4t4,s4pp1,s4pp2,s4pp3,s4pp4,s4cp1,s4cp2,s4cp3,s4cp4;
    Button button;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.finalresult2);
        getSupportActionBar().hide();
        s3e1=findViewById(R.id.s3e1);
        s3e2=findViewById(R.id.s3e2);
        s3e3=findViewById(R.id.s3e3);
        s3e4=findViewById(R.id.s3e4);
        s3t1=findViewById(R.id.s3t1);
        s3t2=findViewById(R.id.s3t2);
        s3t3=findViewById(R.id.s3t3);
        s3t4=findViewById(R.id.s3t4);
        s3m1=findViewById(R.id.s3m1);
        s3m2=findViewById(R.id.s3m2);
        s3m3=findViewById(R.id.s3m3);
        s3m4=findViewById(R.id.s3m4);
        s3p1=findViewById(R.id.s3p1);
        s3p2=findViewById(R.id.s3p2);
        s3p3=findViewById(R.id.s3p3);
        s3p4=findViewById(R.id.s3p4);
        s3c1=findViewById(R.id.s3c1);
        s3c2=findViewById(R.id.s3c2);
        s3c3=findViewById(R.id.s3c3);
        s3c4=findViewById(R.id.s3c4);
        s3pp1=findViewById(R.id.s3pp1);
        s3pp2=findViewById(R.id.s3pp2);
        s3pp3=findViewById(R.id.s3pp3);
        s3pp4=findViewById(R.id.s3pp4);
        s3cp1=findViewById(R.id.s3cp1);
        s3cp2=findViewById(R.id.s3cp2);
        s3cp3=findViewById(R.id.s3cp3);
        s3cp4=findViewById(R.id.s3cp4);
        s4e1=findViewById(R.id.s4e1);
        s4e2=findViewById(R.id.s4e2);
        s4e3=findViewById(R.id.s4e3);
        s4e4=findViewById(R.id.s4e4);
        s4t1=findViewById(R.id.s4t1);
        s4t2=findViewById(R.id.s4t2);
        s4t3=findViewById(R.id.s4t3);
        s4t4=findViewById(R.id.s4t4);
        s4m1=findViewById(R.id.s4m1);
        s4m2=findViewById(R.id.s4m2);
        s4m3=findViewById(R.id.s4m3);
        s4m4=findViewById(R.id.s4m4);
        s4p1=findViewById(R.id.s4p1);
        s4p2=findViewById(R.id.s4p2);
        s4p3=findViewById(R.id.s4p3);
        s4p4=findViewById(R.id.s4p4);
        s4c1=findViewById(R.id.s4c1);
        s4c2=findViewById(R.id.s4c2);
        s4c3=findViewById(R.id.s4c3);
        s4c4=findViewById(R.id.s4c4);
        s4pp1=findViewById(R.id.s4pp1);
        s4pp2=findViewById(R.id.s4pp2);
        s4pp3=findViewById(R.id.s4pp3);
        s4pp4=findViewById(R.id.s4pp4);
        s4cp1=findViewById(R.id.s4cp1);
        s4cp2=findViewById(R.id.s4cp2);
        s4cp3=findViewById(R.id.s4cp3);
        s4cp4=findViewById(R.id.s4cp4);
        textView1=findViewById(R.id.s34frt1);
        textView2=findViewById(R.id.s34frt2);
        textView3=findViewById(R.id.s34frt3);
        button=findViewById(R.id.sem34b1);
        database db1=new database(this);
        sem_3 db=new sem_3(this);
        sem_4 db2=new sem_4(this);
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
            if(section.equals("NCP"))
            {
                button.setVisibility(View.GONE);
            }
            else
            {
                button.setVisibility(View.VISIBLE);
            }
        }
        Cursor cursor=db.s3eresult(regid);
        while(cursor.moveToNext())
        {
            String en1=cursor.getString(0);
            String en2=cursor.getString(1);
            int n1=Integer.parseInt(en1);
            int n2=Integer.parseInt(en2);
            s3e1.setText(en1);
            s3e2.setText(en2);
            int n3=n1+n2;
            s3e3.setText(String.valueOf(n3));
            if(n1 >20 && n2>20)
            {
                s3e4.setText("Pass");
            }
            else
            {
                s3e4.setText("Failed");
            }
        }
        Cursor cursor1=db.s3tresult(regid);
        while(cursor1.moveToNext())
        {
            String tn1=cursor1.getString(0);
            String tn2=cursor1.getString(1);
            int b1=Integer.parseInt(tn1);
            int b2=Integer.parseInt(tn2);
            s3t1.setText(tn1);
            s3t2.setText(tn2);
            int n3=b1+b2;
            s3t3.setText(String.valueOf(n3));
            if(b1 >=20 || b2>=20)
            {
                s3t4.setText("Pass");
            }
            else
            {
                s3t4.setText("Failed");
            }
        }
        Cursor cursor3=db.s3presult(regid);
        while(cursor3.moveToNext())
        {
            String tn1=cursor3.getString(0);
            String tn2=cursor3.getString(1);
            int b1=Integer.parseInt(tn1);
            int b2=Integer.parseInt(tn2);
            s3p1.setText(tn1);
            s3p2.setText(tn2);
            int n3=b1+b2;
            s3p3.setText(String.valueOf(n3));
            if(b1 >=20 || b2>=20)
            {
                s3p4.setText("Pass");
            }
            else
            {
                s3p4.setText("Failed");
            }
        }
        Cursor cursor4=db.s3mresult(regid);
        while(cursor4.moveToNext())
        {
            String tn1=cursor4.getString(0);
            String tn2=cursor4.getString(1);
            int b1=Integer.parseInt(tn1);
            int b2=Integer.parseInt(tn2);
            s3m1.setText(tn1);
            s3m2.setText(tn2);
            int n3=b1+b2;
            s3m3.setText(String.valueOf(n3));
            if(b1 >=20 || b2>=20)
            {
                s3m4.setText("Pass");
            }
            else
            {
                s3m4.setText("Failed");
            }
        }
        Cursor cursor5=db.s3cresult(regid);
        while(cursor5.moveToNext())
        {
            String tn1=cursor5.getString(0);
            String tn2=cursor5.getString(1);
            int b1=Integer.parseInt(tn1);
            int b2=Integer.parseInt(tn2);
            s3c1.setText(tn1);
            s3c2.setText(tn2);
            int n3=b1+b2;
            s3c3.setText(String.valueOf(n3));
            if(b1 >=20 || b2>=20)
            {
                s3c4.setText("Pass");
            }
            else
            {
                s3c4.setText("Failed");
            }
        }
        Cursor cursor6=db2.s4eresult(regid);
        while(cursor6.moveToNext())
        {
            String tn1=cursor6.getString(0);
            String tn2=cursor6.getString(1);
            int b1=Integer.parseInt(tn1);
            int b2=Integer.parseInt(tn2);
            s4e1.setText(tn1);
            s4e2.setText(tn2);
            int n3=b1+b2;
            s4e3.setText(String.valueOf(n3));
            if(b1 >=20 || b2>=20)
            {
                s4e4.setText("Pass");
            }
            else
            {
                s4e4.setText("Failed");
            }
        }
        Cursor cursor7=db2.s4tresult(regid);
        while(cursor7.moveToNext())
        {
            String tn1=cursor7.getString(0);
            String tn2=cursor7.getString(1);
            int b1=Integer.parseInt(tn1);
            int b2=Integer.parseInt(tn2);
            s4t1.setText(tn1);
            s4t2.setText(tn2);
            int n3=b1+b2;
            s4t3.setText(String.valueOf(n3));
            if(b1 >=20 || b2>=20)
            {
                s4t4.setText("Pass");
            }
            else
            {
                s4t4.setText("Failed");
            }
        }
        Cursor cursor8=db2.s4mresult(regid);
        while(cursor8.moveToNext())
        {
            String tn1=cursor8.getString(0);
            String tn2=cursor8.getString(1);
            int b1=Integer.parseInt(tn1);
            int b2=Integer.parseInt(tn2);
            s4m1.setText(tn1);
            s4m2.setText(tn2);
            int n3=b1+b2;
            s4m3.setText(String.valueOf(n3));
            if(b1 >=20 || b2>=20)
            {
                s4m4.setText("Pass");
            }
            else
            {
                s4m4.setText("Failed");
            }
        }
        Cursor cursor9=db2.s4presult(regid);
        while(cursor9.moveToNext())
        {
            String tn1=cursor9.getString(0);
            String tn2=cursor9.getString(1);
            int b1=Integer.parseInt(tn1);
            int b2=Integer.parseInt(tn2);
            s4p1.setText(tn1);
            s4p2.setText(tn2);
            int n3=b1+b2;
            s4p3.setText(String.valueOf(n3));
            if(b1 >=20 || b2>=20)
            {
                s4p4.setText("Pass");
            }
            else
            {
                s4p4.setText("Failed");
            }
        }
        Cursor cursor10=db2.s4cresult(regid);
        while(cursor10.moveToNext())
        {
            String tn1=cursor10.getString(0);
            String tn2=cursor10.getString(1);
            int b1=Integer.parseInt(tn1);
            int b2=Integer.parseInt(tn2);
            s4c1.setText(tn1);
            s4c2.setText(tn2);
            int n3=b1+b2;
            s4c3.setText(String.valueOf(n3));
            if(b1 >=20 || b2>=20)
            {
                s4c4.setText("Pass");
            }
            else
            {
                s4c4.setText("Failed");
            }
        }
        Cursor cursor11=db.s3ppresult(regid);
        while(cursor11.moveToNext())
        {
            String tn1=cursor11.getString(0);
            String tn2=cursor11.getString(1);
            int b1=Integer.parseInt(tn1);
            int b2=Integer.parseInt(tn2);
            s3pp1.setText(tn1);
            s3pp2.setText(tn2);
            int n3=b1+b2;
            s3pp3.setText(String.valueOf(n3));
            if(b1 >=20 || b2>=20)
            {
                s3pp4.setText("Pass");
            }
            else
            {
                s3pp4.setText("Failed");
            }
        }
        Cursor cursor12=db.s3cpresult(regid);
        while(cursor12.moveToNext())
        {
            String tn1=cursor12.getString(0);
            String tn2=cursor12.getString(1);
            int b1=Integer.parseInt(tn1);
            int b2=Integer.parseInt(tn2);
            s3cp1.setText(tn1);
            s3cp2.setText(tn2);
            int n3=b1+b2;
            s3cp3.setText(String.valueOf(n3));
            if(b1 >=20 || b2>=20)
            {
                s3cp4.setText("Pass");
            }
            else
            {
                s3cp4.setText("Failed");
            }
        }
        Cursor cursor13=db2.s4ppresult(regid);
        while(cursor13.moveToNext())
        {
            String tn1=cursor13.getString(0);
            String tn2=cursor13.getString(1);
            int b1=Integer.parseInt(tn1);
            int b2=Integer.parseInt(tn2);
            s4pp1.setText(tn1);
            s4pp2.setText(tn2);
            int n3=b1+b2;
            s4pp3.setText(String.valueOf(n3));
            if(b1 >=20 || b2>=20)
            {
                s4pp4.setText("Pass");
            }
            else
            {
                s4pp4.setText("Failed");
            }
        }
        Cursor cursor14=db2.s4cpresult(regid);
        while(cursor14.moveToNext())
        {
            String tn1=cursor14.getString(0);
            String tn2=cursor14.getString(1);
            int b1=Integer.parseInt(tn1);
            int b2=Integer.parseInt(tn2);
            s4cp1.setText(tn1);
            s4cp2.setText(tn2);
            int n3=b1+b2;
            s4cp3.setText(String.valueOf(n3));
            if(b1 >=20 || b2>=20)
            {
                s4cp4.setText("Pass");
            }
            else
            {
                s4cp4.setText("Failed");
            }
        }
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1=new Intent(finalresult2.this,finalresult3.class);
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