package com.example.demo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TabLayoutTestActivity extends AppCompatActivity {
    private ArrayList<Fragment> fragments = new ArrayList<>();
    private String[] titles = new String[]{"IPV4", "IPV6"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabLayout tabLayout = findViewById(R.id.tab);
        ViewPager viewPager = findViewById(R.id.viewpager);

        for (int i = 0; i < titles.length; i++) {
            fragments.add(new TabFragment(titles[i]));
        }

        FmPagerAdapter pagerAdapter = new FmPagerAdapter(Arrays.asList(titles), fragments, getSupportFragmentManager());
        viewPager.setAdapter(pagerAdapter);

        tabLayout.setupWithViewPager(viewPager);
    }

    private static class FmPagerAdapter extends FragmentPagerAdapter {
        private List<Fragment> fragments;
        private List<String> titles;
        private FragmentManager fragmentManager;

        public FmPagerAdapter(List<String> titles, List<Fragment> fragments, FragmentManager fragmentManager) {
            super(fragmentManager, FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
            this.titles = titles;
            this.fragments = fragments;
            this.fragmentManager = fragmentManager;
        }

        @NonNull
        @Override
        public Fragment getItem(int position) {
            return fragments.get(position);
        }

        @Override
        public int getCount() {
            return titles.size();
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return titles.get(position);
        }
    }
}