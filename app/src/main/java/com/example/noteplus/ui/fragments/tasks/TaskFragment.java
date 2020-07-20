package com.example.noteplus.ui.fragments.tasks;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.noteplus.R;
import com.example.noteplus.local.FakeDatabaseOfTasks;

public class TaskFragment extends Fragment {



    private FakeDatabaseOfTasks fakeDatabaseOfTasks;


    private RecyclerView recyclerViewOfTasks;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.task_fragment, container, false);


        return view ;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        recyclerViewOfTasks = view.findViewById(R.id.recycler_view);

        fakeDatabaseOfTasks = new FakeDatabaseOfTasks();
        configureRecyclerView();


    }


    private  void configureRecyclerView(){

        TaskRecyclerViewClickListener listener = new TaskRecyclerViewClickListener() {
            @Override
            public void onClick(View view, int position) {
                Toast.makeText(TaskFragment.this.getContext(), "Position " + position, Toast.LENGTH_SHORT).show();

            }
        };

        TaskRecyclerViewAdapter adapter = new TaskRecyclerViewAdapter(listener);
        recyclerViewOfTasks.setAdapter(adapter);
        recyclerViewOfTasks.setLayoutManager(new LinearLayoutManager(getContext()));

        adapter.submitList(fakeDatabaseOfTasks.getListOfTasks());



    }

}
