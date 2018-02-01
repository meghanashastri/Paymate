package com.example.meg.paymate;

import android.graphics.Typeface;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.example.meg.paymate.fragments.AddContactScreenOneFragment;
import com.example.meg.paymate.utils.FontManager;

public class MainActivity extends AppCompatActivity {

    private AddContactScreenOneFragment mFragmentOne;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initToolbar();
        initViews();
        mFragmentOne = new AddContactScreenOneFragment();
        replaceFragment(mFragmentOne, AddContactScreenOneFragment.class.getSimpleName());

    }

    /**
     * Initialise toolbar and set Title
     */
    private void initToolbar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("");
        getSupportActionBar().setTitle(getResources().getString(R.string.add_contact));

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    /**
     * Initialise Views
     */
    private void initViews() {
        Typeface iconFont = FontManager.getTypeface(this, FontManager.SIMPLELINE);
        // holder.icon.setTypeface(iconFont);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id) {
            case android.R.id.home:
                finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    /**
     * @param fragment
     * @param TAG
     */
    public void replaceFragment(Fragment fragment, String TAG) {
        FragmentManager mFragmentManager = getSupportFragmentManager();
        FragmentTransaction mFragmentTransaction = mFragmentManager.beginTransaction();
        mFragmentTransaction.replace(R.id.fragment_holder, fragment, TAG);
        mFragmentTransaction.commit();
    }

}
