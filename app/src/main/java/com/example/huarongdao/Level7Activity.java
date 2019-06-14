package com.example.huarongdao;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import java.util.List;

public class Level7Activity extends AppCompatActivity {
    private Klotski mKlotskiView;
    private List<Block> blocks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level7);
        blocks = KlotskiMapParser.parse("1,0,3,10,0,0,1,3,3,1,0,4,6,1,3,1,3,4,2,2,0,7,0,2,2,3,0,6,2,2");
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
