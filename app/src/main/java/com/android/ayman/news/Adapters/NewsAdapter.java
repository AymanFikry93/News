package com.android.ayman.news.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.android.ayman.news.Activities.R;
import com.android.ayman.news.Classes.NewsClass;
import com.android.ayman.news.WebServices.MyApplication;
import com.android.volley.toolbox.ImageLoader;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

/**
 * Created by ayman on 2017-05-14.
 */

public class NewsAdapter extends  RecyclerView.Adapter<NewsAdapter.MyViewHolder>{


    ArrayList<NewsClass> classNewsList;
    ImageLoader imageLoader = MyApplication.getInstance().getImageLoader();

       Context mcontext;
    public NewsAdapter(Context context, ArrayList<NewsClass> objects) {

        classNewsList = objects;
        mcontext=context;

    }
    public static class MyViewHolder extends RecyclerView.ViewHolder {

        public LinearLayout rowlayout;
        public ImageView newsimageView;
        public TextView newsName;
        public TextView newsdescription;
        public TextView newsviews;
        public TextView newscomments;


        public MyViewHolder(View itemView) {
            super(itemView);
         this.rowlayout=(LinearLayout)itemView.findViewById(R.id.newsrowid) ;
            this.newsimageView = (ImageView)itemView.findViewById(R.id.newsimage);
            this.newsName = (TextView)itemView.findViewById(R.id.newsName);
            this.newsdescription = (TextView)itemView.findViewById(R.id.newsdescriptionid);
            this.newscomments = (TextView)itemView.findViewById(R.id.commentnewsid);
            this.newsviews = (TextView)itemView.findViewById(R.id.viewnewsid);
        }
    }


    @Override
    public NewsAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.news_row, parent, false);

        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(NewsAdapter.MyViewHolder holder, int position) {
        // if offline will appear the view of layout with ic image
        //  holder.restimageView.setImageResource(R.mipmap.ic_launcher);

        if (imageLoader == null)
            imageLoader = MyApplication.getInstance().getImageLoader();

        holder.newsName.setText(classNewsList.get(position).getnewsname());
        holder.newsdescription.setText((classNewsList.get(position).getnewsdescription()));
        holder.newscomments.setText((classNewsList.get(position).getnewscomment()));
        holder.newsviews.setText((classNewsList.get(position).getnewsview())+"");
        holder.newsimageView.setImageResource(R.mipmap.ic_launcher);
      //  new DownloadImageTask( holder.restimageView).execute(classResturantsList.get(position).getImage());
        Glide.with(mcontext).load(classNewsList.get(position).getnewsimage()).apply(RequestOptions.circleCropTransform()).into( holder.newsimageView);

    }

    @Override
    public int getItemCount() {
        return classNewsList.size();
    }


    @Override
    public int getItemViewType(int position) {


        return super.getItemViewType(position);
    }



}