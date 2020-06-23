package com.example.astroconsultaion.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.GridView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.astroconsultaion.R;
import com.example.astroconsultaion.adapter.CategoryItemAdapter;
import com.example.astroconsultaion.adapter.HomeGridAdapter;
import com.example.astroconsultaion.adapter.MainRecyclerAdapter;
import com.example.astroconsultaion.model.CategoryItem;
import com.example.astroconsultaion.model.HomeAllCategory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;

    private GridView homeGridView;
    private String[] grid_title = {"Astrology","Numerology","Vastu","PalmReading","Tarot","Love & Relationship"};
    private int[] grid_image = {R.drawable.astro,
            R.drawable.nubers, R.drawable.vastu,
            R.drawable.palm, R.drawable.tarot,
            R.drawable.love};

    private RecyclerView mainCatRecycler;
    private MainRecyclerAdapter mainRecyclerAdapter;
    private HomeGridAdapter homeGridAdapter;
    View root;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        homeViewModel = ViewModelProviders.of(this).get(HomeViewModel.class);
        root = inflater.inflate(R.layout.fragment_home, container, false);

        List<CategoryItem> categoryItemList = new ArrayList<>();
        categoryItemList.add(new CategoryItem(1, "Nainesh Joshi", R.drawable.nainesh, "10"));
        categoryItemList.add(new CategoryItem(2, "Riddhika Panchal", R.drawable.riddhika, "15"));
        categoryItemList.add(new CategoryItem(3, "Poonam Iyar", R.drawable.poonam, "25"));
        categoryItemList.add(new CategoryItem(4, "Narendra Bunde", R.drawable.narendra, "25"));
        categoryItemList.add(new CategoryItem(5, "Santosh Joshi", R.drawable.santosh, "8"));
        categoryItemList.add(new CategoryItem(6, "Sunil Harlalka", R.drawable.sunil, "15"));
        categoryItemList.add(new CategoryItem(7, "Vishnu Modi", R.drawable.nainesh, "10"));
        categoryItemList.add(new CategoryItem(8, "Amit Lamba", R.drawable.nainesh, "5"));

        List<CategoryItem> categoryItemList1 = new ArrayList<>();
        categoryItemList1.add(new CategoryItem(1, "Nainesh Joshi", R.drawable.nainesh, "20"));
        categoryItemList1.add(new CategoryItem(1, "Nainesh Joshi", R.drawable.nainesh, "20"));
        categoryItemList1.add(new CategoryItem(1, "Nainesh Joshi", R.drawable.nainesh, "20"));
        categoryItemList1.add(new CategoryItem(1, "Nainesh Joshi", R.drawable.nainesh, "20"));
        categoryItemList1.add(new CategoryItem(1, "Nainesh Joshi", R.drawable.nainesh, "20"));
        categoryItemList1.add(new CategoryItem(1, "Nainesh Joshi", R.drawable.nainesh, "20"));
        categoryItemList1.add(new CategoryItem(1, "Nainesh Joshi", R.drawable.nainesh, "20"));
        categoryItemList1.add(new CategoryItem(1, "Nainesh Joshi", R.drawable.nainesh, "20"));

        List<CategoryItem> categoryItemList2 = new ArrayList<>();
        categoryItemList2.add(new CategoryItem(1, "Nainesh Joshi", R.drawable.nainesh, "20"));
        categoryItemList2.add(new CategoryItem(1, "Nainesh Joshi", R.drawable.nainesh, "20"));
        categoryItemList2.add(new CategoryItem(1, "Nainesh Joshi", R.drawable.nainesh, "20"));
        categoryItemList2.add(new CategoryItem(1, "Nainesh Joshi", R.drawable.nainesh, "20"));
        categoryItemList2.add(new CategoryItem(1, "Nainesh Joshi", R.drawable.nainesh, "20"));
        categoryItemList2.add(new CategoryItem(1, "Nainesh Joshi", R.drawable.nainesh, "20"));
        categoryItemList2.add(new CategoryItem(1, "Nainesh Joshi", R.drawable.nainesh, "20"));
        categoryItemList2.add(new CategoryItem(1, "Nainesh Joshi", R.drawable.nainesh, "20"));

        // dummy data
        List<HomeAllCategory> homeAllCategoryModelList = new ArrayList<>();
        homeAllCategoryModelList.add(new HomeAllCategory("Online Available", categoryItemList));
        homeAllCategoryModelList.add(new HomeAllCategory("Astrologer ", categoryItemList1));
        homeAllCategoryModelList.add(new HomeAllCategory("Vastu Experts", categoryItemList2));
        homeAllCategoryModelList.add(new HomeAllCategory("Tarot Reader", categoryItemList));
        homeAllCategoryModelList.add(new HomeAllCategory("Marriage Experts", categoryItemList2));

            //GridView

            homeGridView = root.findViewById(R.id.mainGridView);
            homeGridAdapter = new HomeGridAdapter(getActivity(), grid_title, grid_image);
            homeGridView.setAdapter(homeGridAdapter);


            // recyclerview
            mainRecyclerAdapter = new MainRecyclerAdapter(getActivity(),homeAllCategoryModelList);
            mainCatRecycler = root.findViewById(R.id.main_recycler);
            RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
            mainCatRecycler.setLayoutManager(layoutManager);
            mainCatRecycler.setHasFixedSize(true);
            mainCatRecycler.setAdapter(mainRecyclerAdapter);

            return root;

    }

}
