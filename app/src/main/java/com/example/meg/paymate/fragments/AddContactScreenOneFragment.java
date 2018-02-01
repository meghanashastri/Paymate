package com.example.meg.paymate.fragments;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.meg.paymate.R;
import com.example.meg.paymate.utils.FontManager;

/**
 * Created by meg on 01/02/18.
 */

public class AddContactScreenOneFragment extends android.support.v4.app.Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle
            savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_add_contact_screen_one,
                container, false);
        initViews(rootView);
        return rootView;
    }

    /**
     * Method to initialise views
     *
     * @param rootView
     */
    private void initViews(ViewGroup rootView) {
        Typeface simplelineIconFont = FontManager.getTypeface(getActivity(), FontManager.SIMPLELINE);
        Typeface fontawesomeIconFont = FontManager.getTypeface(getActivity(), FontManager.FONTAWESOME);

        TextView iconFirstName = (TextView) rootView.findViewById(R.id.iconFirstName);
        iconFirstName.setTypeface(simplelineIconFont);

        TextView iconEmail = (TextView) rootView.findViewById(R.id.iconEmail);
        iconEmail.setTypeface(simplelineIconFont);


        TextView iconMobileNumber = (TextView) rootView.findViewById(R.id.iconMobileNumber);
        iconMobileNumber.setTypeface(fontawesomeIconFont);


        TextView iconAddress = (TextView) rootView.findViewById(R.id.iconAddress);
        iconAddress.setTypeface(fontawesomeIconFont);

    }
}
