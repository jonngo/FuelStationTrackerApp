package com.example.fuelstationtrackerapp;

import android.location.Location;

public class MessageEvent {
    public final Location message;
    //public final ArrayList<JSONObject> response;
    public final String response;

    public MessageEvent(Location message, String response) {
        this.message = message;
        this.response = response;
    }
}
