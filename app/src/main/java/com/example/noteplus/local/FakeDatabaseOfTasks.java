package com.example.noteplus.local;

import com.example.noteplus.model.ItemTaskModel;

import java.util.ArrayList;
import java.util.List;

public class FakeDatabaseOfTasks {
    private List<ItemTaskModel> listOfTasks = new ArrayList<>();

    public FakeDatabaseOfTasks (){
        int count = 7;

        while(count--> 0){

            listOfTasks.add(new ItemTaskModel("Welcome to Tasks", "one eternity", false));
            listOfTasks.add(new ItemTaskModel("Please finish all Logic ", "21.07.2020", false));

        }



    }

    public List<ItemTaskModel> getListOfTasks() {
        return listOfTasks;
    }
}
