package com.example.actionbarnavigationdrawer;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {


    NavigationView nav;
    ActionBarDrawerToggle toggle;
    DrawerLayout drawerLayout;
    androidx.appcompat.widget.Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        nav = findViewById(R.id.navmenu);
        drawerLayout = findViewById(R.id.drawer);
        toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.open, R.string.close);

        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        nav.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.menu_home:
                        Toast.makeText(getApplicationContext(), "home", Toast.LENGTH_LONG).show();
                        break;
                    case R.id.menu_call:
                        Toast.makeText(getApplicationContext(), "contact", Toast.LENGTH_LONG).show();
                        break;
                    case R.id.menu_settings:
                        Toast.makeText(getApplicationContext(), "settings", Toast.LENGTH_LONG).show();
                        break;
                }
                drawerLayout.closeDrawer(GravityCompat.START);

                return true;
            }
        });


    }


}