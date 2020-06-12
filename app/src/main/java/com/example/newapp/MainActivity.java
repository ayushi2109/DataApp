package com.example.newapp;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    /*AlertDialog.Builder altb = new AlertDialog.Builder(Main2Activity.this);
    AlertDialog alt = altb.create();
    alt.show();*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 = (Button)findViewById(R.id.button);
        /*Intent myintent = getIntent();
        String text = myintent.getStringExtra("INFORMATION");
        tv.setText(text);*/

        /*if(text != null){
            tv.setText(text);
        }*/

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                startActivityForResult(intent,2);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        TextView tv = (TextView)findViewById(R.id.textView3);  
        if(requestCode == 2){
            String text = data.getStringExtra("INFORMATION");
            tv.setText(text);
        }
    }
}
