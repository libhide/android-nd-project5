package com.example.xyzreader.ui.fragment;


import android.os.Bundle;
import android.support.annotation.CallSuper;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.View;

import butterknife.ButterKnife;

/**
 * Created by Ratik on 12/10/16.
 */

/**
 * Base class for all fragments.
 * Binds views, watches memory leaks
 *
 * @see ButterKnife
 */
public class BaseFragment extends Fragment {

    @CallSuper
    @Override public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ButterKnife.bind(this, view);
    }

    @CallSuper
    @Override public void onDestroyView() {
        ButterKnife.unbind(this);
        super.onDestroyView();
    }
}
