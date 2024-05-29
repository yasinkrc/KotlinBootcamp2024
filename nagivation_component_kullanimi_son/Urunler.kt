package com.example.nagivation_component_kullanimi_son

import android.os.Parcelable
import kotlinx.parcelize.Parcelize


@Parcelize
data class Urunler(var id :Int ,var ad:String) : Parcelable {
}