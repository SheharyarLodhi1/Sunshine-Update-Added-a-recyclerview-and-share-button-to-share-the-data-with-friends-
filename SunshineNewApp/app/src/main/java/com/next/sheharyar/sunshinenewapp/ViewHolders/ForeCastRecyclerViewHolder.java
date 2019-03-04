package com.next.sheharyar.sunshinenewapp.ViewHolders;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.next.sheharyar.sunshinenewapp.Adapters.ForecastAdapter;
import com.next.sheharyar.sunshinenewapp.DetailActivity;
import com.next.sheharyar.sunshinenewapp.Interfaces.ForecastAdapterOnClickHandler;
import com.next.sheharyar.sunshinenewapp.MainActivity;
import com.next.sheharyar.sunshinenewapp.R;

/**
 * Created by sheharyar on 3/4/2019.
 */

public class ForeCastRecyclerViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    public static String[] mWeatherData;
    public Context context;
    public final TextView mWeatherTextView;

    /*
    * An on-click handler that we've defined to make it easy for an Activity to interface with
    * our RecyclerView
    */
//    private final ForecastAdapterOnClickHandler mClickHandler;

    /**
     * Creates a ForecastAdapter.
     *
     * @param // handler The on-click handler for this adapter. This single handler is called
     *                     when an item is clicked.
     */

    public ForeCastRecyclerViewHolder(View itemView) {
        super(itemView);

        mWeatherTextView = (TextView)itemView.findViewById(R.id.tv_weather_data);
        itemView.setOnClickListener(this);
        context = itemView.getContext();
//        mClickHandler = handler;
    }


//    @Override
//    public void onClick(View view) {
//        int adapterPosition = getAdapterPosition();
//        String weatherForDay = mWeatherData[adapterPosition];
//
//
//    }

//    @Override
//    public void onClick(String weatherDay) {
//        int adapterPosition = getAdapterPosition();
//        String weatherForDay = mWeatherData[adapterPosition];
//
//    }

    @Override
    public void onClick(View view) {
        int adapterPosition = getAdapterPosition();
        String weatherForDay = mWeatherData[adapterPosition];
        Intent detailActivityIntent = new Intent(context, DetailActivity.class);
        detailActivityIntent.putExtra(Intent.EXTRA_TEXT, weatherForDay);
        context.startActivity(detailActivityIntent);

//        mClickHandler.onClick(weatherForDay);
    }
}
