package com.android.swapnil.yu_hack_application;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.view.View.OnClickListener;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(MainActivity.this, "Application started", Toast.LENGTH_LONG).show();
    }

    public void callPlayGames(View view){
        Toast.makeText(MainActivity.this, "button pressed", Toast.LENGTH_LONG).show();
        final Context context = this;
        Intent intent = new Intent(context, PlayGameActivity.class);
        startActivity(intent);
    }

    public void callChooCharityActivity(View view){
        Toast.makeText(MainActivity.this, "Choose Charities", Toast.LENGTH_LONG).show();
        final Context context = this;
        Intent intent = new Intent(context, ChooseCharitiesActivity.class);
        startActivity(intent);
    }

    public void callAboutActivity(View view){
        Toast.makeText(MainActivity.this, "About Application", Toast.LENGTH_LONG).show();
        final Context context = this;
        Intent intent = new Intent(context, AboutActivity.class);
        startActivity(intent);
    }


  /*  Button btncalcu=(Button)findViewById(R.id.button_play_game);
            btncalcu.setOnClickListener(new OnClickListener(){
        @Override
        public void onClick(View v)
        {
            Toast.makeText(getBaseContext(), "a", Toast.LENGTH_LONG).show();
            //calc();
        }

    });*/
}
