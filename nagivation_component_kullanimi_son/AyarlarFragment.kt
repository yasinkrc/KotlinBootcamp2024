package com.example.nagivation_component_kullanimi_son

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.nagivation_component_kullanimi_son.databinding.FragmentAyarlarBinding


class AyarlarFragment : Fragment() {

    private lateinit var binding: FragmentAyarlarBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        binding=FragmentAyarlarBinding.inflate(layoutInflater,container,false)
        return binding.root
    }}
