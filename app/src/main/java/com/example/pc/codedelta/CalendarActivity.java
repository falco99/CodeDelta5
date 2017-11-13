package com.example.pc.codedelta;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.github.sundeepk.compactcalendarview.CompactCalendarView;
import com.github.sundeepk.compactcalendarview.domain.Event;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class CalendarActivity extends AppCompatActivity {

    CompactCalendarView compactCalendar;
    private SimpleDateFormat dateFormatMonth = new SimpleDateFormat ("MMMM- yyyy", Locale.getDefault());

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);

        final ActionBar actionbar = getSupportActionBar();
        actionbar.setDisplayHomeAsUpEnabled(false);
        actionbar.setTitle(null);

        compactCalendar = (CompactCalendarView) findViewById(R.id.compactcalendar_view);
        compactCalendar.setUseThreeLetterAbbreviation(true);

        //setting up an event

        Event ev1 = new Event(Color.BLUE, 1477054800000L,"Tutoring Appt.");
        compactCalendar.addEvent(ev1);

        compactCalendar.setListener(new CompactCalendarView.CompactCalendarViewListener()
        {
            @Override
            public void onDayClick(Date dateClicked)
            {
                Context context = getApplicationContext();
                if(dateClicked.toString().compareTo("Fri Oct 21 09:00:00 AST 2016")==0)
                {
                    Toast.makeText(context, "Tutoring Appt.",Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(context, "No Events Planned for the day",Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onMonthScroll (Date firstDayOfNewMonth)
            {
                actionbar.setTitle(dateFormatMonth.format(firstDayOfNewMonth));
            }
        });
    }
}
