package com.anshu.www.clonepay;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {
    SeekBar sb;
    int j;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Thread t=new Thread()//anonymous inner class
        {
            public void run()
            {
                try{

                    Thread.sleep(5000);
                    Intent i=new Intent(MainActivity.this,HomepageActivity.class);
                    startActivity(i);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        t.start();
    }
    protected void onRestart(){
        super.onRestart();
        finish();
    }
}
