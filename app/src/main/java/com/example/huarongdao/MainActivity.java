package com.example.huarongdao;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static boolean levels[] = {true,true,true,true};
    private TextView huarongdao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void chooselevel(View view) {
        Intent intent = new Intent();
        intent.setClass(MainActivity.this,LevelActivity.class);
        startActivity(intent);
    }

    public void chooseabout(View view) {
        Intent intent = new Intent();
        intent.setClass(MainActivity.this,AboutActivity.class);
        startActivity(intent);
    }
    /**
    level page 跳转
    */

}
