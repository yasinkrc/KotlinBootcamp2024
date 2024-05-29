package com.example.odev4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.navigation.Navigation
import com.example.odev4.databinding.FragmentAnasayfa1Binding
import com.example.odev4.databinding.FragmentAnasayfa5Binding


class AnasayfaFragment5 : Fragment() {

    private lateinit var binding: FragmentAnasayfa5Binding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding=FragmentAnasayfa5Binding.inflate(layoutInflater,container,false)
        return binding.root
    }

    val backPress =object :OnBackPressedCallback(true){

        override fun handleOnBackPressed() {

            Navigation.findNavController(binding.textView).navigate(R.id.gitanasayfa)
            isEnabled=false
            requireActivity().onBackPressedDispatcher.onBackPressed()

        }

    }

}