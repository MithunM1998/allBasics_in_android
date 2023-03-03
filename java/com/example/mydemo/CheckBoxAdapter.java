package com.example.mydemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class CheckBoxAdapter extends BaseAdapter {
    private  Context mContext;
    private List<Myclass> mItemList;
    LayoutInflater inflater;
    boolean checkAll_flag = false;
    boolean checkItem_flag = false;
    int count=0;
    public CheckBoxAdapter(Context context,List<Myclass> itemList) {

        this.mContext = context;
        this.mItemList=itemList;
        inflater = (LayoutInflater.from(context));
    }

    @Override
    public int getCount() {
        return mItemList.size();
    }

    @Override
    public Object getItem(int i) {
        return mItemList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }
    static class ViewHolder {
        protected TextView text;
        protected CheckBox checkbox;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {

        /*View rowView=inflater.inflate(R.layout.abc,null,true);

        CheckBox titleText = (CheckBox) rowView.findViewById(R.id.checkBox);


        titleText.setText(mItemList.get(i));


        return rowView;*/

        ViewHolder viewHolder = null;
        if (convertView == null) {
           // LayoutInflater inflator = mContext.getLayoutInflater();
            convertView = inflater.inflate(R.layout.abc, null);
            viewHolder = new ViewHolder();
            viewHolder.text = (TextView) convertView.findViewById(R.id.label);
            viewHolder.checkbox = (CheckBox) convertView.findViewById(R.id.checkBox);
            viewHolder.checkbox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
                        // Increment the counter if the CheckBox is checked
                        count++;
                    }
                    int getPosition = (Integer) buttonView.getTag();  // Here we get the position that we have set for the checkbox using setTag.
                    mItemList.get(getPosition).setSelected(buttonView.isChecked());
                    // Set the value of checkbox to maintain its state.

                }
            });
            convertView.setTag(viewHolder);
           convertView.setTag(R.id.label, viewHolder.text);
            convertView.setTag(R.id.checkBox, viewHolder.checkbox);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        viewHolder.checkbox.setTag(position); // This line is important.

       viewHolder.text.setText(mItemList.get(position).getName());
        viewHolder.checkbox.setChecked(mItemList.get(position).isSelected());




        return convertView;
    }


    public int counter(){

        return  count;
    }
}
