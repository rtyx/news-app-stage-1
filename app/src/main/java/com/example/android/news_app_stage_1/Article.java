package com.example.android.news_app_stage_1;

/**
 * Created by rtyx on 1/7/18.
 */

public class Article {

    private String mSectionName;
    private String mWebPublicationDate;
    private String mWebTitle;
    private String mWebUrl;
    private String mAuthor;

    Article(String sectionName,
            String webTitle,
            String webPublicationDate,
            String webUrl,
            String author) {
        mSectionName = sectionName;
        mWebPublicationDate = webPublicationDate;
        mWebTitle = webTitle;
        mWebUrl = webUrl;
        mAuthor = author;
    }

    public String getmSectionName() {
        return mSectionName;
    }

    public String getmWebPublicationDate() {
        return mWebPublicationDate;
    }

    public String getmWebTitle() {
        return mWebTitle;
    }

    public String getmWebUrl() {
        return mWebUrl;
    }

    public String getmAuthor() {
        return mAuthor;
    }

}