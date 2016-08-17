package com.example.ousmane.firstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id) {
            case R.id.settings_action:
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public void launchApp(View view){
        switch (view.getId()) {
            case R.id.btn_popular_movie:
                Toast.makeText(this, "Launching Movie App", Toast.LENGTH_LONG).show();
                break;
            case R.id.btn_stock_hawk:
                Toast.makeText(this, "Launching Stock Hawk App", Toast.LENGTH_LONG).show();
                break;
            case R.id.btn_build_it_bigger:
                Toast.makeText(this, "Launching Build it bigger App", Toast.LENGTH_LONG).show();
                break;
            case R.id.btn_app_material:
                Toast.makeText(this, "Lauching Material App", Toast.LENGTH_LONG ).show();
                break;
            case R.id.btn_ubiquitous:
                Toast.makeText(this, "Lauching Ubiquitous App", Toast.LENGTH_LONG).show();
                break;
            default:
                Toast.makeText(this, "Launching Capstone App", Toast.LENGTH_LONG).show();
        }
    }
}
