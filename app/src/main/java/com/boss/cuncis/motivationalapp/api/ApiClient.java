package com.boss.cuncis.motivationalapp.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {
    private static final String BASE_URL = "https://raw.githubusercontent.com/";
    private Retrofit retrofit = null;

    public TheQuoteApi getQuoteApi() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }

        return retrofit.create(TheQuoteApi.class);
    }
}
