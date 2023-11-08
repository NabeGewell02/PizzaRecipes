package com.example.pizzarecipes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<PizzaRecipeItem> pizzaRecipeItems = new ArrayList<>();

        pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.pizza1,
                Utils.PIZZA1_TITLE,
                Utils.PIZZA1_DESCRIPTION,
                Utils.PIZZA1_RECIPE));
        pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.pizza2,
                Utils.PIZZA2_TITLE,
                Utils.PIZZA2_DESCRIPTION,
                Utils.PIZZA2_RECIPE));
        pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.pizza3,
                Utils.PIZZA3_TITLE,
                Utils.PIZZA3_DESCRIPTION,
                Utils.PIZZA3_RECIPE));
        pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.pizza4,
                Utils.PIZZA4_TITLE,
                Utils.PIZZA4_DESCRIPTION,
                Utils.PIZZA4_RECIPE));
        pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.pizza5,
                Utils.PIZZA5_TITLE,
                Utils.PIZZA5_DESCRIPTION,
                Utils.PIZZA5_RECIPE));
        pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.pizza6,
                Utils.PIZZA6_TITLE,
                Utils.PIZZA6_DESCRIPTION,
                Utils.PIZZA6_RECIPE));
        pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.pizza7,
                Utils.PIZZA7_TITLE,
                Utils.PIZZA7_DESCRIPTION,
                Utils.PIZZA7_RECIPE));
        pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.pizza8,
                Utils.PIZZA8_TITLE,
                Utils.PIZZA8_DESCRIPTION,
                Utils.PIZZA8_RECIPE));
        pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.pizza9,
                Utils.PIZZA9_TITLE,
                Utils.PIZZA9_DESCRIPTION,
                Utils.PIZZA9_RECIPE));
        pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.pizza10,
                Utils.PIZZA10_TITLE,
                Utils.PIZZA10_DESCRIPTION,
                Utils.PIZZA10_RECIPE));
    }
}