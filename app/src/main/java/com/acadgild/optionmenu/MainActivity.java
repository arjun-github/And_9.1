package com.acadgild.optionmenu;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);//Loading main layout file
        getSupportActionBar();//Getting action bar

    }
    //Getting option menu and inflating it
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater Menu=getMenuInflater();
        Menu.inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    //changing the textview color based on the id of menu selected
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        TextView textView=(TextView)findViewById(R.id.textView);
        int menuId=item.getItemId();
        if (menuId==R.id.RED){
            textView.setTextColor(ContextCompat.getColor(this, R.color.red));

        }
        else if (menuId==R.id.GREEN){
            textView.setTextColor(ContextCompat.getColor(this, R.color.green));
        }
        else if (menuId==R.id.BLUE){
            textView.setTextColor(ContextCompat.getColor(this, R.color.blue));
        }
        return super.onOptionsItemSelected(item);
    }
}
