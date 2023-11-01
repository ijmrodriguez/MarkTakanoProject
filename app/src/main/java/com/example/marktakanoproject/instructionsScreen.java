package com.example.marktakanoproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class instructionsScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instructions_screen);

        TextView linkTextView1 = findViewById(R.id.linkTextView1);
        Button homeButton = findViewById(R.id.homeButton);
        linkTextView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.ncbi.nlm.nih.gov/pmc/articles/PMC5478215/";

                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));

                startActivity(intent);



            }
        });

        TextView linkTextView2 = findViewById(R.id.linkTextView2);
        linkTextView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.americanprogress.org/article/discrimination-prevents-lgbtq-people-accessing-health-care/";

                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));

                startActivity(intent);



            }
        });

        TextView linkTextView3 = findViewById(R.id.linkTextView3);
        linkTextView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.cdc.gov/healthyyouth/disparities/health-disparities-among-lgbtq-youth.htm";

                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));

                startActivity(intent);
            }
        });

        homeButton.setOnClickListener(view -> {
            // Handle the button click to go back to the homepage
            Intent intent = new Intent(instructionsScreen.this, MainActivity.class);
            startActivity(intent);
        });
    }
}