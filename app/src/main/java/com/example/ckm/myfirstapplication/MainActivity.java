package com.example.ckm.myfirstapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        button
        final Button btn1 = (Button) findViewById(R.id.button1);

//        textview
        final TextView textV2 = (TextView) findViewById(R.id.textView2);

//        input text
        final TextView editT1 = (TextView) findViewById(R.id.editText1);

//        perform action on click
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strTxt = editT1.getText().toString();
                textV2.setText("Helllo Khun: " + strTxt);
            }
        });

    }// void

  /*  @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }*/


}// main
