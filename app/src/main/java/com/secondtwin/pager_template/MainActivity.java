package com.secondtwin.pager_template;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.secondtwin.pager_template.Fragments.FirstFragment;
import com.secondtwin.pager_template.Fragments.SecondFragment;
import com.secondtwin.pager_template.Fragments.ThirdFragment;

public class MainActivity extends AppCompatActivity {
    private SectionsPageAdapter mSectionsPagerAdapter;
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        mSectionsPagerAdapter = new SectionsPageAdapter(getSupportFragmentManager());

        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);
        setupViewPager(mViewPager);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);

    }

    private void setupViewPager(ViewPager viewPager){
        SectionsPageAdapter adapter = new SectionsPageAdapter(getSupportFragmentManager());
        adapter.addFragment(new FirstFragment(), "Информация");
        adapter.addFragment(new SecondFragment(), "Тактики");
        adapter.addFragment(new ThirdFragment(), "О проекте");

        viewPager.setAdapter(adapter);


    }

}
