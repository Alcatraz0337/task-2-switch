package com.example.switch_task;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    Switch switchA, switchB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        switchA = (Switch) findViewById(R.id.switchA);
        switchB = (Switch) findViewById(R.id.switchB);

        final View view2 = findViewById(R.id.abc);
        //view2.setBackgroundColor(getResources().getColor(android.R.color.background_dark));

        switchA.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if (switchA.isChecked())
                    view2.setBackgroundColor(getResources().getColor(android.R.color.background_dark));
                else
                    view2.setBackgroundColor(getResources().getColor(android.R.color.background_light));
            }
        });

        //switchB.setOnClickListener();
    }
}