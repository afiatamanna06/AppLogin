package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView emai;
    private TextView pass;
    //private TextView tv;
    private Button butn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        emai=(TextView) findViewById(R.id.emid);
        pass=(TextView) findViewById(R.id.pasid);
        butn=(Button) findViewById(R.id.buid);
        butn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*if((emai).equals(" ") || (pass).equals(" "))
                {
                    Toast ts=Toast.makeText(MainActivity.this , "Please fill up the form", Toast.LENGTH_LONG);
                    ts.show();
                }
                else
                {

                }*/
                Toast ts=Toast.makeText(MainActivity.this , "Login button is clicked", Toast.LENGTH_LONG);
                ts.show();
            }
        });
    }
}
