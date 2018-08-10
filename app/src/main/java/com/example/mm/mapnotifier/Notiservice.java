package com.example.mm.mapnotifier;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v4.app.JobIntentService;
import android.util.Log;
import android.widget.Toast;

import com.google.gson.Gson;
import com.onesignal.NotificationExtenderService;
import com.onesignal.OSNotificationReceivedResult;

import org.greenrobot.eventbus.EventBus;

import java.util.ArrayList;

public class Notiservice extends NotificationExtenderService {
    Parsers parsers;

    String url;

    @Override
    protected boolean onNotificationProcessing(OSNotificationReceivedResult notification) {


       // Toast.makeText(this, ""+notification.payload.additionalData, Toast.LENGTH_SHORT).show();

        Log.d("****************","World");
        Log.d("*****",""+notification.payload.additionalData);
        try {

            Gson gson = new Gson();
            parsers = gson.fromJson(""+notification.payload.additionalData,Parsers.class);

            url = "http://maps.google.com/maps/api/staticmap?zoom=15&markers="+parsers.getLatt()+","+parsers.getLongt()+"&size=100x100";



            EventBus.getDefault().post(parsers);


            EventBus.getDefault().post(url);



           // EventBus.getDefault().post(new EventPojo(""+notification.payload.additionalData));
        } catch (Exception e) {
            e.printStackTrace();
        }


        return false;
    }


}
