package com.appenjel.apppenjelotp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.appenjel.appenjelotp.AppenjelOTP;
import com.appenjel.appenjelotp.VolleyCallbackJson;

import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {
    Button login;
    EditText phone_no;
    private AppenjelOTP appenjelOTP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login = findViewById(R.id.login);
        phone_no = findViewById(R.id.phone_no);


        appenjelOTP = new AppenjelOTP();
        appenjelOTP.SetAuthToken("Your api token here.");


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                login();
            }
        });




    }



    public void login() {
        JSONObject jsonObject = new JSONObject();
        try {
            jsonObject.put("number", phone_no.getText().toString());
            jsonObject.put("mask_type", "none_masking");
        } catch (JSONException e) {
            e.printStackTrace();
        }

        appenjelOTP.send(getApplicationContext(), jsonObject, new VolleyCallbackJson() {
            @Override
            public void OnSuccessResponse(JSONObject response) {

                Intent intent = new Intent(getApplicationContext(), OtpVerify.class);
                try {
                    intent.putExtra("otp_code", response.getString("otp_code"));
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                startActivity(intent);
            }

            @Override
            public void OnErrorResponse(String response) {
                Toast.makeText(getApplicationContext(), "Token sent fail", Toast.LENGTH_SHORT).show();
            }
        });
    }
}