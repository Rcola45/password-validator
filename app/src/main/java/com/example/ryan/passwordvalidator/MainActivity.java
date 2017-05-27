package com.example.ryan.passwordvalidator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText input_text;
    private TextView display_text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onValidateClick(View view){
        Password p = new Password(input_text.getText().toString());
        if(p.validate())
            display_text.setText("Strong");
        else
            display_text.setText("Not Strong");
    }
}
