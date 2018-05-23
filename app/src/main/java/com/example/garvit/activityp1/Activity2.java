package com.example.garvit.activityp1;

import android.content.Intent;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Activity2 extends AppCompatActivity {
    Button button;
    public void nextActivity(View view){
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);

}



    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Activity2","Started");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Activity2","resume");
    }

    @Override
    protected void onPause() {
        Log.i("Activity2","paused");
        super.onPause();

    }

    @Override
    protected void onStop() {
        Log.i("Activity2","stop");
        super.onStop();

    }

    @Override
    protected void onDestroy() {
        Log.i("Activity2","destroyed");
        super.onDestroy();

    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        button=(Button) findViewById(R.id.button2);
        Log.i("Activity2","Created");

    }
}
