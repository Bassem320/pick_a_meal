package com.tofi.pickameal.model;

public class Meal {
    // Meal Season Categorization
    public static final String SUMMER_MEAL = "summer meal";
    public static final String WINTER_MEAL = "winter meal";
    public static final String ALL_YEAR_MEAL = "all year meal";
    //Meal Type Categorization
    public static final String BREAKFAST = "breakfast";
    public static final String LUNCH = "lunch";
    public static final String DINNER = "dinner";
    public static final String SNACKS = "snacks";
    public static final String ENTRIES = "entries";
    public static final String SOHOR = "sohor";
    public static final String RAMADAN_BREAKFAST = "ramadan breakfast";
    public static final String DESSERTS = "desserts";
    public static final String DRINKS = "drinks";
    //User Preferences
    public static final String VEGAN = "vegan";
    public static final String CHRISTIAN_MEAL = "christian meal";
    public static final String DEFAULT_PREFERENCES = "default preferences";

    private String mMealName;
    private int mImageResourceId;
    private int mMealCalories;
    private String mMealSeason;
    private String mMealType;
    private String mUserPreferences;

    public String getMealName() {
        return mMealName;
    }

    public void setMealName(String mealName) {
        this.mMealName = mealName;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public void setImageResourceId(int imageResourceId) {
        this.mImageResourceId = imageResourceId;
    }

    public int getMealCalories() {
        return mMealCalories;
    }

    public void setMealCalories(int mealCalories) {
        this.mMealCalories = mealCalories;
    }

    public String getMealSeason() {
        return mMealSeason;
    }

    public void setMealSeason(String mealSeason) {
        this.mMealSeason = mealSeason;
    }

    public String getMealType() {
        return mMealType;
    }

    public void setMealType(String mealType) {
        this.mMealType = mealType;
    }

    public String getUserPreferences() {
        return mUserPreferences;
    }

    public void setUserPreferences(String userPreferences) {
        this.mUserPreferences = userPreferences;
    }
}
