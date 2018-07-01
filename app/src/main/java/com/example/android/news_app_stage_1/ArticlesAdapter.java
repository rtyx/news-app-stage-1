package com.example.android.news_app_stage_1;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import static android.R.attr.format;

/**
 * Created by rtyx on 1/7/18.
 */

public class ArticlesAdapter extends ArrayAdapter {

    public static final String LOG_TAG = ArticlesAdapter.class.getName();

    private static final String BY = "By ";

    public ArticlesAdapter(@NonNull Context context, @NonNull List<Article> articles) {
        super(context, 0, articles);
    }

    private String formatDate(Date dateObject) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("LLL dd, yyyy");
        return dateFormat.format(dateObject);
    }

    private String formatTime(Date dateObject) {
        SimpleDateFormat timeFormat = new SimpleDateFormat("h:mm a");
        return timeFormat.format(dateObject);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.article_list_item, parent, false);
        }

        Article currentArticle = (Article) getItem(position);

        String section = currentArticle.getmSectionName();
        TextView sectionView = (TextView) listItemView.findViewById(R.id.section);
        sectionView.setText(section);

        String title = currentArticle.getmWebTitle();
        TextView titleView = (TextView) listItemView.findViewById(R.id.title);
        titleView.setText(title);

        String dateString = currentArticle.getmWebPublicationDate();
        SimpleDateFormat  format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
        Date date = null;
        try {
            date = format.parse(dateString);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        TextView dateView = (TextView) listItemView.findViewById(R.id.date);
        String formattedDate = formatDate(date);
        dateView.setText(formattedDate);

        TextView timeView = (TextView) listItemView.findViewById(R.id.time);
        String formattedTime = formatTime(date);
        timeView.setText(formattedTime);

        String authorString = currentArticle.getmAuthor();
        if (authorString != null) {
            TextView authorView = (TextView) listItemView.findViewById(R.id.author);
            authorView.setText(BY + authorString);
        }

        return listItemView;
    }
}
