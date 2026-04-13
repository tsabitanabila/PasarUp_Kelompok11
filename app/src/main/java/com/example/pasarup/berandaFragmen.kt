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
        navProfile.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.frameLayout, ProfileFragment())
                .addToBackStack(null)
                .commit()
        }

        return view
    }
}