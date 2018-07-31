package com.priya.fragmentlistexample.fragments;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;

import com.priya.fragmentlistexample.R;
import com.priya.fragmentlistexample.adapter.ChatAdapter;

public class ListFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_list,container,false);

        ListView listView= view.findViewById(R.id.chat_List);
        String[] nameList = {"Priya","Riya","Sriya","Simran","Radha","Sweta","Rohit",
                "Mohit","Raj","Rahul","Aman","Rajesj","Mahesh","Sweety","Humpty","Dhoni","Virat",
                "Aradya","Aradhna","Pinky","rocky","Vicky"};
        ChatAdapter chatAdapter = new ChatAdapter(nameList,getActivity());
        listView.setAdapter(chatAdapter);



        return view;
    }
}
