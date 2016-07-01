package com.basiccalc.basiccalculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnAdd, btnSub, btnDivide, btnMul;
    private TextView tvResult;
    private EditText etNum1, etNum2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        btnAdd = (Button)findViewById(R.id.btnAdd);
        btnSub = (Button)findViewById(R.id.btnSub);
        btnDivide = (Button)findViewById(R.id.btnDivide);
        btnMul = (Button)findViewById(R.id.btnMul);
        etNum1 = (EditText)findViewById(R.id.etNum1);
        etNum2 = (EditText)findViewById(R.id.etNum2);
        tvResult = (TextView)findViewById(R.id.tvResult);

        btnAdd.setOnClickListener(this);
        btnSub.setOnClickListener(this);
        btnDivide.setOnClickListener(this);
        btnMul.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        String Num1 = etNum1.getText().toString();
        String Num2 = etNum2.getText().toString();
        switch(view.getId()){
            case R.id.btnAdd:
                int addition = Integer.parseInt(Num1) + Integer.parseInt(Num2);
                tvResult.setText(String.valueOf(addition));
                break;
            case R.id.btnSub:
                int subtraction = Integer.parseInt(Num1) - Integer.parseInt(Num2);
                tvResult.setText(String.valueOf(subtraction));
                break;
            case R.id.btnDivide:
                try{
                    int division = Integer.parseInt(Num1) / Integer.parseInt(Num2);
                    tvResult.setText(String.valueOf(division));
                }catch(Exception e){
                    tvResult.setText("Cannot DIVIDE!!!");
                }
                break;
            case R.id.btnMul:
                int multiply = Integer.parseInt(Num1) * Integer.parseInt(Num2);
                tvResult.setText(String.valueOf(multiply));
                break;
        }
    }
}
