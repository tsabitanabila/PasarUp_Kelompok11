package com.example.pasarup

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.fragment.app.Fragment

class LoginFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_login, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val email = view.findViewById<EditText>(R.id.etEmail)
        val password = view.findViewById<EditText>(R.id.etPassword)
        val btnLogin = view.findViewById<Button>(R.id.btnLogin)
        val txtRegister = view.findViewById<TextView>(R.id.txtRegister)

        btnLogin.setOnClickListener {
            val isiEmail = email.text.toString()
            val isiPassword = password.text.toString()

            if (isiEmail.isEmpty() || isiPassword.isEmpty()) {
                Toast.makeText(requireContext(), "Isi semua data!", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(requireContext(), "Login Berhasil", Toast.LENGTH_SHORT).show()
                parentFragmentManager.beginTransaction()
                    .replace(R.id.frameLayout, BerandaFragment())
                    .commit()
            }
        }

        txtRegister.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.frameLayout, RegisterFragment())
                .addToBackStack(null)
                .commit()
        }
    }
}