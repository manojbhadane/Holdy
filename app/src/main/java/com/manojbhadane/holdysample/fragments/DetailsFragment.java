package com.manojbhadane.holdysample.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import com.manojbhadane.holdysample.R;
import com.manojbhadane.holdysample.databinding.FragmentDetailsBinding;
import com.manojbhadane.holdysample.databinding.FragmentLoginBinding;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

public class DetailsFragment extends Fragment {

    private FragmentDetailsBinding mDataBinding;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        mDataBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_details, container, false);

        return mDataBinding.getRoot();
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        setHasOptionsMenu(true);
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
        inflater.inflate(R.menu.menu_details, menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                return true;

            case R.id.menu_Add:

                return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
