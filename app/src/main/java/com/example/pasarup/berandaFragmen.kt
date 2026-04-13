package com.example.pasarup

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.fragment.app.Fragment

class BerandaFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_beranda, container, false)

        val navProfile = view.findViewById<LinearLayout>(R.id.navProfile)
        val navSearch = view.findViewById<LinearLayout>(R.id.navSearch)
        val navOrder = view.findViewById<LinearLayout>(R.id.navOrder)

        navProfile.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.frameLayout, ProfileFragment())
                .commit()
        }

        navSearch.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.frameLayout, search())
                .commit()
        }

        navOrder.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.frameLayout, pesanan())
                .commit()
        }

        return view
    }
}