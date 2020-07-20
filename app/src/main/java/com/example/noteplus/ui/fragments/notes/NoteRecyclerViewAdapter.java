package com.example.noteplus.ui.fragments.notes;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.noteplus.R;
import com.example.noteplus.model.ItemNoteModel;

import java.util.ArrayList;
import java.util.List;

public class NoteRecyclerViewAdapter extends RecyclerView.Adapter<NoteItemViewHolder> {

    private List<ItemNoteModel> listOfNotes = new ArrayList<>();

    private NoteRecyclerViewClickListener mListener;

    NoteRecyclerViewAdapter(NoteRecyclerViewClickListener listener) {
        mListener = listener;
    }

    @NonNull
    @Override
    public NoteItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View root = inflater.inflate(R.layout.note_item, parent,false);

        return new NoteItemViewHolder(root, mListener);
    }

    @Override
    public void onBindViewHolder(@NonNull NoteItemViewHolder holder, int position) {
        holder.bindItem(listOfNotes.get(position));
    }

    @Override
    public int getItemCount() {
        return listOfNotes.size();
    }

    public void submitList (List<ItemNoteModel> newListOfNotes){
        listOfNotes = newListOfNotes;
        notifyDataSetChanged();

    }
}
