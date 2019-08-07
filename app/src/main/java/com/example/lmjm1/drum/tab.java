package com.example.lmjm1.drum;

import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;

public class tab extends AppCompatActivity {

    Toolbar toolbar;
    TabLayout tabLayout;
    ViewPager pager;


    Fragment fragment1;
    Fragment fragment2;
    Fragment fragment3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab);

        toolbar=(Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        tabLayout=(TabLayout)findViewById(R.id.tabs);

        tabLayout.addTab(tabLayout.newTab().setText("인기차트"));
        tabLayout.addTab(tabLayout.newTab().setText("장르별"));
        tabLayout.addTab(tabLayout.newTab().setText("곡추천"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        pager=(ViewPager)findViewById(R.id.pager);
        FragmentManager manager = getSupportFragmentManager();
        PagerAdaptor adaptor = new PagerAdaptor(manager,3);
        pager.setAdapter(adaptor);
        pager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                pager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    class PagerAdaptor extends FragmentPagerAdapter {
        int num;
        public PagerAdaptor(FragmentManager fm,int num){
            super(fm);
            this.num = num;
        }
        @Override
        public Fragment getItem(int i) {
            switch (i){
                case 0:
                    fragment1 = new Fragment();
                    return fragment1;
                case 1:
                    fragment2 = new Fragment();
                    return fragment2;
                case 2:
                    fragment3 = new Fragment();
                    return fragment3;
                    default:
                        return null;
            }
        }

        //탭개수
        @Override
        public int getCount() {
            return num;
        }//현재탭에서 보여주 ㄹ프레크먼트를 반환한다.

    }
}
