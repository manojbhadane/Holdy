package com.manojbhadane.holdy;

import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;

import com.manojbhadane.holdy.databinding.ActivityHolderBinding;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import static com.manojbhadane.holdy.Holdy.KEY_FRAGMENT;

public class HolderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        /**
         *  Obtain parameters
         */
        Bundle b = getIntent().getBundleExtra(Holdy.KEY);
        String title = b.getString(Holdy.KEY_TITLE);
        int theme = b.getInt(Holdy.KEY_THEME);
        boolean shouldShowToolbar = b.getBoolean(Holdy.KEY_TOOLBAR_VISIBILITY);
        boolean shouldShowToolbarBackBtn = b.getBoolean(Holdy.KEY_TOOLBAR_BACKBTN_VISIBILITY);
        String fragment = b.getString(KEY_FRAGMENT);


        setTheme(theme);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_holder);
        ActivityHolderBinding dataBinding = DataBindingUtil.setContentView(this, R.layout.activity_holder);

        /**
         *  Toolbar
         */
        if (shouldShowToolbar) {
            dataBinding.toolBar.setVisibility(View.VISIBLE);
            setSupportActionBar(dataBinding.toolBar);
            getSupportActionBar().setTitle(title);
            if (shouldShowToolbarBackBtn)
                getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        } else {
            dataBinding.toolBar.setVisibility(View.GONE);
        }

        /**
         * Load fragment
         */
        loadFragment(fragment, b);

    }

    /**
     * Load given fragment
     * @param className     fragment name
     * @param bundle        bundle for fragment
     */
    public void loadFragment(String className, Bundle bundle) {

        try {
            FragmentManager manager = getSupportFragmentManager();
            Fragment fragment = (Fragment) Class.forName(className).newInstance();
            fragment.setArguments(bundle);
            FragmentTransaction transaction = manager.beginTransaction();
            transaction.replace(R.id.layContainer, fragment);
            transaction.commit();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
