package com.example.kokapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.example.kokapp.databinding.ActivityMyInfoBinding;

public class MyInfoActivity extends AppCompatActivity {

    ActivityMyInfoBinding binding = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_my_info);


    }
}
