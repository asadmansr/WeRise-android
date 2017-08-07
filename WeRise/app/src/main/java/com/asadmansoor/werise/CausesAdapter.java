package com.asadmansoor.werise;


import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class CausesAdapter extends RecyclerView.Adapter<CausesAdapter.CausesViewHolder> {

    private List<String> horizontalList;
    private Context context;

    public class CausesViewHolder extends RecyclerView.ViewHolder {
        public TextView cause_tv;

        public CausesViewHolder(View view) {
            super(view);
            cause_tv = (TextView) view.findViewById(R.id.causes_item);

        }
    }


    public CausesAdapter(List<String> horizontalList, Context context) {
        this.horizontalList = horizontalList;
        this.context = context;
    }


    @Override
    public CausesViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recycler_view_causes, parent, false);

        return new CausesViewHolder(itemView);
    }


    @Override
    public void onBindViewHolder(final CausesViewHolder holder, final int position) {
        holder.cause_tv.setText(horizontalList.get(position));

        holder.cause_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TextView textView = (TextView) v;
                int padding = textView.getPaddingTop();

                String cause_content_desc = v.getContentDescription().toString();
                if (cause_content_desc.equals("unselected")){
                    textView.setBackgroundResource(R.drawable.text_color_background);
                    textView.setTextColor(Color.parseColor("#FFFFFF"));
                    textView.setContentDescription("selected");
                    textView.setPadding(padding,padding,padding,padding);
                    ((RegisterAccountActivity) context).addSelectedItem(textView.getText().toString());

                } else if (cause_content_desc.equals("selected")){
                    textView.setBackgroundResource(R.drawable.text_background);
                    textView.setTextColor(Color.parseColor("#F1A06E"));
                    textView.setContentDescription("unselected");
                    textView.setPadding(padding,padding,padding,padding);
                    ((RegisterAccountActivity) context).removeSelectedItem(textView.getText().toString());
                }
            }
        });
    }


    @Override
    public int getItemCount() {
        return horizontalList.size();
    }
}
