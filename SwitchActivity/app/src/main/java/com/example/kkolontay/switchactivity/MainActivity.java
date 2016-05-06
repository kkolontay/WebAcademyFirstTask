package com.example.kkolontay.switchactivity;

import android.app.Activity;
import android.content.Intent;
//import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private Toolbar toolBar;
    private Button nextButton;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent classB = new Intent(this, BClass.class);
        toolBar = (Toolbar) findViewById(R.id.toolbar_actionbar);

        setSupportActionBar(toolBar);
        //toolBar.setNavigationIcon(R.drawable.left);
        nextButton = (Button) findViewById(R.id.button5);
        editText = (EditText) findViewById(R.id.editText4);
        nextButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent classB = new Intent(MainActivity.this, BClass.class);
                startActivity(classB);
            }
        });
    }


}
