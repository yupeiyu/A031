package com.example.administrator.a031;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    SeekBar     sb;
    RatingBar   rb;
    Context     context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //
        context=this;

        sb=(SeekBar) findViewById(R.id.seekBar);
        rb=(RatingBar) findViewById(R.id.ratingBar);

        sb.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener(){
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                Toast.makeText(context, progress+"", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }


    public  void    buttonsClick(View   v)
    {
        switch (v.getId())
        {
            case    R.id.button:
                int     sbVal=sb.getProgress();
                Toast.makeText(this, "Seek Bar Progress:" + sbVal, Toast.LENGTH_LONG).show();
                break;

            case    R.id.button2:
                int     rbVal=rb.getProgress();
                Toast.makeText(this, "Rating Bar Progress:" + rbVal, Toast.LENGTH_LONG).show();
                break;
        }
    }
}
