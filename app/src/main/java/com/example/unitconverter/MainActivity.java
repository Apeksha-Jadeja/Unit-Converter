package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
//declare widgets
    EditText editText;
    TextView textView,textView4,textView2,valueInPounds;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //instantiating widgets
        textView=findViewById(R.id.textView);
        textView2=findViewById(R.id.textView2);
        textView4=findViewById(R.id.textView4);
        valueInPounds=findViewById(R.id.textView3);

        editText=findViewById(R.id.editTextNumber);
        button=findViewById(R.id.button);

        //adding click event
        button.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                ConvertFromKiloToPound();
            }
        });
    }

    private void ConvertFromKiloToPound() {
        String valueEntered=editText.getText().toString();
        double kilo=Double.parseDouble(valueEntered);
        double pound=kilo*2.205;
        valueInPounds.setText("" + pound);
    }
}