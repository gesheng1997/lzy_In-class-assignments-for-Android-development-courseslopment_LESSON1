package com.bytedance.hellosjtu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MoonActivity extends AppCompatActivity {
    private TextView mtv3;
    private Button mbtn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moon);

        mtv3 = findViewById(R.id.tv_3);
        mtv3.setSelected(true);

        mbtn2 = findViewById(R.id.btn_2);
        mbtn2.setOnClickListener(new View.OnClickListener(){
           public void onClick(View v){
               Intent intent = new Intent(MoonActivity.this,MainActivity.class);
               startActivity(intent);
           }
        });
    }

    public void showToast2_moon(View view){
        Toast.makeText(this,"May The Stars And The Moon Guide You On Your Way",Toast.LENGTH_SHORT).show();
    }
}