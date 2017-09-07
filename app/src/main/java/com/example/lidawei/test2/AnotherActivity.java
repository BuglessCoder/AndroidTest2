package com.example.lidawei.test2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AnotherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another);

        final TextView textView = (TextView)findViewById(R.id.textView2);
        final Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        textView.setText(name);

        final EditText editText = (EditText)findViewById(R.id.editText2);

        Button button2=(Button)findViewById(R.id.buttonReturn);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("anotherName",editText.getText().toString());
                setResult(0,intent);
                finish();
            }
        });

    }



}
