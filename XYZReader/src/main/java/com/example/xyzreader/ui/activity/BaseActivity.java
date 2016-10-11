package com.example.xyzreader.ui.activity;

import android.support.annotation.CallSuper;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;

/**
 * Created by Ratik on 12/10/16.
 */

/**
 * Base class for all activities.
 * Binds views and watches memory leaks
 *
 * @see ButterKnife
 */
public class BaseActivity extends AppCompatActivity {

    @CallSuper
    @Override public void setContentView(int layoutResID) {
        super.setContentView(layoutResID);
        ButterKnife.bind(this);
    }
}
