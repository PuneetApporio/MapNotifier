package com.example.mm.mapnotifier;


import android.content.Context;
import android.graphics.Color;
import android.util.Log;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.bumptech.glide.Glide;
import com.mindorks.placeholderview.annotations.Click;
import com.mindorks.placeholderview.annotations.Layout;
import com.mindorks.placeholderview.annotations.Position;
import com.mindorks.placeholderview.annotations.Resolve;
import com.mindorks.placeholderview.annotations.View;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import java.util.ArrayList;

@Layout(R.layout.designlayout)
public class Holder {


    Context context;
    String url;
    ArrayList<Boolean> seleclist = new ArrayList<>();

    @View(R.id.lays)
    private LinearLayout lays;
    @View(R.id.img)
    private ImageView img;


    public Holder(Context context, ArrayList<Boolean> seleclist,  String url) {
        this.context = context;
        this.url = url;
        this.seleclist = seleclist;

    }


    @Position
    private int position;


    @Resolve
    public void onResolve() {

        //  lays.setBackgroundColor(Color.DKGRAY);


        Glide.with(context).load(url).into(img);


        Log.d("%%%%%%%%%%5", "" + seleclist.get(position));

        if (seleclist.get(position) == true) {


            lays.setBackgroundColor(Color.RED);
           //
            // EventBus.getDefault().post(img);


        } else {
            lays.setBackgroundColor(Color.DKGRAY);


        }


    }


    @Click(R.id.img)
    public void select() {


        EventBus.getDefault().post(Integer.valueOf(position));

    }


}
