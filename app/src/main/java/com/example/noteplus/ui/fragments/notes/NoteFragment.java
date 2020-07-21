package com.example.noteplus.ui.fragments.notes;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import com.example.noteplus.R;
import com.example.noteplus.local.FakeDatabaseOfNotes;
import com.example.noteplus.model.ItemNoteModel;
import com.example.noteplus.ui.fragments.home.HomeFragmentChildrenCallback;

public class NoteFragment extends Fragment {

    private HomeFragmentChildrenCallback callback;
    private NavController navController;

    private FakeDatabaseOfNotes fakeDatabaseOfNotes;

    private RecyclerView recyclerViewOfNotes;

    public NoteFragment(HomeFragmentChildrenCallback callback) {
        this.callback = callback;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.note_fragment, container, false);
        navController = NavHostFragment.findNavController(this);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerViewOfNotes = view.findViewById(R.id.recycler_view);

        fakeDatabaseOfNotes = new FakeDatabaseOfNotes();

        configureRecyclerView();
    }

    private void configureRecyclerView() {

        NoteRecyclerViewClickListener listener = new NoteRecyclerViewClickListener() {
            @Override
            public void onClick(View view, int position, ItemNoteModel model) {
                Toast.makeText(NoteFragment.this.getContext(), "Position " + position, Toast.LENGTH_SHORT).show();
                callback.navigateToNoteDetails(model);
            }
        };

        NoteRecyclerViewAdapter adapter = new NoteRecyclerViewAdapter(listener);
        recyclerViewOfNotes.setAdapter(adapter);
        recyclerViewOfNotes.setLayoutManager(
                new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL));
        adapter.submitList(fakeDatabaseOfNotes.getListOfNotes());


    }
}
