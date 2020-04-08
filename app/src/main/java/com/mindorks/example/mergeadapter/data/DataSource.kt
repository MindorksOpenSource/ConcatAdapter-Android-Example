package com.mindorks.example.mergeadapter.data

import com.mindorks.example.mergeadapter.R
import com.mindorks.example.mergeadapter.data.model.AdModel
import com.mindorks.example.mergeadapter.data.model.User

object DataSource {

    fun getUser() = ArrayList<User>().apply {
        add(User(1, "Himanshu", "https://s3.amazonaws.com/uifaces/faces/twitter/sunlandictwin/128.jpg"))
        add(User(2, "Alford Hoeger", "https://s3.amazonaws.com/uifaces/faces/twitter/fuck_you_two/128.jpg"))
        add(User(3, "Terrance Halvorson", "https://s3.amazonaws.com/uifaces/faces/twitter/mufaddal_mw/128.jpg"))
        add(User(3, "Morgan McGlynn", "https://s3.amazonaws.com/uifaces/faces/twitter/allfordesign/128.jpg"))
        add(User(4, "Ms. Ramiro DuBuque", "https://s3.amazonaws.com/uifaces/faces/twitter/shaneIxD/128.jpg"))
        add(User(5, "Kolby Orn", "https://s3.amazonaws.com/uifaces/faces/twitter/johnsmithagency/128.jpg"))
        add(User(6, "Elijah Schoen MD", "https://s3.amazonaws.com/uifaces/faces/twitter/alxndrustinov/128.jpg"))

    }

    fun getAd() = AdModel(R.drawable.publication_site_cover)

}