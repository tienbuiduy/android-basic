package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

adasdasdasdasdasd



import com.google.android.material.textfield.TextInputEditText;

import java.util.Random;

public class ActivityChangeNickname extends AppCompatActivity {

    Button submitButton;

    TextInputEditText textInputEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.edit_nickname_layout);

        textInputEditText = (TextInputEditText) findViewById(R.id.txtInputEditNickname);
        // get data from DB
        String oldNickname = "nickname from DB";
        System.out.println("get old nickname: "+ oldNickname);
        textInputEditText.setHint(oldNickname);

        textInputEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        submitButton = (Button) findViewById(R.id.btnSubmitData);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String newNickname = textInputEditText.getText().toString();
                System.out.println("Save new nickname to DB: "+newNickname);
                moveToMainScreen();

            }
        });


    }

    public void moveToMainScreen(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
