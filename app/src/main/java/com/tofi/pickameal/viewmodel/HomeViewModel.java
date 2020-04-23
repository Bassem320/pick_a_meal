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

    public void getQuickMeal(int mealType) {

        Meal quickMeal;
        // Still need to be handled
        Calendar calendar = Calendar.getInstance();
        int hour = calendar.get(Calendar.HOUR_OF_DAY);

        quickMeal = generateMeal(Dish.SUMMER_MEAL,mealType,Dish.DEFAULT_PREFERENCES);


        mHomeActivity.setMeal(quickMeal);
    }

    private Meal generateMeal(int mealSeason, int mealType,int userPreferences) {

        ArrayList<Dish> mainDishList = getDishList(allMainDishList,mealSeason,mealType,userPreferences);
        ArrayList<Dish> entryDishList = getDishList(allEntryDishList,mealSeason,mealType,userPreferences);
        ArrayList<Dish> sideDishList = getDishList(allSideDishList,mealSeason,mealType,userPreferences);
        ArrayList<Dish> dessertDishList = getDishList(allDesertDishList,mealSeason,mealType,userPreferences);
        ArrayList<Dish> drinksDishList = getDishList(allDrinkDishList,mealSeason,mealType,userPreferences);
        Meal generatedMeal;

        switch (mealType){

            case Dish.SOHOR:
                generatedMeal = new Meal(mainDishList.get(generateRandomNumber(mainDishList.size())),
                        entryDishList.get(generateRandomNumber(entryDishList.size())),
                        sideDishList.get(generateRandomNumber(sideDishList.size())),
                        drinksDishList.get(generateRandomNumber(dessertDishList.size()))
                );
                break;
            case Dish.DESSERTS:
                generatedMeal = new Meal(dessertDishList.get(generateRandomNumber(dessertDishList.size())));
                break;
            default:
                //Ramadan Breakfast is the default
                generatedMeal =  new Meal(mainDishList.get(generateRandomNumber(mainDishList.size())),
                        entryDishList.get(generateRandomNumber(entryDishList.size())),
                        sideDishList.get(generateRandomNumber(sideDishList.size())),
                        dessertDishList.get(generateRandomNumber(dessertDishList.size())),
                        drinksDishList.get(generateRandomNumber(dessertDishList.size()))
                );
                break;        }
        return generatedMeal;
    }

    private int generateRandomNumber(int maxNumber){
        Random randomNumberGenerator = new Random();
        return randomNumberGenerator.nextInt(maxNumber);
    }

    private ArrayList<Dish> getDishList(ArrayList<Dish> allMainDishList, int mealSeason, int mealType, int mealPreferences) {
        ArrayList<Dish> dishList = new ArrayList<>();

        return dishList;
    }
}
