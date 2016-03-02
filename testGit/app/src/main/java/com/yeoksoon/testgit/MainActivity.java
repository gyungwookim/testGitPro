package com.yeoksoon.testgit;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("kkw", "test1");



        Log.d("kkw", "브랜치로 가야할꺼");
        Log.d("kkw", "브랜치로 마스터");
        Log.d("kkw", "브랜치로 마스터2");
        Log.d("kkw", "브랜치로 마스터3");


    }
}
