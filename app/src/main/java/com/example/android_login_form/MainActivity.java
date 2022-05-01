package com.example.android_login_form;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView result ;
    EditText email ;
    EditText pass ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initTextViews();
    }
    private void initTextViews() {
        TextView result = (TextView) findViewById(R.id.textView);
        EditText email = (EditText) findViewById(R.id.username);
        EditText pass = (EditText) findViewById(R.id.password);
    }


    public void Validate(View view) {
      return;
    
    }
}