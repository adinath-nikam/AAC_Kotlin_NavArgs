package com.adinath.kotlin_navargs

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.adinath.kotlin_navargs.databinding.FragmentFirstBinding

class FragmentFirst : Fragment() {

    private lateinit var binding: FragmentFirstBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {
            idBtSend.setOnClickListener {
                val direction = FragmentFirstDirections.actionFragmentFirstToFragmentSecond(idEtName.text.toString(), idEtAge.text.toString())
                findNavController().navigate(direction)
            }
        }
    }

}