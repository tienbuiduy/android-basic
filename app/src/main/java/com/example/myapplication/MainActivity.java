package com.example.myapplication;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText input;
    Button showBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.relative_layout);

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Edit Name");
        builder.setIcon(R.drawable.ic_launcher_foreground);
        builder.setMessage("Fill Data");
        input = new EditText(this);
        builder.setView(input);
        builder.setPositiveButton("Submit", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                String txt = input.getText().toString();
                Toast.makeText(getApplicationContext(), txt, Toast.LENGTH_LONG).show();
            }
        });

        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();;

            }
        });

        final AlertDialog ad = builder.create();

        showBtn = (Button) findViewById(R.id.btnEditData);
        showBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ad.show();
            }
        });
    }

//    @Override
//    public boolean onCreateOptionMenu(Menu menu){
//        getMenuInflater().inflate(R.menu.main, menu);
//        return true;
//    }
}