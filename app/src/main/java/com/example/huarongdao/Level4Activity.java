package com.example.huarongdao;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import java.util.List;

public class Level4Activity extends AppCompatActivity {
    private Klotski mKlotskiView;
    private List<Block> blocks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level4);
        blocks = KlotskiMapParser.parse("1,0,0,10,1,0,1,3,0,2,0,1,4,1,2,3,3,1,1,0,3,7,0,4,1,3,3,6,2,4");
        mKlotskiView = (Klotski) findViewById(R.id.main_klotski);
        mKlotskiView.setlevel(4);
        mKlotskiView.setBlocks(blocks);
    }
    public void back(View view) {
        finish();
    }

    public void reset(View view) {
        mKlotskiView.setBlocks(blocks);
    }
}
