package com.example.noteplus.ui.fragments.tasks;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.noteplus.R;
import com.example.noteplus.model.ItemTaskModel;

import java.util.ArrayList;
import java.util.List;

public class TaskRecyclerViewAdapter extends RecyclerView.Adapter<TaskItemViewHolder> {


    private TaskRecyclerViewClickListener mListener;
    private List<ItemTaskModel> listOfTasks = new ArrayList<>();

    TaskRecyclerViewAdapter (TaskRecyclerViewClickListener listener) {
        mListener = listener;
    }


    @NonNull
    @Override
    public TaskItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View root = inflater.inflate(R.layout.task_item, parent,false);

        return new TaskItemViewHolder(root,mListener);
    }

    @Override
    public void onBindViewHolder(@NonNull TaskItemViewHolder holder, int position) {

        holder.bindItem(listOfTasks.get(position));

    }

    @Override
    public int getItemCount() {
        return listOfTasks.size();
    }


    public void submitList(List< ItemTaskModel > newListOfTasks){

        listOfTasks = newListOfTasks;
        notifyDataSetChanged();

    }
}
