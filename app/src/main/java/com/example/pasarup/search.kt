package com.example.pasarup

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.fragment.app.Fragment

class search : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_search, container, false)

        view.findViewById<LinearLayout>(R.id.navHome)?.setOnClickListener {
            parentFragmentManager.beginTransaction().replace(R.id.frameLayout, BerandaFragment()).commit()
        }
        view.findViewById<LinearLayout>(R.id.navOrder)?.setOnClickListener {
            parentFragmentManager.beginTransaction().replace(R.id.frameLayout, pesanan()).commit()
        }
        view.findViewById<LinearLayout>(R.id.navProfile)?.setOnClickListener {
            parentFragmentManager.beginTransaction().replace(R.id.frameLayout, ProfileFragment()).commit()
        }

        return view
    }
}