package com.example.nagivation_component_kullanimi_son

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.navigation.fragment.navArgs
import com.example.nagivation_component_kullanimi_son.databinding.FragmentDetayBinding
import com.google.android.material.snackbar.Snackbar


class DetayFragment : Fragment() {

    private lateinit var binding: FragmentDetayBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        binding=FragmentDetayBinding.inflate(layoutInflater,container,false)
        val bundle :DetayFragmentArgs by navArgs()
        val gelenAd=bundle.ad
        val gelenYas=bundle.yas
        val gelenBoy=bundle.boy
        val gelenBekarMi=bundle.bekarMi

        val urunId=bundle.urun.id
        val urunAdi=bundle.urun.ad


        binding.textView2.text="$gelenAd - $gelenYas - $gelenBoy - $gelenBekarMi - $urunId - $urunAdi"
        val backPress=object :OnBackPressedCallback(true){
            override fun handleOnBackPressed() {
                Snackbar.make(binding.textView2,"Geri Dönmek İstiyor musunuz ?",Snackbar.LENGTH_SHORT)
                    .setAction("Evet"){
                        isEnabled=false // Geri dönüş aktif
                        requireActivity().onBackPressedDispatcher.onBackPressed()
                    }.show()
            }
        }
        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner,backPress)
        return binding.root
    }

}