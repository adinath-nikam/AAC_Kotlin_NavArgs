package com.adinath.kotlin_navargs

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.adinath.kotlin_navargs.databinding.FragmentSecondBinding

class FragmentSecond : Fragment() {

    private lateinit var binding: FragmentSecondBinding

    private val args: FragmentSecondArgs by navArgs()

    private var name: String = ""

    private var age: String = ""

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {
            name = args.argName
            age = args.argAge
            idTvName.text = name
            idTvAge.text = age.toString()
        }
    }

}