package com.example.grato_gv.Activity;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;

import com.example.grato_gv.Adapter.AddQuestionViewPagerAdapter;
import com.example.grato_gv.Adapter.MainViewPagerAdapter;
import com.example.grato_gv.Fragment.AddQuestionFragment;
import com.example.grato_gv.R;
import com.google.android.material.tabs.TabLayout;

public class AddQuestionActivity extends AppCompatActivity {

    Toolbar addQuestionToolbar;
    TabLayout tabLayout;
    ViewPager viewPager;
    Integer mNumQuestion = 20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_question);

        addControls();
        init();
        addEvents();
    }

    private void init() {
        setSupportActionBar(addQuestionToolbar);
        ActionBar actionbar = getSupportActionBar();
        actionbar.setDisplayHomeAsUpEnabled(true); // icon

        // viewpager & tab layout
        AddQuestionViewPagerAdapter adapter = new AddQuestionViewPagerAdapter(getSupportFragmentManager());
        for(int i=0; i<mNumQuestion; i++){
            adapter.addFragment(new AddQuestionFragment());
        }
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }

    private void addEvents() {
        addQuestionToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    private void addControls() {
        addQuestionToolbar = findViewById(R.id.addQuestionToolbar);
        viewPager = findViewById(R.id.addQuestionViewPager);
        tabLayout = findViewById(R.id.addQuestionTabLayout);
    }
}