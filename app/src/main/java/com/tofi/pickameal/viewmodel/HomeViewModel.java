package com.tofi.pickameal.viewmodel;

import android.util.Log;

import androidx.lifecycle.ViewModel;

import com.tofi.pickameal.R;
import com.tofi.pickameal.model.Dish;
import com.tofi.pickameal.model.Meal;
import com.tofi.pickameal.view.HomeActivity;

import java.util.ArrayList;
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
        allMainDishList = new ArrayList<>();
        allMainDishList.add(new Dish(R.string.main_meal_1,Dish.SUMMER_MEAL,Dish.RAMADAN_BREAKFAST,Dish.DEFAULT_PREFERENCES));
        allMainDishList.add(new Dish(R.string.main_meal_2,Dish.SUMMER_MEAL,Dish.RAMADAN_BREAKFAST,Dish.DEFAULT_PREFERENCES));
        allMainDishList.add(new Dish(R.string.main_meal_3,Dish.SUMMER_MEAL,Dish.RAMADAN_BREAKFAST,Dish.DEFAULT_PREFERENCES));
        allMainDishList.add(new Dish(R.string.main_meal_4,Dish.SUMMER_MEAL,Dish.RAMADAN_BREAKFAST,Dish.DEFAULT_PREFERENCES));
        allMainDishList.add(new Dish(R.string.main_meal_5,Dish.SUMMER_MEAL,Dish.RAMADAN_BREAKFAST,Dish.DEFAULT_PREFERENCES));
        allMainDishList.add(new Dish(R.string.main_meal_6,Dish.SUMMER_MEAL,Dish.RAMADAN_BREAKFAST,Dish.DEFAULT_PREFERENCES));
        allMainDishList.add(new Dish(R.string.main_meal_7,Dish.SUMMER_MEAL,Dish.RAMADAN_BREAKFAST,Dish.DEFAULT_PREFERENCES));
        allMainDishList.add(new Dish(R.string.main_meal_8,Dish.SUMMER_MEAL,Dish.RAMADAN_BREAKFAST,Dish.DEFAULT_PREFERENCES));
        allMainDishList.add(new Dish(R.string.main_meal_9,Dish.SUMMER_MEAL,Dish.RAMADAN_BREAKFAST,Dish.DEFAULT_PREFERENCES));
        allMainDishList.add(new Dish(R.string.main_meal_10,Dish.SUMMER_MEAL,Dish.RAMADAN_BREAKFAST,Dish.DEFAULT_PREFERENCES));
        allMainDishList.add(new Dish(R.string.main_meal_11,Dish.SUMMER_MEAL,Dish.RAMADAN_BREAKFAST,Dish.DEFAULT_PREFERENCES));
        allMainDishList.add(new Dish(R.string.main_meal_12,Dish.SUMMER_MEAL,Dish.RAMADAN_BREAKFAST,Dish.DEFAULT_PREFERENCES));
        allMainDishList.add(new Dish(R.string.main_meal_13,Dish.SUMMER_MEAL,Dish.RAMADAN_BREAKFAST,Dish.DEFAULT_PREFERENCES));
        allMainDishList.add(new Dish(R.string.main_meal_14,Dish.SUMMER_MEAL,Dish.RAMADAN_BREAKFAST,Dish.DEFAULT_PREFERENCES));
        allMainDishList.add(new Dish(R.string.main_meal_15,Dish.SUMMER_MEAL,Dish.RAMADAN_BREAKFAST,Dish.DEFAULT_PREFERENCES));
        allMainDishList.add(new Dish(R.string.main_meal_16,Dish.SUMMER_MEAL,Dish.RAMADAN_BREAKFAST,Dish.DEFAULT_PREFERENCES));
        allMainDishList.add(new Dish(R.string.main_meal_17,Dish.SUMMER_MEAL,Dish.RAMADAN_BREAKFAST,Dish.DEFAULT_PREFERENCES));
        allMainDishList.add(new Dish(R.string.main_meal_18,Dish.SUMMER_MEAL,Dish.RAMADAN_BREAKFAST,Dish.DEFAULT_PREFERENCES));
        allMainDishList.add(new Dish(R.string.main_meal_19,Dish.SUMMER_MEAL,Dish.RAMADAN_BREAKFAST,Dish.DEFAULT_PREFERENCES));
        allMainDishList.add(new Dish(R.string.main_meal_20,Dish.SUMMER_MEAL,Dish.RAMADAN_BREAKFAST,Dish.DEFAULT_PREFERENCES));
        allMainDishList.add(new Dish(R.string.main_meal_21,Dish.SUMMER_MEAL,Dish.RAMADAN_BREAKFAST,Dish.DEFAULT_PREFERENCES));
        allMainDishList.add(new Dish(R.string.main_meal_22,Dish.SUMMER_MEAL,Dish.RAMADAN_BREAKFAST,Dish.DEFAULT_PREFERENCES));
        allMainDishList.add(new Dish(R.string.main_meal_23,Dish.SUMMER_MEAL,Dish.RAMADAN_BREAKFAST,Dish.DEFAULT_PREFERENCES));
        allMainDishList.add(new Dish(R.string.main_meal_24,Dish.SUMMER_MEAL,Dish.RAMADAN_BREAKFAST,Dish.DEFAULT_PREFERENCES));
        allMainDishList.add(new Dish(R.string.main_meal_25,Dish.SUMMER_MEAL,Dish.RAMADAN_BREAKFAST,Dish.DEFAULT_PREFERENCES));
        allMainDishList.add(new Dish(R.string.main_meal_26,Dish.SUMMER_MEAL,Dish.RAMADAN_BREAKFAST,Dish.DEFAULT_PREFERENCES));
        allMainDishList.add(new Dish(R.string.main_meal_27,Dish.SUMMER_MEAL,Dish.RAMADAN_BREAKFAST,Dish.DEFAULT_PREFERENCES));
        allMainDishList.add(new Dish(R.string.main_meal_28,Dish.SUMMER_MEAL,Dish.RAMADAN_BREAKFAST,Dish.DEFAULT_PREFERENCES));
        allMainDishList.add(new Dish(R.string.main_meal_29,Dish.SUMMER_MEAL,Dish.RAMADAN_BREAKFAST,Dish.DEFAULT_PREFERENCES));
        allMainDishList.add(new Dish(R.string.main_meal_30,Dish.SUMMER_MEAL,Dish.RAMADAN_BREAKFAST,Dish.DEFAULT_PREFERENCES));
        allMainDishList.add(new Dish(R.string.main_meal_31,Dish.SUMMER_MEAL,Dish.RAMADAN_BREAKFAST,Dish.DEFAULT_PREFERENCES));
        allMainDishList.add(new Dish(R.string.main_meal_32,Dish.SUMMER_MEAL,Dish.RAMADAN_BREAKFAST,Dish.DEFAULT_PREFERENCES));
        allMainDishList.add(new Dish(R.string.main_meal_33,Dish.SUMMER_MEAL,Dish.RAMADAN_BREAKFAST,Dish.DEFAULT_PREFERENCES));
        allMainDishList.add(new Dish(R.string.main_meal_34,Dish.SUMMER_MEAL,Dish.RAMADAN_BREAKFAST,Dish.DEFAULT_PREFERENCES));
        allMainDishList.add(new Dish(R.string.main_meal_35,Dish.SUMMER_MEAL,Dish.RAMADAN_BREAKFAST,Dish.DEFAULT_PREFERENCES));
        allMainDishList.add(new Dish(R.string.main_meal_36,Dish.SUMMER_MEAL,Dish.RAMADAN_BREAKFAST,Dish.DEFAULT_PREFERENCES));
        allMainDishList.add(new Dish(R.string.main_meal_37,Dish.SUMMER_MEAL,Dish.RAMADAN_BREAKFAST,Dish.DEFAULT_PREFERENCES));
        allMainDishList.add(new Dish(R.string.main_meal_38,Dish.SUMMER_MEAL,Dish.RAMADAN_BREAKFAST,Dish.DEFAULT_PREFERENCES));
        allMainDishList.add(new Dish(R.string.main_meal_39,Dish.SUMMER_MEAL,Dish.RAMADAN_BREAKFAST,Dish.DEFAULT_PREFERENCES));
        allMainDishList.add(new Dish(R.string.main_meal_40,Dish.SUMMER_MEAL,Dish.RAMADAN_BREAKFAST,Dish.DEFAULT_PREFERENCES));
        allMainDishList.add(new Dish(R.string.main_meal_41,Dish.SUMMER_MEAL,Dish.RAMADAN_BREAKFAST,Dish.DEFAULT_PREFERENCES));
        allMainDishList.add(new Dish(R.string.main_meal_42,Dish.SUMMER_MEAL,Dish.RAMADAN_BREAKFAST,Dish.DEFAULT_PREFERENCES));
        allMainDishList.add(new Dish(R.string.main_meal_43,Dish.SUMMER_MEAL,Dish.RAMADAN_BREAKFAST,Dish.DEFAULT_PREFERENCES));
        allMainDishList.add(new Dish(R.string.main_meal_44,Dish.SUMMER_MEAL,Dish.RAMADAN_BREAKFAST,Dish.DEFAULT_PREFERENCES));
        allMainDishList.add(new Dish(R.string.main_meal_45,Dish.SUMMER_MEAL,Dish.RAMADAN_BREAKFAST,Dish.DEFAULT_PREFERENCES));
        allMainDishList.add(new Dish(R.string.main_meal_46,Dish.SUMMER_MEAL,Dish.RAMADAN_BREAKFAST,Dish.DEFAULT_PREFERENCES));
        allMainDishList.add(new Dish(R.string.main_meal_47,Dish.SUMMER_MEAL,Dish.RAMADAN_BREAKFAST,Dish.DEFAULT_PREFERENCES));
        allMainDishList.add(new Dish(R.string.main_meal_48,Dish.SUMMER_MEAL,Dish.RAMADAN_BREAKFAST,Dish.DEFAULT_PREFERENCES));
        allMainDishList.add(new Dish(R.string.main_meal_49,Dish.SUMMER_MEAL,Dish.RAMADAN_BREAKFAST,Dish.DEFAULT_PREFERENCES));
        allMainDishList.add(new Dish(R.string.main_meal_50,Dish.SUMMER_MEAL,Dish.RAMADAN_BREAKFAST,Dish.DEFAULT_PREFERENCES));
        allMainDishList.add(new Dish(R.string.main_meal_51,Dish.SUMMER_MEAL,Dish.RAMADAN_BREAKFAST,Dish.DEFAULT_PREFERENCES));
        allMainDishList.add(new Dish(R.string.main_meal_52,Dish.SUMMER_MEAL,Dish.RAMADAN_BREAKFAST,Dish.DEFAULT_PREFERENCES));
        allMainDishList.add(new Dish(R.string.main_meal_53,Dish.SUMMER_MEAL,Dish.SOHOR,Dish.DEFAULT_PREFERENCES));
        allMainDishList.add(new Dish(R.string.main_meal_54,Dish.SUMMER_MEAL,Dish.SOHOR,Dish.DEFAULT_PREFERENCES));
        allMainDishList.add(new Dish(R.string.main_meal_55,Dish.SUMMER_MEAL,Dish.SOHOR,Dish.DEFAULT_PREFERENCES));
        allMainDishList.add(new Dish(R.string.main_meal_56,Dish.SUMMER_MEAL,Dish.SOHOR,Dish.DEFAULT_PREFERENCES));
        allMainDishList.add(new Dish(R.string.main_meal_57,Dish.SUMMER_MEAL,Dish.SOHOR,Dish.DEFAULT_PREFERENCES));
        allMainDishList.add(new Dish(R.string.main_meal_58,Dish.SUMMER_MEAL,Dish.SOHOR,Dish.DEFAULT_PREFERENCES));
        allMainDishList.add(new Dish(R.string.main_meal_59,Dish.SUMMER_MEAL,Dish.SOHOR,Dish.DEFAULT_PREFERENCES));
        allMainDishList.add(new Dish(R.string.main_meal_60,Dish.SUMMER_MEAL,Dish.SOHOR,Dish.DEFAULT_PREFERENCES));
        allMainDishList.add(new Dish(R.string.main_meal_61,Dish.SUMMER_MEAL,Dish.SOHOR,Dish.DEFAULT_PREFERENCES));
        allMainDishList.add(new Dish(R.string.main_meal_62,Dish.SUMMER_MEAL,Dish.SOHOR,Dish.DEFAULT_PREFERENCES));
        allMainDishList.add(new Dish(R.string.main_meal_63,Dish.SUMMER_MEAL,Dish.SOHOR,Dish.DEFAULT_PREFERENCES));
        allMainDishList.add(new Dish(R.string.main_meal_64,Dish.SUMMER_MEAL,Dish.SOHOR,Dish.DEFAULT_PREFERENCES));
        allMainDishList.add(new Dish(R.string.main_meal_65,Dish.SUMMER_MEAL,Dish.SOHOR,Dish.DEFAULT_PREFERENCES));
        allMainDishList.add(new Dish(R.string.main_meal_66,Dish.SUMMER_MEAL,Dish.SOHOR,Dish.DEFAULT_PREFERENCES));
        allMainDishList.add(new Dish(R.string.main_meal_67,Dish.SUMMER_MEAL,Dish.SOHOR,Dish.DEFAULT_PREFERENCES));
        allMainDishList.add(new Dish(R.string.main_meal_68,Dish.SUMMER_MEAL,Dish.SOHOR,Dish.DEFAULT_PREFERENCES));
        allMainDishList.add(new Dish(R.string.main_meal_69,Dish.SUMMER_MEAL,Dish.SOHOR,Dish.DEFAULT_PREFERENCES));
        allMainDishList.add(new Dish(R.string.main_meal_70,Dish.SUMMER_MEAL,Dish.SOHOR,Dish.DEFAULT_PREFERENCES));
        allMainDishList.add(new Dish(R.string.main_meal_71,Dish.SUMMER_MEAL,Dish.SOHOR,Dish.DEFAULT_PREFERENCES));

        allEntryDishList = new ArrayList<>();
        allEntryDishList.add(new Dish(R.string.entry_1,Dish.SUMMER_MEAL,Dish.RAMADAN_BREAKFAST,Dish.DEFAULT_PREFERENCES));
        allEntryDishList.add(new Dish(R.string.entry_2,Dish.SUMMER_MEAL,Dish.RAMADAN_BREAKFAST,Dish.DEFAULT_PREFERENCES));
        allEntryDishList.add(new Dish(R.string.entry_3,Dish.SUMMER_MEAL,Dish.RAMADAN_BREAKFAST,Dish.DEFAULT_PREFERENCES));
        allEntryDishList.add(new Dish(R.string.entry_4,Dish.SUMMER_MEAL,Dish.RAMADAN_BREAKFAST,Dish.DEFAULT_PREFERENCES));
        allEntryDishList.add(new Dish(R.string.entry_5,Dish.SUMMER_MEAL,Dish.RAMADAN_BREAKFAST,Dish.DEFAULT_PREFERENCES));
        allEntryDishList.add(new Dish(R.string.entry_6,Dish.SUMMER_MEAL,Dish.RAMADAN_BREAKFAST,Dish.DEFAULT_PREFERENCES));
        allEntryDishList.add(new Dish(R.string.entry_7,Dish.SUMMER_MEAL,Dish.RAMADAN_BREAKFAST,Dish.DEFAULT_PREFERENCES));
        allEntryDishList.add(new Dish(R.string.entry_8,Dish.SUMMER_MEAL,Dish.SOHOR,Dish.DEFAULT_PREFERENCES));
        allEntryDishList.add(new Dish(R.string.entry_9,Dish.SUMMER_MEAL,Dish.SOHOR,Dish.DEFAULT_PREFERENCES));
        allEntryDishList.add(new Dish(R.string.entry_10,Dish.SUMMER_MEAL,Dish.SOHOR,Dish.DEFAULT_PREFERENCES));
        allEntryDishList.add(new Dish(R.string.entry_11,Dish.SUMMER_MEAL,Dish.SOHOR,Dish.DEFAULT_PREFERENCES));
        allEntryDishList.add(new Dish(R.string.entry_12,Dish.SUMMER_MEAL,Dish.SOHOR,Dish.DEFAULT_PREFERENCES));
        allEntryDishList.add(new Dish(R.string.entry_13,Dish.SUMMER_MEAL,Dish.SOHOR,Dish.DEFAULT_PREFERENCES));
        allEntryDishList.add(new Dish(R.string.entry_14,Dish.SUMMER_MEAL,Dish.SOHOR,Dish.DEFAULT_PREFERENCES));
        allEntryDishList.add(new Dish(R.string.entry_15,Dish.SUMMER_MEAL,Dish.SOHOR,Dish.DEFAULT_PREFERENCES));
        allEntryDishList.add(new Dish(R.string.entry_16,Dish.SUMMER_MEAL,Dish.SOHOR,Dish.DEFAULT_PREFERENCES));
        allEntryDishList.add(new Dish(R.string.entry_17,Dish.SUMMER_MEAL,Dish.SOHOR,Dish.DEFAULT_PREFERENCES));
        allEntryDishList.add(new Dish(R.string.entry_18,Dish.SUMMER_MEAL,Dish.SOHOR,Dish.DEFAULT_PREFERENCES));
        allEntryDishList.add(new Dish(R.string.entry_19,Dish.SUMMER_MEAL,Dish.SOHOR,Dish.DEFAULT_PREFERENCES));

        allSideDishList = new ArrayList<>();
        allSideDishList.add(new Dish(R.string.side_dish_1,Dish.SUMMER_MEAL,Dish.RAMADAN_BREAKFAST,Dish.DEFAULT_PREFERENCES));
        allSideDishList.add(new Dish(R.string.side_dish_2,Dish.SUMMER_MEAL,Dish.RAMADAN_BREAKFAST,Dish.DEFAULT_PREFERENCES));
        allSideDishList.add(new Dish(R.string.side_dish_3,Dish.SUMMER_MEAL,Dish.RAMADAN_BREAKFAST,Dish.DEFAULT_PREFERENCES));
        allSideDishList.add(new Dish(R.string.side_dish_4,Dish.SUMMER_MEAL,Dish.RAMADAN_BREAKFAST,Dish.DEFAULT_PREFERENCES));
        allSideDishList.add(new Dish(R.string.side_dish_5,Dish.SUMMER_MEAL,Dish.RAMADAN_BREAKFAST,Dish.DEFAULT_PREFERENCES));
        allSideDishList.add(new Dish(R.string.side_dish_6,Dish.SUMMER_MEAL,Dish.RAMADAN_BREAKFAST,Dish.DEFAULT_PREFERENCES));
        allSideDishList.add(new Dish(R.string.side_dish_7,Dish.SUMMER_MEAL,Dish.RAMADAN_BREAKFAST,Dish.DEFAULT_PREFERENCES));
        allSideDishList.add(new Dish(R.string.side_dish_8,Dish.SUMMER_MEAL,Dish.RAMADAN_BREAKFAST,Dish.DEFAULT_PREFERENCES));
        allSideDishList.add(new Dish(R.string.side_dish_9,Dish.SUMMER_MEAL,Dish.RAMADAN_BREAKFAST,Dish.DEFAULT_PREFERENCES));
        allSideDishList.add(new Dish(R.string.side_dish_10,Dish.SUMMER_MEAL,Dish.RAMADAN_BREAKFAST,Dish.DEFAULT_PREFERENCES));
        allSideDishList.add(new Dish(R.string.side_dish_11,Dish.SUMMER_MEAL,Dish.RAMADAN_BREAKFAST,Dish.DEFAULT_PREFERENCES));
        allSideDishList.add(new Dish(R.string.side_dish_12,Dish.SUMMER_MEAL,Dish.RAMADAN_BREAKFAST,Dish.DEFAULT_PREFERENCES));
        allSideDishList.add(new Dish(R.string.side_dish_13,Dish.SUMMER_MEAL,Dish.RAMADAN_BREAKFAST,Dish.DEFAULT_PREFERENCES));
        allSideDishList.add(new Dish(R.string.side_dish_14,Dish.SUMMER_MEAL,Dish.RAMADAN_BREAKFAST,Dish.DEFAULT_PREFERENCES));
        allSideDishList.add(new Dish(R.string.side_dish_15,Dish.SUMMER_MEAL,Dish.RAMADAN_BREAKFAST,Dish.DEFAULT_PREFERENCES));
        allSideDishList.add(new Dish(R.string.side_dish_16,Dish.SUMMER_MEAL,Dish.RAMADAN_BREAKFAST,Dish.DEFAULT_PREFERENCES));
        allSideDishList.add(new Dish(R.string.side_dish_17,Dish.SUMMER_MEAL,Dish.RAMADAN_BREAKFAST,Dish.DEFAULT_PREFERENCES));
        allSideDishList.add(new Dish(R.string.side_dish_18,Dish.SUMMER_MEAL,Dish.RAMADAN_BREAKFAST,Dish.DEFAULT_PREFERENCES));
        allSideDishList.add(new Dish(R.string.side_dish_19,Dish.SUMMER_MEAL,Dish.SOHOR,Dish.DEFAULT_PREFERENCES));
        allSideDishList.add(new Dish(R.string.side_dish_20,Dish.SUMMER_MEAL,Dish.SOHOR,Dish.DEFAULT_PREFERENCES));
        allSideDishList.add(new Dish(R.string.side_dish_21,Dish.SUMMER_MEAL,Dish.SOHOR,Dish.DEFAULT_PREFERENCES));
        allSideDishList.add(new Dish(R.string.side_dish_22,Dish.SUMMER_MEAL,Dish.SOHOR,Dish.DEFAULT_PREFERENCES));
        allSideDishList.add(new Dish(R.string.side_dish_23,Dish.SUMMER_MEAL,Dish.SOHOR,Dish.DEFAULT_PREFERENCES));
        allSideDishList.add(new Dish(R.string.side_dish_24,Dish.SUMMER_MEAL,Dish.SOHOR,Dish.DEFAULT_PREFERENCES));
        allSideDishList.add(new Dish(R.string.side_dish_25,Dish.SUMMER_MEAL,Dish.SOHOR,Dish.DEFAULT_PREFERENCES));
        allSideDishList.add(new Dish(R.string.side_dish_26,Dish.SUMMER_MEAL,Dish.SOHOR,Dish.DEFAULT_PREFERENCES));
        allSideDishList.add(new Dish(R.string.side_dish_27,Dish.SUMMER_MEAL,Dish.SOHOR,Dish.DEFAULT_PREFERENCES));
        allSideDishList.add(new Dish(R.string.side_dish_28,Dish.SUMMER_MEAL,Dish.SOHOR,Dish.DEFAULT_PREFERENCES));
        allSideDishList.add(new Dish(R.string.side_dish_29,Dish.SUMMER_MEAL,Dish.SOHOR,Dish.DEFAULT_PREFERENCES));
        allSideDishList.add(new Dish(R.string.side_dish_30,Dish.SUMMER_MEAL,Dish.SOHOR,Dish.DEFAULT_PREFERENCES));
        allSideDishList.add(new Dish(R.string.side_dish_31,Dish.SUMMER_MEAL,Dish.SOHOR,Dish.DEFAULT_PREFERENCES));
        allSideDishList.add(new Dish(R.string.side_dish_32,Dish.SUMMER_MEAL,Dish.SOHOR,Dish.DEFAULT_PREFERENCES));
        allSideDishList.add(new Dish(R.string.side_dish_33,Dish.SUMMER_MEAL,Dish.SOHOR,Dish.DEFAULT_PREFERENCES));
        allSideDishList.add(new Dish(R.string.side_dish_34,Dish.SUMMER_MEAL,Dish.SOHOR,Dish.DEFAULT_PREFERENCES));
        allSideDishList.add(new Dish(R.string.side_dish_35,Dish.SUMMER_MEAL,Dish.SOHOR,Dish.DEFAULT_PREFERENCES));
        allSideDishList.add(new Dish(R.string.side_dish_36,Dish.SUMMER_MEAL,Dish.SOHOR,Dish.DEFAULT_PREFERENCES));
        allSideDishList.add(new Dish(R.string.side_dish_37,Dish.SUMMER_MEAL,Dish.SOHOR,Dish.DEFAULT_PREFERENCES));
        allSideDishList.add(new Dish(R.string.side_dish_38,Dish.SUMMER_MEAL,Dish.SOHOR,Dish.DEFAULT_PREFERENCES));
        allSideDishList.add(new Dish(R.string.side_dish_39,Dish.SUMMER_MEAL,Dish.SOHOR,Dish.DEFAULT_PREFERENCES));
        allSideDishList.add(new Dish(R.string.side_dish_40,Dish.SUMMER_MEAL,Dish.SOHOR,Dish.DEFAULT_PREFERENCES));
        allSideDishList.add(new Dish(R.string.side_dish_41,Dish.SUMMER_MEAL,Dish.SOHOR,Dish.DEFAULT_PREFERENCES));
        allSideDishList.add(new Dish(R.string.side_dish_42,Dish.SUMMER_MEAL,Dish.SOHOR,Dish.DEFAULT_PREFERENCES));
        allSideDishList.add(new Dish(R.string.side_dish_43,Dish.SUMMER_MEAL,Dish.SOHOR,Dish.DEFAULT_PREFERENCES));

        allDesertDishList = new ArrayList<>();
        allDesertDishList.add(new Dish(R.string.dessert_1,Dish.SUMMER_MEAL,Dish.RAMADAN_BREAKFAST,Dish.DEFAULT_PREFERENCES));
        allDesertDishList.add(new Dish(R.string.dessert_2,Dish.SUMMER_MEAL,Dish.RAMADAN_BREAKFAST,Dish.DEFAULT_PREFERENCES));
        allDesertDishList.add(new Dish(R.string.dessert_3,Dish.SUMMER_MEAL,Dish.RAMADAN_BREAKFAST,Dish.DEFAULT_PREFERENCES));
        allDesertDishList.add(new Dish(R.string.dessert_4,Dish.SUMMER_MEAL,Dish.RAMADAN_BREAKFAST,Dish.DEFAULT_PREFERENCES));
        allDesertDishList.add(new Dish(R.string.dessert_5,Dish.SUMMER_MEAL,Dish.RAMADAN_BREAKFAST,Dish.DEFAULT_PREFERENCES));
        allDesertDishList.add(new Dish(R.string.dessert_6,Dish.SUMMER_MEAL,Dish.RAMADAN_BREAKFAST,Dish.DEFAULT_PREFERENCES));
        allDesertDishList.add(new Dish(R.string.dessert_7,Dish.SUMMER_MEAL,Dish.RAMADAN_BREAKFAST,Dish.DEFAULT_PREFERENCES));
        allDesertDishList.add(new Dish(R.string.dessert_8,Dish.SUMMER_MEAL,Dish.RAMADAN_BREAKFAST,Dish.DEFAULT_PREFERENCES));
        allDesertDishList.add(new Dish(R.string.dessert_9,Dish.SUMMER_MEAL,Dish.RAMADAN_BREAKFAST,Dish.DEFAULT_PREFERENCES));
        allDesertDishList.add(new Dish(R.string.dessert_10,Dish.SUMMER_MEAL,Dish.RAMADAN_BREAKFAST,Dish.DEFAULT_PREFERENCES));
        allDesertDishList.add(new Dish(R.string.dessert_11,Dish.SUMMER_MEAL,Dish.RAMADAN_BREAKFAST,Dish.DEFAULT_PREFERENCES));
        allDesertDishList.add(new Dish(R.string.dessert_12,Dish.SUMMER_MEAL,Dish.RAMADAN_BREAKFAST,Dish.DEFAULT_PREFERENCES));
        allDesertDishList.add(new Dish(R.string.dessert_13,Dish.SUMMER_MEAL,Dish.RAMADAN_BREAKFAST,Dish.DEFAULT_PREFERENCES));
        allDesertDishList.add(new Dish(R.string.dessert_14,Dish.SUMMER_MEAL,Dish.RAMADAN_BREAKFAST,Dish.DEFAULT_PREFERENCES));
        allDesertDishList.add(new Dish(R.string.dessert_15,Dish.SUMMER_MEAL,Dish.RAMADAN_BREAKFAST,Dish.DEFAULT_PREFERENCES));
        allDesertDishList.add(new Dish(R.string.dessert_16,Dish.SUMMER_MEAL,Dish.RAMADAN_BREAKFAST,Dish.DEFAULT_PREFERENCES));
        allDesertDishList.add(new Dish(R.string.dessert_17,Dish.SUMMER_MEAL,Dish.RAMADAN_BREAKFAST,Dish.DEFAULT_PREFERENCES));
        allDesertDishList.add(new Dish(R.string.dessert_18,Dish.SUMMER_MEAL,Dish.RAMADAN_BREAKFAST,Dish.DEFAULT_PREFERENCES));
        allDesertDishList.add(new Dish(R.string.dessert_19,Dish.SUMMER_MEAL,Dish.RAMADAN_BREAKFAST,Dish.DEFAULT_PREFERENCES));
        allDesertDishList.add(new Dish(R.string.dessert_20,Dish.SUMMER_MEAL,Dish.RAMADAN_BREAKFAST,Dish.DEFAULT_PREFERENCES));
        allDesertDishList.add(new Dish(R.string.dessert_21,Dish.SUMMER_MEAL,Dish.RAMADAN_BREAKFAST,Dish.DEFAULT_PREFERENCES));
        allDesertDishList.add(new Dish(R.string.dessert_22,Dish.SUMMER_MEAL,Dish.RAMADAN_BREAKFAST,Dish.DEFAULT_PREFERENCES));
        allDesertDishList.add(new Dish(R.string.dessert_23,Dish.SUMMER_MEAL,Dish.RAMADAN_BREAKFAST,Dish.DEFAULT_PREFERENCES));
        allDesertDishList.add(new Dish(R.string.dessert_24,Dish.SUMMER_MEAL,Dish.RAMADAN_BREAKFAST,Dish.DEFAULT_PREFERENCES));
        allDesertDishList.add(new Dish(R.string.dessert_25,Dish.SUMMER_MEAL,Dish.RAMADAN_BREAKFAST,Dish.DEFAULT_PREFERENCES));
        allDesertDishList.add(new Dish(R.string.dessert_26,Dish.SUMMER_MEAL,Dish.RAMADAN_BREAKFAST,Dish.DEFAULT_PREFERENCES));
        allDesertDishList.add(new Dish(R.string.dessert_27,Dish.SUMMER_MEAL,Dish.RAMADAN_BREAKFAST,Dish.DEFAULT_PREFERENCES));
        allDesertDishList.add(new Dish(R.string.dessert_28,Dish.SUMMER_MEAL,Dish.RAMADAN_BREAKFAST,Dish.DEFAULT_PREFERENCES));
        allDesertDishList.add(new Dish(R.string.dessert_29,Dish.SUMMER_MEAL,Dish.RAMADAN_BREAKFAST,Dish.DEFAULT_PREFERENCES));
        allDesertDishList.add(new Dish(R.string.dessert_30,Dish.SUMMER_MEAL,Dish.RAMADAN_BREAKFAST,Dish.DEFAULT_PREFERENCES));
        allDesertDishList.add(new Dish(R.string.dessert_31,Dish.SUMMER_MEAL,Dish.RAMADAN_BREAKFAST,Dish.DEFAULT_PREFERENCES));
        allDesertDishList.add(new Dish(R.string.dessert_32,Dish.SUMMER_MEAL,Dish.RAMADAN_BREAKFAST,Dish.DEFAULT_PREFERENCES));
        allDesertDishList.add(new Dish(R.string.dessert_33,Dish.SUMMER_MEAL,Dish.RAMADAN_BREAKFAST,Dish.DEFAULT_PREFERENCES));
        allDesertDishList.add(new Dish(R.string.dessert_34,Dish.SUMMER_MEAL,Dish.RAMADAN_BREAKFAST,Dish.DEFAULT_PREFERENCES));
        allDesertDishList.add(new Dish(R.string.dessert_35,Dish.SUMMER_MEAL,Dish.RAMADAN_BREAKFAST,Dish.DEFAULT_PREFERENCES));
        allDesertDishList.add(new Dish(R.string.dessert_36,Dish.SUMMER_MEAL,Dish.RAMADAN_BREAKFAST,Dish.DEFAULT_PREFERENCES));
        allDesertDishList.add(new Dish(R.string.dessert_37,Dish.SUMMER_MEAL,Dish.RAMADAN_BREAKFAST,Dish.DEFAULT_PREFERENCES));
        allDesertDishList.add(new Dish(R.string.dessert_38,Dish.SUMMER_MEAL,Dish.RAMADAN_BREAKFAST,Dish.DEFAULT_PREFERENCES));
        allDesertDishList.add(new Dish(R.string.dessert_39,Dish.SUMMER_MEAL,Dish.RAMADAN_BREAKFAST,Dish.DEFAULT_PREFERENCES));
        allDesertDishList.add(new Dish(R.string.dessert_1,Dish.SUMMER_MEAL,Dish.DESSERTS,Dish.DEFAULT_PREFERENCES));
        allDesertDishList.add(new Dish(R.string.dessert_2,Dish.SUMMER_MEAL,Dish.DESSERTS,Dish.DEFAULT_PREFERENCES));
        allDesertDishList.add(new Dish(R.string.dessert_3,Dish.SUMMER_MEAL,Dish.DESSERTS,Dish.DEFAULT_PREFERENCES));
        allDesertDishList.add(new Dish(R.string.dessert_4,Dish.SUMMER_MEAL,Dish.DESSERTS,Dish.DEFAULT_PREFERENCES));
        allDesertDishList.add(new Dish(R.string.dessert_5,Dish.SUMMER_MEAL,Dish.DESSERTS,Dish.DEFAULT_PREFERENCES));
        allDesertDishList.add(new Dish(R.string.dessert_6,Dish.SUMMER_MEAL,Dish.DESSERTS,Dish.DEFAULT_PREFERENCES));
        allDesertDishList.add(new Dish(R.string.dessert_7,Dish.SUMMER_MEAL,Dish.DESSERTS,Dish.DEFAULT_PREFERENCES));
        allDesertDishList.add(new Dish(R.string.dessert_8,Dish.SUMMER_MEAL,Dish.DESSERTS,Dish.DEFAULT_PREFERENCES));
        allDesertDishList.add(new Dish(R.string.dessert_9,Dish.SUMMER_MEAL,Dish.DESSERTS,Dish.DEFAULT_PREFERENCES));
        allDesertDishList.add(new Dish(R.string.dessert_10,Dish.SUMMER_MEAL,Dish.DESSERTS,Dish.DEFAULT_PREFERENCES));
        allDesertDishList.add(new Dish(R.string.dessert_11,Dish.SUMMER_MEAL,Dish.DESSERTS,Dish.DEFAULT_PREFERENCES));
        allDesertDishList.add(new Dish(R.string.dessert_12,Dish.SUMMER_MEAL,Dish.DESSERTS,Dish.DEFAULT_PREFERENCES));
        allDesertDishList.add(new Dish(R.string.dessert_13,Dish.SUMMER_MEAL,Dish.DESSERTS,Dish.DEFAULT_PREFERENCES));
        allDesertDishList.add(new Dish(R.string.dessert_14,Dish.SUMMER_MEAL,Dish.DESSERTS,Dish.DEFAULT_PREFERENCES));
        allDesertDishList.add(new Dish(R.string.dessert_15,Dish.SUMMER_MEAL,Dish.DESSERTS,Dish.DEFAULT_PREFERENCES));
        allDesertDishList.add(new Dish(R.string.dessert_16,Dish.SUMMER_MEAL,Dish.DESSERTS,Dish.DEFAULT_PREFERENCES));
        allDesertDishList.add(new Dish(R.string.dessert_17,Dish.SUMMER_MEAL,Dish.DESSERTS,Dish.DEFAULT_PREFERENCES));
        allDesertDishList.add(new Dish(R.string.dessert_18,Dish.SUMMER_MEAL,Dish.DESSERTS,Dish.DEFAULT_PREFERENCES));
        allDesertDishList.add(new Dish(R.string.dessert_19,Dish.SUMMER_MEAL,Dish.DESSERTS,Dish.DEFAULT_PREFERENCES));
        allDesertDishList.add(new Dish(R.string.dessert_20,Dish.SUMMER_MEAL,Dish.DESSERTS,Dish.DEFAULT_PREFERENCES));
        allDesertDishList.add(new Dish(R.string.dessert_21,Dish.SUMMER_MEAL,Dish.DESSERTS,Dish.DEFAULT_PREFERENCES));
        allDesertDishList.add(new Dish(R.string.dessert_22,Dish.SUMMER_MEAL,Dish.DESSERTS,Dish.DEFAULT_PREFERENCES));
        allDesertDishList.add(new Dish(R.string.dessert_23,Dish.SUMMER_MEAL,Dish.DESSERTS,Dish.DEFAULT_PREFERENCES));
        allDesertDishList.add(new Dish(R.string.dessert_24,Dish.SUMMER_MEAL,Dish.DESSERTS,Dish.DEFAULT_PREFERENCES));
        allDesertDishList.add(new Dish(R.string.dessert_25,Dish.SUMMER_MEAL,Dish.DESSERTS,Dish.DEFAULT_PREFERENCES));
        allDesertDishList.add(new Dish(R.string.dessert_26,Dish.SUMMER_MEAL,Dish.DESSERTS,Dish.DEFAULT_PREFERENCES));
        allDesertDishList.add(new Dish(R.string.dessert_27,Dish.SUMMER_MEAL,Dish.DESSERTS,Dish.DEFAULT_PREFERENCES));
        allDesertDishList.add(new Dish(R.string.dessert_28,Dish.SUMMER_MEAL,Dish.DESSERTS,Dish.DEFAULT_PREFERENCES));
        allDesertDishList.add(new Dish(R.string.dessert_29,Dish.SUMMER_MEAL,Dish.DESSERTS,Dish.DEFAULT_PREFERENCES));
        allDesertDishList.add(new Dish(R.string.dessert_30,Dish.SUMMER_MEAL,Dish.DESSERTS,Dish.DEFAULT_PREFERENCES));
        allDesertDishList.add(new Dish(R.string.dessert_31,Dish.SUMMER_MEAL,Dish.DESSERTS,Dish.DEFAULT_PREFERENCES));
        allDesertDishList.add(new Dish(R.string.dessert_32,Dish.SUMMER_MEAL,Dish.DESSERTS,Dish.DEFAULT_PREFERENCES));
        allDesertDishList.add(new Dish(R.string.dessert_33,Dish.SUMMER_MEAL,Dish.DESSERTS,Dish.DEFAULT_PREFERENCES));
        allDesertDishList.add(new Dish(R.string.dessert_34,Dish.SUMMER_MEAL,Dish.DESSERTS,Dish.DEFAULT_PREFERENCES));
        allDesertDishList.add(new Dish(R.string.dessert_35,Dish.SUMMER_MEAL,Dish.DESSERTS,Dish.DEFAULT_PREFERENCES));
        allDesertDishList.add(new Dish(R.string.dessert_36,Dish.SUMMER_MEAL,Dish.DESSERTS,Dish.DEFAULT_PREFERENCES));
        allDesertDishList.add(new Dish(R.string.dessert_37,Dish.SUMMER_MEAL,Dish.DESSERTS,Dish.DEFAULT_PREFERENCES));
        allDesertDishList.add(new Dish(R.string.dessert_38,Dish.SUMMER_MEAL,Dish.DESSERTS,Dish.DEFAULT_PREFERENCES));
        allDesertDishList.add(new Dish(R.string.dessert_39,Dish.SUMMER_MEAL,Dish.DESSERTS,Dish.DEFAULT_PREFERENCES));

        allDrinkDishList = new ArrayList<>();
        allDrinkDishList.add(new Dish(R.string.drink_1,Dish.SUMMER_MEAL,Dish.RAMADAN_BREAKFAST,Dish.DEFAULT_PREFERENCES));
        allDrinkDishList.add(new Dish(R.string.drink_2,Dish.SUMMER_MEAL,Dish.RAMADAN_BREAKFAST,Dish.DEFAULT_PREFERENCES));
        allDrinkDishList.add(new Dish(R.string.drink_3,Dish.SUMMER_MEAL,Dish.RAMADAN_BREAKFAST,Dish.DEFAULT_PREFERENCES));
        allDrinkDishList.add(new Dish(R.string.drink_4,Dish.SUMMER_MEAL,Dish.RAMADAN_BREAKFAST,Dish.DEFAULT_PREFERENCES));
        allDrinkDishList.add(new Dish(R.string.drink_5,Dish.SUMMER_MEAL,Dish.RAMADAN_BREAKFAST,Dish.DEFAULT_PREFERENCES));
        allDrinkDishList.add(new Dish(R.string.drink_6,Dish.SUMMER_MEAL,Dish.RAMADAN_BREAKFAST,Dish.DEFAULT_PREFERENCES));
        allDrinkDishList.add(new Dish(R.string.drink_7,Dish.SUMMER_MEAL,Dish.RAMADAN_BREAKFAST,Dish.DEFAULT_PREFERENCES));
        allDrinkDishList.add(new Dish(R.string.drink_8,Dish.SUMMER_MEAL,Dish.RAMADAN_BREAKFAST,Dish.DEFAULT_PREFERENCES));
        allDrinkDishList.add(new Dish(R.string.drink_9,Dish.SUMMER_MEAL,Dish.RAMADAN_BREAKFAST,Dish.DEFAULT_PREFERENCES));
        allDrinkDishList.add(new Dish(R.string.drink_10,Dish.SUMMER_MEAL,Dish.RAMADAN_BREAKFAST,Dish.DEFAULT_PREFERENCES));
        allDrinkDishList.add(new Dish(R.string.drink_11,Dish.SUMMER_MEAL,Dish.RAMADAN_BREAKFAST,Dish.DEFAULT_PREFERENCES));
        allDrinkDishList.add(new Dish(R.string.drink_12,Dish.SUMMER_MEAL,Dish.RAMADAN_BREAKFAST,Dish.DEFAULT_PREFERENCES));
        allDrinkDishList.add(new Dish(R.string.drink_13,Dish.SUMMER_MEAL,Dish.RAMADAN_BREAKFAST,Dish.DEFAULT_PREFERENCES));
        allDrinkDishList.add(new Dish(R.string.drink_14,Dish.SUMMER_MEAL,Dish.RAMADAN_BREAKFAST,Dish.DEFAULT_PREFERENCES));
        allDrinkDishList.add(new Dish(R.string.drink_15,Dish.SUMMER_MEAL,Dish.RAMADAN_BREAKFAST,Dish.DEFAULT_PREFERENCES));
        allDrinkDishList.add(new Dish(R.string.drink_16,Dish.SUMMER_MEAL,Dish.RAMADAN_BREAKFAST,Dish.DEFAULT_PREFERENCES));
        allDrinkDishList.add(new Dish(R.string.drink_17,Dish.SUMMER_MEAL,Dish.RAMADAN_BREAKFAST,Dish.DEFAULT_PREFERENCES));
        allDrinkDishList.add(new Dish(R.string.drink_18,Dish.SUMMER_MEAL,Dish.RAMADAN_BREAKFAST,Dish.DEFAULT_PREFERENCES));
        allDrinkDishList.add(new Dish(R.string.drink_19,Dish.SUMMER_MEAL,Dish.RAMADAN_BREAKFAST,Dish.DEFAULT_PREFERENCES));
        allDrinkDishList.add(new Dish(R.string.drink_20,Dish.SUMMER_MEAL,Dish.RAMADAN_BREAKFAST,Dish.DEFAULT_PREFERENCES));
        allDrinkDishList.add(new Dish(R.string.drink_21,Dish.SUMMER_MEAL,Dish.SOHOR,Dish.DEFAULT_PREFERENCES));
        allDrinkDishList.add(new Dish(R.string.drink_22,Dish.SUMMER_MEAL,Dish.SOHOR,Dish.DEFAULT_PREFERENCES));
        allDrinkDishList.add(new Dish(R.string.drink_23,Dish.SUMMER_MEAL,Dish.SOHOR,Dish.DEFAULT_PREFERENCES));
        allDrinkDishList.add(new Dish(R.string.drink_24,Dish.SUMMER_MEAL,Dish.SOHOR,Dish.DEFAULT_PREFERENCES));
        allDrinkDishList.add(new Dish(R.string.drink_25,Dish.SUMMER_MEAL,Dish.SOHOR,Dish.DEFAULT_PREFERENCES));
        allDrinkDishList.add(new Dish(R.string.drink_26,Dish.SUMMER_MEAL,Dish.SOHOR,Dish.DEFAULT_PREFERENCES));
        allDrinkDishList.add(new Dish(R.string.drink_27,Dish.SUMMER_MEAL,Dish.SOHOR,Dish.DEFAULT_PREFERENCES));

    }

    public void getQuickMeal(int mealType) {

        Meal quickMeal = generateMeal(Dish.SUMMER_MEAL,mealType,Dish.DEFAULT_PREFERENCES);
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
                        drinksDishList.get(generateRandomNumber(drinksDishList.size()))
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
                        drinksDishList.get(generateRandomNumber(drinksDishList.size()))
                );
                break;
        }
        return generatedMeal;
    }

    private int generateRandomNumber(int maxNumber){
        Random randomNumberGenerator = new Random();
        Log.i("PickAMeal",maxNumber+"");
        int randomNumber = randomNumberGenerator.nextInt(maxNumber);
        return randomNumber;
    }

    private ArrayList<Dish> getDishList(ArrayList<Dish> allDishList, int mealSeason, int mealType, int userPreferences) {
        ArrayList<Dish> dishList = new ArrayList<>();
        Log.i("PickAMeal","mealSeason: "+ mealSeason+", mealType: "+mealType +"userPref: "+ userPreferences);
        for(Dish dish : allDishList){
            if(dish.getDishSeason() == mealSeason && dish.getDishType() == mealType && dish.getUserPreferences() == userPreferences){
                dishList.add(dish);
            }
        }
        return dishList;
    }
}
