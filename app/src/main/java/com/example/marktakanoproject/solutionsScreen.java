package com.example.marktakanoproject;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.content.Intent; // Import Intent class

public class solutionsScreen extends AppCompatActivity {
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solutions_screen);

        // Instantiate variables
        Button confirmButton = findViewById(R.id.confirmButton);
        Button backButton = findViewById(R.id.backButton);
        Spinner spinner = findViewById(R.id.spinner);
        TextView textViewOutput = findViewById(R.id.textViewOutput);

        // Create an ArrayAdapter and set it to the Spinner
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.stringArray, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        // Set an OnClickListener for the Confirm Button
        confirmButton.setOnClickListener(view -> {
            String selectedItem = spinner.getSelectedItem().toString();

            switch (selectedItem) {
                case "Where are you?":
                    textViewOutput.setText("Please select a valid option.");
                    break;
                case "Moreno Valley":
                    textViewOutput.setText("Moreno Valley Family Health Center\nMoreno Valley Community Health Center\nUnicare Community Health Center - Moreno Valley");
                    break;
                case "Riverside":
                    textViewOutput.setText("Kaiser Permanente\nPacific Grove Hospital\nParkview Community");
                    break;
                case "Fontana":
                    textViewOutput.setText("Unicare Community Health Center - Fontana\nUrgent Care - Dignity Health - Fontana, CA\nUnicare Community Health Center - Fontana");
                    break;
                case "Corona":
                    textViewOutput.setText("Corona Community Health Center\nMEDICROSS CLINIC & URGENT CARE\nCentro Medico Community Clinic");
                    break;
                case "San Bernardino":
                    textViewOutput.setText("Adelanto Health Center\nHesperia Health Center\nOntario Health Center");
                    break;
            }
        });

        // Set an OnClickListener for the Back to Homepage Button
        backButton.setOnClickListener(view -> {
            // Handle the button click to go back to the homepage
            Intent intent = new Intent(solutionsScreen.this, MainActivity.class);
            startActivity(intent);
        });
    }
}
