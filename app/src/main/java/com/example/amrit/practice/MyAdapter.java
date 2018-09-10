package com.example.amrit.practice;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private List<Model> arrayList;

    public MyAdapter(List<Model> modelArrayList) {

        arrayList = modelArrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View view = inflater.inflate(R.layout.list_row_layout,viewGroup,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {

        Model model = arrayList.get(i);
        viewHolder.userNameField.setText(model.getEnglish());
        viewHolder.followersField.setText(model.getHindi());
        viewHolder.subscribersField.setText(model.getMaths());
        System.out.println(model.getEnglish());
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView userNameField,followersField,subscribersField;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            userNameField = itemView.findViewById(R.id.textView1);
            followersField = itemView.findViewById(R.id.textView2);
            subscribersField = itemView.findViewById(R.id.textView3);

        }
    }

}
