package com.example.newcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    TextView txtDisplay,txtResult;
    long result = 0;

    Button btnOne, btnTwo, btnThree, btnFour, btnFive,btnSix, btnSeven, btnEight, btnNine;
    Button btnAdd, btnSub, btnEqual, btnMulti, btnDivide, btnBackspace, btnZero;

    String input1, input2, operator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



//        requestWindowFeature(getWindow().FEATURE_NO_TITLE);
//        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
//        getSupportActionBar().hide();   //this line hide the action bar


        setContentView(R.layout.activity_main);

        txtDisplay=findViewById(R.id.txtDisplay);
        txtResult=findViewById(R.id.txtResult);

        btnOne= findViewById(R.id.btnOne);
        btnTwo= findViewById(R.id.btnTwo);
        btnThree= findViewById(R.id.btnThree);
        btnFour= findViewById(R.id.btnFour);
        btnFive= findViewById(R.id.btnFive);
        btnSix= findViewById(R.id.btnSix);
        btnSeven= findViewById(R.id.btnSeven);
        btnEight= findViewById(R.id.btnEight);
        btnNine= findViewById(R.id.btnNine);

        btnAdd= findViewById(R.id.btnAdd);
        btnSub= findViewById(R.id.btnSub);
        btnEqual= findViewById(R.id.btnEqual);
        btnMulti= findViewById(R.id.btnMulti);
        btnDivide= findViewById(R.id.btnDivide);
        btnBackspace= findViewById(R.id.btnBackspace);
        btnZero= findViewById(R.id.btnZero);


        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtDisplay.setText(txtDisplay.getText()+"1");
            }
        });

        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtDisplay.setText(txtDisplay.getText()+"2");
            }
        });

        btnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtDisplay.setText(txtDisplay.getText()+"3");
            }
        });

        btnFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtDisplay.setText(txtDisplay.getText()+"4");
            }
        });

        btnFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtDisplay.setText(txtDisplay.getText()+"5");
            }
        });

        btnSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtDisplay.setText(txtDisplay.getText()+"6");
            }
        });

        btnSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtDisplay.setText(txtDisplay.getText()+"7");
            }
        });

        btnEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtDisplay.setText(txtDisplay.getText()+"8");
            }
        });

        btnNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtDisplay.setText(txtDisplay.getText()+"9");
            }
        });

        btnZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtDisplay.setText(txtDisplay.getText()+"0");
            }
        });


        btnBackspace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = txtDisplay.getText().toString();
                if(str.length()>1){
                    str = str.substring(0, str.length()-1);
                    txtDisplay.setText(str);
                }
                else if(str.length()<=1){
                    txtDisplay.setText("");
                }
            }
        });

        btnBackspace.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                txtDisplay.setText("");
                return false;
            }
        });

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String input= txtDisplay.getText().toString();
                if(input.equals("")){
                    Toast.makeText(getApplicationContext(),"Enter value first",Toast.LENGTH_LONG).show();
                }
                else{
                    txtDisplay.setText(txtDisplay.getText() + "+");
                    input1 = input;
                    operator = "+";
                }
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String input= txtDisplay.getText().toString();
                if(input.equals("")){
                    Toast.makeText(getApplicationContext(),"Enter value first",Toast.LENGTH_LONG).show();
                }
                else{
                    txtDisplay.setText(txtDisplay.getText() + "-");
                    input1 = input;
                    operator = "-";
                }
            }
        });

        btnMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String input= txtDisplay.getText().toString();
                if(input.equals("")){
                    Toast.makeText(getApplicationContext(),"Enter value first",Toast.LENGTH_LONG).show();
                }
                else{
                    txtDisplay.setText(txtDisplay.getText() + "×");
                    input1 = input;
                    operator ="*";
                }
            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String input= txtDisplay.getText().toString();
                if(input.equals("")){
                    Toast.makeText(getApplicationContext(),"Enter value first",Toast.LENGTH_LONG).show();
                }
                else{
                    txtDisplay.setText(txtDisplay.getText() + "÷");
                    input1 = input;
                    operator ="/";
                }
            }
        });

        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String input = txtDisplay.getText().toString();
                
                if(!Objects.equals(input1, "") && input.length() > input1.length() +1){
                    input2 = input.substring(input1.length()+1);

                    switch (operator){
                        case "+":
                            if(result == 0){
                                result = Long.parseLong(input1) + Long.parseLong(input2);
                                txtResult.setText(String.valueOf(result));
                            }
                            else{
                                input1 = String.valueOf(result);
                                result = Long.parseLong(input1) + Long.parseLong(input2);
                                txtResult.setText(String.valueOf(result));
                            }
                           break;
                        case "-":
                            if(result == 0){
                                result = Long.parseLong(input1) - Long.parseLong(input2);
                                txtResult.setText(String.valueOf(result));
                            }
                            else{
                                input1 = String.valueOf(result);
                                result = Long.parseLong(input1) - Long.parseLong(input2);
                                txtResult.setText(String.valueOf(result));
                            }
                            break;
                        case "*":
                            if(Objects.equals(result,"")){
                                result = Long.parseLong(input1) * Long.parseLong(input2);
                                txtResult.setText(String.valueOf(result));
                            }
                            else{
                                input1 = String.valueOf(result);
                                result = Long.parseLong(input1) * Long.parseLong(input2);
                                txtResult.setText(String.valueOf(result));
                            }
                            break;
                        case "/":
                            if(Objects.equals(result,"")){
                                result = Long.parseLong(input1) / Long.parseLong(input2);
                                txtResult.setText(String.valueOf(result));
                            }
                            else{
                                input1 = String.valueOf(result);
                                result = Long.parseLong(input1) / Long.parseLong(input2);
                                txtResult.setText(String.valueOf(result));
                            }
                            break;
                    }

                }
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "App Start", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "App Restart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "App Pause", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "App closed", Toast.LENGTH_SHORT).show();

    }
}