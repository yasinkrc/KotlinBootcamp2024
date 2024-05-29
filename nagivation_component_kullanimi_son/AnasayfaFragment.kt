package com.example.nagivation_component_kullanimi_son

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.nagivation_component_kullanimi_son.databinding.FragmentAnasayfaBinding
import com.google.android.material.snackbar.Snackbar


class AnasayfaFragment : Fragment() {

    private lateinit var binding: FragmentAnasayfaBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        binding=FragmentAnasayfaBinding.inflate(layoutInflater,container,false)

        binding.buttonDetay.setOnClickListener{
            //Snackbar.make(it,"Merhaba",Snackbar.LENGTH_SHORT).show()
            //binding.textView.text="Nasılsın ? "

            val urun =Urunler(100,"Tv")


            val gecis=AnasayfaFragmentDirections.detayGecis(urun=urun,ad="Ahmet",yas=23,boy= 1.78F, bekarMi =true)
            Navigation.findNavController(it).navigate(gecis)


        }

        binding.buttonGSster.setOnClickListener{
            Navigation.findNavController(it).navigate(R.id.bottomsheetgecis)
        }
        return binding.root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        android.util.Log.e("Yaşam Döngüsü","OnCreate")
    }

    override fun onPause() {
        super.onPause()
        android.util.Log.e("Yaşam Döngüsü","onPause")

    }
    override fun onResume() {
        super.onResume()
        android.util.Log.e("Yaşam Döngüsü","onResume")

    }


}