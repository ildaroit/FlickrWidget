package com.hetangshah.flickrwidget.widget;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/**
 * Created by hetashah on 2/16/16.
 */
public class FlickrWidgetIntentReceiver extends BroadcastReceiver{

    @Override
    public void onReceive(Context context, Intent intent) {
        context.startService(new Intent(context,FlickrWidgetIntentService.class));
    }
}
