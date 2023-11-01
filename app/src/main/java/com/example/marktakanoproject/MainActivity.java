package com.example.marktakanoproject;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

import com.example.marktakanoproject.R;
import com.example.marktakanoproject.instructionsScreen;
import com.example.marktakanoproject.solutionsScreen;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Your existing code for MainActivity

        // Set an OnClickListener for the Information Page Button
        Button informationButton = findViewById(R.id.informationButton);
        informationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Handle the button click to go to the Information Page
                Intent intent = new Intent(MainActivity.this, instructionsScreen.class);
                startActivity(intent);
            }
        });

        // Set an OnClickListener for the Solution Page Button
        Button solutionButton = findViewById(R.id.solutionButton);
        solutionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, solutionsScreen.class);
                startActivity(intent);
            }
        });
    }
}
