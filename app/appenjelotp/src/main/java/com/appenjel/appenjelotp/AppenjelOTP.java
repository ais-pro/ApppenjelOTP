package com.appenjel.appenjelotp;

import android.content.Context;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class AppenjelOTP {

    public String otp_code;
    private JSONObject response;
    private String token;

    private RequestQueue mRequest;
    public String Base_url;

    public boolean send(Context context, JSONObject postData, final VolleyCallbackJson volleyCallbackJson){

        mRequest = Volley.newRequestQueue(context);
        mRequest.getCache().clear();

        Base_url = "https://sms.appenjel.com/api/send-otp-sms";

        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest
                (Request.Method.POST, Base_url, postData, new Response.Listener<JSONObject>() {


                    @Override
                    public void onResponse(JSONObject response) {
                        try {
                            otp_code =  response.getString("otp_code");
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                        volleyCallbackJson.OnSuccessResponse(response);
                    }
                }, new Response.ErrorListener() {

                    @Override
                    public void onErrorResponse(VolleyError error) {


                        error.printStackTrace();
                        // TODO: Handle error

                    }
                }) {


            /**
             * Passing some request headers
             */
            @Override
            public Map<String, String> getHeaders() throws AuthFailureError {
                HashMap<String, String> headers = new HashMap<String, String>();
                headers.put("Content-Type", "application/json");
                headers.put("Accept", "application/json");
                headers.put("Authorization", token);
                return headers;
            }
        };
        mRequest.add(jsonObjectRequest);
        return false;

    }




    public String GetOtpCode(){
        return otp_code;
    }


    public void SetAuthToken(String token){
        this.token = "Bearer " + token;
    }

}
