package com.appenjel.appenjelotp;


import org.json.JSONObject;

public interface VolleyCallbackJson {
    void OnSuccessResponse(JSONObject response);
    void OnErrorResponse(String response);
}
