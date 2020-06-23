package com.example.astroconsultaion.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.astroconsultaion.R;
import com.example.astroconsultaion.model.CategoryItem;
import com.example.astroconsultaion.model.HomeAllCategory;
import com.example.astroconsultaion.ui.home.HomeFragment;

import java.util.List;

public class MainRecyclerAdapter extends RecyclerView.Adapter<MainRecyclerAdapter.MainVH> {

    private Context context;
    private List<HomeAllCategory> allCategoryList;

    public MainRecyclerAdapter(FragmentActivity context, List<HomeAllCategory> allCategoryList) {
        this.context = context;
        this.allCategoryList = allCategoryList;
    }

    @NonNull
    @Override
    public MainVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MainVH(LayoutInflater.from(context).inflate(R.layout.main_recyceler_raw_item, parent, false));

    }

    @Override
    public void onBindViewHolder(@NonNull MainVH holder, int position) {
        holder.categoryTitle.setText(allCategoryList.get(position).getCategoryTitle());
        setCatItemRecycler(holder.itemRecycler, allCategoryList.get(position).getCategoryItemList());
    }

    @Override
    public int getItemCount() {
        return allCategoryList.size();
    }

    public class MainVH extends RecyclerView.ViewHolder {

        TextView categoryTitle;
        RecyclerView itemRecycler;

        public MainVH(@NonNull View itemView) {
            super(itemView);

             categoryTitle = itemView.findViewById(R.id.cat_title);
             itemRecycler = itemView.findViewById(R.id.item_recycler);

        }
    }

    private void setCatItemRecycler(RecyclerView recycler, List<CategoryItem> categoryItemList){

        CategoryItemAdapter itemAdapter = new CategoryItemAdapter(context,categoryItemList);
        recycler.setLayoutManager(new LinearLayoutManager(context, RecyclerView.HORIZONTAL, false));
        recycler.setAdapter(itemAdapter);
    }
}
