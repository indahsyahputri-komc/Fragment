package com.example.fragmentlist;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class PagerAdapter extends FragmentStatePagerAdapter {
    private int number_tabs;
    public PagerAdapter(FragmentManager fm, int number_tabs)
    {
        super(fm, FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        this.number_tabs = number_tabs;
    }

    public Fragment getItem(int position){
        switch (position)
        {
            case 0:
                return new Frag2018();
            case 1:
                return new Frag2019();
            case 2:
                return new Frag2020();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return number_tabs;
    }
}
