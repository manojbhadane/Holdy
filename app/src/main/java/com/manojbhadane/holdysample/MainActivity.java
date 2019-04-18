package com.manojbhadane.holdysample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.manojbhadane.holdy.Holdy;
import com.manojbhadane.holdysample.databinding.ActivityMainBinding;
import com.manojbhadane.holdysample.fragments.HomeFragment;
import com.manojbhadane.holdysample.fragments.LoginFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        ActivityMainBinding dataBinding= DataBindingUtil.setContentView(this,R.layout.activity_main);


        dataBinding.btnFrag1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                /**
                 * Login fragment
                 */
                new Holdy.Builder(MainActivity.this)
                        .setTitle("Login")
                        .setToolbarBackBtn(false)
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
                new Holdy.Builder(MainActivity.this)
                        .setTitle("Home")
                        .setBundle(new Bundle())
                        .setTheme(R.style.HomeTheme)
                        .setToolbarBackBtn(true)
                        .setFragment(HomeFragment.class.getCanonicalName())
                        .build();

            }
        });
    }
}
