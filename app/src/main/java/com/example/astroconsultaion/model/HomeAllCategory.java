package com.example.astroconsultaion.model;

import java.util.List;

public class HomeAllCategory {

    String categoryTitle;
    List<CategoryItem> categoryItemList;

    public HomeAllCategory(String categoryTitle, List<CategoryItem> categoryItemsList) {
        this.categoryTitle = categoryTitle;
        this.categoryItemList = categoryItemsList;
    }

    public String getCategoryTitle() {
        return categoryTitle;
    }

    public void setCategoryTitle(String categoryTitle) {
        this.categoryTitle = categoryTitle;
    }

    public List<CategoryItem> getCategoryItemList() {
        return categoryItemList;
    }

    public void setCategoryItemList(List<CategoryItem> categoryItemList) {
        this.categoryItemList = categoryItemList;
    }
}
