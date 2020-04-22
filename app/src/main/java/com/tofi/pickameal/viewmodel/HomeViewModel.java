package com.tofi.pickameal.viewmodel;

import android.util.Log;

import androidx.lifecycle.ViewModel;

import com.tofi.pickameal.model.Meal;
import com.tofi.pickameal.view.HomeActivity;

import java.util.Calendar;

public class HomeViewModel extends ViewModel {

    private  HomeActivity mHomeActivity;

    public HomeViewModel(HomeActivity homeActivity){
            mHomeActivity = homeActivity;
    }

    public void getQuickMeal() {
        // Still need to be handled
        Meal quickMeal = new Meal();
        Calendar calendar = Calendar.getInstance();
        int hour = calendar.get(Calendar.HOUR_OF_DAY);

        if(hour>0 && hour<5){
            Log.i("PickAMeal","Sohor Time");
        }else if(hour>5 && hour< 18){
            Log.i("PickAMeal","Fetar Time");
        }else if(hour>18 && hour<24){
            Log.i("PickAMeal","7elw Time");
        }

        mHomeActivity.setMeal(quickMeal);
    }
}
