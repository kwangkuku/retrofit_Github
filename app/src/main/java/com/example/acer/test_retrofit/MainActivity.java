package com.example.acer.test_retrofit;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.squareup.okhttp.ResponseBody;

import retrofit.Retrofit;

public class MainActivity extends AppCompatActivity {

    //Layout Form
    LinearLayout layoutForm;
    EditText edUserName;
    Button btn_send;

    //Layout Progress
    LinearLayout layoutProgress;

    //Layout Result
    LinearLayout layoutResult;
    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Layout Form
        layoutForm = (LinearLayout) findViewById(R.id.layoutForm);
        edUserName = (EditText) findViewById(R.id.edUserName);
        btn_send = (Button) findViewById(R.id.btn_send);


        //Layout Progress
        layoutProgress = (LinearLayout) findViewById(R.id.layoutProgress);

        //Layout Result
        layoutResult = (LinearLayout) findViewById(R.id.layoutResult);
        tvResult = (TextView) findViewById(R.id.tvResult);

        View.OnClickListener onBtSendClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                layoutForm.setVisibility(View.GONE);
                layoutResult.setVisibility(View.GONE);
                layoutProgress.setVisibility(View.VISIBLE);
                new NetworkConnectionManager().callServer(networkCallbackListener, edUserName.getText().toString());
            }
        };

        //setOnClick
        btn_send.setOnClickListener(onBtSendClickListener);



    }
    OnNetworkCallbackListener networkCallbackListener = new OnNetworkCallbackListener() {
        @Override
        public void onResponse(User user, Retrofit retrofit) {
            //200

            String data = "Github Name :" + user.getName() +
                    "\nBlog :"+user.getBlog() +
                    "\nCompany Name :" + user.getCompany();
            tvResult.setText(data);

            layoutForm.setVisibility(View.GONE);
            layoutResult.setVisibility(View.VISIBLE);
            layoutProgress.setVisibility(View.GONE);

        }

        @Override
        public void onBodyError(ResponseBody responseBodyError) {
            //404 (error not null)

        }

        @Override
        public void onBodyErrorIsNull() {
            //404 (error is null)

        }

        @Override
        public void onFailure(Throwable t) {
            //fail any course

        }
    };
}
