package com.tofi.pickameal.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.tofi.pickameal.R;
import com.tofi.pickameal.model.Meal;
import com.tofi.pickameal.viewmodel.HomeViewModel;

public class HomeActivity extends AppCompatActivity {

    private HomeViewModel mViewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mViewModel = new HomeViewModelFactory(this).create(HomeViewModel.class);

        // Quick Meal Button Handler
        FloatingActionButton btnQuickMeal = findViewById(R.id.btn_quick_meal);
        btnQuickMeal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mViewModel.getQuickMeal();
            }
        });
    }

    public void setMeal(Meal meal){

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
