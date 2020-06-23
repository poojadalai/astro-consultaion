package com.example.astroconsultaion.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.astroconsultaion.R;
import com.example.astroconsultaion.model.CategoryItem;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class CategoryItemAdapter extends RecyclerView.Adapter<CategoryItemAdapter.CategoryItemVH> {

    private Context context;
    private List<CategoryItem> categoryItemList;

    public CategoryItemAdapter(Context context, List<CategoryItem> categoryItemList) {
        this.context = context;
        this.categoryItemList = categoryItemList;
    }

    @NonNull
    @Override
    public CategoryItemVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CategoryItemVH(LayoutInflater.from(context).inflate(R.layout.category_row_items,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryItemVH holder, int position) {

         holder.profile_image.setImageResource(categoryItemList.get(position).getExpert_img());
         holder.expert_name.setText(categoryItemList.get(position).getExpert_name());
         holder.rate.setText(categoryItemList.get(position).getRate());
    }

    @Override
    public int getItemCount() {
        return categoryItemList.size();
    }

    public class CategoryItemVH extends RecyclerView.ViewHolder {

        ImageView profile_image;
        TextView expert_name;
        TextView rate;

        public CategoryItemVH(@NonNull View itemView) {
            super(itemView);

            profile_image = itemView.findViewById(R.id.expert_image);
            expert_name = itemView.findViewById(R.id.expert_name);
            rate = itemView.findViewById(R.id.expert_rate);

        }
    }
}
