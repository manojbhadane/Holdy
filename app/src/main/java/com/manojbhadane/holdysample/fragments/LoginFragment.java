package com.manojbhadane.holdysample.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.manojbhadane.holdysample.R;
import com.manojbhadane.holdysample.databinding.FragmentHomeBinding;
import com.manojbhadane.holdysample.databinding.FragmentLoginBinding;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

public class LoginFragment extends Fragment {

    private FragmentLoginBinding mDataBinding;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        mDataBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_login, container, false);

        return mDataBinding.getRoot();
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {

    }
}
