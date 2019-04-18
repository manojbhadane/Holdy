package com.manojbhadane.holdy;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class Holdy {

    protected static final String KEY = "key_container";
    protected static final String KEY_TITLE = "key_title";
    protected static final String KEY_THEME = "key_theme";
    protected static final String KEY_FRAGMENT = "key_fragment";
    protected static final String KEY_TOOLBAR_VISIBILITY = "key_toolbar_visibility";
    protected static final String KEY_TOOLBAR_BACKBTN_VISIBILITY = "key_toolbar_back_btn_visibility";

    private static int sTheme;

    public Holdy() {
    }

    public static void init(int theme) {
        sTheme = theme;
    }

    public static class Builder {

        private String mTitle;
        private Bundle mBundle;
        private Context mContext;
        private String mFragment = "";

        private int mTheme;
        private boolean mShowToolbar = true;
        private boolean mShowToolbarBackBtn = true;

        public Builder(Context context) {
            mContext = context;
        }

        public String getTitle() {
            return mTitle;
        }

        public Builder setTitle(String title) {
            this.mTitle = title;
            return this;
        }

        public Bundle getBundle() {

            if (mBundle == null)
                mBundle = new Bundle();

            mBundle.putString(KEY_TITLE, getTitle());
            mBundle.putBoolean(KEY_TOOLBAR_VISIBILITY, isShowToolbar());
            mBundle.putBoolean(KEY_TOOLBAR_BACKBTN_VISIBILITY, isToolbarBackBtnShown());
            mBundle.putString(KEY_FRAGMENT, mFragment);
            if (sTheme != 0)
                mBundle.putInt(KEY_THEME, sTheme);

            if (getTheme() != 0)
                mBundle.putInt(KEY_THEME, getTheme());

            return mBundle;
        }

        public Builder setBundle(Bundle bundle) {
            this.mBundle = bundle;
            return this;
        }

        public boolean isShowToolbar() {
            return mShowToolbar;
        }

        public Builder setShowToolbar(boolean showToolbar) {
            this.mShowToolbar = showToolbar;
            return this;
        }

        public Builder setFragment(String frag) {
            this.mFragment = frag;
            return this;
        }

        public boolean isToolbarBackBtnShown() {
            return mShowToolbarBackBtn;
        }

        public Builder setToolbarBackBtn(boolean showToolbarBackBtn) {
            this.mShowToolbarBackBtn = showToolbarBackBtn;
            return this;
        }

        public int getTheme() {
            return mTheme;
        }

        public Builder setTheme(int theme) {
            this.mTheme = theme;
            return this;
        }

        public void build() {
            if (mFragment.length() > 0) {
                Intent intent = new Intent(mContext, HolderActivity.class);
                intent.putExtra(KEY, getBundle());
                mContext.startActivity(intent);
            } else {
                Toast.makeText(mContext, "Invalid fragment", Toast.LENGTH_SHORT).show();
            }
        }
    }
}
