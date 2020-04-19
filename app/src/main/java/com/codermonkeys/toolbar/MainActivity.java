package com.codermonkeys.toolbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

   private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch(item.getItemId()) {

            case R.id.item_1:
                Toast.makeText(this, "Item 1 Clicked", Toast.LENGTH_LONG).show();
                break;

            case R.id.item_2:
                Toast.makeText(this, "Item 2 Clicked", Toast.LENGTH_LONG).show();
                break;

            case R.id.item_3:
                Toast.makeText(this, "Item 3 Clicked", Toast.LENGTH_LONG).show();
                break;

            case R.id.search:
                Toast.makeText(this, "Search Clicked", Toast.LENGTH_SHORT).show();
                break;

            case R.id.cart:
                Toast.makeText(this, "Cart Clicked", Toast.LENGTH_SHORT).show();
                break;

            case android.R.id.home:
                finish();
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}
