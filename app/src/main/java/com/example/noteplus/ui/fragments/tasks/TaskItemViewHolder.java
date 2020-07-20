package com.example.noteplus.ui.fragments.tasks;

import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.noteplus.R;
import com.example.noteplus.model.ItemTaskModel;

import static com.example.noteplus.R.id.task_heading;

public class TaskItemViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    private TextView heading;
    private TextView deadline;
    private CheckBox tick;

    private  TaskRecyclerViewClickListener mListener;


    public TaskItemViewHolder(@NonNull View itemView, TaskRecyclerViewClickListener listener) {
        super(itemView);

        heading = itemView.findViewById(task_heading);
        deadline = itemView.findViewById(R.id.deadline);
        tick = itemView.findViewById(R.id.check_box);

        mListener = listener;
        itemView.setOnClickListener(this);



    }

    public void bindItem(ItemTaskModel model){

        heading.setText(model.getHeading());
        deadline.setText(model.getDeadline());
        tick.setChecked(model.isTick());

    }

    @Override
    public void onClick(View view) {

        mListener.onClick(view, getAdapterPosition());

    }
}
