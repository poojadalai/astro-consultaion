package com.example.astroconsultaion.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.astroconsultaion.R;

import java.util.HashMap;

public class HomeGridAdapter extends BaseAdapter {
    private Context context;
    private LayoutInflater inflater;
    private String[] grid_title;
    private int[] grid_image;


    public HomeGridAdapter(Context context, String[] grid_title, int[] grid_image) {
        this.context = context;
        this.grid_title = grid_title;
        this.grid_image = grid_image;

    }

    @Override
    public int getCount() {
        return grid_title.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
       if(inflater == null)
       {
           inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

       }
       if(convertView == null)
       {
        convertView = inflater.inflate(R.layout.grid_item, null);
        }
        TextView txtview = convertView.findViewById(R.id.text_cat);
        ImageView imgview = convertView.findViewById(R.id.image_cat);

        // Set the text and image for current item using data
        txtview.setText(grid_title[position]);
        imgview.setImageResource(grid_image[position]);
        return convertView;


    }
}


