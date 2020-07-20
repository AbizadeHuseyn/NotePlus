package com.example.noteplus.ui.fragments.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TableLayout;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.NavHostController;
import androidx.navigation.fragment.NavHostFragment;
import androidx.viewpager.widget.ViewPager;

import com.example.noteplus.R;
import com.example.noteplus.ui.fragments.notes.NoteFragment;
import com.example.noteplus.ui.fragments.notes.NoteRecyclerViewClickListener;
import com.example.noteplus.ui.fragments.tasks.TaskFragment;
import com.google.android.material.tabs.TabLayout;

public class HomeFragment extends Fragment {

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





    }

    private void setOnClickListener(){




    }


}
