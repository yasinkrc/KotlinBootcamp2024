  package com.example.nagivation_component_kullanimi_son

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.nagivation_component_kullanimi_son.databinding.FragmentAyarlarBinding
import com.example.nagivation_component_kullanimi_son.databinding.FragmentBottomSheetBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.google.android.material.snackbar.Snackbar

  class BottomSheetFragment : BottomSheetDialogFragment(){

    private lateinit var binding:FragmentBottomSheetBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding=FragmentBottomSheetBinding.inflate(layoutInflater,container,false)

        binding.imageviewPaylas.setOnClickListener{
            Snackbar.make(it,"Paylaşıldı ! ",Snackbar.LENGTH_SHORT).show()
        }

        binding.imageviewcopy.setOnClickListener{
            Snackbar.make(it,"Kopyalandı ! ",Snackbar.LENGTH_SHORT).show()

        }
        return binding.root
    }
}