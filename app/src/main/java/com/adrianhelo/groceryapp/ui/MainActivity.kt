package com.adrianhelo.groceryapp.ui

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.adrianhelo.groceryapp.R
import com.adrianhelo.groceryapp.adapter.GroceryAdapter
import com.adrianhelo.groceryapp.model.GroceryModel

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // 1. AdapterView: RecyclerView
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        // 2. Data Source
        var groceryItems = ArrayList<GroceryModel>()
        val grocery1 = GroceryModel(R.drawable.beverage, "Beverage", "Juice, tea, coffee and soda")
        val grocery2 = GroceryModel(R.drawable.milk, "Milk", "Milk, shakes and yogurt")
        val grocery3 = GroceryModel(R.drawable.bread, "Bread", "Bread, wheat and beans")
        val grocery4 = GroceryModel(R.drawable.fruit, "Fruit", "Fresh fruits from the garden")
        val grocery5 = GroceryModel(R.drawable.popcorn, "Snacks", "Pop corn, donuts and drinks")
        val grocery6 = GroceryModel(R.drawable.vegitables, "Vegetables", "Delicious vegetables")
        groceryItems.add(grocery1)
        groceryItems.add(grocery2)
        groceryItems.add(grocery3)
        groceryItems.add(grocery4)
        groceryItems.add(grocery5)
        groceryItems.add(grocery6)

        // 3. Adapter
        val adapter = GroceryAdapter(groceryItems)
        recyclerView.adapter = adapter

    }
}