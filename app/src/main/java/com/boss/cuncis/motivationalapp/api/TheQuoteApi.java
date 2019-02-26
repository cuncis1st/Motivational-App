package com.boss.cuncis.motivationalapp.api;

import com.boss.cuncis.motivationalapp.model.Quote;

import retrofit2.Call;
import retrofit2.http.GET;

public interface TheQuoteApi {
    @GET("pdichone/UIUX-Android-Course/master/Quotes.json%20")
    Call<Quote> getQuote();
}
