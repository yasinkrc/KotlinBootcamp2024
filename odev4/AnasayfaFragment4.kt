package com.example.odev4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.navGraphViewModels
import com.example.odev4.databinding.FragmentAnasayfa1Binding
import com.example.odev4.databinding.FragmentAnasayfa4Binding

class AnasayfaFragment4 : Fragment() {

    private lateinit var binding: FragmentAnasayfa4Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding=FragmentAnasayfa4Binding.inflate(layoutInflater,container,false)

        binding.Git51.setOnClickListener {

            Navigation.findNavController(it).navigate(R.id.gecis51)
        }
        return binding.root
    }
}