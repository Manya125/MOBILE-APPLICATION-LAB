package com.example.sharedpreference;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText T1;
EditText T2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        T1=(EditText) findViewById(R.id.T1);
        T2=(EditText) findViewById(R.id.T2);
    }
    public void B1(View view)
    {
        SharedPreferences sp=getSharedPreferences("MYDATA", Context.MODE_PRIVATE);
        SharedPreferences.Editor ed=sp.edit();
        ed.putString("T1",T1.getText().toString());
        ed.putString("T2",T1.getText().toString());
        ed.commit();
        Toast.makeText(this,"SAVED SUCCESSFULLY",Toast.LENGTH_LONG).show();
    }
    public void B2(View view)
    {
        Toast.makeText(this,"SAVED SUCCESSFULLY",Toast.LENGTH_LONG).show();
        Intent in=new Intent(this,ActivityB.class);
        startActivity(in);
    }
}
