package com.ddc.bmicalculator;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.databinding.DataBindingUtil;

import com.ddc.bmicalculator.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Inflate the layout using Data Binding
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        binding.button.setOnClickListener(view -> {

            float age = Float.parseFloat(binding.etAge.getText().toString());

            float feet = Float.parseFloat(binding.etFeet.getText().toString());
            float inches = Float.parseFloat(binding.etInches.getText().toString());
            float weight = Float.parseFloat(binding.etWeight.getText().toString());

            float heightInMeters = (feet * 12 + inches) * 0.0254f;
            float bmi = weight / (heightInMeters * heightInMeters);

            binding.tvResult.setText("BMI: " + bmi);

        });
    }
}