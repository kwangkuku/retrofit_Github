package com.example.acer.test_retrofit;

import com.squareup.okhttp.ResponseBody;

import retrofit.Retrofit;



/**
 * Created by Acer on 6/9/2559.
 */


public interface OnNetworkCallbackListener  {

        public void onResponse(User user, Retrofit retrofit) ;

        public void onBodyError(ResponseBody responseBodyError);

        public void onBodyErrorIsNull();

        public void onFailure(Throwable t);
        }






    /*
    public void onResponse(User user, Retrofit retrofit);
    public void onBodyError(ResponseBody responseBodyError);
    public void onBodyErrorIsNull();
    public void onFailure(Throwable t);


    OnNetworkCallbackListener networkCallbackListener = new OnNetworkCallbackListener() {
        @Override
        public void onResponse(User user, Retrofit retrofit) {

            //200

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

    */

