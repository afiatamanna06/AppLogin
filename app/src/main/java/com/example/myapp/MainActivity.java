package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText emai;
    private EditText pass;
    //private TextView tv;
    private Button butn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        emai=(EditText) findViewById(R.id.emid);
        pass=(EditText) findViewById(R.id.pasid);
        butn=(Button) findViewById(R.id.buid);
        butn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(TextUtils.isEmpty((emai).getText().toString()) || TextUtils.isEmpty((pass).getText().toString()))
                {
                    Toast ts=Toast.makeText(MainActivity.this , "Please fill up the form", Toast.LENGTH_LONG);
                    ts.show();
                }
                else
                {
                    Toast ts=Toast.makeText(MainActivity.this , "Login button is clicked", Toast.LENGTH_LONG);
                    ts.show();
                }
            }
        });
    }
}
