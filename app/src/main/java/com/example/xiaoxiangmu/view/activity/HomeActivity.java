package com.example.xiaoxiangmu.view.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.xiaoxiangmu.R;
import com.example.xiaoxiangmu.view.design.LoginView;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
       // startActivity(new Intent(this, LoginActivity.class));
    }
}