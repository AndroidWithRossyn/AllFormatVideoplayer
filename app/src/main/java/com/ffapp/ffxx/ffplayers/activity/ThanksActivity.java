package com.ffapp.ffxx.ffplayers.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.ffapp.ffxx.ffplayers.R;

public class ThanksActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thanks);
    }

    @Override
    public void onBackPressed() {

        finishAffinity();
    }
}
