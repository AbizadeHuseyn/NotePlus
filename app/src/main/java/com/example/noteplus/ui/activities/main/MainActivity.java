package com.example.noteplus.ui.activities.main;

import android.os.Bundle;

import com.example.noteplus.R;
import com.example.noteplus.ui.fragments.home.ViewPagerAdapter;
import com.example.noteplus.ui.fragments.notes.NoteFragment;
import com.example.noteplus.ui.fragments.tasks.TaskFragment;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.view.View;

import android.view.Menu;
import android.view.MenuItem;

import java.text.Normalizer;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ViewPagerAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_fragment);

        configureUI();
        setAdapter();
        addingFragments();

    }

    private void configureUI(){

        viewPager = (ViewPager) findViewById(R.id.viewpager);
        tabLayout = (TabLayout) findViewById(R.id.tab_layout);
    }

    private void setAdapter(){
        adapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }

    private void addingFragments(){
        adapter.AddFragment(new NoteFragment(), "Notes");
        adapter.AddFragment(new TaskFragment(), "Tasks");
        adapter.notifyDataSetChanged();

    }


}