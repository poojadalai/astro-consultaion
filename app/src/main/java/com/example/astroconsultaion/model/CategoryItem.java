package com.example.astroconsultaion.model;

import android.content.Intent;

public class CategoryItem {

    private Integer id;
    private String expert_name;
    private Integer expert_img;
    private String rate;

    public CategoryItem(Integer id, String expert_name, Integer expert_img, String rate) {
        this.id = id;
        this.expert_name = expert_name;
        this.expert_img = expert_img;
        this.rate = rate;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getExpert_name() {
        return expert_name;
    }

    public void setExpert_name(String expert_name) {
        this.expert_name = expert_name;
    }

    public Integer getExpert_img() {
        return expert_img;
    }

    public void setExpert_img(Integer expert_img) {
        this.expert_img = expert_img;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }
}
