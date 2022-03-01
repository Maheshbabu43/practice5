package com.example.practice5;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Spinner s1;
    EditText editText;
    TextView textView;
    Button button1,button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        //Intent intent=new Intent(MainActivity.this,astudent.class);
        //startActivity(intent);
        s1=findViewById(R.id.sem);
        editText=findViewById(R.id.e1);
        textView=findViewById(R.id.t1);
        button1=findViewById(R.id.b1);
        button2=findViewById(R.id.b2);
        database db=new database(this);
        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(MainActivity.this,R.array.semister, android.R.layout.simple_spinner_dropdown_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s1.setAdapter(adapter);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String regid=editText.getText().toString();
                String semres=s1.getSelectedItem().toString();
                boolean res=db.checkregid(regid);
                if(res == true)
                {
                    Toast.makeText(MainActivity.this, "account exist", Toast.LENGTH_SHORT).show();
                    Intent intent=new Intent(MainActivity.this,resultinsert.class);
                    String sec=intent.getStringExtra("section");
                    intent.putExtra("regid",regid);
                    intent.putExtra("semres1",semres);
                    intent.putExtra("section",sec);
                    startActivity(intent);
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Error occurred", Toast.LENGTH_SHORT).show();
                }
            }
        });
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,newstudent.class);
                startActivity(intent);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Cursor cursor=db.cursor();
                StringBuffer stringBuffer=new StringBuffer();
                while(cursor.moveToNext())
                {
                    stringBuffer.append("Name:"+cursor.getString(0)+"\n");
                    stringBuffer.append("Regid:"+cursor.getString(1)+"\n");
                    stringBuffer.append("Dob:"+cursor.getString(2)+"\n");
                    stringBuffer.append("Section:"+cursor.getString(3)+"\n");
                    stringBuffer.append("Gender:"+cursor.getString(4)+"\n");
                }
                AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("Records");
                builder.setMessage(stringBuffer);
                builder.setCancelable(true);
                builder.show();
            }
        });
    }
}