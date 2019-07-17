package com.manojbhadane.holdysample;

import android.os.Bundle;
import android.view.View;

import com.manojbhadane.holdy.Holdy;
import com.manojbhadane.holdysample.databinding.ActivityMainBinding;
import com.manojbhadane.holdysample.fragments.DetailsFragment;
import com.manojbhadane.holdysample.fragments.HomeFragment;
import com.manojbhadane.holdysample.fragments.LoginFragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding dataBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        init(dataBinding);
    }

    public void init(ActivityMainBinding dataBinding) {

        dataBinding.btnFrag1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                /**
                 * Login fragment
                 */
                Holdy.Builder(MainActivity.this)
                        .setTitle("Login")
                        .setToolbarBackBtn(false)
                        .setOrientationToPortrait()
                        .setFragment(LoginFragment.class.getCanonicalName())
                        .build();

            }
        });

        dataBinding.btnFrag2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                /**
                 * Home fragment
                 */
                 Holdy.Builder(MainActivity.this)
                        .setTitle("Home")
                        .setShowToolbar(true)
                        .setBundle(new Bundle())
                        .setToolbarBackBtn(true)
                        .setTheme(R.style.HomeTheme)
                        .setFragment(HomeFragment.class.getCanonicalName())
                        .build();


            }
        });

        dataBinding.btnFrag3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                /**
                 * Details fragment
                 */
                 Holdy.Builder(MainActivity.this)
                        .setTitle("Details")
                        .setToolbarBackBtn(true)
                        .setFragment(DetailsFragment.class.getCanonicalName())
                        .build();
            }
        });
    }
}
