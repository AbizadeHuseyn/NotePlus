package com.example.noteplus.local;

import com.example.noteplus.model.ItemNoteModel;

import java.util.ArrayList;
import java.util.List;

public class FakeDatabaseOfNotes {

    private List<ItemNoteModel> listOfNotes = new ArrayList<>();


    public FakeDatabaseOfNotes() {

        int count = 5;

        while(count --> 0){

            listOfNotes.add(new ItemNoteModel(
                    "Note 1 ",
                    "Wwelcome to NotePlus",
                    "17.07.2020"));

            listOfNotes.add(new ItemNoteModel(
                    "Steve Jobs",
                    "The Ceo Of Apple ",
                    "01.01.2020"
            ));

            listOfNotes.add(new ItemNoteModel(
                    "Elon Musk",
                    "The Ceo Of Tesla, LINK, SpaceX ",
                    "01.01.2020"
            ));

            listOfNotes.add(new ItemNoteModel(
                    "Hüseyn Abızadə and Ayxan Vəliyev",
                    "The Co-founders Of The most preferred App creator corporation ",
                    "Coming Soon"
            ));


        }




    }


    public List<ItemNoteModel> getListOfNotes() {
        return listOfNotes;
    }


}
