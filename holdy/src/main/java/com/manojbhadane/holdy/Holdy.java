package com.manojbhadane.holdy;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.Toast;

final public class Holdy {

    /**
     * Version Commit guide on Jitpack , execute follwing commands
     * <p>
     * git tag -a v1.2 -m "first commit"
     * git push origin v1.2
     *
     * @param context
     * @param attrs
     */

    protected static final String KEY = "key_container";
    protected static final String KEY_TITLE = "key_title";
    protected static final String KEY_THEME = "key_theme";
    protected static final String KEY_FRAGMENT = "key_fragment";
    protected static final String KEY_SOFTINPUT_MODE = "key_softinput_mode";
    protected static final String KEY_SCREEN_ORIENTATION_PORTRAIT = "key_screen_orientation_portrait";
    protected static final String KEY_TOOLBAR_VISIBILITY = "key_toolbar_visibility";
    protected static final String KEY_TOOLBAR_BACKBTN_VISIBILITY = "key_toolbar_back_btn_visibility";

    public static Typeface sTypeface;
    private static int sTheme;

    private Holdy() {
    }

    public static HoldyBuilder Builder(Context context) {
        return new HoldyBuilder(context);
    }

    public static void init(int theme, Typeface typeface) {
        sTheme = theme;
        sTypeface = typeface;
    }

    public static void init(int theme) {
        sTheme = theme;
    }

    public static class HoldyBuilder {

        private int mScreenOrientation = -1;
        private int mSoftInputMode = 0;
        private String mTitle;
        private Bundle mBundle;
        private Context mContext;
        private String mFragment = "";

        private int mTheme;
        private boolean mShowToolbar = true;
        private boolean mShowToolbarBackBtn = true;

        public HoldyBuilder(Context context) {
            mContext = context;
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

        public String getTitle() {
            return mTitle;
        }

        public HoldyBuilder setTitle(String title) {
            this.mTitle = title;
            return this;
        }

        public Bundle getBundle() {

            if (mBundle == null)
                mBundle = new Bundle();

            mBundle.putString(KEY_TITLE, getTitle());
            mBundle.putString(KEY_FRAGMENT, mFragment);
            mBundle.putInt(KEY_SOFTINPUT_MODE, mSoftInputMode);
            mBundle.putInt(KEY_SCREEN_ORIENTATION_PORTRAIT, mScreenOrientation);
            mBundle.putBoolean(KEY_TOOLBAR_VISIBILITY, isShowToolbar());
            mBundle.putBoolean(KEY_TOOLBAR_BACKBTN_VISIBILITY, isToolbarBackBtnShown());
            if (sTheme != 0)
                mBundle.putInt(KEY_THEME, sTheme);

            if (getTheme() != 0)
                mBundle.putInt(KEY_THEME, getTheme());

            return mBundle;
        }

        public HoldyBuilder setBundle(Bundle bundle) {
            this.mBundle = bundle;
            return this;
        }

        public boolean isShowToolbar() {
            return mShowToolbar;
        }

        public HoldyBuilder setShowToolbar(boolean showToolbar) {
            this.mShowToolbar = showToolbar;
            return this;
        }

        public HoldyBuilder setFragment(String fragment) {
            this.mFragment = fragment;
            return this;
        }

        public boolean isToolbarBackBtnShown() {
            return mShowToolbarBackBtn;
        }

        public HoldyBuilder setToolbarBackBtn(boolean showToolbarBackBtn) {
            this.mShowToolbarBackBtn = showToolbarBackBtn;
            return this;
        }

        public int getTheme() {
            return mTheme;
        }

        public HoldyBuilder setTheme(int theme) {
            this.mTheme = theme;
            return this;
        }

        public HoldyBuilder setSoftInputMode(int softInputMode) {
            mSoftInputMode = softInputMode;
            return this;
        }

        public HoldyBuilder setOrientationToPortrait() {
            mScreenOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT;
            return this;
        }

    }
}
