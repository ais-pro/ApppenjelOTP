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
        appenjelOTP.SetAuthToken("eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiIsImp0aSI6ImM2MGJmMzMxYWY3YjcyYTJjMGYxZTcwZjEwNmM0OTY4NmNhOTNkODE0YWEzY2FjOTk5M2E1NDRiNjNkYjU2MjY5YzMzMmJhZWQ4ZjUwZGFjIn0.eyJhdWQiOiIxIiwianRpIjoiYzYwYmYzMzFhZjdiNzJhMmMwZjFlNzBmMTA2YzQ5Njg2Y2E5M2Q4MTRhYTNjYWM5OTkzYTU0NGI2M2RiNTYyNjljMzMyYmFlZDhmNTBkYWMiLCJpYXQiOjE2MzU1MjQ0MjQsIm5iZiI6MTYzNTUyNDQyNCwiZXhwIjoxNjY3MDYwNDI0LCJzdWIiOiIxOSIsInNjb3BlcyI6W119.f9q6uThDmVle6iIUSZ4i5eX5Oq8KRSWRNJsymXK2SvqxCc-4C_MbsDMpVSJRvB8qlgJC2QN_cqFKPZqwQ3js337V0p0pkyJUu3hn2tuT5NMmfiD_As5uNWZptK1Tdfh6rcYDGToFw7zc3r_lvdMnkvRFVBmvAZZ3FsGdh-BnZ3a8DN2RckjXr0AnKvXKY2yKtLsvMPMyvQ7rAuuPc7XbkHK_IeTWEaI9dGbIQl5mOKyiyUMUxwNmLmqeN-AGk-pNW8bA2JwpqZibeEw3JhUO1dvGnI9soKxsBDFB65N_2iZhedc1PpzSZbC0BYF7Y-nIatJhz_J-quCj-AjAotZWCKJoiXCbq7SHuJh7Rsp2kuXJtcQHFupyA6Exn6r-h8GxISap9BlXeZrSYODZKiWQKcIuucRILNInkaJ-zGJCFOoOpeSvdsTVB2I233XSYHFoeFOjnsgRs2NIH25f20UxcyQ4xl-vG6PG69hRx2DZlDiikXXdzb2EQYgV9_fIJ0Iocisk44TIz7wFsrnRU9SVjdPpolr4sNSzsqFWv2GMci9jmNinQ1SLeiGiD0CtuDqt_bWQDWe5FmzK_x6dFMsjQrucxOmZMjnY6Iltm5VNWN1wCGhBeemnBTrKgtb-YtW3TTSut2lGXqmIKJmazbX_c93fmsC3UM8vNB_OxDTYeIE");

        JSONObject jsonObject = new JSONObject();
        try {
            jsonObject.put("number", "01710188764");
            jsonObject.put("mask_type", "none_masking");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        appenjelOTP.send(getApplicationContext(),jsonObject, new VolleyCallbackJson() {
            @Override
            public void OnSuccessResponse(JSONObject response) {

            }
        });

        Log.d("__data__", appenjelOTP.GetOtpCode());
    }
}