package com.example.varungove.crumbs;


import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Layout;
import android.view.MenuInflater;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class mail extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mail);


    }


    public void settings(View view)
    {
        Intent intent = new Intent(mail.this, settings.class);
        startActivity(intent);
    }

    public void accept(View view)
    {
        AlertDialog.Builder dlgAlert  = new AlertDialog.Builder(this);
        dlgAlert.setMessage("Invitation Accepted");
        dlgAlert.setPositiveButton("OK", null);
        dlgAlert.setCancelable(true);
        dlgAlert.create().show();

        dlgAlert.setPositiveButton("Ok",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        //dismiss the dialog
                    }
                });

        switch (view.getId())
        {
            case(R.id.yes1):
                RelativeLayout x = (RelativeLayout) findViewById(R.id.invite);
                x.setVisibility(View.INVISIBLE);
                break;
            case(R.id.yes):
                RelativeLayout y = (RelativeLayout) findViewById(R.id.invite1);
                y.setVisibility(View.INVISIBLE);
                break;
        }//end of switch
    }//end of accept dialog

    public void decline(View view)
    {
        AlertDialog.Builder dlgAlert  = new AlertDialog.Builder(this);
        dlgAlert.setMessage("Invitation Declined");
        dlgAlert.setPositiveButton("OK", null);
        dlgAlert.setCancelable(true);
        dlgAlert.create().show();

        dlgAlert.setPositiveButton("Ok",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        //dismiss the dialog
                    }
                });

            switch (view.getId())
            {
                case(R.id.no1):
                    RelativeLayout x = (RelativeLayout) findViewById(R.id.invite);
                    x.setVisibility(View.INVISIBLE);
                        break;
                case(R.id.no):
                    RelativeLayout y = (RelativeLayout) findViewById(R.id.invite1);
                    y.setVisibility(View.INVISIBLE);
                    break;
            }//end of switch

    }//end of accept dialog



}
