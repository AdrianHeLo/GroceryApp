package com.adrianhelo.groceryapp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.adrianhelo.groceryapp.R
import com.adrianhelo.groceryapp.model.GroceryModel
import java.util.zip.Inflater

class GroceryAdapter(private val itemList: ArrayList<GroceryModel>):
    RecyclerView.Adapter<GroceryAdapter.GroceryViewHolder>() {


    // ViewHolder: holding references to the views for a single
    // item in the 'RecyclerView'
    // itemView: represents the view for a single item in RV
    inner class GroceryViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val itemImg: ImageView
        val itmeTxt: TextView
        val itemDescTxt: TextView

        init {
            itemImg = itemView.findViewById(R.id.grocery_image)
            itemDescTxt = itemView.findViewById(R.id.grocery_description)
            itmeTxt = itemView.findViewById(R.id.grocery_name)
            itemView.setOnClickListener(){
                Toast.makeText(itemView.context, "You choose:  ${itemList[layoutPosition].groceryName}", Toast.LENGTH_LONG).show()
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GroceryViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(
            R.layout.item_layout,
            parent,
            false)
        return GroceryViewHolder(view)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onBindViewHolder(holder: GroceryViewHolder, position: Int) {
        holder.itemDescTxt.text = itemList[position].groceryDescription
        holder.itemImg.setImageResource(itemList[position].groceryImage)
        holder.itmeTxt.text = itemList[position].groceryName
    }
}