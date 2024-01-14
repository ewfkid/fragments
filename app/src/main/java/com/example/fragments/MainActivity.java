package com.example.fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;


import android.os.Bundle;
import android.view.View;

import com.example.fragments.databinding.ActivityMainBinding;
import com.example.fragments.fragment.FirstFragment;
import com.example.fragments.fragment.SecondFragment;
import com.example.fragments.fragment.ThirdFragment;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    private FragmentManager fragmentManager;

    private SecondFragment secondFragment;

    private FirstFragment firstFragment;

    private ThirdFragment thirdFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        fragmentManager = getSupportFragmentManager();
        firstFragment = (FirstFragment) fragmentManager.getFragments().get(0);
        secondFragment = new SecondFragment();
        thirdFragment = new ThirdFragment();

        binding.btnFr1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentManager.beginTransaction().replace(R.id.fr_main, firstFragment).addToBackStack(null).commit();
            }
        });

        binding.btnFr2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragmentManager.beginTransaction().replace(R.id.fr_main, secondFragment).addToBackStack(null).commit();
            }
        });

        binding.btnFr3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragmentManager.beginTransaction().replace(R.id.fr_main, thirdFragment).addToBackStack(null).commit();
            }
        });
    }
}