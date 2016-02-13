package com.galbal.courtcounter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class OptimaSecond extends AppCompatActivity {
    String first;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_optima_second);
        Bundle bundle = getIntent().getExtras();
        if (bundle == null) {
            return;
        } else {
            first = bundle.getString("first");
        }
    }


    public void secondSubmit(View view) {
        Intent i = new Intent(this, MainActivity.class);
        EditText editText = (EditText) findViewById(R.id.SecondTeamName);
        String second = editText.getText().toString();
        i.putExtra("firstName", first);
        i.putExtra("secondName", second);
        startActivity(i);
    }


}
