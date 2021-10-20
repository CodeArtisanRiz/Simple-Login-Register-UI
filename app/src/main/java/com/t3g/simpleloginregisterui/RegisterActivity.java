package com.t3g.simpleloginregisterui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

//        ImageView logImg = findViewById(R.id.logImg);
//        logImg.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View view) {
//                Intent intend = new Intent(RegisterActivity.this, LoginActivity.class);
//                intend.putExtra("url", ""); // hs_sc_1_pdf
//                startActivity(intend);
//            }
//        });
        TextView logTxt = findViewById(R.id.logTxt);
        logTxt.setOnClickListener(vi -> {
            Intent intent2 = new Intent(RegisterActivity.this, LoginActivity.class);
            startActivity(intent2);
        });

    }
}