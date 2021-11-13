package com.appenjel.apppenjelotp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.appenjel.appenjelotp.AppenjelOTP;
import com.appenjel.appenjelotp.VolleyCallbackJson;

import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        AppenjelOTP appenjelOTP = new AppenjelOTP();
        appenjelOTP.SetAuthToken("your API token here");

        JSONObject jsonObject = new JSONObject();
        try {
            jsonObject.put("number", "01710188764");
            jsonObject.put("mask_type", "none_masking");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        appenjelOTP.send(getApplicationContext(), jsonObject, new VolleyCallbackJson() {
            @Override
            public void OnSuccessResponse(JSONObject response) {
                Log.d("match",""+ appenjelOTP.Match("11225"));
            }
        });

    }
}