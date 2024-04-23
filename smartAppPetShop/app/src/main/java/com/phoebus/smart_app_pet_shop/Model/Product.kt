package com.phoebus.smart_app_pet_shop.Model

import com.google.gson.annotations.SerializedName

class Product {

    @SerializedName("price")
    var price: Double = 0.0

    @SerializedName("title")
    var title: String =""

    @SerializedName("description")
    var description: String =""

    @SerializedName("image_url")
    var image_url: String =""



}