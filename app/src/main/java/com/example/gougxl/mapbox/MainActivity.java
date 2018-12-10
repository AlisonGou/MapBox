package com.example.gougxl.mapbox;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.mapbox.mapboxsdk.Mapbox;
import com.mapbox.mapboxsdk.maps.MapView;
import com.mapbox.mapboxsdk.maps.MapboxMap;
import com.mapbox.mapboxsdk.maps.OnMapReadyCallback;

public class MainActivity extends AppCompatActivity {
    private MapView mMapView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //mapbox access token
        Mapbox.getInstance(getApplicationContext(),getString(R.string.map_access_token));
        setContentView(R.layout.activity_main);

        mMapView=(MapView) findViewById(R.id.mapView);
        mMapView.onCreate(savedInstanceState);
        mMapView.getMapAsync(new OnMapReadyCallback() {
            @Override
            public void onMapReady(MapboxMap mapboxMap) {

            }
        });

        //
    }
    @Override
    protected void onStart(){
        super.onStart();

    }
}
