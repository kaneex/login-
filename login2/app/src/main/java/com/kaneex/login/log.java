package com.kaneex.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class log extends AppCompatActivity {
    TextView textView2,textView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log);
        final TextView textView2=(TextView)findViewById(R.id.textView2);
        final TextView textView4=(TextView)findViewById(R.id.textView4);

        textView4.setText(getIntent().getExtras().getString("name"));
    }
}
