package com.epiclancers.app.materialdesigntoolbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_for_toolbar , menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId() == R.id.gotocart){
            Toast.makeText(this, "Going to Cart", Toast.LENGTH_SHORT).show();
        }
        if(item.getItemId() == R.id.buynow){
            Toast.makeText(this, "Buying it Now", Toast.LENGTH_SHORT).show();
        }
        if(item.getItemId() == R.id.shopnow){
            Toast.makeText(this, "Shopping Right Now", Toast.LENGTH_SHORT).show();
        }
        if(item.getItemId() == R.id.search){
            Toast.makeText(this, "Going to search", Toast.LENGTH_SHORT).show();
        }
        if(item.getItemId() == R.id.setting){
            Toast.makeText(this, "Going to setting", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }
}
