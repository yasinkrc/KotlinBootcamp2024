package com.example.nagivation_bozuk

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.nagivation_bozuk.databinding.FragmentDetayBinding


class DetayFragment : Fragment() {

   private lateinit var binding: FragmentDetayBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        binding=FragmentDetayBinding.inflate(inflater,container,false)

        binding.textViewdetay.text="Merhaba"

        return binding.root
    }
}