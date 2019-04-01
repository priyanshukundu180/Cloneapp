package com.anshu.www.clonepay;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageButton;
import android.widget.Toast;

public class HomepageActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
ImageButton i1;
ImageButton i2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);





        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        navigationView.setItemIconTintList(null);
        i1=findViewById(R.id.img4);
        i2=findViewById(R.id.imageButton1);
        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Functionality not included as per mail",Toast.LENGTH_LONG).show();
            }
        });
        i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Functionality not included as per mail",Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override


    @SuppressWarnings("StatementWithEmptyBody")

    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_account) {
            Intent i=new Intent(getApplicationContext(),LoginActivity.class);
            startActivity(i);
        } else if (id == R.id.nav_passbook) {

            Intent i=new Intent(getApplicationContext(),passbookActivity.class);
            startActivity(i);



        } else if (id == R.id.nav_reminders) {

            Intent i=new Intent(getApplicationContext(),paymentreminders.class);
            startActivity(i);



        } else if (id == R.id.nav_help) {
            Intent i=new Intent(getApplicationContext(),helpActivity.class);
            startActivity(i);

        } else if (id == R.id.nav_loyalty) {
            Intent i=new Intent(getApplicationContext(),loyaltyActivity.class);
            startActivity(i);

        } else if (id == R.id.nav_profile) {
Toast.makeText(getApplicationContext(),"Functionality not included as per mail",Toast.LENGTH_LONG).show();
        }

        else if (id == R.id.nav_language) {
            Toast.makeText(getApplicationContext(),"Functionality not included as per mail",Toast.LENGTH_LONG).show();
        }
        else if (id == R.id.nav_upi) {
            Toast.makeText(getApplicationContext(),"Functionality not included as per mail",Toast.LENGTH_LONG).show();
        }

        else if (id == R.id.nav_security) {
            Toast.makeText(getApplicationContext(),"Functionality not included as per mail",Toast.LENGTH_LONG).show();
        }


        else if (id == R.id.nav_payment) {
            Toast.makeText(getApplicationContext(),"Functionality not included as per mail",Toast.LENGTH_LONG).show();
        }
else if(id==R.id.nav_share)
        {
            Toast.makeText(getApplicationContext(),"Functionality not included as per mail",Toast.LENGTH_LONG).show();

        }

        else if(id==R.id.nav_send)
        {
            Toast.makeText(getApplicationContext(),"Functionality not included as per mail",Toast.LENGTH_LONG).show();
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public void clickme(View view) {
        Toast.makeText(getApplicationContext(),"Functionality not included as per mail",Toast.LENGTH_LONG).show();
    }
}
