package com.android.ayman.news.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.ayman.news.WebServices.DownloadImageTask;

public class NewsDetailsActivity extends AppCompatActivity {

    ImageView newsimageitem;
    TextView newsitemdetailsName;
    TextView newsitemdetailsprice;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_details);

        newsimageitem = (ImageView) findViewById(R.id.detailsimage);
        newsimageitem.setImageResource(R.mipmap.ic_launcher);
        new DownloadImageTask(newsimageitem).execute("image comes from main activity");
        // Glide.with(getApplicationContext()).load(itemfoodImage).into(imageitem);

        newsitemdetailsName = (TextView) findViewById(R.id.newsitemnameid);
        newsitemdetailsName.setText("name comes from main activity");

        newsitemdetailsprice = (TextView) findViewById(R.id.newsdescriptionId);
        newsitemdetailsprice.setText("description comes from main activity");


        Button button = (Button) findViewById(R.id.detailbuttonid);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
