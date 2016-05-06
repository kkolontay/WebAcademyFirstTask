package com.example.kkolontay.switchactivity;

import android.app.Activity;
import android.content.Intent;
import  android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by kkolontay on 5/6/16.
 */
public class CClass extends AppCompatActivity {
    private Toolbar toolBar;
    private Button nextButton;
    private EditText textField;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c);
        toolBar = (Toolbar) findViewById(R.id.toolbar_actionbar);
        setSupportActionBar(toolBar);
        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        nextButton = (Button) findViewById(R.id.button7);
        textField = (EditText) findViewById(R.id.editText3);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent classD = new Intent(CClass.this, DClass.class);
                startActivity(classD);
            }
        });
    }

}
