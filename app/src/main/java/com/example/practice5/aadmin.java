package com.example.practice5;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.DialogInterface;
import android.content.Intent;
import android.hardware.biometrics.BiometricPrompt;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

import java.util.concurrent.Executor;

public class aadmin extends AppCompatActivity {
    TextInputEditText e1,e2;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aadmin);
        getSupportActionBar().hide();
        e1=findViewById(R.id.aanamee1);
        e2=findViewById(R.id.aapassworde2);
        button=findViewById(R.id.aab1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name=e1.getText().toString();
                String password=e2.getText().toString();
                if(name.equals("naresh") & password.equals("192616"))
                {
                    Intent intent2=new Intent(aadmin.this,MainActivity.class);
                    startActivity(intent2);
                    overridePendingTransition(R.anim.slide_right,R.anim.slide_out_left);
                }
                else
                {
                    AlertDialog.Builder builder=new AlertDialog.Builder(aadmin.this);
                    builder.setTitle("⚠Warning!!");
                    builder.setMessage("Incorrect user Name or Password");
                    builder.setCancelable(false);
                    builder.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                        }
                    });
                    builder.show();
                    //Toast.makeText(aadmin.this, "Incorrect user name/password", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}