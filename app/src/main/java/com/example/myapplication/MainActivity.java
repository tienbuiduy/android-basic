package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button showBtn;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.relative_layout);

        showBtn = (Button) findViewById(R.id.btnEditData);

        // get data from DB
        String nickname = "nickname from DB";
        showBtn.setText(nickname);

        showBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToEditScreen();
            }
        });
    }

    public void moveToEditScreen(){
        Intent intent = new Intent(this, ActivityChangeNickname.class);
        startActivity(intent);
    }

}