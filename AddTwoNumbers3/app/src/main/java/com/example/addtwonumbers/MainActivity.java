package com.example.addtwonumbers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       EditText etNum3 = findViewById(R.id.editTextNumber4);
       EditText etNum6 = findViewById(R.id.editTextNumber5);
       Button btnAdd = findViewById(R.id.button2);
        Button btnSub = findViewById(R.id.button3);
        Button btnMUl = findViewById(R.id.button4);
        Button btnDiv = findViewById(R.id.button5);

       TextView tvResult = (TextView) findViewById(R.id.texv);



          btnAdd.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View view) {
                  int num1=Integer.parseInt(etNum3.getText().toString());
                  int num2=Integer.parseInt(etNum6.getText().toString());
                  int result=num1+num2;

                  tvResult.setText(Integer.toString(result));


              }
          });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1=Integer.parseInt(etNum3.getText().toString());
                int num2=Integer.parseInt(etNum6.getText().toString());
                int result=num1-num2;

                tvResult.setText(Integer.toString(result));


            }
        });

        btnMUl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1=Integer.parseInt(etNum3.getText().toString());
                int num2=Integer.parseInt(etNum6.getText().toString());
                int result=num1*num2;

                tvResult.setText(Integer.toString(result));


            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1=Integer.parseInt(etNum3.getText().toString());
                int num2=Integer.parseInt(etNum6.getText().toString());
                int result=num1/num2;

                tvResult.setText(Integer.toString(result));


            }
        });



        }
    }
