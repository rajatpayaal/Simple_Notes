package com.example.simple_notes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {

    public static final int REQUES_CODE_ADD_NOTE=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView newnote =findViewById(R.id.newnote);
                newnote.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        startActivityForResult(
                             new Intent(getApplicationContext(), note_activity.class),
                                REQUES_CODE_ADD_NOTE
                        );
                    }
                });
    }
}

//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