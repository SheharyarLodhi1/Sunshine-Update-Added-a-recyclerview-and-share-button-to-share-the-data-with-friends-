package com.next.sheharyar.sunshinenewapp.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.next.sheharyar.sunshinenewapp.Interfaces.ForecastAdapterOnClickHandler;

/**
 * Created by sheharyar on 3/4/2019.
 */

public class ForecastAdapter extends RecyclerView.Adapter<ForecastAdapter.ForecastAdapterViewHolder> implements ForecastAdapterOnClickHandler {
    private String[] mWeatherData;
    /*
   * An on-click handler that we've defined to make it easy for an Activity to interface with
   * our RecyclerView
   */
    private final ForecastAdapterOnClickHandler mClickHandler;

    public ForecastAdapter(ForecastAdapterOnClickHandler clickHandler){

        mClickHandler = clickHandler;
    }
    @Override
    public ForecastAdapter.ForecastAdapterViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {


        return null;
    }

    @Override
    public void onBindViewHolder(ForecastAdapter.ForecastAdapterViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    @Override
    public void onClick(String weatherDay) {

    }

    /**
     * Cache of the children views for a forecast list item.
     */
    public class ForecastAdapterViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
//        public final TextView mWeatherTextView;

        public ForecastAdapterViewHolder(View itemView) {
            super(itemView);
//            mWeatherTextView = (TextView) view.findViewById(R.id.tv_weather_data);
//            view.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {

        }
    }
}
