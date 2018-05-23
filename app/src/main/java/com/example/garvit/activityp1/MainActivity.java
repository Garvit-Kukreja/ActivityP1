package com.example.garvit.activityp1;

import android.content.Intent;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button button;
    public void nextActivity(View view){
        Intent intent=new Intent(this,Activity2.class);
        startActivity(intent);

    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Activity1","Started");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Activity1","resume");
    }

    @Override
    protected void onPause() {
        Log.i("Activity1","paused");
        super.onPause();

    }

    @Override
    protected void onStop() {
        Log.i("Activity1","stop");
        super.onStop();

    }

    @Override
    protected void onDestroy() {
        Log.i("Activity1","destroyed");
        super.onDestroy();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=(Button) findViewById(R.id.button1);
        Log.i("Activity1","Created");

    }
}
