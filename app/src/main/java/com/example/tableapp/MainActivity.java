package com.example.tableapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView textView, textView2;
    private EditText Num1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView);
        textView2 = findViewById(R.id.textView2);
        Num1 = findViewById(R.id.Num1);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Created by : Hiren Patel", Toast.LENGTH_SHORT).show();
                String s = Num1.getText().toString();
                float num = Float.parseFloat(s);
            if(num<=10000.0) {
                textView2.setText("Multiplication Table of " + num + " is :" + "\n" + "\n" +
                        num + "  *  01   =   " + num * 1 + "\n" +
                        num + "  *  02   =   " + num * 2 + "\n" +
                        num + "  *  03   =   " + num * 3 + "\n" +
                        num + "  *  04   =   " + num * 4 + "\n" +
                        num + "  *  05   =   " + num * 5 + "\n" +
                        num + "  *  06   =   " + num * 6 + "\n" +
                        num + "  *  07   =   " + num * 7 + "\n" +
                        num + "  *  08   =   " + num * 8 + "\n" +
                        num + "  *  09   =   " + num * 9 + "\n" +
                        num + "  *  10   =   " + num * 10);
                    }
            else{
                textView2.setText("Please enter No. less than 10000.0");
            }
                }

        });
    }
}