package com.example.android.news_app_stage_1;

/**
 * Created by rtyx on 1/7/18.
 */

public class Article {

    private String sectionName;
    private String webPublicationDate;
    private String webTitle;
    private String webUrl;
    private String author;

    Article(String sectionName,
            String webTitle,
            String webPublicationDate,
            String webUrl,
            String author) {
        this.sectionName = sectionName;
        this.webPublicationDate = webPublicationDate;
        this.webTitle = webTitle;
        this.webUrl = webUrl;
        this.author = author;
    }

    public String getSectionName() {
        return sectionName;
    }

    public String getWebPublicationDate() {
        return webPublicationDate;
    }

    public String getWebTitle() {
        return webTitle;
    }

    public String getWebUrl() {
        return webUrl;
    }

    public String getAuthor() {
        return author;
    }

}