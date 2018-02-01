package com.example.meg.paymate.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.meg.paymate.R;

/**
 * Created by meg on 01/02/18.
 */

public class AddContactScreenOneFragment extends android.support.v4.app.Fragment{

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle
            savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_add_contact_screen_one,
                container, false);


        return rootView;
    }
}
