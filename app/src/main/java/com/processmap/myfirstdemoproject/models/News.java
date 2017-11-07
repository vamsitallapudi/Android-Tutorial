package com.processmap.myfirstdemoproject.models;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by vamsitallapudi on 11/7/17.
 */

public class News {

    /**
     * id : 3
     * news_title : Apple defends complying with China over VPNs
     * news_detail : Apple boss Tim Cook has defended his companyâ€™s decision to comply with the Chinese governmentâ€™s demand it remove VPN software from the App Store. Virtual Private Networks are often used to skirt censorship and surveillance in countries with tight restrictions on internet use. The company has been heavily criticised for removing several VPN apps, and was accused of â€œaiding Chinese censorship effortsâ€. Apple said it disagreed with Chinaâ€™s position but had to comply with the countryâ€™s laws. "We would obviously rather not remove the apps,â€ Apple chief executive Tim Cook said on Tuesday. "But like we do in other countries we follow the law wherever we do business.
     * news_image_url : https://ichef.bbci.co.uk/news/660/cpsprodpb/D60B/production/_97159745_whatsubject.jpg
     * news_url : http://www.bbc.com/news/technology-40798623
     * news_source : BBC
     * pub_date : 2017-08-02T05:36:42Z
     */

    private int id;
    private String news_title;
    private String news_detail;
    private String news_image_url;
    private String news_url;
    private String news_source;
    private String pub_date;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNews_title() {
        return news_title;
    }

    public News(JSONObject jsonObject){
        try {
            this.news_title = (String) jsonObject.get("news_title");
            this.news_detail = (String) jsonObject.get("news_detail");
            this.news_image_url = (String) jsonObject.get("news_image_url");
            this.news_url = (String) jsonObject.get("news_url");
            this.pub_date = (String) jsonObject.get("pub_date");
            this.news_source = (String) jsonObject.get("news_source");
            this.id = (int) jsonObject.get("id");
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public void setNews_title(String news_title) {
        this.news_title = news_title;
    }

    public String getNews_detail() {
        return news_detail;
    }

    public void setNews_detail(String news_detail) {
        this.news_detail = news_detail;
    }

    public String getNews_image_url() {
        return news_image_url;
    }

    public void setNews_image_url(String news_image_url) {
        this.news_image_url = news_image_url;
    }

    public String getNews_url() {
        return news_url;
    }

    public void setNews_url(String news_url) {
        this.news_url = news_url;
    }

    public String getNews_source() {
        return news_source;
    }

    public void setNews_source(String news_source) {
        this.news_source = news_source;
    }

    public String getPub_date() {
        return pub_date;
    }

    public void setPub_date(String pub_date) {
        this.pub_date = pub_date;
    }
}
