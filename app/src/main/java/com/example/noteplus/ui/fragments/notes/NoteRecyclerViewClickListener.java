package com.example.noteplus.ui.fragments.notes;

import android.view.View;

import com.example.noteplus.model.ItemNoteModel;

public interface NoteRecyclerViewClickListener {

    void onClick(View view, int position, ItemNoteModel model);

}
