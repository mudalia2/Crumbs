package com.example.varungove.crumbs;


import android.content.Intent;
import android.graphics.Color;
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
    TextView d1, d2, d3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.preferences);
        p1 = (TextView) findViewById(R.id.dollar1);
        p2 = (TextView) findViewById(R.id.dollar2);
        p3 = (TextView) findViewById(R.id.dollar3);

        d1 = (TextView) findViewById(R.id.distance1);
        d2 = (TextView) findViewById(R.id.distance2);
        d3 = (TextView) findViewById(R.id.distance3);

    }

    public void price1(View view) {
        p1.setBackgroundColor(Color.parseColor("#e55050"));
        p2.setBackgroundColor(Color.parseColor("#cfb593"));
        p3.setBackgroundColor(Color.parseColor("#cfb593"));

    }

    public void price2(View view) {
        p2.setBackgroundColor(Color.parseColor("#e55050"));
        p1.setBackgroundColor(Color.parseColor("#cfb593"));
        p3.setBackgroundColor(Color.parseColor("#cfb593"));

    }

    public void price3(View view) {
        p3.setBackgroundColor(Color.parseColor("#e55050"));
        p2.setBackgroundColor(Color.parseColor("#cfb593"));
        p1.setBackgroundColor(Color.parseColor("#cfb593"));
    }

    public void dis1(View view) {
        d1.setBackgroundColor(Color.parseColor("#e55050"));
        d2.setBackgroundColor(Color.parseColor("#cfb593"));
        d3.setBackgroundColor(Color.parseColor("#cfb593"));

    }

    public void dis2(View view) {
        d2.setBackgroundColor(Color.parseColor("#e55050"));
        d1.setBackgroundColor(Color.parseColor("#cfb593"));
        d3.setBackgroundColor(Color.parseColor("#cfb593"));

    }

    public void dis3(View view) {
        d3.setBackgroundColor(Color.parseColor("#e55050"));
        d2.setBackgroundColor(Color.parseColor("#cfb593"));
        d1.setBackgroundColor(Color.parseColor("#cfb593"));
    }

}
