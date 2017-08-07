package com.asadmansoor.werise;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ThemesAdapter extends RecyclerView.Adapter<ThemesAdapter.ThemesViewHolder> {

    private List<String> themeTextList;
    private List<Integer> themeImageList;
    private Context context;

    public class ThemesViewHolder extends RecyclerView.ViewHolder {
        public TextView theme_tv;
        public ImageView theme_iv;

        public ThemesViewHolder(View view) {
            super(view);
            theme_tv = (TextView) view.findViewById(R.id.theme_tv);
            theme_iv = (ImageView) view.findViewById(R.id.theme_iv);

        }
    }


    public ThemesAdapter(List<String> themeTextList, List<Integer> themeImageList, Context context) {
        this.themeTextList = themeTextList;
        this.themeImageList = themeImageList;
        this.context = context;
    }


    @Override
    public ThemesViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recycler_view_themes, parent, false);

        return new ThemesViewHolder(itemView);
    }


    @Override
    public void onBindViewHolder(final ThemesViewHolder holder, final int position) {
        holder.theme_tv.setText(themeTextList.get(position));
        holder.theme_iv.setBackgroundResource(themeImageList.get(position));

        holder.theme_iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                TextView textView = (TextView) v;
//                int padding = textView.getPaddingTop();
//
//                String cause_content_desc = v.getContentDescription().toString();
//                if (cause_content_desc.equals("unselected")){
//                    textView.setBackgroundResource(R.drawable.text_color_background);
//                    textView.setTextColor(Color.parseColor("#FFFFFF"));
//                    textView.setContentDescription("selected");
//                    textView.setPadding(padding,padding,padding,padding);
//                    ((RegisterAccountActivity) context).addSelectedItem(textView.getText().toString());
//
//                } else if (cause_content_desc.equals("selected")){
//                    textView.setBackgroundResource(R.drawable.text_background);
//                    textView.setTextColor(Color.parseColor("#F1A06E"));
//                    textView.setContentDescription("unselected");
//                    textView.setPadding(padding,padding,padding,padding);
//                    ((RegisterAccountActivity) context).removeSelectedItem(textView.getText().toString());
//                }
            }
        });
    }


    @Override
    public int getItemCount() {
        return themeTextList.size();
    }
}
