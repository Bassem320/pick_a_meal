package com.tofi.pickameal.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.tofi.pickameal.R;
import com.tofi.pickameal.model.Meal;
import com.tofi.pickameal.viewmodel.HomeViewModel;

public class HomeActivity extends AppCompatActivity {

    TextView txtMainDish, txtSideDish, txtEntry, txtDessert, txtDrinks;

    private HomeViewModel mViewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mViewModel = new HomeViewModelFactory(this).create(HomeViewModel.class);

        //TextView References Linking
        txtMainDish = findViewById(R.id.txt_main_dish);
        txtSideDish = findViewById(R.id.txt_side_dish);
        txtEntry = findViewById(R.id.txt_entry);
        txtDessert = findViewById(R.id.txt_dessert);
        txtDrinks = findViewById(R.id.txt_drinks);

        FloatingActionButton btnQuickMeal = findViewById(R.id.btn_quick_meal);
        // Quick Meal Button Handler
        btnQuickMeal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mViewModel.getQuickMeal();
            }
        });
    }

    public void setMeal(Meal meal){
        if(meal.isHasMain()){
            txtMainDish.setText(meal.getMainDish().getName());
        }else{
            txtMainDish.setVisibility(View.GONE);
        }
        if(meal.isHasSide()){
            txtSideDish.setText(meal.getSideDish().getName());
        }else{
            txtSideDish.setVisibility(View.GONE);
        }
        if(meal.isHasEntry()){
            txtEntry.setText(meal.getEntry().getName());
        }else{
            txtEntry.setVisibility(View.GONE);
        }
        if(meal.isHasDessert()){
            txtDessert.setText(meal.getDessert().getName());
        }else{
            txtDessert.setVisibility(View.GONE);
        }
        if(meal.isHasDrinks()){
            txtDrinks.setText(meal.getDrinks().getName());
        }else{
            txtDrinks.setVisibility(View.GONE);
        }
    }


    static class HomeViewModelFactory implements ViewModelProvider.Factory {
        private HomeActivity mActivity;


        HomeViewModelFactory(HomeActivity activity) {
            mActivity = activity;
        }


        @Override
        public <T extends ViewModel> T create(Class<T> modelClass) {
            return (T) new HomeViewModel(mActivity);
        }
    }
}
