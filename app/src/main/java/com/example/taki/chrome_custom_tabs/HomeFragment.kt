package com.example.taki.chrome_custom_tabs

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.taki.chrome_custom_tabs.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.simpleButton.setOnClickListener {
            requireActivity().startActivity(
                Intent(
                    requireActivity(),
                    SimpleCustomTabActivity::class.java
                )
            )
        }

        binding.navToChromeCustomTab.setOnClickListener {
            findNavController().navigate(
                HomeFragmentDirections.navigateToCustomTabs("https://my.au.com/rd/entertainment")
            )
        }
    }
}