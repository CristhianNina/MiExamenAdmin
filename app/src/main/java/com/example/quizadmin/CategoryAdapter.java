package com.example.quizadmin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.ViewHolder > {

    private List<String> cat_list;

    public CategoryAdapter(List<String> cat_list) {
        this.cat_list = cat_list;
    }

    @NonNull
    @Override
    public CategoryAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cat_item_layout,viewGroup,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryAdapter.ViewHolder viewHolder, int pos) {

        String title = cat_list.get(pos);

        viewHolder.setData(title);
    }

    @Override
    public int getItemCount() {

        return cat_list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView catName;
        private ImageView deleteB;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            catName = itemView.findViewById(R.id.catName);
            deleteB = itemView.findViewById(R.id.catDelB);
        }


        private void setData(String title)
        {

            catName.setText(title);

            deleteB.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {



                }
            });


        }

    }
}
