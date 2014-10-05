package jp.mursts.android.viewpagersample;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class PagerAdapter extends FragmentPagerAdapter {
    private static final String TAG = PagerAdapter.class.getSimpleName();

    public PagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        if (i < 2) {
            return TabFragment.newInstance(i);
        } else {
            return ThirdFragment.newInstance();
        }
//        return TabFragment.newInstance(i);
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return "Tab " + (position + 1);
    }


}
