package com.example.odev4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.odev4.databinding.FragmentAnasayfa1Binding


class AnasayfaFragment1 : Fragment() {

    private lateinit var binding: FragmentAnasayfa1Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding=FragmentAnasayfa1Binding.inflate(layoutInflater,container,false)

        binding.Git2.setOnClickListener{

            Navigation.findNavController(it).navigate(R.id.action_anasayfaFragment1_to_anasafyaFragment2)
        }
        return binding.root
    }
}