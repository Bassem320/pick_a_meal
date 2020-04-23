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

    private int mDishNameId;
    private int mDishType;
    private int mDishSeason;
    private int mUserPreferences;

    public Dish(int dishNameId, int dishSeason, int dishType, int userPreferences) {
        this.mDishNameId = dishNameId;
        this.mDishType = dishType;
        this.mDishSeason = dishSeason;
        this.mUserPreferences = userPreferences;
    }

    public int getDishNameId() {
        return mDishNameId;
    }

    public void setDishNameId(int mDishNameId) {
        this.mDishNameId = mDishNameId;
    }

    public int getDishType() {
        return mDishType;
    }

    public void setDishType(int mDishType) {
        this.mDishType = mDishType;
    }

    public int getDishSeason() {
        return mDishSeason;
    }

    public void setDishSeason(int mDishSeason) {
        this.mDishSeason = mDishSeason;
    }

    public int getUserPreferences() {
        return mUserPreferences;
    }

    public void setUserPreferences(int mUserPreferences) {
        this.mUserPreferences = mUserPreferences;
    }
}
