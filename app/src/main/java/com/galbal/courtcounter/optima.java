package com.galbal.courtcounter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class optima extends AppCompatActivity {

    String firstTeamName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_optima);
    }

    public void firstSubmit(View view) {
        Intent i = new Intent(this, OptimaSecond.class);
        EditText editText = (EditText) findViewById(R.id.firstTeamName);
        firstTeamName = editText.getText().toString();
        i.putExtra("first", firstTeamName);
        startActivity(i);
    }

}
