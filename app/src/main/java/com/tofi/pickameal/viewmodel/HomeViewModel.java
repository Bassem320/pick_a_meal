package com.tofi.pickameal.viewmodel;

import android.util.Log;

import androidx.lifecycle.ViewModel;

import com.tofi.pickameal.model.Dish;
import com.tofi.pickameal.model.Meal;
import com.tofi.pickameal.view.HomeActivity;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Random;

public class HomeViewModel extends ViewModel {

    private  HomeActivity mHomeActivity;
    private ArrayList<Dish> allMainDishList;
    private ArrayList<Dish> allEntryDishList;
    private ArrayList<Dish> allSideDishList;
    private ArrayList<Dish> allDesertDishList;
    private ArrayList<Dish> allDrinkDishList;

    public HomeViewModel(HomeActivity homeActivity){
            mHomeActivity = homeActivity;
    }

    public void getQuickMeal() {
        // Still need to be handled
        Meal quickMeal = generateMeal(Dish.ALL_YEAR_MEAL,Dish.RAMADAN_BREAKFAST,Dish.DEFAULT_PREFERENCES);
        Calendar calendar = Calendar.getInstance();
        int hour = calendar.get(Calendar.HOUR_OF_DAY);

        if((hour>0 && hour<5) || (hour >20)){
            Log.i("PickAMeal","Sohor Time");
        }else if(hour>5 && hour< 20){
            Log.i("PickAMeal","Fetar Time");
        }

        mHomeActivity.setMeal(quickMeal);
    }

    private Meal generateMeal(int dishSeason, int dishType,int userPreferences) {
        ArrayList<Dish> mainDishList = getDishList(allMainDishList,dishSeason,dishType,userPreferences);
        ArrayList<Dish> entryDishList = getDishList(allEntryDishList,dishSeason,dishType,userPreferences);
        ArrayList<Dish> sideDishList = getDishList(allSideDishList,dishSeason,dishType,userPreferences);
        ArrayList<Dish> dessertDishList = getDishList(allDesertDishList,dishSeason,dishType,userPreferences);
        ArrayList<Dish> drinksDishList = getDishList(allDrinkDishList,dishSeason,dishType,userPreferences);

        return new Meal(mainDishList.get(0),
                entryDishList.get(0),
                sideDishList.get(0),
                dessertDishList.get(0),
                drinksDishList.get(0)
        );

    }

    private ArrayList<Dish> getDishList(ArrayList<Dish> allMainDishList, int mealSeason, int mealType, int mealPreferences) {
        ArrayList<Dish> dishList = new ArrayList<>();

        return dishList;
    }
}
