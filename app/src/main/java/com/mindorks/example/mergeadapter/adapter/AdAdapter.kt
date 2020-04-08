package com.mindorks.example.mergeadapter.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.mindorks.example.mergeadapter.R
import com.mindorks.example.mergeadapter.data.model.AdModel
import kotlinx.android.synthetic.main.item_layout_ads.view.*

class AdAdapter(
        private val adModel: AdModel
) : RecyclerView.Adapter<AdAdapter.DataViewHolder>() {

    class DataViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(user: AdModel) {
            Glide.with(itemView.imageViewAd.context)
                    .load(user.adBanner)
                    .into(itemView.imageViewAd)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
            DataViewHolder(
                    LayoutInflater.from(parent.context).inflate(
                            R.layout.item_layout_ads, parent,
                            false
                    )
            )

    override fun getItemCount(): Int = 1

    override fun onBindViewHolder(holder: DataViewHolder, position: Int) {
        holder.bind(adModel)
    }


}