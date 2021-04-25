package com.example.grato_sv;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.grato_sv.Adapter.MainViewPagerAdapter;
import com.example.grato_sv.Fragment.infor_subject;
import com.example.grato_sv.Fragment.quiz;
import com.example.grato_sv.Fragment.list_group_in_class;
import com.example.grato_sv.Fragment.took_attendance;
import com.google.android.material.tabs.TabLayout;


public class MainActivity extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabLayout = findViewById(R.id.tab_layout);
        viewPager = findViewById(R.id.view_pager);
        init();
    }

    private void init(){
//        Toolbar toolbar = findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
//        ActionBar actionbar = getSupportActionBar();
//        actionbar.setDisplayHomeAsUpEnabled(true);

        MainViewPagerAdapter adapter = new MainViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new infor_subject());
        adapter.addFragment(new list_group_in_class());
        adapter.addFragment(new quiz());
        adapter.addFragment(new took_attendance());

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.getTabAt(0).setIcon(R.drawable.thong_icon_home);
        tabLayout.getTabAt(1).setIcon(R.drawable.thong_icon_group);
        tabLayout.getTabAt(2).setIcon(R.drawable.thong_icon_quiz);
        tabLayout.getTabAt(3).setIcon(R.drawable.thong_icon_attendance);
//        tabLayout.getTabAt(4).setIcon(R.drawable.thong_icon_grade);

    }
}