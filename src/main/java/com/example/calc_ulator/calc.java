package com.example.calc_ulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class calc extends AppCompatActivity implements View.OnClickListener{
    EditText number;
    TextView ip;
    Button one,two,three,four,five,six,seven,eight,nine,zero,add,sub,mul,div,eq,clear,mod;
    int no1=0,no2=0;
    String op;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);
        number=(EditText) findViewById(R.id.number);
        ip=(TextView) findViewById(R.id.ip_no);
        one=(Button) findViewById(R.id.one_id);
        one.setOnClickListener(this);
        two=(Button) findViewById(R.id.two_id);
        two.setOnClickListener(this);
        three=(Button) findViewById(R.id.three_id);
        three.setOnClickListener(this);
        four=(Button) findViewById(R.id.four_id);
        four.setOnClickListener(this);
        five=(Button) findViewById(R.id.five_id);
        five.setOnClickListener(this);
        six=(Button) findViewById(R.id.six_id);
        six.setOnClickListener(this);
        seven=(Button) findViewById(R.id.seven_id);
        seven.setOnClickListener(this);
        eight=(Button) findViewById(R.id.eight_id);
        eight.setOnClickListener(this);
        nine=(Button) findViewById(R.id.nine_id);
        nine.setOnClickListener(this);
        zero=(Button) findViewById(R.id.zero_id);
        zero.setOnClickListener(this);

        add=(Button) findViewById(R.id.addition_id);
        add.setOnClickListener(this);
        sub=(Button) findViewById(R.id.subtract_id);
        sub.setOnClickListener(this);
        mul=(Button) findViewById(R.id.multiply_id);
        mul.setOnClickListener(this);
        div=(Button) findViewById(R.id.divide_id);
        div.setOnClickListener(this);
        eq=(Button) findViewById(R.id.answer_id);
        eq.setOnClickListener(this);
        mod=(Button) findViewById(R.id.mod);
        mod.setOnClickListener(this);
        clear=(Button) findViewById(R.id.clear_id);
        clear.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {

        String st=((Button) view).getText().toString();
        switch (st){
            case "1":no1=(no1*10)+1;
                number.setText(String.valueOf(no1));
                break;
            case "2":no1=(no1*10)+2;
                number.setText(String.valueOf(no1));
                break;
            case "3":no1=(no1*10)+3;
                number.setText(String.valueOf(no1));
                break;
            case "4":no1=(no1*10)+4;
                number.setText(String.valueOf(no1));
                break;
            case "5":no1=(no1*10)+5;
                number.setText(String.valueOf(no1));
                break;
            case "6":no1=(no1*10)+6;
                number.setText(String.valueOf(no1));
                break;
            case "7":no1=(no1*10)+7;
                number.setText(String.valueOf(no1));
                break;
            case "8":no1=(no1*10)+8;
                number.setText(String.valueOf(no1));
                break;
            case "9":no1=(no1*10)+9;
                number.setText(String.valueOf(no1));
                break;
            case "0":no1=(no1*10)+0;
                number.setText(String.valueOf(no1));
                break;
            case "+":no2=no1;
                op="+";
                no1=0;
                ip.setText(String.valueOf(no2)+"+");
                number.setText("");
                break;
            case "-":no2=no1;
                op="-";
                no1=0;
                ip.setText(String.valueOf(no2)+"-");
                number.setText("");
                break;
            case "*":no2=no1;
                op="*";
                no1=0;
                ip.setText(String.valueOf(no2)+"*");
                number.setText("");
                break;
            case "/":no2=no1;
                op="/";
                no1=0;
                ip.setText(String.valueOf(no2)+"/");
                number.setText("");
                break;
            case "%":no2=no1;
                op="%";
                no1=0;
                ip.setText(String.valueOf(no2)+"%");
                number.setText("");
                break;
            case "AC":ip.setText("");
                number.setText("");
                no1=0;
                no2=0;
                break;
            case "=":{
                float ans;
                switch(op)
                {
                    case "+":ans=no2+no1;
                        ip.setText("");
                        number.setText(String.valueOf(ans));
                        break;
                    case "-":ans=no2-no1;
                        ip.setText("");
                        number.setText(String.valueOf(ans));
                        break;
                    case "*":ans=no2*no1;
                        ip.setText("");
                        number.setText(String.valueOf(ans));
                        break;
                    case "/":ans=no2/no1;
                        ip.setText("");
                        number.setText(String.valueOf(ans));
                        break;
                    case "%":ans=no2%no1;
                        ip.setText("");
                        number.setText(String.valueOf(ans));
                        break;
                    default: break;
                }
            }
            default: break;
        }
    }
}