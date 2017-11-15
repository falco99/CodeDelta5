package com.example.pc.codedelta;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class Currentappointments2Activity extends AppCompatActivity {

    ListView list;
    String [] tutors;
    String [] appointments;
    int [] imgs = {R.drawable.chrisprofile,R.drawable.trevorcartoonprofile};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currentappointments2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Resources res = getResources();

        tutors = res.getStringArray(R.array.tutors);
        appointments = res.getStringArray(R.array.appointments);

        list = (ListView) findViewById(R.id.list1);
        MyAdapter adapter = new MyAdapter(this,tutors,imgs,appointments);
        list.setAdapter(adapter);
    }

    class MyAdapter extends ArrayAdapter<String> {

    Context context;
    int[] imgs;
    String mytutors[];
    String myappointments[];

    MyAdapter(Context c,String []tutors, int[] imgs, String[]appointments){
        super(c,R.layout.row,R.id.text1,tutors);
        this.context=c;
        this.imgs = imgs;
        this.myappointments = appointments;
        this.mytutors = tutors;


    }
    @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row = layoutInflater.inflate(R.layout.row, parent, false);
            ImageView images = (ImageView) findViewById(R.id.icon);
            TextView myTutor = (TextView) findViewById(R.id.text1);
            TextView myAppointment = (TextView) findViewById(R.id.text2);
            images.setImageResource(imgs[position]);
            myTutor.setText(mytutors[position]);
            myAppointment.setText(appointments[position]);
            return row;
        }





    }


}
