package com.example.contacts;

import android.app.Application;

import com.backendless.Backendless;

public class ApplicationClass extends Application {
    public static final String APPLICATION_ID = " 92C964E5-B02C-9D9E-FF71-55512AB18700";
    public static final String API_KEY = "59B5FB00-2487-4F56-AF54-C9F56F22A370";
    public static final String SERVER_URL = "https://api.backendless.com";

   public static Back

    @Override
    public void onCreate() {
        super.onCreate();

        Backendless.setUrl( SERVER_URL );
        Backendless.initApp( getApplicationContext(),APPLICATION_ID,
                API_KEY );
    }

}

