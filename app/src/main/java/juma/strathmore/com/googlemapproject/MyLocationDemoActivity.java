package juma.strathmore.com.googlemapproject;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import android.widget.Toast;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;

import static juma.strathmore.com.googlemapproject.R.id.map;

/**
 * Created by Dennis Juma on 31/10/2017.
 */

public class MyLocationDemoActivity extends FragmentActivity{
    implements GoogleMap.OnMyLocationButtonClickListener,
    OnMyLocationClickListener,
    OnMapReadyCallback {
        Private GoogleMap mMap;
        @Override
                protected void onCreate( Bundle savedInstanceState;
        savedInstanceState;
        savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.my_location_demo);

            SupportMapFragment mapFragment =
                    (SupportMapFragment) getSupportFragmentManager() .findFragmentById(map);
            mapFragment.getMapAsync(this);
        }
        @Override
                public void onMapReady(GoogleMap map) {
            mMap = map;
            //To do: Before enabling the My Location layer, you must request
            // Location permssion from the user. This sample des not include
            //a request for location permission.
            mMap.setMyLocationEnabled(true);
            mMap.setOnMyLocationButtonClickListener(this);
            mMap.setOnMyLocationClickListener(this);
        }
        @Override
                public void onMyLocationClick(@NonNull Location location) {
            Toast.makeText(this. "Current location:\n" + location, Toast.LENGTH_LONG).show();

        }

        @Override
                public boolean onMyLocationClick() {
            Toast.makeText(this,"MyLocation button clicked",Toast.LENGTH_LONG).show();
            //Return false so that we don't consume the event and the default behavior still occurs
            //(the camera animates to the users position)
            return false;
        }

    }

}
