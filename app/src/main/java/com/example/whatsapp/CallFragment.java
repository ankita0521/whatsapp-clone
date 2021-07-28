package com.example.whatsapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;


public class CallFragment extends Fragment {

    RecyclerView callrecyclerview;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_call, container, false);
        callrecyclerview = view.findViewById(R.id.callsRecycler);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        callrecyclerview.setLayoutManager(layoutManager);
        String[] data= {
                "Ankita" , "Suarbhi" , "Anamika" , "Aradhya" , "Shreyanvi" , "Sushma"
        };
        CallRecyclerAdapter adapter = new CallRecyclerAdapter(data);
        callrecyclerview.setAdapter(adapter);
        return view;
    }
}
