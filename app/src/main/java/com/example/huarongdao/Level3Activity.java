package com.example.huarongdao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.List;

public class Level3Activity extends AppCompatActivity {
    private Klotski mKlotskiView;
    private List<Block> blocks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level3);
        blocks = KlotskiMapParser.parse("2,0,0,10,1,0,3,3,0,1,0,2,4,1,2,1,3,2,1,0,3,7,0,4,1,3,3,6,2,4");
        mKlotskiView = (Klotski) findViewById(R.id.main_klotski);
        mKlotskiView.setlevel(3);
        mKlotskiView.setBlocks(blocks);
    }
    public void back(View view) {
        finish();
    }

    public void reset(View view) {
        mKlotskiView.setBlocks(blocks);
    }
}
