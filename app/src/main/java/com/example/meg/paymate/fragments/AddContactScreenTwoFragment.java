package com.example.meg.paymate.fragments;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.meg.paymate.R;
import com.example.meg.paymate.utils.FontManager;

/**
 * Created by meg on 01/02/18.
 */

public class AddContactScreenTwoFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle
            savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_add_contact_screen_two,
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

        TextView iconCompany = (TextView) rootView.findViewById(R.id.iconCompany);
        iconCompany.setTypeface(fontawesomeIconFont);

        TextView iconReferralCode = (TextView) rootView.findViewById(R.id.iconReferralCode);
        iconReferralCode.setTypeface(fontawesomeIconFont);


        TextView iconAccount = (TextView) rootView.findViewById(R.id.iconAccount);
        iconAccount.setTypeface(simplelineIconFont);


        TextView iconBank = (TextView) rootView.findViewById(R.id.iconBank);
        iconBank.setTypeface(fontawesomeIconFont);

        Button btnNext = (Button) rootView.findViewById(R.id.btnNext);
        btnNext.setTypeface(fontawesomeIconFont);

        Button btnCancel = (Button) rootView.findViewById(R.id.btnCancel);
        btnCancel.setTypeface(fontawesomeIconFont);


    }
}
