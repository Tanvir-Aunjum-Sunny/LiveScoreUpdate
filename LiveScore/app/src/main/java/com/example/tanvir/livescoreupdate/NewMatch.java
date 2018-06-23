package com.example.tanvir.livescoreupdate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class NewMatch extends AppCompatActivity {

    Button click;
    public static TextView data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_match);

        click =  findViewById(R.id.button);
        data = findViewById(R.id.matchscore);

        click.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                fetchData process = new fetchData();
                process.execute();
            }
        });

    }
}
