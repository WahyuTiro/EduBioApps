package com.wahyu.biosisko

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_home.view.*

class HomeFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view: View = inflater.inflate(R.layout.fragment_home, container, false)

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.btnPendahuluan.setOnClickListener {
            val intent = Intent (context, MenuKIKDActivity::class.java)
            context?.startActivity(intent)
        }

        view.btnMateri.setOnClickListener {
            val intent = Intent (context, MenuMateriActivity::class.java)
            context?.startActivity(intent)
        }

        view.btnEvaluasi.setOnClickListener {
            val intent = Intent (context, EvaluasiActivity::class.java)
            context?.startActivity(intent)
        }

        view.btnVideo.setOnClickListener {
            val intent = Intent (context, MenuVideoActivity::class.java)
            context?.startActivity(intent)
        }

        view.btnPetunjuk.setOnClickListener {
            val intent = Intent(context, PetunjukActivity::class.java)
            context?.startActivity(intent)
        }
        
        view.btnProfil.setOnClickListener {
            val intent = Intent(context, ProfilActivity::class.java)
            context?.startActivity(intent)
        }
    }
}
