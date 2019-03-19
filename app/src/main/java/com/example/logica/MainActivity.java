package com.example.logica;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.Spanned;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText txt1;
    private EditText txt2;
    private EditText txt3;
    private EditText txt4;

    private Button validate;

    private boolean input1;
    private boolean input2;
    private boolean input3;
    private boolean input4;

    Context context;

    CharSequence textGoed = "Dat klopt!";
    CharSequence textFout = "Nee helaas!";
    int duration = Toast.LENGTH_SHORT;
    Toast toast;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt1 = findViewById(R.id.input);;
        txt2 = findViewById(R.id.input1);
        txt3 = findViewById(R.id.input2);
        txt4 = findViewById(R.id.input3);

        validate = findViewById(R.id.submit);

        context = getApplicationContext();



        validate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checkInput()){
                    toast = Toast.makeText(context, textGoed, duration);
                    toast.show();
                }
                else {
                    toast = Toast.makeText(context, textFout, duration);
                    toast.show();
                }
            }
        });


    }

    private boolean checkInput() {

        if(txt1.getText().toString().equals("f") || txt1.getText().toString().equals("F")) {
            input1 = true;
        }
        else input1 = false;
        if(txt2.getText().toString().equals("t") || txt2.getText().toString().equals("T")) {
            input2 = true;
        }
        else input2 = false;
        if(txt3.getText().toString().equals("f") || txt3.getText().toString().equals("F")) {
            input3 = true;
        }
        else input3 = false;
        if(txt4.getText().toString().equals("t") || txt4.getText().toString().equals("T")) {
            input4 = true;
        }
        else input4 = false;

        if(input1 == true && input2 == true && input3 == true && input4 == true) {
            return true;
        }

        return false;
    }


}
