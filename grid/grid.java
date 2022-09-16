package com.example.grid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText ed1;
    Boolean newop=true;
    String old,op;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1=findViewById(R.id.res);
    }
    public void numberEvent(View view){
        if(newop){
            ed1.setText("");
        }
        newop=false;
        String num=ed1.getText().toString();
        switch(view.getId()) {
            case R.id.b1:
                num += "1";
                break;
            case R.id.b2:
                num += "2";
                break;
            case R.id.b3:
                num += "3";
                break;
            case R.id.b4:
                num += "4";
                break;
            case R.id.b5:
                num += "5";
                break;
            case R.id.b6:
                num += "6";
                break;
            case R.id.b7:
                num += "7";
                break;
            case R.id.b8:
                num += "8";
                break;
            case R.id.b9:
                num += "9";
                break;
            case R.id.b0:
                num += "0";
                break;
            case R.id.bclr:
                num = " ";
                break;

        }
        ed1.setText(num);
    }

    public void operatorEvent(View view){
        newop=true;
        old=ed1.getText().toString();
        switch(view.getId()) {
            case R.id.badd:
                op = "+";
                break;
            case R.id.bsub:
                op = "-";
                break;
            case R.id.bdiv:
                op = "/";
                break;
            case R.id.bmul:
                op = "*";
                break;
        }
    }


    public void equalEvent(View view){
        String newno=ed1.getText().toString();
        double result=0.0;
        switch (op){
            case "+":
                result=Double.parseDouble(old)+Double.parseDouble(newno);
                break;
            case "-":
                result=Double.parseDouble(old)-Double.parseDouble(newno);
                break;
            case "/":
                result=Double.parseDouble(old)/Double.parseDouble(newno);
                break;
            case "*":
                result=Double.parseDouble(old)*Double.parseDouble(newno);
                break;
        }
        ed1.setText(result+"");
    }
}
