package com.example.kokapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.kokapp.databinding.ActivitySingUpBinding;
import com.example.kokapp.user.User;

public class SingUp extends AppCompatActivity {

    ActivitySingUpBinding binding = null;
    public Context mContext = this;
//    List<User> user =

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_sing_up);

        binding.signUpOkBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });


    }
}
