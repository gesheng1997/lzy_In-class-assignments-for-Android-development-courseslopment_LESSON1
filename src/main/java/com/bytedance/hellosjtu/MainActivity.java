package com.bytedance.hellosjtu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView mtv1;
    private Button mbtn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mtv1 = findViewById(R.id.tv_1);
        //mtv1.setTypeface(Typeface.createFromAsset(getAssets(),"BERNHC.TTF"));
        //mtv1.setEnabled(false);
        mtv1.setSelected(true);

        mbtn1 = findViewById(R.id.btn_1);
        mbtn1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this,MoonActivity.class);
                startActivity(intent);
            }
        });
    }

    public void showToast1_sun(View view){
        Toast.makeText(this,"May The Bright Sunshine Shine On Every Corner Of Your Life",Toast.LENGTH_SHORT).show();
    }
}