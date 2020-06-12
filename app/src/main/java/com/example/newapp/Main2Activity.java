package com.example.newapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button btn2 = (Button)findViewById(R.id.button2);
        final EditText txt = (EditText)findViewById(R.id.editText);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder altb2 = new AlertDialog.Builder(Main2Activity.this);
                /*while(text == null){
                    Toast.makeText(Main2Activity.this, "Please enter some information!", Toast.LENGTH_LONG).show();
                }*/
                altb2.setMessage("Do you want to save this information?");
                altb2.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent3 = new Intent(getApplicationContext(),MainActivity.class);
                        Toast.makeText(Main2Activity.this,"Information saved!",Toast.LENGTH_LONG).show();
                        EditText txt = (EditText)findViewById(R.id.editText);
                        String text = txt.getText().toString();
                        intent3.putExtra("INFORMATION",text);
                        setResult(2,intent3);
                        finish();
                    }
                });
                altb2.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                AlertDialog alt2 = altb2.create();
                alt2.show();
            }
        });
    }


    @Override
    public void onBackPressed(){
        AlertDialog.Builder altb = new AlertDialog.Builder(this);
        final Intent intent1 = new Intent(getApplicationContext(),MainActivity.class);
        altb.setMessage("Do you want to save this information?");
        altb.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(Main2Activity.this,"Information saved!",Toast.LENGTH_LONG).show();
                EditText txt = (EditText)findViewById(R.id.editText);
                String text = txt.getText().toString();
                intent1.putExtra("INFORMATION",text);
                setResult(2,intent1);
                finish();
            }
        });
        altb.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        AlertDialog alt = altb.create();
        alt.show();
    }



}
