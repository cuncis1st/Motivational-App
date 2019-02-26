package com.boss.cuncis.motivationalapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.boss.cuncis.motivationalapp.model.Quote;
import com.boss.cuncis.motivationalapp.view.QuoteView;


/**
 * A simple {@link Fragment} subclass.
 */
public class QuoteFragment extends Fragment implements QuoteView {

    TextView tvQuote, tvAuthor;

    public QuoteFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_quote, container, false);

        tvQuote = view.findViewById(R.id.tv_quote);
        tvAuthor = view.findViewById(R.id.tv_author);

        tvQuote.setText("");
        tvAuthor.setText("");

        return view;
    }

    @Override
    public void showSuccess(Quote result) {

    }

    @Override
    public void showError(String message) {
        Toast.makeText(getActivity(), "Error: " + message, Toast.LENGTH_SHORT).show();
    }
}
