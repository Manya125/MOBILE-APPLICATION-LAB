package com.example.menu;



import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id= item.getItemId();
        if(id==R.id.menu_home)
        {
            Toast.makeText(this, "clicked option is home", Toast.LENGTH_SHORT).show();
        }
        if(id==R.id.menu_about)
        {
            Toast.makeText(this, "clicked option is about", Toast.LENGTH_SHORT).show();
        }
        if(id==R.id.menu_contact)
        {
            Toast.makeText(this, "clicked option is contact", Toast.LENGTH_SHORT).show();
        }
        if(id==R.id.menu_setting)
        {
            Toast.makeText(this, "clicked option is settings", Toast.LENGTH_SHORT).show();
        }
        if(id==R.id.menu_share)
        {
            Toast.makeText(this, "clicked option is home", Toast.LENGTH_SHORT).show();
            String url="https://www.google.com/".toString();
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);

    }

}
