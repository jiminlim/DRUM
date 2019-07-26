package com.example.lmjm1.drum;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class List_Adapter extends BaseAdapter {
    private LayoutInflater mInflater;
    private Activity m_activity;
    private ArrayList<list_item> arr;

    public List_Adapter(Activity act, ArrayList<list_item> arr_item){
        this.m_activity=act;
        arr=arr_item;
        mInflater=(LayoutInflater)m_activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }@Override
    public int getCount() {
        return arr.size();
    }
    @Override
    public Object getItem(int position) {
        return arr.get(position);
    }
    public long getItemId(int position){
        return position;
    }
    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        if(convertView == null){
            int res = 0;
            res = R.layout.list_item;
            convertView = mInflater.inflate(res, parent, false);

        }
        TextView title = (TextView)convertView.findViewById(R.id.list_title);
        TextView content = (TextView)convertView.findViewById(R.id.list_content);
        LinearLayout layout_view =  (LinearLayout)convertView.findViewById(R.id.vi_view);
        title.setText(arr.get(position).Title);
        content.setText(arr.get(position).Content);
        layout_view.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                GoIntent(position);
            }
        });
        return convertView;
    }

    public void GoIntent(int a){
        Intent intent = new Intent(m_activity, Room.class);
        intent.putExtra("TITLE", arr.get(a).Title);
        intent.putExtra("EXPLAIN", arr.get(a).Content);
        m_activity.startActivity(intent);
    }
}
