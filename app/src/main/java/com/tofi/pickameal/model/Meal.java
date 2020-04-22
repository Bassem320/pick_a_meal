package com.tofi.pickameal.model;

import java.util.ArrayList;

public class Meal {

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


    public Dish getEntry() {
        return mEntry;
    }

    public void setEntry(Dish mEntry) {
        this.mEntry = mEntry;
    }

    public boolean isHasEntry() {
        return hasEntry;
    }

    public void setHasEntry(boolean hasEntry) {
        this.hasEntry = hasEntry;
    }

    public Dish getMainDish() {
        return mMainDish;
    }

    public void setMainDish(Dish mMainDish) {
        this.mMainDish = mMainDish;
    }

    public boolean isHasMain() {
        return hasMain;
    }

    public void setHasMain(boolean hasMain) {
        this.hasMain = hasMain;
    }

    public Dish getSideDish() {
        return mSideDish;
    }

    public void setSideDish(Dish mSideDish) {
        this.mSideDish = mSideDish;
    }

    public boolean isHasSide() {
        return hasSide;
    }

    public void setHasSide(boolean hasSide) {
        this.hasSide = hasSide;
    }

    public Dish getDessert() {
        return mDessert;
    }

    public void setDessert(Dish mDessert) {
        this.mDessert = mDessert;
    }

    public boolean isHasDessert() {
        return hasDessert;
    }

    public void setHasDessert(boolean hasDessert) {
        this.hasDessert = hasDessert;
    }

    public Dish getDrinks() {
        return mDrinks;
    }

    public void setDrinks(Dish mDrinks) {
        this.mDrinks = mDrinks;
    }

    public boolean isHasDrinks() {
        return hasDrinks;
    }

    public void setHasDrinks(boolean hasDrinks) {
        this.hasDrinks = hasDrinks;
    }
}
