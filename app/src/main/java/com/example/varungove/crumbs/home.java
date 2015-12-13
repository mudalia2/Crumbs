package com.example.varungove.crumbs;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
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
        myPager.setCurrentItem(0);

        //Trying to open resinfo through longpress on images

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

    public class MyPagerAdapter extends PagerAdapter {
        public int getCount() {
            return 3;
        }
        public Object instantiateItem(ViewGroup collection, int position) {
            LayoutInflater inflater = (LayoutInflater) collection.getContext()
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            int resId = 0;
            switch (position) {
                case 0:
                    resId = R.layout.swipe1;
                    break;
                case 1:
                    resId = R.layout.swipe2;
                    break;
                case 2:
                    resId = R.layout.swipe3;
                    break;



            }
            View view = inflater.inflate(resId, null);

            view.setOnLongClickListener(new View.OnLongClickListener() {
                public boolean onLongClick(View v) {
                    //this will log the page number that was click
                    Intent intent = new Intent(home.this, resinfo.class);
                    startActivity(intent);
                    return true;
                }
            });
            ((ViewPager) collection).addView(view, 0);

            return view;
        }
        @Override
        public void destroyItem(ViewGroup arg0, int arg1, Object arg2) {
            ((ViewPager) arg0).removeView((View) arg2);
        }

        @Override
        public boolean isViewFromObject(View arg0, Object arg1) {
            return arg0 == ((View) arg1);
        }

        //public boolean isViewFromObject(ViewGroup arg0, Object arg1) {
        // return arg0 == ((View) arg1);
        //}
        @Override
        public Parcelable saveState() {
            return null;
        }
    }
}
