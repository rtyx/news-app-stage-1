package com.example.android.news_app_stage_1;

import android.content.AsyncTaskLoader;
import android.content.Context;

import java.util.List;

/**
 * Created by rtyx on 1/7/18.
 */

public class ArticlesLoader extends AsyncTaskLoader {

    private static final String LOG_TAG = ArticlesLoader.class.getName();

    private String mUrl;

    public ArticlesLoader(Context context, String url) {
        super(context);
        mUrl = url;
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
    }

    @Override
    public Object loadInBackground() {
        if (mUrl == null) {
            return null;
        }

        List<Article> articles = QueryUtils.fetchArticleData(mUrl);
        return articles;
    }

}
