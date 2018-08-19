package com.example.pepi.calculatorapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    Button btnSum,btnDiv,btnMul,btnSub,btnMod;
    EditText firstNr,secondNr;
    TextView result;

    Calculator calculator=new Calculator();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnSum=(Button) findViewById(R.id.btnSum);
        btnSub=(Button) findViewById(R.id.btnSub);
        btnMul=(Button) findViewById(R.id.btnMultiply);
        btnDiv=(Button) findViewById(R.id.btnDivide);
        btnMod=(Button) findViewById(R.id.btnMod);

        firstNr=(EditText) findViewById(R.id.inputOne);
        secondNr=(EditText)findViewById(R.id.inputTwo);

        result=(TextView) findViewById(R.id.txtResult);




        btnSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {

                    checkInputs(firstNr.getText().toString(),
                                secondNr.getText().toString());

                    double sum=calculator.Adition();

                    result.setText("Result: "+sum);

                }catch (Exception e){

                    result.setText(e.getMessage());
                }

            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {

                    checkInputs(firstNr.getText().toString(),
                            secondNr.getText().toString());

                    double sub=calculator.Subtraction();

                    result.setText("Result: "+sub);

                }catch (Exception e)
                {
                    result.setText(e.getMessage());
                }

            }
        });


        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{

                    checkInputs(firstNr.getText().toString(),
                            secondNr.getText().toString());

                    double mul=calculator.Multiplication();

                    result.setText("Result: "+mul);

                }catch (Exception e)
                {
                    result.setText(e.getMessage());
                }
            }
        });


        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try{

                    checkInputs(firstNr.getText().toString(),
                            secondNr.getText().toString());

                    double div=calculator.Division();

                    result.setText("Result: "+div);

                }catch (Exception e)
                {
                    result.setText(e.getMessage());
                }

            }
        });

        btnMod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try{

                    checkInputs(firstNr.getText().toString(),
                            secondNr.getText().toString());

                    double mod=calculator.Mod();

                    result.setText("Result: "+mod);

                }catch (Exception e)
                {
                    result.setText(e.getMessage());
                }

            }
        });





    }


    private void checkInputs(String inputOne, String inputTwo) throws Exception {

        if(TextUtils.isEmpty(inputOne) || TextUtils.isEmpty(inputTwo))
        {
            throw new Exception("Not allowed empty fields");
        }


        double first=Double.parseDouble(inputOne);
        double second=Double.parseDouble(inputTwo);

        calculator.setFirst(first);
        calculator.setSecond(second);

    }
}
