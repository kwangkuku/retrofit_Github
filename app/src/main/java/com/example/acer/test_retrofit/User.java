package com.example.acer.test_retrofit;

import com.google.gson.annotations.Expose;

/**
 * Created by Acer on 6/9/2559.
 */

//Model ( POJO )
    // Data Json <Respone> from Server

public class User {
    @Expose
    String name;
    @Expose
    String blog;
    @Expose
    String company;

    public String getName() {
        return name;
    }

    public String getBlog() {
        return blog;
    }

    public String getCompany() {
        return company;
    }



}


