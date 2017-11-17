package com.example.pc.codedelta;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.content.Context;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Cory on 11/17/2017.
 */

public class AppiontmentListAdapter extends ArrayAdapter<AppList> {

    private static final String TAG = "AppiontmentListAdapter";

    private Context mContext;
    int mResource;

    public AppiontmentListAdapter(Context context, int resource, ArrayList<AppList> objects) {
        super(context, resource, objects);
        mContext = context;
        mResource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        //get the person information
        String name = getItem(position).getName();
        String date = getItem(position).getDate();
        String location = getItem(position).getLocation();

        //create the person object with the information
        AppList appList = new AppList(name,date,location);

        LayoutInflater inflater = LayoutInflater.from(mContext);
        convertView = inflater.inflate(mResource, parent, false);

        TextView tvName = (TextView) convertView.findViewById(R.id.textView1);
        TextView tvDate = (TextView) convertView.findViewById(R.id.textView2);
        TextView tvLocation = (TextView) convertView.findViewById(R.id.textView3);

        tvName.setText(name);
        tvName.setText(date);
        tvName.setText(location);

        return convertView;

    }
}

