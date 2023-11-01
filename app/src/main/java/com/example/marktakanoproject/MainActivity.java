package com.example.marktakanoproject;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Your existing code for MainActivity

        // Set an OnClickListener for the Information Page Button
        Button informationButton = findViewById(R.id.informationButton);
        informationButton.setOnClickListener(view -> {
            // Handle the button click to go to the Information Page
            Intent intent = new Intent(MainActivity.this, instructionsScreen.class);
            startActivity(intent);
        });

        // Set an OnClickListener for the Solution Page Button
        Button solutionButton = findViewById(R.id.solutionButton);
        solutionButton.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, solutionsScreen.class);
            startActivity(intent);
        });
    }
}
