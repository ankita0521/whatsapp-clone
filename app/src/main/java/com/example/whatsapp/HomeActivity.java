package com.example.whatsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.whatsapp.Adapter.FragAdapter;
import com.google.android.material.tabs.TabLayout;

public class HomeActivity extends AppCompatActivity {


    TabLayout tabLayout;
    ViewPager viewPager;
    FragAdapter fragAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        tabLayout = findViewById(R.id.tab);
        viewPager = findViewById(R.id.viewpager);


        tabLayout.addTab(tabLayout.newTab().setText("CALLS"));
        tabLayout.addTab(tabLayout.newTab().setText("CHATS"));
        tabLayout.addTab(tabLayout.newTab().setText("CONTACTS"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

      fragAdapter = new FragAdapter(getSupportFragmentManager(),this,tabLayout.getTabCount());
        viewPager.setAdapter(fragAdapter);


        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition(),true);

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });


    }
}