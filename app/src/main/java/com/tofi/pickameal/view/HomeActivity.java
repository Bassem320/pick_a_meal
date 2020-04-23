package com.tofi.pickameal.view;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.tofi.pickameal.R;
import com.tofi.pickameal.model.Dish;
import com.tofi.pickameal.model.Meal;
import com.tofi.pickameal.viewmodel.HomeViewModel;

public class HomeActivity extends AppCompatActivity {

    TextView txtMainDish, txtSideDish, txtEntry, txtDessert, txtDrinks, txtMealType;
    LinearLayout layoutMain,layoutSide,layoutEntry,layoutDessert,layoutDrinks;
    int mealIndex = Dish.RAMADAN_BREAKFAST;

    private HomeViewModel mViewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        mViewModel = new HomeViewModelFactory(this).create(HomeViewModel.class);

        //TextView References Linking
        txtMainDish = findViewById(R.id.txt_main_dish);
        txtSideDish = findViewById(R.id.txt_side_dish);
        txtEntry = findViewById(R.id.txt_entry);
        txtDessert = findViewById(R.id.txt_dessert);
        txtDrinks = findViewById(R.id.txt_drinks);
        txtMealType = findViewById(R.id.txt_meal_type);
        layoutMain = findViewById(R.id.lin_layout_main_dish);
        layoutEntry = findViewById(R.id.lin_layout_entry);
        layoutSide = findViewById(R.id.lin_layout_side_dish);
        layoutDessert = findViewById(R.id.lin_layout_Desserts);
        layoutDrinks = findViewById(R.id.lin_layout_Drinks);

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
                layoutMain.setVisibility(View.GONE);
                layoutEntry.setVisibility(View.GONE);
                layoutSide.setVisibility(View.GONE);
                layoutDessert.setVisibility(View.GONE);
                layoutDrinks.setVisibility(View.GONE);

                return  true;
            case R.id.menu_sohor:
                mealIndex = Dish.SOHOR;
                txtMealType.setText(R.string.menu_sohor);
                layoutMain.setVisibility(View.GONE);
                layoutEntry.setVisibility(View.GONE);
                layoutSide.setVisibility(View.GONE);
                layoutDessert.setVisibility(View.GONE);
                layoutDrinks.setVisibility(View.GONE);
                return  true;
            case R.id.menu_desserts:
                mealIndex = Dish.DESSERTS;
                txtMealType.setText(R.string.menu_dessert);
                layoutMain.setVisibility(View.GONE);
                layoutEntry.setVisibility(View.GONE);
                layoutSide.setVisibility(View.GONE);
                layoutDessert.setVisibility(View.GONE);
                layoutDrinks.setVisibility(View.GONE);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public void setMeal(Meal meal){
        if(meal.isHasMain()){
            txtMainDish.setText(meal.getMainDish().getDishNameId());
            layoutMain.setVisibility(View.VISIBLE);
        }else{
            layoutMain.setVisibility(View.GONE);
        }
        if(meal.isHasSide()){
            txtSideDish.setText(meal.getSideDish().getDishNameId());
            layoutSide.setVisibility(View.VISIBLE);
        }else{
            layoutSide.setVisibility(View.GONE);
        }
        if(meal.isHasEntry()){
            txtEntry.setText(meal.getEntry().getDishNameId());
            layoutEntry.setVisibility(View.VISIBLE);
        }else{
            layoutEntry.setVisibility(View.GONE);
        }
        if(meal.isHasDessert()){
            txtDessert.setText(meal.getDessert().getDishNameId());
            layoutDessert.setVisibility(View.VISIBLE);
        }else{
            layoutDessert.setVisibility(View.GONE);
        }
        if(meal.isHasDrinks()){
            txtDrinks.setText(meal.getDrinks().getDishNameId());
            layoutDrinks.setVisibility(View.VISIBLE);
        }else{
            layoutDrinks.setVisibility(View.GONE);
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
