package com.appenjel.apppenjelotp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class OtpVerify extends AppCompatActivity {
    Button btn_verify;
    EditText tv_code;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp_verify);


        btn_verify = findViewById(R.id.btn_verify);
        tv_code = findViewById(R.id.tv_code);

        Bundle bundle = getIntent().getExtras();
        String otp_code = bundle.getString("otp_code");

        btn_verify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tv_code.getText().toString().matches(otp_code)){
                    Toast.makeText(getApplicationContext(), "Verified success", Toast.LENGTH_SHORT).show();
                    tv_code.setEnabled(false);
                    btn_verify.setEnabled(false);
                }else{
//                    Log.d("__verify__", )
                    Toast.makeText(getApplicationContext(), "Try again", Toast.LENGTH_SHORT).show();
                    tv_code.setText("");
                    tv_code.requestFocus();
                }
            }
        });


    }
}