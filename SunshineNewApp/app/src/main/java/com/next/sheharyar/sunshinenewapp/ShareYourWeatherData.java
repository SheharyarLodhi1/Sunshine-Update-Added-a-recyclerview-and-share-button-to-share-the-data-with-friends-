package com.next.sheharyar.sunshinenewapp;

import android.support.v4.app.ShareCompat;

/**
 * Created by sheharyar on 3/4/2019.
 */

public class ShareYourWeatherData extends DetailActivity{

    public static String TEXT_TO_DISPLAY_IN_DETAILACTIVITY;

    public ShareYourWeatherData(){
//        DetailActivity detailActivity = new DetailActivity();
//        String textToShare = detailActivity.TEXT_HOLDER_FOR_WEATHER;
//        shareYourData(textToShare);
    }

    public void shareYourData(String textToShare) {
        // COMPLETED (2) Create a String variable called mimeType and set it to "text/plain"
        /*
         * You can think of MIME types similarly to file extensions. They aren't the exact same,
         * but MIME types help a computer determine which applications can open which content. For
         * example, if you double click on a .pdf file, you will be presented with a list of
         * programs that can open PDFs. Specifying the MIME type as text/plain has a similar affect
         * on our implicit Intent. With text/plain specified, all apps that can handle text content
         * in some way will be offered when we call startActivity on this particular Intent.
         */
        String mimeType = "text/plain";

        // COMPLETED (3) Create a title for the chooser window that will pop up
        /* This is just the title of the window that will pop up when we call startActivity */
        String title = "Current Weather";
        // COMPLETED (4) Use ShareCompat.IntentBuilder to build the Intent and start the chooser
        /* ShareCompat.IntentBuilder provides a fluent API for creating Intents */
        ShareCompat.IntentBuilder
                .from(this)
                .setType(mimeType)
                .setChooserTitle(title)
                .setText(textToShare)
                .startChooser();
    }
}
