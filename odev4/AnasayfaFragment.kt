package com.example.odev4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.odev4.databinding.FragmentAnasayfaBinding


class AnasayfaFragment : Fragment() {

   private lateinit var binding: FragmentAnasayfaBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding=FragmentAnasayfaBinding.inflate(layoutInflater,container,false)

        binding.Git1.setOnClickListener{

            Navigation.findNavController(it).navigate(R.id.gecis1)

        }
        binding.Git4.setOnClickListener{

            Navigation.findNavController(it).navigate(R.id.gecis4)
        }
        return binding.root
    }


}