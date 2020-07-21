package com.example.noteplus.ui.fragments.notes;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.noteplus.R;
import com.example.noteplus.model.ItemNoteModel;


public class NoteItemViewHolder extends RecyclerView.ViewHolder {

    private TextView heading;
    private TextView context;
    private TextView date;

    private NoteRecyclerViewClickListener mListener;

    public NoteItemViewHolder(@NonNull View itemView, NoteRecyclerViewClickListener listener) {
        super(itemView);


        heading = itemView.findViewById(R.id.header);
        context = itemView.findViewById(R.id.context);
        date = itemView.findViewById(R.id.date);

        mListener = listener;

    }

    public void bindItem(ItemNoteModel model) {

        heading.setText(model.getHeading());
        context.setText(model.getContext());
        date.setText(model.getDate());

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mListener.onClick(view, getAdapterPosition(), model);
            }
        });

    }

}
