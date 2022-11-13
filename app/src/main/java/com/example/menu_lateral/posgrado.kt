package com.example.menu_lateral

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.menu_lateral.databinding.FragmentPosgradoBinding

class posgrado : Fragment() {

    private var _binding: FragmentPosgradoBinding? = null
    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentPosgradoBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val back = view.findViewById<Button>(R.id.backtrap3)
        back.setOnClickListener {
            val fr = activity?.supportFragmentManager?.beginTransaction()
            fr?.replace(R.id.contenedordefragmentos, prueba())
            fr?.commit()

        }
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
