package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {


    Button btn2;
    EditText number1;
    EditText number2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        btn2= findViewById(R.id.btn1);
        btn2.setText("OK");

        Log.i("Lifecycle","OnCreate() involked");

        number1=findViewById(R.id.message1);
        number2=findViewById(R.id.message2);

    }


    @Override
    protected void onResume() {
        super.onResume();


        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Double input1= number1.getText().toString();
                // Double = Double.parseDouble(firstNumber.getText().toString());
                Double input1 = Double.parseDouble(number1.getText().toString());
                Double input2 = Double.parseDouble(number2.getText().toString());
                //String input2= number2.getText().toString();
                //int userInput1 = new Integer(input1).intValue();
                // int userInput2 =new Integer(input2).intValue();

                Intent intent = new Intent(FirstActivity.this,SecondActivity.class);
                //intent.putExtra(String.valueOf(number1),userInput1);
                // intent.putExtra("Number1",userInput1);
                //intent.putExtra("Number2",userInput2);
                // intent.putExtra("user_input1",input1);
                // intent.putExtra("user_input2",input2);
                intent.putExtra("Number1",input1);
                intent.putExtra("Number2",input2);
                startActivity(intent);

                Context context = getApplicationContext(); //The context to use. Usually your Application or Activity object
                CharSequence message = "You just clicked the OK button"; //Display string
                int duration = Toast.LENGTH_SHORT; //How long the toast message will lasts
                Toast toast = Toast.makeText(context, message, duration);
                toast.show();
                toast.setGravity(Gravity.TOP| Gravity.LEFT, 0, 0);
            }
        });


    }






}