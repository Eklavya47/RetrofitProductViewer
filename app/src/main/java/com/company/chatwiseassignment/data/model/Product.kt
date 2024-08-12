package com.company.chatwiseassignment.data.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class Product(
    @SerializedName("id")
    val id: Int,
    @SerializedName("title")
    val title: String,
    @SerializedName("description")
    val description: String?,
    @SerializedName("category")
    val category: String?,
    @SerializedName("price")
    val price: Double?,
    @SerializedName("discountPercentage")
    val discountPercentage: Double?,
    @SerializedName("rating")
    val rating: Double?,
    @SerializedName("stock")
    val stock: Int?,
    @SerializedName("tags")
    val tags: List<String>?,
    @SerializedName("brand")
    val brand: String?,
    @SerializedName("sku")
    val sku: String?,
    @SerializedName("weight")
    val weight: Double?,
    @SerializedName("dimensions")
    val dimensions: Dimensions?,
    @SerializedName("warrantyInformation")
    val warrantyInformation: String?,
    @SerializedName("shippingInformation")
    val shippingInformation: String?,
    @SerializedName("availabilityStatus")
    val availabilityStatus: String?,
    @SerializedName("reviews")
    val reviews: List<Review>?,
    @SerializedName("returnPolicy")
    val returnPolicy: String?,
    @SerializedName("minimumOrderQuantity")
    val minimumOrderQuantity: Int?,
    @SerializedName("meta")
    val meta: Meta?,
    @SerializedName("images")
    val images: List<String>?,
    @SerializedName("thumbnail")
    val thumbnail: String?
): Parcelable

@Parcelize
data class Dimensions(
    @SerializedName("width")
    val width: Double?,
    @SerializedName("height")
    val height: Double?,
    @SerializedName("depth")
    val depth: Double?
): Parcelable

@Parcelize
data class Review(
    @SerializedName("rating")
    val rating: Int,
    @SerializedName("comment")
    val comment: String?,
    @SerializedName("date")
    val date: String?,
    @SerializedName("reviewerName")
    val reviewerName: String?,
    @SerializedName("reviewerEmail")
    val reviewerEmail: String?
): Parcelable

@Parcelize
data class Meta(
    @SerializedName("createdAt")
    val createdAt: String?,
    @SerializedName("updatedAt")
    val updatedAt: String?,
    @SerializedName("barcode")
    val barcode: String?,
    @SerializedName("qrCode")
    val qrCode: String?
): Parcelable
