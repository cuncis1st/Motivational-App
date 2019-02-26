package com.boss.cuncis.motivationalapp.presenter;

import com.boss.cuncis.motivationalapp.api.ApiClient;
import com.boss.cuncis.motivationalapp.api.TheQuoteApi;
import com.boss.cuncis.motivationalapp.model.Quote;
import com.boss.cuncis.motivationalapp.view.QuoteView;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class QuotePresenter {
    private QuoteView view;
    private TheQuoteApi theQuoteApi;

    public QuotePresenter(QuoteView view) {
        this.view = view;
        theQuoteApi = new ApiClient().getQuoteApi();
    }

    public void getAllQuote() {
        theQuoteApi.getQuote()
                .enqueue(new Callback<Quote>() {
                    @Override
                    public void onResponse(Call<Quote> call, Response<Quote> response) {
                        if (response.isSuccessful()) {
                            view.showSuccess(response.body());
                        } else {
                            view.showError(response.message());
                        }
                    }

                    @Override
                    public void onFailure(Call<Quote> call, Throwable t) {
                        view.showError(t.getMessage());
                    }
                });
    }
}
