package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button b1,b2,b3,b4;
    private EditText f,s;
    private TextView res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.addbtn);
        b2=findViewById(R.id.subbtn);
        b3=findViewById(R.id.mulbtn);
        b4=findViewById(R.id.divbtn);
        f=findViewById(R.id.first);
        s=findViewById(R.id.second);
        res=findViewById(R.id.res);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1,n2,n3;
                n1=Integer.parseInt(f.getText().toString());
                n2=Integer.parseInt(s.getText().toString());
                n3=n1+n2;
                res.setText(String.valueOf(n3));
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1,n2,n3;
                n1=Integer.parseInt(f.getText().toString());
                n2=Integer.parseInt(s.getText().toString());
                n3=n1-n2;
                res.setText(String.valueOf(n3));
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1,n2,n3;
                n1=Integer.parseInt(f.getText().toString());
                n2=Integer.parseInt(s.getText().toString());
                n3=n1*n2;
                res.setText(String.valueOf(n3));
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1,n2,n3;
                n1=Integer.parseInt(f.getText().toString());
                n2=Integer.parseInt(s.getText().toString());
                n3=n1/n2;
                res.setText(String.valueOf(n3));
            }
        });

    }
}
