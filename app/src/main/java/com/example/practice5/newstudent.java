package com.example.practice5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class newstudent extends AppCompatActivity {
    EditText editText1,editText2,editText3;
    Spinner spinner1,spinner2;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newstudent);
        getSupportActionBar().hide();
        editText1=findViewById(R.id.nse1);
        editText2=findViewById(R.id.nse2);
        editText3=findViewById(R.id.nse3);
        spinner1=findViewById(R.id.gender);
        spinner2=findViewById(R.id.sec);
        database db=new database(this);
        ArrayAdapter<CharSequence> adapter1=ArrayAdapter.createFromResource(this,R.array.gender, android.R.layout.simple_spinner_dropdown_item);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(adapter1);
        ArrayAdapter<CharSequence> adapter2=ArrayAdapter.createFromResource(this,R.array.section, android.R.layout.simple_spinner_dropdown_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(adapter2);
        button=findViewById(R.id.nsb1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name=editText1.getText().toString();
                String regid1=editText2.getText().toString();
                int reg=Integer.parseInt(regid1);
                String dob=editText3.getText().toString();
                String gender=spinner1.getSelectedItem().toString();
                String section=spinner2.getSelectedItem().toString();
                boolean res=db.sinsert(name,reg,dob,section,gender);
                if(res == true)
                {
                    Toast.makeText(newstudent.this, "Inserted successfully", Toast.LENGTH_SHORT).show();
                    Intent intent=new Intent(newstudent.this,MainActivity.class);
                    intent.putExtra("section",section);
                    startActivity(intent);
                }
                else
                {
                    Toast.makeText(newstudent.this, "Unable to insert", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}