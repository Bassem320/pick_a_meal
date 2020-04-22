package com.tofi.pickameal.model;

public class Dish {
    private String mName;
    private String mDishType;
    private String mDishSeason;
    private String mUserPreferences;

    public Dish(String mName, String mDishType, String mDishSeason, String mUserPreferences) {
        this.mName = mName;
        this.mDishType = mDishType;
        this.mDishSeason = mDishSeason;
        this.mUserPreferences = mUserPreferences;
    }

    public String getName() {
        return mName;
    }

    public void setName(String mName) {
        this.mName = mName;
    }

    public String getDishType() {
        return mDishType;
    }

    public void setDishType(String mDishType) {
        this.mDishType = mDishType;
    }

    public String getDishSeason() {
        return mDishSeason;
    }

    public void setDishSeason(String mDishSeason) {
        this.mDishSeason = mDishSeason;
    }

    public String getUserPreferences() {
        return mUserPreferences;
    }

    public void setUserPreferences(String mUserPreferences) {
        this.mUserPreferences = mUserPreferences;
    }
}
