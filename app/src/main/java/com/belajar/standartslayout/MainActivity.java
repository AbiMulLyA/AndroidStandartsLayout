package com.belajar.standartslayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button btnToRegister, btnToListBelanja, btnToMp3Player;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnToRegister = findViewById(R.id.btnToRegister);
        btnToListBelanja = findViewById(R.id.btnToListBelanja);
        btnToMp3Player = findViewById(R.id.btnToMp3Player);

        btnToRegister.setOnClickListener(this);
        btnToListBelanja.setOnClickListener(this);
        btnToMp3Player.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnToRegister:
                Intent toRegister= new Intent(getApplicationContext(), RegisterActivity.class);
                startActivity(toRegister);
                break;

            case R.id.btnToListBelanja:
                Intent toListBelanja= new Intent(getApplicationContext(), ListBelanjaActivity.class);
                startActivity(toListBelanja);
                break;

            case R.id.btnToMp3Player:
                Intent toMp3Playerr= new Intent(getApplicationContext(), Mp3PlayerActivity.class);
                startActivity(toMp3Playerr);
                break;
        }
    }
}