package com.example.tanvir.livescoreupdate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void newMatchclick(View v) {
        switch(v.getId()) {
            case R.id.newMatchclick: // R.id.textView1
                intent = new Intent(this, NewMatch.class);
                break;
        }
        startActivity(intent);
    }

    public void oldmatchScore(View v) {
        switch(v.getId()) {
            case R.id.oldmatchScore: // R.id.textView1
                intent = new Intent(this, Old_Match.class);
                break;
        }
        startActivity(intent);
    }
}
