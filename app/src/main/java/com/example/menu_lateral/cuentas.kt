package com.example.menu_lateral

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import com.example.menu_lateral.databinding.AppBarMainBinding
import com.example.menu_lateral.databinding.FragmentCuentasBinding


class cuentas : Fragment() {

    private var _binding: FragmentCuentasBinding? = null
  
    private val binding get() = _binding!!



    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?



    ): View? {
        _binding = FragmentCuentasBinding.inflate(inflater, container, false)
        val view = binding.root




        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val lic = view.findViewById<Button>(R.id.licenciaturabtn)
        val doc = view.findViewById<Button>(R.id.doctoradobtn)
        val posg = view.findViewById<Button>(R.id.posgradobtn)
        val back = view.findViewById<Button>(R.id.backtrap)
        back.setOnClickListener {
            val fr = activity?.supportFragmentManager?.beginTransaction()
            fr?.replace(R.id.contenedordefragmentos, prueba())
            fr?.commit()



        }
        lic.setOnClickListener {

            val fr = activity?.supportFragmentManager?.beginTransaction()
            fr?.replace(R.id.contenedordefragmentos, licenciatura())
            Toast.makeText(activity, "Licenciatura", Toast.LENGTH_SHORT).show()
            fr?.commit()



        }
        doc.setOnClickListener {
            val fr = activity?.supportFragmentManager?.beginTransaction()
            fr?.replace(R.id.contenedordefragmentos, maestria_doc())
            Toast.makeText(activity, "Maestria y Doctorado", Toast.LENGTH_SHORT).show()
            fr?.commit()
        }
        posg.setOnClickListener {
            val fr = activity?.supportFragmentManager?.beginTransaction()
            fr?.replace(R.id.contenedordefragmentos, posgrado())
            Toast.makeText(activity, "Posgrado", Toast.LENGTH_SHORT).show()
            fr?.commit()
        }


    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}










