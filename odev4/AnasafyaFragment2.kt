package com.example.odev4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.odev4.databinding.FragmentAnasafya2Binding
import com.example.odev4.databinding.FragmentAnasayfa1Binding


class AnasafyaFragment2 : Fragment() {

    private lateinit var binding: FragmentAnasafya2Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding=FragmentAnasafya2Binding.inflate(layoutInflater,container,false)
        binding.Git5.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.gecis5)
        }
        return binding.root
    }

}