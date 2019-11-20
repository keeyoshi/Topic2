package com.ninzen.topic1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnCalculate;
    EditText etFirst, etSecond;
    RadioButton radioSum,radioSub,radionDivide,radioMultiply;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnCalculate=findViewById(R.id.btnCal);
        etFirst=findViewById(R.id.etfirst);
        etSecond=findViewById(R.id.etSecond);
        radioSum= findViewById(R.id.radioSum);
        radioSub=findViewById(R.id.radioSub);
        radioMultiply=findViewById(R.id.radioMultiply);
        radionDivide=findViewById(R.id.radioDivide);

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int result=0;
                int first = Integer.parseInt(etFirst.getText().toString());
                int second = Integer.parseInt(etSecond.getText().toString());
                if(radioSub.isChecked())
                {
                    result= first-second;
                }
                else if( radioSum.isChecked())
                {
                    result=first+second;
                }
                else if( radioMultiply.isChecked())
                {
                    result=first*second;
                }
                else if( radionDivide.isChecked())
                {
                    result=first/second;
                }

                Toast.makeText(MainActivity.this, "The result is "+result, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
