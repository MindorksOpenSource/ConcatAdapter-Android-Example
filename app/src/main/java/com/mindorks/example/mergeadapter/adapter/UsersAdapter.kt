package com.mindorks.example.mergeadapter.adapter


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.mindorks.example.mergeadapter.R
import com.mindorks.example.mergeadapter.data.model.User
import kotlinx.android.synthetic.main.item_layout.view.*

class UsersAdapter(
        private val users: ArrayList<User>
) : RecyclerView.Adapter<UsersAdapter.DataViewHolder>() {

    class DataViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(user: User) {
            itemView.textViewUserName.text = user.name
            Glide.with(itemView.imageViewAvatar.context)
                    .load(user.avatar)
                    .into(itemView.imageViewAvatar)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
            DataViewHolder(
                    LayoutInflater.from(parent.context).inflate(
                            R.layout.item_layout, parent,
                            false
                    )
            )

    override fun getItemCount(): Int = users.size

    override fun onBindViewHolder(holder: DataViewHolder, position: Int) =
            holder.bind(users[position])

}