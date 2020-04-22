package com.tofi.pickameal.model;

public class Dish {
    //Constants
    // Meal Season Categorization
    public static final int SUMMER_MEAL = 1122;
    public static final int WINTER_MEAL = 2233;
    public static final int ALL_YEAR_MEAL = 4455;
    //Meal Type Categorization
    public static final int BREAKFAST = 1234;
    public static final int LUNCH = 2345;
    public static final int DINNER = 3456;
    public static final int SNACKS = 4567;
    public static final int SOHOR = 5678;
    public static final int RAMADAN_BREAKFAST = 6789;
    public static final int DESSERTS = 7890;
    //User Preferences
    public static final int VEGAN = 9876;
    public static final int DIET = 8765;
    public static final int CHRISTIAN_MEAL = 7654;
    public static final int DEFAULT_PREFERENCES = 6543;

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
