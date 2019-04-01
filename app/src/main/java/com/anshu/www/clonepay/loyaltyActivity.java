package com.anshu.www.clonepay;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class loyaltyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loyalty);
    }

    public void clickme2(View view) {
        Toast.makeText(getApplicationContext(),"Functionality not included as per mail",Toast.LENGTH_LONG).show();
    }
}
