package com.example.varungove.crumbs;


import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuInflater;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class home extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        //Image Swiping
        MyPagerAdapter adapter = new MyPagerAdapter();
        ViewPager myPager = (ViewPager) findViewById(R.id.viewpager_layout);
        myPager.setAdapter(adapter);
        myPager.setCurrentItem(1);

        //Trying to open resinfo through longpress on images
//        LinearLayout txtView = (LinearLayout) findViewById(R.id.pics);
//        txtView.setOnLongClickListener(new View.OnLongClickListener() {
//            @Override
//            public boolean onLongClick(View v) {
//
//                Intent intent = new Intent(home.this, resinfo.class);
//                startActivity(intent);
//                return true;
//
//            }
//
//        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return true;
    }

    public void mail(View view)
    {
        Intent intent = new Intent(home.this, mail.class);
        startActivity(intent);
    }

    public void settings(View view)
    {
        Intent intent = new Intent(home.this, settings.class);
        startActivity(intent);
    }

    public void invite(View view)
    {
        Intent intent = new Intent(home.this, invite.class);
        startActivity(intent);
    }

    public void preferences(View view)
    {
        Intent intent = new Intent(home.this, preferences.class);
        startActivity(intent);
    }
}
