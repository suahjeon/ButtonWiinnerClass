package com.example.buttonwiinnerclass;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button mButton1;
    TextView mTextview1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButton1 = findViewById(R.id.button1);
        mTextview1 = findViewById(R.id.textView1);


        mButton1.setOnClickListener(new MyOnClickListener(this));
    }

    private class MyOnClickListener implements View.OnClickListener {
        MainActivity mainActivity;
        public MyOnClickListener(MainActivity mainActivity) {
            this.mainActivity = mainActivity;
        }

        @Override
        public void onClick(View v) {
           mainActivity.mTextview1.setText("You clicked suah's button");
        }
    }
}