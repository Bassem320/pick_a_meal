package com.tofi.pickameal.model;

import java.util.ArrayList;

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
    public static final String SOHOR = "sohor";
    public static final String RAMADAN_BREAKFAST = "ramadan breakfast";
    public static final String DESSERTS = "desserts";
    //User Preferences
    public static final String VEGAN = "vegan";
    public static final String DIET = "diet";
    public static final String CHRISTIAN_MEAL = "christian meal";
    public static final String DEFAULT_PREFERENCES = "default preferences";

    private String mMealSeason;
    private String mMealType;
    private String mUserPreferences;

    private Dish mEntry;
    private boolean hasEntry;
    private Dish mMainDish;
    private boolean hasMain;
    private Dish mSideDish;
    private boolean hasSide;
    private Dish mDessert;
    private boolean hasDessert;
    private Dish mDrinks;
    private boolean hasDrinks;

    public Meal(Dish mEntry, Dish mMainDish, Dish mSideDish, Dish mDessert, Dish mDrinks) {
        this.mEntry = mEntry;
        this.hasEntry = true;
        this.mMainDish = mMainDish;
        this.hasMain = true;
        this.mSideDish = mSideDish;
        this.hasSide = true;
        this.mDessert = mDessert;
        this.hasDessert = true;
        this.mDrinks = mDrinks;
        this.hasDrinks = true;
    }

    public Meal(Dish mEntry, Dish mMainDish, Dish mSideDish, Dish mDrinks) {
        this.mEntry = mEntry;
        this.hasEntry = true;
        this.mMainDish = mMainDish;
        this.hasMain = true;
        this.mSideDish = mSideDish;
        this.hasSide = true;
        this.mDrinks = mDrinks;
        this.hasDrinks = true;
        this.hasDessert = false;
    }


    public Dish getmEntry() {
        return mEntry;
    }

    public void setmEntry(Dish mEntry) {
        this.mEntry = mEntry;
    }

    public boolean isHasEntry() {
        return hasEntry;
    }

    public void setHasEntry(boolean hasEntry) {
        this.hasEntry = hasEntry;
    }

    public Dish getmMainDish() {
        return mMainDish;
    }

    public void setmMainDish(Dish mMainDish) {
        this.mMainDish = mMainDish;
    }

    public boolean isHasMain() {
        return hasMain;
    }

    public void setHasMain(boolean hasMain) {
        this.hasMain = hasMain;
    }

    public Dish getmSideDish() {
        return mSideDish;
    }

    public void setmSideDish(Dish mSideDish) {
        this.mSideDish = mSideDish;
    }

    public boolean isHasSide() {
        return hasSide;
    }

    public void setHasSide(boolean hasSide) {
        this.hasSide = hasSide;
    }

    public Dish getmDessert() {
        return mDessert;
    }

    public void setmDessert(Dish mDessert) {
        this.mDessert = mDessert;
    }

    public boolean isHasDessert() {
        return hasDessert;
    }

    public void setHasDessert(boolean hasDessert) {
        this.hasDessert = hasDessert;
    }

    public Dish getmDrinks() {
        return mDrinks;
    }

    public void setmDrinks(Dish mDrinks) {
        this.mDrinks = mDrinks;
    }

    public boolean isHasDrinks() {
        return hasDrinks;
    }

    public void setHasDrinks(boolean hasDrinks) {
        this.hasDrinks = hasDrinks;
    }
}
