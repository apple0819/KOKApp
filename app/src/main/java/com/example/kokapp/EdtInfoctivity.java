package com.example.kokapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.example.kokapp.databinding.ActivityEdtInfoctivityBinding;
import com.example.kokapp.databinding.ActivityMainBinding;

public class EdtInfoctivity extends AppCompatActivity {

    ActivityEdtInfoctivityBinding binding = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_edt_infoctivity);


    }



}
