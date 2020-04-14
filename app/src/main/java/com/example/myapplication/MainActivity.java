package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.relative_layout);

        final TextView txtContent;
        Button btnViewContent;

        txtContent = (TextView) findViewById(R.id.textViewContent);
        btnViewContent = (Button) findViewById(R.id.buttonViewContent);


        txtContent.setText("Content");
        btnViewContent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txtContent.getText().equals("TextView")){
                    txtContent.setText("This is content");
                } else {
                    txtContent.setText("TextView");
                }

            }
        });
    }
}