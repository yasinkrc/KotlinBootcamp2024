package com.example.degiskenler

import kotlin.reflect.typeOf


fun main(){

    var ogrenciAdi="Ahmet"
    var ogrenciYas=23
    var ogrenciBoy=1.98
    var ogrenciBasHarf='A'
    var ogrenciDevamEdiyorMu=true

    println(ogrenciAdi)
    println(ogrenciYas)
    println(ogrenciBoy)
    println(ogrenciBasHarf)
    println(ogrenciDevamEdiyorMu)
    println("********************************************************")
    test1()
    println("********************************************************")
    constant()
    println("********************************************************")
    typeCasting()
}

fun test1(){

    var urun_id :Int =3416
    var urun_adi :String ="Macbook Pro"
    var urun_adet :Int =1
    var urun_fiyat :Double =42999.99
    var urun_tedarikci :String  ="Apple"

    println("Ürün id : $urun_id")
    println("urun_adi : $urun_adi")
    println("urun_adet : $urun_adet")
    println("urun_fiyat : $urun_fiyat")
    println("urun_tedarikci : $urun_tedarikci")

    var a :Int =5
    var b :Int =6

    println("$a * $b : ${a*b}")




}


fun constant(){
    // Sabitler  // constant

    // val(Kotlin ) -cont(C++) -Final(java) -let(swift)

    var sayi :Int =30
    println(sayi)
    sayi=100

    println(sayi)

    val numara =40
    println(numara)
    // numara = 5  fail ....
    // her şeyi val yaz değişince değiştirisin !

}

fun typeCasting(){

    // Tür dönüşümü -Type Casting

    val i =42
    val d =78.95

    // sayısaldan sayısala dönüşüm

    val sonuc1 =i.toDouble()
    val sonuc2=d.toInt()
    println(sonuc1)
    println(sonuc2)

    // sayısaldan metine dönüşüm

    val sonuc3 = i.toString()
    val sonuc4=d.toString()

    println(sonuc3)
    println(sonuc4)


    //Metinden sayısala dönüşüm

    val yazi ="67.54"

    val sonuc5=yazi.toDouble()
    println(sonuc5)
    println(sonuc5.javaClass)

    val yazi2 :String= "67.54t"

    val sonuc6=yazi2.toDoubleOrNull()

    if(sonuc6!=null){
        println(sonuc6)

    }else
    {
        println(" it happened a fail in this question  ") //A problem occurred

    }

    sonuc6?.let {
        println(it)
    }
}