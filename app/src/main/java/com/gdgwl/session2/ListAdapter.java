package com.gdgwl.session2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by indira on 09/08/14.
 */
public class ListAdapter extends BaseAdapter {

    private Context mContext;
    private Item[] mItems;

    public ListAdapter(Context context, Item[] items){
        this.mContext = context;
        this.mItems = items;
    }

    @Override
    public int getCount() {
        return this.mItems.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        LayoutInflater layoutInflater = (LayoutInflater)
        mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if(view == null){
            view = layoutInflater.inflate(R.layout.layout_item, null, false);
        }

        TextView txtitem = (TextView) view.findViewById(R.id.txtItem);
        String title = this.mItems[i].getTitle();

        txtitem.setText(title);

        return view;
    }
}
