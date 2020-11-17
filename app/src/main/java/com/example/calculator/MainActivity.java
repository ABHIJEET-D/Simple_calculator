package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

import java.math.BigDecimal;

public class MainActivity extends AppCompatActivity {
    Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn_add,btn_mul,btn_sub,btn_div,btn_mod,
            btn_c,btn_ac,btn_decimal,btn_ans,btn_equal;
    TextView tv,tv_up;
    BigDecimal first,second,result;
    String symbol = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btn_add = findViewById(R.id.btn_add);
        btn_mul = findViewById(R.id.btn_mul);
        btn_sub = findViewById(R.id.btn_sub);
        btn_div = findViewById(R.id.btn_div);
        btn_mod = findViewById(R.id.btn_mod);
        btn_c = findViewById(R.id.btn_c);
        btn_ac = findViewById(R.id.btn_ac);
        btn_decimal = findViewById(R.id.btn_decimal);
        btn_ans =findViewById(R.id.btn_ans);
        btn_equal =findViewById(R.id.btn_equal);
        btn0 =findViewById(R.id.btn0);

        tv = findViewById(R.id.tv);
        tv_up = findViewById(R.id.tv_up);
        tv.setText("");
        tv_up.setText("");

        btn0.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v) {
                tv.setText(tv.getText()+"0");
            }
        });

        btn1.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v) {
                tv.setText(tv.getText()+"1");
            }
        });

        btn2.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v) {
                tv.setText(tv.getText()+"2");
            }
        });

        btn3.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v) {
                tv.setText(tv.getText()+"3");
            }
        });

        btn4.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v) {
                tv.setText(tv.getText()+"4");
            }
        });

        btn5.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v) {
                tv.setText(tv.getText()+"5");
            }
        });

        btn6.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v) {
                tv.setText(tv.getText()+"6");
            }
        });

        btn7.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v) {
                tv.setText(tv.getText()+"7");
            }
        });

        btn8.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v) {
                tv.setText(tv.getText()+"8");
            }
        });

        btn9.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v) {
                tv.setText(tv.getText()+"9");
            }
        });

        btn_decimal.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v) {
                if(!tv.getText().toString().contains("."))
                tv.setText(tv.getText()+".");
            }
        });

        btn_add.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v) {
                try {
                    first = new BigDecimal(tv.getText().toString());
                    tv_up.setText(first+"+");
                    symbol = "+";
                    tv.setText("");
                }
                catch (Exception e){}

            }
        });

        btn_sub.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v) {
                try {
                    first = new BigDecimal(tv.getText().toString());
                    tv_up.setText(first+"-");
                    symbol = "-";
                    tv.setText("");
                }
                catch (Exception e){}
            }
        });

        btn_mul.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v) {
                try {
                    first = new BigDecimal(tv.getText().toString());
                    tv_up.setText(first+"X");
                    symbol = "X";
                    tv.setText("");
                }
                catch (Exception e){}
            }
        });

        btn_div.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v) {
                try {
                    first = new BigDecimal(tv.getText().toString());
                    tv_up.setText(first+"/");
                    symbol = "/";
                    tv.setText("");
                }
                catch (Exception e){}
            }
        });

        btn_ac.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v) {
                try {
                    tv.setText("");
                    tv_up.setText("");
                }
                catch (Exception e){}
            }
        });

        btn_c.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v) {
                try {
                    int len = tv.getText().toString().length();
                    tv.setText(tv.getText().subSequence(0, len - 1));
                }
                catch (Exception e){}
            }
        });

        btn_ans.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v) {
                tv.setText(tv.getText().toString().substring(1));
                tv_up.setText("");
            }
        });

        btn_equal.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v) {
                try {


                second = new BigDecimal(tv.getText().toString());
                switch(symbol){
                    case "+":
                        result=first.add(second);
                        tv.setText("="+result);
                        tv_up.setText(tv_up.getText()+second.toString());
                        break;

                    case "-":
                        result=first.subtract(second);
                        tv.setText("="+result);
                        tv_up.setText(tv_up.getText()+second.toString());
                        break;

                    case "X":
                        result=first.multiply(second);
                        tv.setText("="+result);
                        tv_up.setText(tv_up.getText()+second.toString());
                        break;

                    case "/":
                        result=first.divide(second);
                        tv.setText("="+result);
                        tv_up.setText(tv_up.getText()+second.toString());
                        break;
                }
            }
                catch (Exception e){}
            }

        });


    }
}