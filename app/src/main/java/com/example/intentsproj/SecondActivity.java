package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    int num1;
    int num2;
    TextView addResult;
    TextView calc_information;
    Button btnAdd;
    Button btnSub;
    Button btnMul;
    Button btnDiv;
    Double user_input1;
    Double user_input2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        addResult=findViewById(R.id.calc_display);
        btnAdd=findViewById(R.id.btn_add);
        btnSub=findViewById(R.id.btn_sub);
        btnMul=findViewById(R.id.btn_mul);
        btnDiv=findViewById(R.id.btn_div);
        calc_information=findViewById(R.id.calc_info);

        btnAdd.setText("+");
        btnSub.setText("-");
        btnMul.setText("*" );
        btnDiv.setText("/");

        Intent intent = getIntent();
        //String user_input1 = intent.getStringExtra("user_input1");
        //  String user_input2 = intent.getStringExtra("user_input2");
        user_input1 =intent.getDoubleExtra("Number1",0);
        user_input2 =intent.getDoubleExtra("Number2",0);
        //num1 = Double.parseDouble(user_input1.getText().toString());
        //addResult.setText(Double.toString(sum));
        //num1 = extras.getIntExtra("Number1",0);
        TextView txt1 = findViewById(R.id.Userinput1);
        TextView txt2 = findViewById(R.id.Userinput2);
        // num2 = extras.getIntExtra("Number2",0);
        txt1.setText(Double.toString(user_input1));
        txt2.setText(Double.toString(user_input2));



    }

    @Override
    protected void onResume() {
        super.onResume();

        btnAdd.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                double sum=user_input1+user_input2;
                calc_information.setText(user_input1+" "+"+"+" "+user_input2+"  "+"="+" ");
                addResult.setText(Double.toString(sum));
            }
        });
        btnMul.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                double sum=user_input1*user_input2;
                calc_information.setText(user_input1+" "+"*"+" "+user_input2+"  "+"="+" ");
                addResult.setText(Double.toString(sum));
            }
        });
        btnSub.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                double sum=user_input1-user_input2;
                calc_information.setText(user_input1+" "+"-"+" "+user_input2+"  "+"="+" ");
                addResult.setText(Double.toString(sum));
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                double sum=user_input1/user_input2;
                calc_information.setText(user_input1+" "+"/"+" "+user_input2+"  "+"="+" ");
                addResult.setText(Double.toString(sum));
            }
        });

    }


}
