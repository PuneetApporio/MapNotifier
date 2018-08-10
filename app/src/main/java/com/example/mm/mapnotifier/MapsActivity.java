package com.example.mm.mapnotifier;

import android.Manifest;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interfaces.StringRequestListener;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.gson.Gson;
import com.google.maps.android.PolyUtil;
import com.mindorks.placeholderview.PlaceHolderView;
import com.onesignal.OneSignal;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    Button button;
    LatLng CurrentLocation;
    ArrayList<LatLng> latLngs = new ArrayList<>();
    RouteParser routeParser;
    LocationManager locationManager;


    String imageUrl;
    private GoogleMap mMap;
    PlaceHolderView placeholder;
    String ss = "";
    ArrayList<Boolean> selectlist = new ArrayList<>();


    @Override
    protected void onResume() {
        EventBus.getDefault().register(this);

        super.onResume();
    }


    @Override
    protected void onPause() {
        super.onPause();
        EventBus.getDefault().unregister(this);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        placeholder = (PlaceHolderView) findViewById(R.id.placeholder);
        mapFragment.getMapAsync(this);


        button = (Button) findViewById(R.id.btn);


        for (int i = 0; i < 6; i++) {
            selectlist.add(false);
        }


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Toast.makeText(MapsActivity.this, "" + ss, Toast.LENGTH_SHORT).show();
                // Toast.makeText(MapsActivity.this, ""+x, Toast.LENGTH_SHORT).show();

                //placeholder.addView(new Holder());
                //placeholder.getBuilder().setLayoutManager(new LinearLayoutManager(MapsActivity.this, LinearLayoutManager.VERTICAL, false));
            }
        });


    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng sydney = new LatLng(-34, 151);
        mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
    }


    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onMessageEvent(String str) {
        ss = str;

        placeholder.addView(new Holder(this, selectlist, ss));

    }


    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onMessageEvent1(Parsers parsers) {
        latLngs.add(new LatLng(Double.parseDouble(parsers.getLatt()), Double.parseDouble(parsers.getLongt())));


    }


    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onClickPosition(final Integer pos) {



        Toast.makeText(this, "subscriber position" + pos, Toast.LENGTH_SHORT).show();


        for (int i = 0; i < selectlist.size(); i++) {
            if (i == pos) {


                ((Holder) placeholder.getAllViewResolvers().get(0)).seleclist.set(pos, true);


            } else {
                ((Holder) placeholder.getAllViewResolvers().get(0)).seleclist.set(i, false);

            }
        }

        placeholder.refresh();


        Log.d("position is", "" + pos);

        locationManager = (LocationManager) getSystemService(LOCATION_SERVICE);




        if (ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {

            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.ACCESS_COARSE_LOCATION, Manifest.permission.ACCESS_COARSE_LOCATION}, 0);
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }


        if (locationManager.isProviderEnabled(LocationManager.NETWORK_PROVIDER)) {


            locationManager.requestLocationUpdates(LocationManager.NETWORK_PROVIDER, 0, 0, new LocationListener() {
                @Override
                public void onLocationChanged(Location location) {

                    CurrentLocation = new LatLng(location.getLatitude(), location.getLongitude());
                    Log.d("*********************","Cuurent loc"+CurrentLocation);
                    locats(pos);
                    Toast.makeText(MapsActivity.this, "" + CurrentLocation, Toast.LENGTH_SHORT).show();

                }

                @Override
                public void onStatusChanged(String s, int i, Bundle bundle) {

                }

                @Override
                public void onProviderEnabled(String s) {

                }

                @Override
                public void onProviderDisabled(String s) {

                }
            });






        }

    }





    public void locats(int pos)
    {

        String localityorigin="";
        String localitydes="";
        // "+CurrentLocation.latitude+","+CurrentLocation.longitude+"

        Geocoder geocoder = new Geocoder(getApplicationContext());

        try {
            List<Address> addresses = geocoder.getFromLocation(CurrentLocation.latitude,CurrentLocation.longitude,1);
            List<Address> addresses1 = geocoder.getFromLocation(latLngs.get(pos).latitude,latLngs.get(pos).longitude,1);


            localityorigin = addresses.get(0).getLocality();
            localitydes = addresses1.get(0).getLocality();

        } catch (IOException e) {
            e.printStackTrace();
        }


        callApi("https://maps.googleapis.com/maps/api/directions/json?origin="+localityorigin+"&destination="+localitydes);


    }







    public void callApi(String url)
    {

        AndroidNetworking.get(url).build().getAsString(new StringRequestListener() {
            @Override
            public void onResponse(String response) {


                Log.d("*************response",""+response);

                parseIt(response);




            }

            @Override
            public void onError(ANError anError) {

            }
        });




    }

    public void parseIt(String response)
    {

        Gson gson = new Gson();
        routeParser = gson.fromJson(response,RouteParser.class);

        addPoly();




    }





    public void addPoly()
    {

        List<LatLng> latLongList = PolyUtil.decode(routeParser.getRoutes().get(0).getOverview_polyline().getPoints());
        mMap.addPolyline(new PolylineOptions().addAll(latLongList).color(Color.RED));


        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(latLongList.get(0).latitude, latLongList.get(0).longitude), 10.2f));

  //      mMap.addMarker(new MarkerOptions().position(CurrentLocation));

    }


}
