package com.secondapp.gamestories.Controller;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.secondapp.gamestories.View.OneFragment;
import com.secondapp.gamestories.View.ThreeFragment;

public class MainActivity extends AppCompatActivity {
    private PageAdapter adapter;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.secondapp.gamestories.R.layout.activity_main);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        adapter = new PageAdapter(getSupportFragmentManager());

        viewPager = (ViewPager) findViewById(com.secondapp.gamestories.R.id.container);
        viewPager.setAdapter(adapter);
        setupViewPager(viewPager);

        TabLayout tabs = (TabLayout) findViewById(com.secondapp.gamestories.R.id.tabs);
        tabs.setupWithViewPager(viewPager);

    }

    private void setupViewPager(ViewPager viewPager){
        PageAdapter adapter = new PageAdapter(getSupportFragmentManager());
        adapter.addFragment(new ThreeFragment(), "История");
        adapter.addFragment(new OneFragment(), "Информация");
        //adapter.addFragment(new ThirdFragment(), "О проекте");

        viewPager.setAdapter(adapter);


    }

}
