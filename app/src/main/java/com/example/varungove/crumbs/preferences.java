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
import android.widget.TextView;

public class preferences extends AppCompatActivity{

    TextView p1, p2, p3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.preferences);
        p1 = (TextView) findViewById(R.id.dollar1);
        p2 = (TextView) findViewById(R.id.dollar2);
        p3 = (TextView) findViewById(R.id.dollar3);

    }

    public void price1(View view) {
        p1.setBackgroundColor(0xf6f1eb00);
        p2.setBackgroundColor(0xdfcdb600);
        p3.setBackgroundColor(0xdfcdb600);
    }

    public void price2(View view) {
        p1.setBackgroundColor(0xdfcdb600);
        p2.setBackgroundColor(0xf6f1eb00);
        p3.setBackgroundColor(0xdfcdb600);
    }

    public void price3(View view) {
        p1.setBackgroundColor(0xdfcdb600);
        p2.setBackgroundColor(0xdfcdb600);
        p3.setBackgroundColor(0xf6f1eb00);
    }

}
