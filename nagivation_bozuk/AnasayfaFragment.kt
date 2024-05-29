package com.example.nagivation_bozuk

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.nagivation_bozuk.databinding.FragmentAnasayfaBinding
import com.example.nagivation_bozuk.databinding.FragmentDetayBinding
import com.google.android.material.snackbar.Snackbar


class AnasayfaFragment : Fragment() {

    private lateinit var binding: FragmentAnasayfaBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        binding=FragmentAnasayfaBinding.inflate(inflater,container, false)
        // binding_=ActivityDetayBinding.inflate(layoutInflater) --> Activitylerde nasıl kullanılır

        binding.buttonAnasayfa.setOnClickListener{
            Snackbar.make(binding.buttonAnasayfa,"Butona Basıldı ! ",Snackbar.LENGTH_SHORT).show()
            binding.textView.text="Nasılsın"

        }
        return binding.root
    }
}