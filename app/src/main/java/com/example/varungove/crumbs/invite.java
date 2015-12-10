package com.example.varungove.crumbs;


import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.TimePickerDialog;
import android.content.DialogInterface;
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
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.Calendar;

public class invite extends AppCompatActivity{

    private DatePicker datePicker;
    private Calendar calendar;
    private TextView dateView, timeView;
    private int year, month, day, hour, minute;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.invite);

        dateView = (TextView) findViewById(R.id.dateView);
        timeView = (TextView) findViewById(R.id.timeView);
        calendar = Calendar.getInstance();

        year = calendar.get(Calendar.YEAR);
        month = calendar.get(Calendar.MONTH);
        day = calendar.get(Calendar.DAY_OF_MONTH);
        hour = calendar.get(Calendar.HOUR_OF_DAY);
        minute = calendar.get(Calendar.MINUTE);

        showTime(hour, minute + 30);
        showDate(year, month + 1, day);
    }

    private void showDate(int year, int month, int day) {
        dateView.setText(new StringBuilder().append(day).append("/")
                .append(month).append("/").append(year));
    }

    private void showTime(int hour, int minute) {
        if (minute < 30)
            timeView.setText(new StringBuilder().append(pad(hour)).append(":")
                .append(pad(minute)));
        else if (hour < 23)
            timeView.setText(new StringBuilder().append(pad(hour + 1)).append(":")
                    .append(pad(minute - 60)));
        else
            timeView.setText(new StringBuilder().append(pad(hour - 23)).append(":")
                    .append(pad(minute - 60)));
    }

    public void setDate(View view) {
        showDialog(999);
    }

    public void setTime(View view) {
        showDialog(1000);
    }

    @Override
    protected Dialog onCreateDialog(int id) {
        switch (id) {
            case 999:
                return new DatePickerDialog(this, pickerListener1, year, month,day);
            case 1000:
                return new TimePickerDialog(this, pickerListener2, hour, minute, false);
        }
        return null;
    }

    private DatePickerDialog.OnDateSetListener pickerListener1 = new DatePickerDialog.OnDateSetListener() {

        // when dialog box is closed, below method will be called.
        @Override
        public void onDateSet(DatePicker view, int selectedYear,
                              int selectedMonth, int selectedDay) {

            year  = selectedYear;
            month = selectedMonth;
            day   = selectedDay;

            // Show selected date
            dateView.setText(new StringBuilder().append(month + 1)
                    .append("/").append(day).append("/").append(year));

        }
    };

    private TimePickerDialog.OnTimeSetListener pickerListener2 =
            new TimePickerDialog.OnTimeSetListener() {
                public void onTimeSet(TimePicker view, int selectedHour,
                                      int selectedMinute) {
                    hour = selectedHour;
                    minute = selectedMinute;

                    // set current time into textview
                    timeView.setText(new StringBuilder().append(pad(hour))
                            .append(":").append(pad(minute)));

                }
            };

    private static String pad(int c) {
        if (c >= 10)
            return String.valueOf(c);
        else
            return "0" + String.valueOf(c);
    }

    public void sendInvites(View view)
    {
        new AlertDialog.Builder(this)
                .setTitle("Invite")
                .setMessage("Invites Sent Successfully")
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent(invite.this, home.class);
                        startActivity(intent);                    }
                })
                .show();

    }

    public void settings(View view)
    {
        Intent intent = new Intent(invite.this, settings.class);
        startActivity(intent);
    }
}

