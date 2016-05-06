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
public class BClass extends AppCompatActivity {
    private Toolbar toolBar;
    private Button nextButton;
    private EditText textField;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
        toolBar = (Toolbar) findViewById(R.id.toolbar_actionbar);
        setSupportActionBar(toolBar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
       // toolBar.setNavigationIcon(R.drawable.left);
        nextButton = (Button) findViewById(R.id.button8);
        textField = (EditText) findViewById(R.id.editText);
        nextButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent classC = new Intent(BClass.this, CClass.class);
                startActivity(classC);
            }
        });
        toolBar.setNavigationOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent classA = new Intent(BClass.this, MainActivity.class);
                startActivity(classA);
            }
        });
    }

}
