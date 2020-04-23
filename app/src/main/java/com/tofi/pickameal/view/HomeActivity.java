package com.tofi.pickameal.view;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.tofi.pickameal.R;
import com.tofi.pickameal.model.Dish;
import com.tofi.pickameal.model.Meal;
import com.tofi.pickameal.viewmodel.HomeViewModel;

public class HomeActivity extends AppCompatActivity {

    TextView txtMainDish, txtSideDish, txtEntry, txtDessert, txtDrinks, txtMealType;
    int mealIndex = Dish.RAMADAN_BREAKFAST;

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
        txtMealType = findViewById(R.id.txt_meal_type);

        FloatingActionButton btnQuickMeal = findViewById(R.id.btn_quick_meal);
        // Quick Meal Button Handler
        btnQuickMeal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mViewModel.getQuickMeal(mealIndex);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.home_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.menu_ramadan_breakfast:
                mealIndex = Dish.RAMADAN_BREAKFAST;
                txtMealType.setText(R.string.menu_ramadan_breakfast);
                return  true;
            case R.id.menu_sohor:
                mealIndex = Dish.SOHOR;
                txtMealType.setText(R.string.menu_sohor);
                return  true;
            case R.id.menu_desserts:
                mealIndex = Dish.DESSERTS;
                txtMealType.setText(R.string.menu_dessert);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
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
