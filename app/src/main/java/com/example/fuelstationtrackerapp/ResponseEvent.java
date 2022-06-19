package com.example.fuelstationtrackerapp;

import org.json.JSONObject;

import java.util.ArrayList;

public class ResponseEvent {
    public final ArrayList<JSONObject> message;
    public ResponseEvent(ArrayList<JSONObject> message) {
        this.message = message;
    }
}
