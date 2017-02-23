package com.johnreis.instituto.firstdayapp.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.johnreis.instituto.firstdayapp.utils.Utils;
import com.johnreis.instituto.firstdayapp.R;
import com.johnreis.instituto.firstdayapp.entities.Books;
import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by Instituto on 16/02/2017.
 */

public class BookAdapter extends BaseAdapter {
    private ArrayList<Books> books;
    private LayoutInflater layoutInflater;
    private Context context;

    public BookAdapter(ArrayList<Books> books, Context context) {
        this.books = books;
        this.context = context;
        layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return books.size();
    }

    @Override
    public Object getItem(int position) {
        return books.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = layoutInflater.inflate(R.layout.tableview_cell, null);

        TextView textInCell = (TextView) convertView.findViewById(R.id.titleInCell);
        textInCell.setText(books.get(position).getTitle());

        ImageView coverInCell = (ImageView) convertView.findViewById(R.id.coverInCell);
        Picasso.with(convertView.getContext())
                .load(books.get(position).getUrl())
                .into(coverInCell);

        return convertView;
    }
}
