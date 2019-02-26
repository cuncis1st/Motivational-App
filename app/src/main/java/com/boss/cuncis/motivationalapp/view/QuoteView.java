package com.boss.cuncis.motivationalapp.view;

import com.boss.cuncis.motivationalapp.model.Quote;

import java.util.List;

public interface QuoteView {
    void showSuccess(Quote result);
    void showError(String message);
}
