package com.byteshaft.groupedirectouest.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.byteshaft.groupedirectouest.R;


public class FormFragment extends Fragment {

    private View mBaseView;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mBaseView = inflater.inflate(R.layout.formlayout, container, false);
        return mBaseView;
    }
}