package com.t3g.simpleloginregisterui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        ImageView regImg = findViewById(R.id.regImg);
        regImg.setOnClickListener(v -> {
            Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
            startActivity(intent);
        });
        TextView regTxt = findViewById(R.id.regTxt);
        regTxt.setOnClickListener(v2 -> {
            Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
            startActivity(intent);
        });


    }
}











//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){
//            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
//        }


//    }
//    public void onLoginclick(View view){
//        startActivity(new Intent(this, RegisterActivity.class));
//        overridePendingTransition(R.anim.slide_in_left, R.anim.stay);
//    }
//}