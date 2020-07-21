package com.example.noteplus.ui.fragments.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import androidx.viewpager2.widget.ViewPager2;

import com.example.noteplus.R;
import com.example.noteplus.model.ItemNoteModel;
import com.example.noteplus.ui.fragments.notes.NoteFragment;
import com.example.noteplus.ui.fragments.tasks.TaskFragment;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    private TabLayout tabLayout;
    private ViewPager2 viewPager;

    private NavController navController;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.home_fragment, container, false);
        navController = NavHostFragment.findNavController(this);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        configureViewPager();
        configureTabLayout();
    }

    private void configureViewPager() {
        List<Fragment> fragments = new ArrayList<>();

        HomeFragmentChildrenCallback callback = new HomeFragmentChildrenCallback() {
            @Override
            public void navigateToNoteDetails(ItemNoteModel model) {
                //TODO send this model to next NoteDetailsFragment
                navController.navigate(HomeFragmentDirections.actionHomeFragmentToNoteDetailsFragment());
            }
        };

        fragments.add(new NoteFragment(callback));
        fragments.add(new TaskFragment());

        ViewPagerAdapter adapter = new ViewPagerAdapter(requireActivity(), fragments);
        viewPager.setAdapter(adapter);
    }

    private void configureTabLayout() {

        List<String> titles = new ArrayList<>();
        titles.add("Notes");
        titles.add("Tasks");

        new TabLayoutMediator(tabLayout, viewPager, (tab, position) -> {
            tab.setText(titles.get(position));
        }).attach();

    }

    private void setOnClickListener() {

    }

}
