package com.priya.fragmentlistexample.adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.priya.fragmentlistexample.R;

public class ChatAdapter extends BaseAdapter {


    private String[] nameList;
    private Activity activity;
    public ChatAdapter(String[] nameList, Activity activity)
    {
        this.activity=activity;
                this.nameList=nameList;

    }

    @Override
    public int getCount() {
        return nameList.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
      View view= LayoutInflater.from(activity).inflate(R.layout.list_item_chat,parent,false);
        TextView textView= view.findViewById(R.id.nameTv);
        textView.setText(nameList[position]);
        return view;
    }

    public int add(int a, int b){
        int sum = a+b;
        return sum;
    }

    public int sub (int a, int b){
    int sum = a-b;
    return sum ;
    }

    public int multiply (int a , int b )
    {
        int sum = a*b;
        return sum ;
    }

    public int divide (int a, int b ){
    int sum = a/b;
    return sum ;
    }

}
