package com.example.practice5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class resultinsert extends AppCompatActivity {
    Spinner spinner;
    EditText editText1,editText2;
    Button button1,button2,button3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultinsert);
        getSupportActionBar().hide();
        spinner=findViewById(R.id.subject);
        editText1=findViewById(R.id.rie1);
        editText2=findViewById(R.id.rie2);
        button1=findViewById(R.id.rib1);
        button2=findViewById(R.id.rib3);
        button3=findViewById(R.id.rib2);
        database db2=new database(this);
        sem_1 db=new sem_1(this);
        sem_2 db1=new sem_2(this);
        sem_3 db3=new sem_3(this);
        sem_4 db4=new sem_4(this);
        sem_5 db5=new sem_5(this);
        sem_6 db6=new sem_6(this);
        String sem=getIntent().getStringExtra("semres1");
        if(sem.equals("SEM-I"))
        {
            ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(resultinsert.this,R.array.subjects_1, android.R.layout.simple_spinner_dropdown_item);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinner.setAdapter(adapter);
        }
        else if(sem.equals("SEM-II"))
        {
            ArrayAdapter<CharSequence> adapter1=ArrayAdapter.createFromResource(resultinsert.this,R.array.subjects_2, android.R.layout.simple_spinner_dropdown_item);
            adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinner.setAdapter(adapter1);
        }
        else if(sem.equals("SEM-III"))
        {
            ArrayAdapter<CharSequence> adapter2=ArrayAdapter.createFromResource(resultinsert.this,R.array.subjects_3, android.R.layout.simple_spinner_dropdown_item);
            adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinner.setAdapter(adapter2);
        }
        else if(sem.equals("SEM-IV"))
        {
            ArrayAdapter<CharSequence> adapter3=ArrayAdapter.createFromResource(resultinsert.this,R.array.subjects_4, android.R.layout.simple_spinner_dropdown_item);
            adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinner.setAdapter(adapter3);
        }
        else if(sem.equals("SEM-V"))
        {
            ArrayAdapter<CharSequence> adapter4=ArrayAdapter.createFromResource(resultinsert.this,R.array.subjects_5, android.R.layout.simple_spinner_dropdown_item);
            adapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinner.setAdapter(adapter4);
        }
        else if(sem.equals("SEM-VI"))
        {
            ArrayAdapter<CharSequence> adapter5=ArrayAdapter.createFromResource(resultinsert.this,R.array.subjects_6, android.R.layout.simple_spinner_dropdown_item);
            adapter5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinner.setAdapter(adapter5);
        }
        else {
            Toast.makeText(this, "NULL", Toast.LENGTH_SHORT).show();
        }
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String regid=getIntent().getStringExtra("regid");
                String sem=getIntent().getStringExtra("semres1");
                int reg=Integer.parseInt(regid);
                String s1=editText1.getText().toString();
                int n1=Integer.parseInt(s1);
                String sub=spinner.getSelectedItem().toString();
                String s2=editText2.getText().toString();
                int n2=Integer.parseInt(s2);
                if(sub.equals("Physics-I") & n1<=50 & n2<=50 & sem.equals("SEM-I"))
                {
                    boolean res=db.pinsert(reg,n1,n2);
                    if(res == true)
                    {
                        Toast.makeText(resultinsert.this, "Inserted successfully", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(resultinsert.this, "Already inserted", Toast.LENGTH_SHORT).show();
                    }
                }
                else if(sub.equals("Telugu-I") & n1<=50 & n2<=50 & sem.equals("SEM-I"))
                {
                    boolean res=db.tinsert(reg,n1,n2);
                    if(res == true)
                    {
                        Toast.makeText(resultinsert.this, "Inserted successfully", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(resultinsert.this, "Already inserted", Toast.LENGTH_SHORT).show();
                    }
                }
                else if(sub.equals("English-I") & n1<=50 & n2<=50 & sem.equals("SEM-I"))
                {
                    boolean res=db.insert(reg,n1,n2);
                    if(res == true)
                    {
                        Toast.makeText(resultinsert.this, "Inserted successfully", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(resultinsert.this, "Already inserted", Toast.LENGTH_SHORT).show();
                    }
                }
                else if(sub.equals("Maths-I") & n1<=50 & n2<=50 & sem.equals("SEM-I"))
                {
                    boolean res=db.minsert(reg,n1,n2);
                    if(res == true)
                    {
                        Toast.makeText(resultinsert.this, "Inserted successfully", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(resultinsert.this, "Already inserted", Toast.LENGTH_SHORT).show();
                    }
                }
                else if(sub.equals("Computer science-I") & n1<=50 & n2<=50 & sem.equals("SEM-I"))
                {
                    boolean res=db.cinsert(reg,n1,n2);
                    if(res == true)
                    {
                        Toast.makeText(resultinsert.this, "Inserted successfully", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(resultinsert.this, "Already inserted", Toast.LENGTH_SHORT).show();
                    }
                }
                else if(sub.equals("Computer science(P)-I") & n1<=50 & n2<=50 & sem.equals("SEM-I"))
                {
                    boolean res=db.cpinsert(reg,n1,n2);
                    if(res == true)
                    {
                        Toast.makeText(resultinsert.this, "Inserted successfully", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(resultinsert.this, "Already inserted", Toast.LENGTH_SHORT).show();
                    }
                }
                else if(sub.equals("Physics(P)-I") & n1<=50 & n2<=50 & sem.equals("SEM-I"))
                {
                    boolean res=db.ppinsert(reg,n1,n2);
                    if(res == true)
                    {
                        Toast.makeText(resultinsert.this, "Inserted successfully", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(resultinsert.this, "Already inserted", Toast.LENGTH_SHORT).show();
                    }
                }
                else if(sub.equals("Physics-II") & n1<=50 & n2<=50 & sem.equals("SEM-II"))
                {
                    boolean res=db1.s2pinsert(reg,n1,n2);
                    if(res == true)
                    {
                        Toast.makeText(resultinsert.this, "Inserted successfully", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(resultinsert.this, "Already inserted", Toast.LENGTH_SHORT).show();
                    }
                }
                else if(sub.equals("English-II") & n1<=50 & n2<=50 & sem.equals("SEM-II"))
                {
                    boolean res=db1.s2insert(reg,n1,n2);
                    if(res == true)
                    {
                        Toast.makeText(resultinsert.this, "Inserted successfully", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(resultinsert.this, "Already inserted", Toast.LENGTH_SHORT).show();
                    }
                }
                else if(sub.equals("Telugu-II") & n1<=50 & n2<=50 & sem.equals("SEM-II"))
                {
                    boolean res=db1.s2tinsert(reg,n1,n2);
                    if(res == true)
                    {
                        Toast.makeText(resultinsert.this, "Inserted successfully", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(resultinsert.this, "Already inserted", Toast.LENGTH_SHORT).show();
                    }
                }
                else if(sub.equals("Computer science-II") & n1<=50 & n2<=50 & sem.equals("SEM-II"))
                {
                    boolean res=db1.s2cinsert(reg,n1,n2);
                    if(res == true)
                    {
                        Toast.makeText(resultinsert.this, "Inserted successfully", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(resultinsert.this, "Already inserted", Toast.LENGTH_SHORT).show();
                    }
                }
                else if(sub.equals("Maths-II") & n1<=50 & n2<=50 & sem.equals("SEM-II"))
                {
                    boolean res=db1.s2minsert(reg,n1,n2);
                    if(res == true)
                    {
                        Toast.makeText(resultinsert.this, "Inserted successfully", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(resultinsert.this, "Already inserted", Toast.LENGTH_SHORT).show();
                    }
                }
                else if(sub.equals("Physics(P)-II") & n1<=50 & n2<=50 & sem.equals("SEM-II"))
                {
                    boolean res=db1.s2ppinsert(reg,n1,n2);
                    if(res == true)
                    {
                        Toast.makeText(resultinsert.this, "Inserted successfully", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(resultinsert.this, "Already inserted", Toast.LENGTH_SHORT).show();
                    }
                }
                else if(sub.equals("Computer science(P)-II") & n1<=50 & n2<=50 & sem.equals("SEM-II"))
                {
                    boolean res=db1.s2cpinsert(reg,n1,n2);
                    if(res == true)
                    {
                        Toast.makeText(resultinsert.this, "Inserted successfully", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(resultinsert.this, "Already inserted", Toast.LENGTH_SHORT).show();
                    }
                }
                else if(sub.equals("English-III") & n1<=50 & n2<=50 & sem.equals("SEM-III"))
                {
                    boolean res=db3.s3insert(reg,n1,n2);
                    if(res == true)
                    {
                        Toast.makeText(resultinsert.this, "Inserted successfully", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(resultinsert.this, "Already inserted", Toast.LENGTH_SHORT).show();
                    }
                }
                else if(sub.equals("Telugu-III") & n1<=50 & n2<=50 & sem.equals("SEM-III"))
                {
                    boolean res=db3.s3tinsert(reg,n1,n2);
                    if(res == true)
                    {
                        Toast.makeText(resultinsert.this, "Inserted successfully", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(resultinsert.this, "Already inserted", Toast.LENGTH_SHORT).show();
                    }
                }
                else if(sub.equals("Maths-III") & n1<=50 & n2<=50 & sem.equals("SEM-III"))
                {
                    boolean res=db3.s3minsert(reg,n1,n2);
                    if(res == true)
                    {
                        Toast.makeText(resultinsert.this, "Inserted successfully", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(resultinsert.this, "Already inserted", Toast.LENGTH_SHORT).show();
                    }
                }
                else if(sub.equals("Physics-III") & n1<=50 & n2<=50 & sem.equals("SEM-III"))
                {
                    boolean res=db3.s3pinsert(reg,n1,n2);
                    if(res == true)
                    {
                        Toast.makeText(resultinsert.this, "Inserted successfully", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(resultinsert.this, "Already inserted", Toast.LENGTH_SHORT).show();
                    }
                }
                else if(sub.equals("Computer science-III") & n1<=50 & n2<=50 & sem.equals("SEM-III"))
                {
                    boolean res=db3.s3cinsert(reg,n1,n2);
                    if(res == true)
                    {
                        Toast.makeText(resultinsert.this, "Inserted successfully", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(resultinsert.this, "Already inserted", Toast.LENGTH_SHORT).show();
                    }
                }
                else if(sub.equals("Physics(P)-III") & n1<=50 & n2<=50 & sem.equals("SEM-III"))
                {
                    boolean res=db3.s3ppinsert(reg,n1,n2);
                    if(res == true)
                    {
                        Toast.makeText(resultinsert.this, "Inserted successfully", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(resultinsert.this, "Already inserted", Toast.LENGTH_SHORT).show();
                    }
                }
                else if(sub.equals("Computer science(P)-III") & n1<=50 & n2<=50 & sem.equals("SEM-III"))
                {
                    boolean res=db3.s3cpinsert(reg,n1,n2);
                    if(res == true)
                    {
                        Toast.makeText(resultinsert.this, "Inserted successfully", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(resultinsert.this, "Already inserted", Toast.LENGTH_SHORT).show();
                    }
                }
                else if(sub.equals("English-IV") & n1<=50 & n2<=50 & sem.equals("SEM-IV"))
                {
                    boolean res=db4.s4insert(reg,n1,n2);
                    if(res == true)
                    {
                        Toast.makeText(resultinsert.this, "Inserted successfully", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(resultinsert.this, "Already inserted", Toast.LENGTH_SHORT).show();
                    }
                }
                else if(sub.equals("Telugu-IV") & n1<=50 & n2<=50 & sem.equals("SEM-IV"))
                {
                    boolean res=db4.s4tinsert(reg,n1,n2);
                    if(res == true)
                    {
                        Toast.makeText(resultinsert.this, "Inserted successfully", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(resultinsert.this, "Already inserted", Toast.LENGTH_SHORT).show();
                    }
                }
                else if(sub.equals("Maths-IV") & n1<=50 & n2<=50 & sem.equals("SEM-IV"))
                {
                    boolean res=db4.s4minsert(reg,n1,n2);
                    if(res == true)
                    {
                        Toast.makeText(resultinsert.this, "Inserted successfully", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(resultinsert.this, "Already inserted", Toast.LENGTH_SHORT).show();
                    }
                }
                else if(sub.equals("Physics-IV") & n1<=50 & n2<=50 & sem.equals("SEM-IV"))
                {
                    boolean res=db4.s4pinsert(reg,n1,n2);
                    if(res == true)
                    {
                        Toast.makeText(resultinsert.this, "Inserted successfully", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(resultinsert.this, "Already inserted", Toast.LENGTH_SHORT).show();
                    }
                }
                else if(sub.equals("Computer science-IV") & n1<=50 & n2<=50 & sem.equals("SEM-IV"))
                {
                    boolean res=db4.s4cinsert(reg,n1,n2);
                    if(res == true)
                    {
                        Toast.makeText(resultinsert.this, "Inserted successfully", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(resultinsert.this, "Already inserted", Toast.LENGTH_SHORT).show();
                    }
                }
                else if(sub.equals("Physics(P)-IV") & n1<=50 & n2<=50 & sem.equals("SEM-IV"))
                {
                    boolean res=db4.s4ppinsert(reg,n1,n2);
                    if(res == true)
                    {
                        Toast.makeText(resultinsert.this, "Inserted successfully", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(resultinsert.this, "Already inserted", Toast.LENGTH_SHORT).show();
                    }
                }
                else if(sub.equals("Computer science(P)-IV") & n1<=50 & n2<=50 & sem.equals("SEM-IV"))
                {
                    boolean res=db4.s4cpinsert(reg,n1,n2);
                    if(res == true)
                    {
                        Toast.makeText(resultinsert.this, "Inserted successfully", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(resultinsert.this, "Already inserted", Toast.LENGTH_SHORT).show();
                    }
                }
                else if(sub.equals("Maths-PI") & n1<=50 & n2<=50 & sem.equals("SEM-V"))
                {
                    boolean res=db5.s5minsertp1(reg,n1,n2);
                    if(res == true)
                    {
                        Toast.makeText(resultinsert.this, "Inserted successfully", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(resultinsert.this, "Already inserted", Toast.LENGTH_SHORT).show();
                    }
                }
                else if(sub.equals("Maths-PII") & n1<=50 & n2<=50 & sem.equals("SEM-V"))
                {
                    boolean res=db5.s5minsertp2(reg,n1,n2);
                    if(res == true)
                    {
                        Toast.makeText(resultinsert.this, "Inserted successfully", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(resultinsert.this, "Already inserted", Toast.LENGTH_SHORT).show();
                    }
                }
                else if(sub.equals("Physics-PI") & n1<=50 & n2<=50 & sem.equals("SEM-V"))
                {
                    boolean res=db5.s5pinsertp1(reg,n1,n2);
                    if(res == true)
                    {
                        Toast.makeText(resultinsert.this, "Inserted successfully", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(resultinsert.this, "Already inserted", Toast.LENGTH_SHORT).show();
                    }
                }
                else if(sub.equals("Physics-PII") & n1<=50 & n2<=50 & sem.equals("SEM-V"))
                {
                    boolean res=db5.s5pinsertp2(reg,n1,n2);
                    if(res == true)
                    {
                        Toast.makeText(resultinsert.this, "Inserted successfully", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(resultinsert.this, "Already inserted", Toast.LENGTH_SHORT).show();
                    }
                }
                else if(sub.equals("Computer science-PI") & n1<=50 & n2<=50 & sem.equals("SEM-V"))
                {
                    boolean res=db5.s5cinsertp1(reg,n1,n2);
                    if(res == true)
                    {
                        Toast.makeText(resultinsert.this, "Inserted successfully", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(resultinsert.this, "Already inserted", Toast.LENGTH_SHORT).show();
                    }
                }
                else if(sub.equals("Computer science-PII") & n1<=50 & n2<=50 & sem.equals("SEM-V"))
                {
                    boolean res=db5.s5cinsertp2(reg,n1,n2);
                    if(res == true)
                    {
                        Toast.makeText(resultinsert.this, "Inserted successfully", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(resultinsert.this, "Already inserted", Toast.LENGTH_SHORT).show();
                    }
                }
                else if(sub.equals("Physics(P)-PI") & n1<=50 & n2<=50 & sem.equals("SEM-V"))
                {
                    boolean res=db5.s5pinsertpp1(reg,n1,n2);
                    if(res == true)
                    {
                        Toast.makeText(resultinsert.this, "Inserted successfully", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(resultinsert.this, "Already inserted", Toast.LENGTH_SHORT).show();
                    }
                }
                else if(sub.equals("Physics(P)-PII") & n1<=50 & n2<=50 & sem.equals("SEM-V"))
                {
                    boolean res=db5.s5pinsertpp2(reg,n1,n2);
                    if(res == true)
                    {
                        Toast.makeText(resultinsert.this, "Inserted successfully", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(resultinsert.this, "Already inserted", Toast.LENGTH_SHORT).show();
                    }
                }
                else if(sub.equals("Computer science(P)-PI") & n1<=50 & n2<=50 & sem.equals("SEM-V"))
                {
                    boolean res=db5.s5cinsertpp1(reg,n1,n2);
                    if(res == true)
                    {
                        Toast.makeText(resultinsert.this, "Inserted successfully", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(resultinsert.this, "Already inserted", Toast.LENGTH_SHORT).show();
                    }
                }
                else if(sub.equals("Computer science(P)-PII") & n1<=50 & n2<=50 & sem.equals("SEM-V"))
                {
                    boolean res=db5.s5cinsertpp2(reg,n1,n2);
                    if(res == true)
                    {
                        Toast.makeText(resultinsert.this, "Inserted successfully", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(resultinsert.this, "Already inserted", Toast.LENGTH_SHORT).show();
                    }
                }
                else if(sub.equals("Maths-VI") & n1<=50 & n2<=50 & sem.equals("SEM-VI"))
                {
                    boolean res=db6.s6minsert(reg,n1,n2);
                    if(res == true)
                    {
                        Toast.makeText(resultinsert.this, "Inserted successfully", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(resultinsert.this, "Already inserted", Toast.LENGTH_SHORT).show();
                    }
                }
                else if(sub.equals("Physics-VI") & n1<=50 & n2<=50 & sem.equals("SEM-VI"))
                {
                    boolean res=db6.s6pinsert(reg,n1,n2);
                    if(res == true)
                    {
                        Toast.makeText(resultinsert.this, "Inserted successfully", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(resultinsert.this, "Already inserted", Toast.LENGTH_SHORT).show();
                    }
                }
                else if(sub.equals("Computer science-VI") & n1<=50 & n2<=50 & sem.equals("SEM-VI"))
                {
                    boolean res=db6.s6cinsert(reg,n1,n2);
                    if(res == true)
                    {
                        Toast.makeText(resultinsert.this, "Inserted successfully", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(resultinsert.this, "Already inserted", Toast.LENGTH_SHORT).show();
                    }
                }
                else if(sub.equals("Physics(P)-VI") & n1<=50 & n2<=50 & sem.equals("SEM-VI"))
                {
                    boolean res=db6.s6pinsertp(reg,n1,n2);
                    if(res == true)
                    {
                        Toast.makeText(resultinsert.this, "Inserted successfully", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(resultinsert.this, "Already inserted", Toast.LENGTH_SHORT).show();
                    }
                }
                else if(sub.equals("Computer science(P)-VI") & n1<=50 & n2<=50 & sem.equals("SEM-VI"))
                {
                    boolean res=db6.s6cinsertp(reg,n1,n2);
                    if(res == true)
                    {
                        Toast.makeText(resultinsert.this, "Inserted successfully", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(resultinsert.this, "Already inserted", Toast.LENGTH_SHORT).show();
                    }
                }
                else if(sub.equals("Computer science-CPI") & n1<=50 & n2<=50 & sem.equals("SEM-VI"))
                {
                    boolean res=db6.s6cinsertc1(reg,n1,n2);
                    if(res == true)
                    {
                        Toast.makeText(resultinsert.this, "Inserted successfully", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(resultinsert.this, "Already inserted", Toast.LENGTH_SHORT).show();
                    }
                }
                else if(sub.equals("Computer science-CPII") & n1<=50 & n2<=50 & sem.equals("SEM-VI"))
                {
                    boolean res=db6.s6cinsertc2(reg,n1,n2);
                    if(res == true)
                    {
                        Toast.makeText(resultinsert.this, "Inserted successfully", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(resultinsert.this, "Already inserted", Toast.LENGTH_SHORT).show();
                    }
                }
                else if(sub.equals("Computer science-CPIII") & n1<=50 & n2<=50 & sem.equals("SEM-VI"))
                {
                    boolean res=db6.s6cinsertc3(reg,n1,n2);
                    if(res == true)
                    {
                        Toast.makeText(resultinsert.this, "Inserted successfully", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(resultinsert.this, "Already inserted", Toast.LENGTH_SHORT).show();
                    }
                }
                else if(sub.equals("Computer science(P)-CPI") & n1<=50 & n2<=50 & sem.equals("SEM-VI"))
                {
                    boolean res=db6.s6cinsertc1p(reg,n1,n2);
                    if(res == true)
                    {
                        Toast.makeText(resultinsert.this, "Inserted successfully", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(resultinsert.this, "Already inserted", Toast.LENGTH_SHORT).show();
                    }
                }
                else if(sub.equals("Computer science(P)-CPII") & n1<=50 & n2<=50 & sem.equals("SEM-VI"))
                {
                    boolean res=db6.s6cinsertc2p(reg,n1,n2);
                    if(res == true)
                    {
                        Toast.makeText(resultinsert.this, "Inserted successfully", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(resultinsert.this, "Already inserted", Toast.LENGTH_SHORT).show();
                    }
                }
                else if(sub.equals("Computer science(P)-CPIII") & n1<=50 & n2<=50 & sem.equals("SEM-VI"))
                {
                    boolean res=db6.s6cinsertc3p(reg,n1,n2);
                    if(res == true)
                    {
                        Toast.makeText(resultinsert.this, "Inserted successfully", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(resultinsert.this, "Already inserted", Toast.LENGTH_SHORT).show();
                    }
                }
                else
                {
                    Toast.makeText(resultinsert.this, "Wrong subject", Toast.LENGTH_SHORT).show();
                }
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String sem=getIntent().getStringExtra("semres1");
                String reg=getIntent().getStringExtra("regid");
                //Cursor cursor=db.eresult(reg);
                //if(cursor.getCount() >0)
                //{
                    //StringBuffer stringBuffer=new StringBuffer();
                    //while(cursor.moveToNext())
                    //{
                        //stringBuffer.append("name"+cursor.getString(0)+"\n");
                        //stringBuffer.append("name"+cursor.getString(1)+"\n");
                        //stringBuffer.append("name"+cursor.getString(2)+"\n");
                        //stringBuffer.append("name"+cursor.getString(3)+"\n");
                    //}
                    //AlertDialog.Builder builder=new AlertDialog.Builder(resultinsert.this);
                    //builder.setTitle("data");
                    //builder.setCancelable(true);
                    //builder.setMessage(stringBuffer);
                    //builder.show();
                //}
                //else
                //{
                    //Toast.makeText(resultinsert.this, "Error", Toast.LENGTH_SHORT).show();
               //}
                Intent intent=new Intent(resultinsert.this,finalresult.class);
                intent.putExtra("sem",sem);
                intent.putExtra("reg",reg);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_right,R.anim.slide_left);
            }

        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String sem=getIntent().getStringExtra("semres1");
                String regid=getIntent().getStringExtra("regid");
                String s1=editText1.getText().toString();
                int n1=Integer.parseInt(s1);
                String s2=editText2.getText().toString();
                int n2=Integer.parseInt(s2);
                String sub=spinner.getSelectedItem().toString();
                if(sub.equals("English-I") & sem.equals("SEM-I"))
                {
                    boolean res=db.eupdate(regid,n1,n2);
                    if(res == true)
                    {
                        Toast.makeText(resultinsert.this, "Updated successfully", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(resultinsert.this, "Error occurred/Account does not exist", Toast.LENGTH_SHORT).show();
                    }
                }
                else if(sub.equals("Telugu-I") & sem.equals("SEM-I"))
                {
                    boolean res=db.tupdate(regid,n1,n2);
                    if(res == true)
                    {
                        Toast.makeText(resultinsert.this, "Updated successfully", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(resultinsert.this, "Error occurred/Account does not exist", Toast.LENGTH_SHORT).show();
                    }
                }
                else if(sub.equals("Maths-I") & sem.equals("SEM-I"))
                {
                    boolean res=db.mupdate(regid,n1,n2);
                    if(res == true)
                    {
                        Toast.makeText(resultinsert.this, "Updated successfully", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(resultinsert.this, "Error occurred/Account does not exist", Toast.LENGTH_SHORT).show();
                    }
                }
                else if(sub.equals("Physics-I") & sem.equals("SEM-I"))
                {
                    boolean res=db.pupdate(regid,n1,n2);
                    if(res == true)
                    {
                        Toast.makeText(resultinsert.this, "Updated successfully", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(resultinsert.this, "Error occurred/Account does not exist", Toast.LENGTH_SHORT).show();
                    }
                }
                else if(sub.equals("Computer science-I") & sem.equals("SEM-I"))
                {
                    boolean res=db.cupdate(regid,n1,n2);
                    if(res == true)
                    {
                        Toast.makeText(resultinsert.this, "Updated successfully", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(resultinsert.this, "Error occurred/Account does not exist", Toast.LENGTH_SHORT).show();
                    }
                }
                else if(sub.equals("Computer science(P)-I") & sem.equals("SEM-I"))
                {
                    boolean res=db.cpupdate(regid,n1,n2);
                    if(res == true)
                    {
                        Toast.makeText(resultinsert.this, "Updated successfully", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(resultinsert.this, "Error occurred/Account does not exist", Toast.LENGTH_SHORT).show();
                    }
                }
                else if(sub.equals("Physics(P)-I") & sem.equals("SEM-I"))
                {
                    boolean res=db.ppupdate(regid,n1,n2);
                    if(res == true)
                    {
                        Toast.makeText(resultinsert.this, "Updated successfully", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(resultinsert.this, "Error occurred/Account does not exist", Toast.LENGTH_SHORT).show();
                    }
                }
                else if(sub.equals("English-II") & sem.equals("SEM-II"))
                {
                    boolean res=db1.s2eupdate(regid,n1,n2);
                    if(res == true)
                    {
                        Toast.makeText(resultinsert.this, "Updated successfully", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(resultinsert.this, "Error occurred/Account does not exist", Toast.LENGTH_SHORT).show();
                    }
                }
                else if(sub.equals("Telugu-II") & sem.equals("SEM-II"))
                {
                    boolean res=db1.s2tupdate(regid,n1,n2);
                    if(res == true)
                    {
                        Toast.makeText(resultinsert.this, "Updated successfully", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(resultinsert.this, "Error occurred/Account does not exist", Toast.LENGTH_SHORT).show();
                    }
                }
                else if(sub.equals("Maths-II") & sem.equals("SEM-II"))
                {
                    boolean res=db1.s2mupdate(regid,n1,n2);
                    if(res == true)
                    {
                        Toast.makeText(resultinsert.this, "Updated successfully", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(resultinsert.this, "Error occurred/Account does not exist", Toast.LENGTH_SHORT).show();
                    }
                }
                else if(sub.equals("Physics-II") & sem.equals("SEM-II"))
                {
                    boolean res=db1.s2pupdate(regid,n1,n2);
                    if(res == true)
                    {
                        Toast.makeText(resultinsert.this, "Updated successfully", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(resultinsert.this, "Error occurred/Account does not exist", Toast.LENGTH_SHORT).show();
                    }
                }
                else if(sub.equals("Computer science-II") & sem.equals("SEM-II"))
                {
                    boolean res=db1.s2cupdate(regid,n1,n2);
                    if(res == true)
                    {
                        Toast.makeText(resultinsert.this, "Updated successfully", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(resultinsert.this, "Error occurred/Account does not exist", Toast.LENGTH_SHORT).show();
                    }
                }
                else if(sub.equals("Computer science(P)-II") & sem.equals("SEM-II"))
                {
                    boolean res=db1.s2cpupdate(regid,n1,n2);
                    if(res == true)
                    {
                        Toast.makeText(resultinsert.this, "Updated successfully", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(resultinsert.this, "Error occurred/Account does not exist", Toast.LENGTH_SHORT).show();
                    }
                }
                else if(sub.equals("Physics(P)") & sem.equals("SEM-II"))
                {
                    boolean res=db1.s2pupdate(regid,n1,n2);
                    if(res == true)
                    {
                        Toast.makeText(resultinsert.this, "Updated successfully", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(resultinsert.this, "Error occurred/Account does not exist", Toast.LENGTH_SHORT).show();
                    }
                }
                else if(sub.equals("English-III") & sem.equals("SEM-III"))
                {
                    boolean res=db3.s3eupdate(regid,n1,n2);
                    if(res == true)
                    {
                        Toast.makeText(resultinsert.this, "Updated successfully", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(resultinsert.this, "Error occurred/Account does not exist", Toast.LENGTH_SHORT).show();
                    }
                }
                else if(sub.equals("Telugu-III") & sem.equals("SEM-III"))
                {
                    boolean res=db3.s3tupdate(regid,n1,n2);
                    if(res == true)
                    {
                        Toast.makeText(resultinsert.this, "Updated successfully", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(resultinsert.this, "Error occurred/Account does not exist", Toast.LENGTH_SHORT).show();
                    }
                }
                else if(sub.equals("Maths-III") & sem.equals("SEM-III"))
                {
                    boolean res=db3.s3mupdate(regid,n1,n2);
                    if(res == true)
                    {
                        Toast.makeText(resultinsert.this, "Updated successfully", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(resultinsert.this, "Error occurred/Account does not exist", Toast.LENGTH_SHORT).show();
                    }
                }
                else if(sub.equals("Physics-III") & sem.equals("SEM-III"))
                {
                    boolean res=db3.s3pupdate(regid,n1,n2);
                    if(res == true)
                    {
                        Toast.makeText(resultinsert.this, "Updated successfully", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(resultinsert.this, "Error occurred/Account does not exist", Toast.LENGTH_SHORT).show();
                    }
                }
                else if(sub.equals("Computer science-III") & sem.equals("SEM-III"))
                {
                    boolean res=db3.s3cupdate(regid,n1,n2);
                    if(res == true)
                    {
                        Toast.makeText(resultinsert.this, "Updated successfully", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(resultinsert.this, "Error occurred/Account does not exist", Toast.LENGTH_SHORT).show();
                    }
                }
                else if(sub.equals("Computer science(P)-III") & sem.equals("SEM-III"))
                {
                    boolean res=db3.s3cpupdate(regid,n1,n2);
                    if(res == true)
                    {
                        Toast.makeText(resultinsert.this, "Updated successfully", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(resultinsert.this, "Error occurred/Account does not exist", Toast.LENGTH_SHORT).show();
                    }
                }
                else if(sub.equals("Physics(P)-III") & sem.equals("SEM-III"))
                {
                    boolean res=db3.s3ppupdate(regid,n1,n2);
                    if(res == true)
                    {
                        Toast.makeText(resultinsert.this, "Updated successfully", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(resultinsert.this, "Error occurred/Account does not exist", Toast.LENGTH_SHORT).show();
                    }
                }
                else if(sub.equals("English-III") & sem.equals("SEM-IV"))
                {
                    boolean res=db4.s4eupdate(regid,n1,n2);
                    if(res == true)
                    {
                        Toast.makeText(resultinsert.this, "Updated successfully", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(resultinsert.this, "Error occurred/Account does not exist", Toast.LENGTH_SHORT).show();
                    }
                }
                else if(sub.equals("Telugu-IV") & sem.equals("SEM-IV"))
                {
                    boolean res=db4.s4tupdate(regid,n1,n2);
                    if(res == true)
                    {
                        Toast.makeText(resultinsert.this, "Updated successfully", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(resultinsert.this, "Error occurred/Account does not exist", Toast.LENGTH_SHORT).show();
                    }
                }
                else if(sub.equals("Maths-IV") & sem.equals("SEM-IV"))
                {
                    boolean res=db4.s4mupdate(regid,n1,n2);
                    if(res == true)
                    {
                        Toast.makeText(resultinsert.this, "Updated successfully", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(resultinsert.this, "Error occurred/Account does not exist", Toast.LENGTH_SHORT).show();
                    }
                }
                else if(sub.equals("Physics-IV") & sem.equals("SEM-IV"))
                {
                    boolean res=db4.s4pupdate(regid,n1,n2);
                    if(res == true)
                    {
                        Toast.makeText(resultinsert.this, "Updated successfully", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(resultinsert.this, "Error occurred/Account does not exist", Toast.LENGTH_SHORT).show();
                    }
                }
                else if(sub.equals("Computer science-IV") & sem.equals("SEM-IV"))
                {
                    boolean res=db4.s4cupdate(regid,n1,n2);
                    if(res == true)
                    {
                        Toast.makeText(resultinsert.this, "Updated successfully", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(resultinsert.this, "Error occurred/Account does not exist", Toast.LENGTH_SHORT).show();
                    }
                }
                else if(sub.equals("Computer science(P)-IV") & sem.equals("SEM-IV"))
                {
                    boolean res=db4.s4cpupdate(regid,n1,n2);
                    if(res == true)
                    {
                        Toast.makeText(resultinsert.this, "Updated successfully", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(resultinsert.this, "Error occurred/Account does not exist", Toast.LENGTH_SHORT).show();
                    }
                }
                else if(sub.equals("Physics(P)-IV") & sem.equals("SEM-IV"))
                {
                    boolean res=db4.s4ppupdate(regid,n1,n2);
                    if(res == true)
                    {
                        Toast.makeText(resultinsert.this, "Updated successfully", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(resultinsert.this, "Error occurred/Account does not exist", Toast.LENGTH_SHORT).show();
                    }
                }
                else if(sub.equals("Maths-PI") & sem.equals("SEM-V"))
                {
                    boolean res=db5.s5mupdatep1(regid,n1,n2);
                    if(res == true)
                    {
                        Toast.makeText(resultinsert.this, "Updated successfully", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(resultinsert.this, "Error occurred/Account does not exist", Toast.LENGTH_SHORT).show();
                    }
                }
                else if(sub.equals("Maths-PII") & sem.equals("SEM-V"))
                {
                    boolean res=db5.s5mupdatep2(regid,n1,n2);
                    if(res == true)
                    {
                        Toast.makeText(resultinsert.this, "Updated successfully", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(resultinsert.this, "Error occurred/Account does not exist", Toast.LENGTH_SHORT).show();
                    }
                }
                else if(sub.equals("Physics-PI") & sem.equals("SEM-V"))
                {
                    boolean res=db5.s5pupdatep1(regid,n1,n2);
                    if(res == true)
                    {
                        Toast.makeText(resultinsert.this, "Updated successfully", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(resultinsert.this, "Error occurred/Account does not exist", Toast.LENGTH_SHORT).show();
                    }
                }
                else if(sub.equals("Physics-PII") & sem.equals("SEM-V"))
                {
                    boolean res=db5.s5pupdatep2(regid,n1,n2);
                    if(res == true)
                    {
                        Toast.makeText(resultinsert.this, "Updated successfully", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(resultinsert.this, "Error occurred/Account does not exist", Toast.LENGTH_SHORT).show();
                    }
                }
                else if(sub.equals("Computer science-PI") & sem.equals("SEM-V"))
                {
                    boolean res=db5.s5cupdatep1(regid,n1,n2);
                    if(res == true)
                    {
                        Toast.makeText(resultinsert.this, "Updated successfully", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(resultinsert.this, "Error occurred/Account does not exist", Toast.LENGTH_SHORT).show();
                    }
                }
                else if(sub.equals("Computer science-PII") & sem.equals("SEM-V"))
                {
                    boolean res=db5.s5cupdatep2(regid,n1,n2);
                    if(res == true)
                    {
                        Toast.makeText(resultinsert.this, "Updated successfully", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(resultinsert.this, "Error occurred/Account does not exist", Toast.LENGTH_SHORT).show();
                    }
                }
                else if(sub.equals("Physics(P)-PI") & sem.equals("SEM-V"))
                {
                    boolean res=db5.s5pupdatepp1(regid,n1,n2);
                    if(res == true)
                    {
                        Toast.makeText(resultinsert.this, "Updated successfully", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(resultinsert.this, "Error occurred/Account does not exist", Toast.LENGTH_SHORT).show();
                    }
                }
                else if(sub.equals("Physics(P)-PII") & sem.equals("SEM-V"))
                {
                    boolean res=db5.s5pupdatepp2(regid,n1,n2);
                    if(res == true)
                    {
                        Toast.makeText(resultinsert.this, "Updated successfully", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(resultinsert.this, "Error occurred/Account does not exist", Toast.LENGTH_SHORT).show();
                    }
                }
                else if(sub.equals("Computer science(P)-PI") & sem.equals("SEM-V"))
                {
                    boolean res=db5.s5cupdatepp1(regid,n1,n2);
                    if(res == true)
                    {
                        Toast.makeText(resultinsert.this, "Updated successfully", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(resultinsert.this, "Error occurred/Account does not exist", Toast.LENGTH_SHORT).show();
                    }
                }
                else if(sub.equals("Computer science(P)-PII") & sem.equals("SEM-V"))
                {
                    boolean res=db5.s5cupdatepp2(regid,n1,n2);
                    if(res == true)
                    {
                        Toast.makeText(resultinsert.this, "Updated successfully", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(resultinsert.this, "Error occurred/Account does not exist", Toast.LENGTH_SHORT).show();
                    }
                }
                else if(sub.equals("Maths-VI") & sem.equals("SEM-VI"))
                {
                    boolean res=db6.s6mupdate(regid,n1,n2);
                    if(res == true)
                    {
                        Toast.makeText(resultinsert.this, "Updated successfully", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(resultinsert.this, "Error occurred/Account does not exist", Toast.LENGTH_SHORT).show();
                    }
                }
                else if(sub.equals("Physics-VI") & sem.equals("SEM-VI"))
                {
                    boolean res=db6.s6pupdate(regid,n1,n2);
                    if(res == true)
                    {
                        Toast.makeText(resultinsert.this, "Updated successfully", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(resultinsert.this, "Error occurred/Account does not exist", Toast.LENGTH_SHORT).show();
                    }
                }
                else if(sub.equals("Computer science-VI") & sem.equals("SEM-VI"))
                {
                    boolean res=db6.s6cupdate(regid,n1,n2);
                    if(res == true)
                    {
                        Toast.makeText(resultinsert.this, "Updated successfully", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(resultinsert.this, "Error occurred/Account does not exist", Toast.LENGTH_SHORT).show();
                    }
                }
                else if(sub.equals("Physics(P)-VI") & sem.equals("SEM-VI"))
                {
                    boolean res=db6.s6pupdatep(regid,n1,n2);
                    if(res == true)
                    {
                        Toast.makeText(resultinsert.this, "Updated successfully", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(resultinsert.this, "Error occurred/Account does not exist", Toast.LENGTH_SHORT).show();
                    }
                }
                else if(sub.equals("Computer science(P)-VI") & sem.equals("SEM-VI"))
                {
                    boolean res=db6.s6cupdatep(regid,n1,n2);
                    if(res == true)
                    {
                        Toast.makeText(resultinsert.this, "Updated successfully", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(resultinsert.this, "Error occurred/Account does not exist", Toast.LENGTH_SHORT).show();
                    }
                }
                else if(sub.equals("Computer science-CPI") & sem.equals("SEM-VI"))
                {
                    boolean res=db6.s6cupdatec1(regid,n1,n2);
                    if(res == true)
                    {
                        Toast.makeText(resultinsert.this, "Updated successfully", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(resultinsert.this, "Error occurred/Account does not exist", Toast.LENGTH_SHORT).show();
                    }
                }
                else if(sub.equals("Computer science-CPII") & sem.equals("SEM-VI"))
                {
                    boolean res=db6.s6cupdatec2(regid,n1,n2);
                    if(res == true)
                    {
                        Toast.makeText(resultinsert.this, "Updated successfully", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(resultinsert.this, "Error occurred/Account does not exist", Toast.LENGTH_SHORT).show();
                    }
                }
                else if(sub.equals("Computer science-CPIII") & sem.equals("SEM-VI"))
                {
                    boolean res=db6.s6cupdatec3(regid,n1,n2);
                    if(res == true)
                    {
                        Toast.makeText(resultinsert.this, "Updated successfully", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(resultinsert.this, "Error occurred/Account does not exist", Toast.LENGTH_SHORT).show();
                    }
                }
                else if(sub.equals("Computer science(P)-CPI") & sem.equals("SEM-VI"))
                {
                    boolean res=db6.s6cupdatec1p(regid,n1,n2);
                    if(res == true)
                    {
                        Toast.makeText(resultinsert.this, "Updated successfully", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(resultinsert.this, "Error occurred/Account does not exist", Toast.LENGTH_SHORT).show();
                    }
                }
                else if(sub.equals("Computer science(P)-CPII") & sem.equals("SEM-VI"))
                {
                    boolean res=db6.s6cupdatec2p(regid,n1,n2);
                    if(res == true)
                    {
                        Toast.makeText(resultinsert.this, "Updated successfully", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(resultinsert.this, "Error occurred/Account does not exist", Toast.LENGTH_SHORT).show();
                    }
                }
                else if(sub.equals("Computer science(P)-CPIII") & sem.equals("SEM-VI"))
                {
                    boolean res=db6.s6cupdatec3p(regid,n1,n2);
                    if(res == true)
                    {
                        Toast.makeText(resultinsert.this, "Updated successfully", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(resultinsert.this, "Error occurred/Account does not exist", Toast.LENGTH_SHORT).show();
                    }
                }
                else
                {
                    Toast.makeText(resultinsert.this, "Wrong subject", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    public void onBackPressed()
    {
        super.onBackPressed();
        overridePendingTransition(R.anim.slide_left,R.anim.slide_out_right);
    }
}