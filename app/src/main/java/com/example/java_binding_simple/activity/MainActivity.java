package com.example.java_binding_simple.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.java_binding_simple.DetailActivity;
import com.example.java_binding_simple.R;
import com.example.java_binding_simple.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding=ActivityMainBinding.inflate(getLayoutInflater());
        View view=binding.getRoot();
        setContentView(view);

        initViews();
    }
    void initViews(){
        binding.mainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDetailPage();
            }
        });
    }
    void openDetailPage(){
        Intent intent= new Intent(this, DetailActivity.class);
        startActivity(intent);
    }
}