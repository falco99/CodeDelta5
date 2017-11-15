package com.example.pc.codedelta;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by PC on 11/15/2017.
 */

public class CustomListview extends ArrayAdapter<String> {

    private String[] tutorname;
    private String[] Appt;
    private Integer[] imgid;
    private Activity context;

    public CustomListview(Activity context, String[] tutorname, String[] Appt, Integer[] imgid) {
        super(context, R.layout.layout, tutorname);

        this.context = context;
        this.tutorname = tutorname;
        this.Appt = Appt;
        this.imgid = imgid;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View r = convertView;
        ViewHolder viewHolder = null;
        if (r == null) {
            LayoutInflater layoutInflater = context.getLayoutInflater();
            r = layoutInflater.inflate(R.layout.listview_tutor_row, null, true);
            viewHolder = new ViewHolder(r);
            r.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) r.getTag();

        }
        viewHolder.ivw.setImageResource(imgid[position]);
        viewHolder.tvw1.setText(tutorname[position]);
        viewHolder.tvw2.setText(Appt[position]);
        return r;


    }


    class ViewHolder {
        TextView tvw1;
        TextView tvw2;
        ImageView ivw;

        ViewHolder(View v) {
            tvw1 = (TextView) v.findViewById(R.id.tvtutorname);
            tvw2 = (TextView) v.findViewById(R.id.tvAppt);
            ivw = v.findViewById(R.id.imageView);
        }
    }
}


