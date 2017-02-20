package com.example.segmentfault;

import android.support.v4.view.ViewPager;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.support.design.widget.TabLayout;

public class MainActivity extends AppCompatActivity {

    TabLayout mTableLayout;

    ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setNavigationIcon(R.drawable.ic_explore_black_18dp);
        setSupportActionBar(toolbar);

        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) findViewById(R.id.swipe_refresh);
        swipeRefreshLayout.setColorSchemeResources(R.color.colorPrimary);

        mTableLayout = (TabLayout) findViewById(R.id.tab_layout);
        mViewPager = (ViewPager) findViewById(R.id.viewpage);
        mViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(mTableLayout));

        MyFragmentPagerAdapter adapter = new MyFragmentPagerAdapter(getSupportFragmentManager(), this);
        mViewPager.setAdapter(adapter);

        mTableLayout.setupWithViewPager(mViewPager);

        TabLayout boomTabLayout = (TabLayout) findViewById(R.id.boom_tablayout);
        boomTabLayout.addTab(boomTabLayout.newTab().setText("头条"));
        boomTabLayout.addTab(boomTabLayout.newTab().setText("专栏"));
        boomTabLayout.addTab(boomTabLayout.newTab().setText("问答"));
        boomTabLayout.addTab(boomTabLayout.newTab().setText("发现"));
        boomTabLayout.addTab(boomTabLayout.newTab().setText("我的"));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.toolbar, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.ic_sort_white:
                break;
            case R.id.ic_add_white:
                break;
            default:
                break;
        }
        return true;
    }
}

