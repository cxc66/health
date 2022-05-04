package com.animee.test;

import androidx.appcompat.app.AppCompatActivity;
import androidx.multidex.MultiDex;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.animee.test.activity.BaseActivity;
import com.animee.test.activity.LoginActivity;
import com.animee.test.activity.RegisterActivity;

public class MainActivity extends BaseActivity {

    private Button btnLogin;
    private Button btnRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        MultiDex.install(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogin = findViewById(R.id.btn_login);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent intent=new Intent(MainActivity.this, LoginActivity.class);
//                startActivity(intent);
                navigateTo(LoginActivity.class);
            }
        });

        btnRegister = findViewById(R.id.btn_register);
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent intent=new Intent(MainActivity.this, RegisterActivity.class);
//                startActivity(intent);
                navigateTo(RegisterActivity.class);
            }
        });
    }

//    @Override
//    protected void initView() {
//        btnLogin = findViewById(R.id.btn_login);
//        btnRegister = findViewById(R.id.btn_register);
//    }
}