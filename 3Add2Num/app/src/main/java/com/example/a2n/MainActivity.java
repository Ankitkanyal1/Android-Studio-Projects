package com.example.a2n;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText number1;
    EditText number2;
    Button button;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        number1=(EditText) findViewById(R.id.editText_firstN);
        number2=(EditText) findViewById(R.id.editText_SecondN);
        button=(Button) findViewById(R.id.add_button);
        result=(TextView) findViewById(R.id.textView_ans);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num1=Double.parseDouble(number1.getText().toString());
                double num2=Double.parseDouble(number2.getText().toString());
                double sum=num1+num2;
                result.setText(Double.toString(sum));

            }
        });
    }
}