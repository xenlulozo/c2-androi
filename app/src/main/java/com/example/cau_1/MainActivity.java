package com.example.cau_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

       if (id == R.id.item1) {
           Toast toast = Toast.makeText(this , "Item 1 selected", Toast.LENGTH_SHORT);
           toast.show();
            return true;
        }
       else   if (id == R.id.item2) {
           Toast toast = Toast.makeText(this , "Item 2 selected", Toast.LENGTH_SHORT);
           toast.show();
           return true;
       }
       else   if (id == R.id.item3) {
           Toast toast = Toast.makeText(this , "Item 3 selected", Toast.LENGTH_SHORT);
           toast.show();
           return true;
       }

        return super.onOptionsItemSelected(item);
    }

}