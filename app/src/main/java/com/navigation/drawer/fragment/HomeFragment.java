package com.navigation.drawer.fragment;

import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.navigation.drawer.R;


public class HomeFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) getActivity().findViewById(R.id.collapse_toolbar_layout);
        collapsingToolbarLayout.setTitle("Home");
        collapsingToolbarLayout.setCollapsedTitleTextColor(getResources().getColor(R.color.white));
        collapsingToolbarLayout.setExpandedTitleColor(getResources().getColor(R.color.white));
        return inflater.inflate(R.layout.fragment_home, container, false);
    }
}
