package com.example.marktakanoproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class solutionsScreen extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solutions_screen);

        //instantiating variables

        Button confirmButton = findViewById(R.id.confirmButton);
        Spinner spinner = findViewById(R.id.spinner);
        TextView textViewOutput = findViewById(R.id.textViewOutput);
        TextView textViewOutput2 = findViewById(R.id.textViewOutput2);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.stringArray, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        confirmButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                //if statements that output different LGBTQ+ friendly healthcare centers nearby depending on what area you pick
                String selectedItem = spinner.getSelectedItem().toString();

                if (selectedItem.equals("Where are you?"))
                {
                    textViewOutput.setText("Please select a valid option.");
                }//end of if statement
                else if (selectedItem.equals("Moreno Valley"))
                {
                    textViewOutput.setText("Moreno Valley Family Health Center\nMoreno Valley Community Health Center\nUnicare Community Health Center - Moreno Valley");
                    textViewOutput2.setText("Julio Hernandez Rodriguez, MD\nAsia Sullivan, PA-C, MPH\nGregory Cason, PhD");
                }//end of else if statement
                else if (selectedItem.equals("Riverside"))
                {
                    textViewOutput.setText("Kaiser Permanente\nPacific Grove Hospital\nParkview Community");
                    textViewOutput2.setText("Andrea Seldomridge, PsyD\nFelipe Cendejas, DMSc, PA-C\nRebecca Williams, LMFT");
                }//end of else if statement
                else if (selectedItem.equals("Fontana"))
                {
                    textViewOutput.setText("Unicare Community Health Center - Fontana\nUrgent Care - Dignity Health - Fontana, CA\nUnicare Community Health Center - Fontana");
                    textViewOutput2.setText("Michelle McNevin, LCSW\nDeAndrea Knight, LCSW\nLila Goldsman Phd\n");
                }//end of else if statement
                else if (selectedItem.equals("Corona"))
                {
                    textViewOutput.setText("Corona Community Health Center\nMEDICROSS CLINIC & URGENT CARE\nCentro Medico Community Clinic");
                    textViewOutput2.setText("Florence Yuan, MD\nLindsey Ritter-Ingorvaia, AMFT, APCC\nJudith Morgan, LE");
                }//end of else if statement
                else if (selectedItem.equals("San Bernardino"))
                {
                    textViewOutput.setText("Adelanto Health Center\nHesperia Health Center\nOntario Health Center");
                    textViewOutput2.setText("Kevin Chun, MD\nFrank R. Patti, LMFT, PsyD\nGene Park, DDS, MS");
                }//end of else if statement
            }//end of onClick method
        });//end of onclick event handler
    }//end of oncreate event handler
}//end of class