package com.processmap.myfirstdemoproject.RecyclerAdapter;


/**
 * Created by vamsi on 10-Oct-16.
 */

import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.processmap.myfirstdemoproject.R;
import com.processmap.myfirstdemoproject.models.News;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/**
 * Created by vamsi on 06-May-16 for android recyclerview and cardview tutorial
 */
public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.ViewHolder> {

    private List<News> mNewsList;
    private Context context;

    //Provide a reference to the views for each data item
    //Complex data items may need more than one view per item, and
    //you provide access to all the views for a data item in a view holder
    public static class ViewHolder extends RecyclerView.ViewHolder {
        //each data item is just a string in this case
        public TextView tvHeading, tvSource, tvTime;
        public ImageView ivCover;

        public ViewHolder(View v) {
            super(v);
            tvHeading = v.findViewById(R.id.tv_heading);
            tvSource = v.findViewById(R.id.tv_source);
            tvTime = v.findViewById(R.id.tv_time);
            ivCover =v.findViewById(R.id.iv_cover);
        }
    }

    //Provide a suitable constructor
    public NewsAdapter(Context context, List<News> mNewsList) {
        this.mNewsList = mNewsList;
        this.context = context;
    }

    //Create new views (invoked by the layout manager)
    @Override
    public NewsAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        //Creating a new view
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.news_card, parent, false);

        //set the view's size, margins, paddings and layout parameters

        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    //Replace the contents of a view (invoked by the layout manager
    @Override
    public void onBindViewHolder(NewsAdapter.ViewHolder holder, int position) {

        // - get element from arraylist at this position
        // - replace the contents of the view with that element

        News article = mNewsList.get(position);

//        setFont(holder);

        holder.tvHeading.setText(article.getNews_title());
        holder.tvSource.setText(article.getNews_source());
//        Date publishedDate = new Date(article.getPub_date());
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MMM-yyyy", Locale.getDefault());
//        holder.tvTime.setText(simpleDateFormat.format(publishedDate));

        Glide.with(context).load(article.getNews_image_url()).into(holder.ivCover);

    }

//    private void setFont(ViewHolder holder) {
//        Typeface type = Typeface.createFromAsset(context.getAssets(), "fonts/raleway.ttf");
//        holder.tvHeading.setTypeface(type);
//        holder.tvSource.setTypeface(type);
//        holder.tvTime.setTypeface(type);
//    }

    @Override
    public int getItemCount() {
        return mNewsList.size();
    }
}