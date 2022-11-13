package com.example.menu_lateral

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.menu_lateral.databinding.ActivityMainBinding
import com.example.menu_lateral.databinding.FragmentPruebaBinding

class prueba : Fragment() {

    private var _binding: FragmentPruebaBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentPruebaBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val lic = view.findViewById<Button>(R.id.licenciaturabtn)
        val doc = view.findViewById<Button>(R.id.doctoradobtn)
        val posg = view.findViewById<Button>(R.id.posgradobtn)
        val back = view.findViewById<Button>(R.id.backtrap4)
        back.setOnClickListener {
            val fr = activity?.supportFragmentManager?.beginTransaction()
            fr?.replace(R.id.contenedordefragmentos, info_Aalumnos())
            fr?.commit()
        }
        lic.setOnClickListener {
            val fr = activity?.supportFragmentManager?.beginTransaction()
            fr?.replace(R.id.contenedordefragmentos, licenciatura())
            fr?.commit()
        }
        doc.setOnClickListener {
            val fr = activity?.supportFragmentManager?.beginTransaction()
            fr?.replace(R.id.contenedordefragmentos, posgrado())
            fr?.commit()
        }
        posg.setOnClickListener {
            val fr = activity?.supportFragmentManager?.beginTransaction()
            fr?.replace(R.id.contenedordefragmentos,posgrado())
            fr?.commit()
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}