package com.pucescus.schetchik;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    
    private EditText input;
    private Button button;
    private TextView output;

    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        input = findViewById(R.id.input);
        button = findViewById(R.id.button);
        output = findViewById(R.id.output);

        button.setOnClickListener(listener);
    }
    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String inputString = input.getText().toString();
            String[] inputArray = inputString.split("\\s+");

            int numberbukv = 0;
            for (String word: inputArray) {

                numberbukv = numberbukv + word.length();

            }
            output.setText("В введенном тексте " + inputArray.length + " слов и " + numberbukv + " букв");
        }

    };

}



















