package com.example.practice5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class astudent extends AppCompatActivity {
    EditText editText;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_astudent);
        getSupportActionBar().hide();
        editText=findViewById(R.id.ase1);
        button=findViewById(R.id.asb1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String reg=editText.getText().toString();
                Intent intent=new Intent(astudent.this,finalresult.class);
                intent.putExtra("reg",reg);
                startActivity(intent);
            }
        });
    }
}