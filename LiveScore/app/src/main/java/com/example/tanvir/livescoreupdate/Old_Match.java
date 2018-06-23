package com.example.tanvir.livescoreupdate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Old_Match extends AppCompatActivity {
    Button click;
    public static TextView data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_old__match);

        click =  findViewById(R.id.button);
        data = findViewById(R.id.matchscoreold);

        click.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                fetchDataOld process = new fetchDataOld();
                process.execute();
            }
        });
    }
}
