package com.techlensgh.myabout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnALC;
    Button btnme;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




    }
    public  void web(View v){
        startActivity(new Intent(this, alcWebsite.class));

    }

    public  void about(View v){
        startActivity(new Intent(this, myProfile.class));

    }
}
