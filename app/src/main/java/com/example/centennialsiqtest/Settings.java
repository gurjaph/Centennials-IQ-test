package com.example.centennialsiqtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.SyncStateContract;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;

public class Settings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        Spinner dropdown = (Spinner) findViewById(R.id.Dropdown);

        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(Settings.this,
                android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.schemes));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        dropdown.setAdapter(myAdapter);
        Switch music = (Switch) findViewById(R.id.MusicSwitch);

        if(Helper.musics==true){
            music.setChecked(true);
        }else{
            music.setChecked(false);
        }

        Switch sto = (Switch) findViewById(R.id.StockSwitch);
        if(Helper.stocks==true){
            sto.setChecked(true);
        }else{
            sto.setChecked(false);
        }

    }
    public void backd(View view){
        finish();
    }
    public void music(View view){
        if(Helper.musics == true) {
            Helper.musics = false;
        }else{
            Helper.musics = true;
        }
    }
    public void slow(View view){
        Helper.setSpeed(1000);
        Helper.reset();
    }
    public void fast(View view){
        Helper.setSpeed(500);
        Helper.reset();
    }
    public void stockswitch(View view){
        if(Helper.stocks == true){
            Helper.stocks = false;
        }else{
            Helper.stocks = true;
        }
    }
}