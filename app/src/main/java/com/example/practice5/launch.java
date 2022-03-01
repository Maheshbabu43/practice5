package com.example.practice5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class launch extends AppCompatActivity {
    Spinner s1;
    Button button1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch);
        getSupportActionBar().hide();
        s1=findViewById(R.id.lsp1);
        button1=findViewById(R.id.lb1);
        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(launch.this,R.array.category, android.R.layout.simple_spinner_dropdown_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s1.setAdapter(adapter);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String cat=s1.getSelectedItem().toString();
                if(cat.equals("Student"))
                {
                    Intent intent=new Intent(launch.this,astudent.class);
                    startActivity(intent);
                    overridePendingTransition(R.anim.slide_right,R.anim.slide_out_left);
                }
                else if(cat.equals("Administrator"))
                {
                    Intent intent1 = new Intent(launch.this, aadmin.class);
                    startActivity(intent1);
                    overridePendingTransition(R.anim.fade_in,R.anim.fade_out);
                }
                else {
                    Toast.makeText(launch.this, "Select one category", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}