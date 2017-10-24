package com.android.ayman.news.Classes;

/**
 * Created by ayman on 2017-10-24.
 */

public class NewsClass {

    private String Id ;
    private String newsname ;
    private String newsimage ;
    private String newsdescription ;
    private String newscomment;
    private String newsview ;


    public NewsClass( ) {

    }

    public NewsClass(String Id, String newsname, String newsimage, String newsdescription, String newscomment,String newsview) {
        this.Id = Id;
        this.newsname = newsname;
        this.newsimage = newsimage;
        this.newsdescription = newsdescription;
        this.newscomment = newscomment;
        this.newsview = newsview;


    }

    public String getId() {
        return Id;
    }
    public void setId(String Id) {
        this.Id = Id;
    }

    public String getnewsname() {
        return newsname;
    }

    public void setnewsname(String newsname) {
        this.newsname = newsname;
    }

    public String getnewsdescription() {
        return newsdescription;
    }

    public void setnewsdescription(String newsdescription) {
        this.newsdescription = newsdescription;
    }


    public String getnewsimage() {
        return newsimage;
    }
    public void setnewsimage(String newsimage) {
        this.newsimage = newsimage;
    }

    public String getnewscomment() {
        return newscomment;
    }
    public void setnewscomment(String newscomment) {
        this.newscomment = newscomment;
    }

    public String getnewsview() {
        return newsview;
    }
    public void setnnewsview(String newsview) {
        this.newsview = newsview;
    }





}
