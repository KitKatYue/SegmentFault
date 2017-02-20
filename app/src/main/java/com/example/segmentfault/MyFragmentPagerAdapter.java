package com.example.segmentfault;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by SanYue
 * 2017/2/20
 * email sanyuedev@gmail.com
 */

public class MyFragmentPagerAdapter extends FragmentPagerAdapter {

    public final int COUNT = 9;
    private List<String> tabTitles = new ArrayList<>();
    private Context context;

    public MyFragmentPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
        initData();
    }

    @Override
    public Fragment getItem(int position) {
        return PageFragment.newInstance(position + 1);
    }

    @Override
    public int getCount() {
        return COUNT;
    }

    private void initData() {
        tabTitles.add("全部");
        tabTitles.add("前端");
        tabTitles.add("后端");
        tabTitles.add("iOS");
        tabTitles.add("Android");
        tabTitles.add("安全");
        tabTitles.add("工具");
        tabTitles.add("程序员");
        tabTitles.add("行业");
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles.get(position);
    }
}
