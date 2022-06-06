package br.com.zup.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import br.com.zup.myapplication.databinding.ActivityMainBinding
import br.com.zup.myapplication.databinding.FragmentPrimeiroBinding


class PrimeiroFragment : Fragment() {
    private lateinit var binding: FragmentPrimeiroBinding
    override fun onCreateView( inflater: LayoutInflater, container: ViewGroup?,
                                savedInstanceState: Bundle?): View? {

        binding = FragmentPrimeiroBinding.inflate(layoutInflater)

        binding.bSegundoFragment.setOnClickListener { view : View ->
            val campoUm = binding.etUm.text.toString().toBoolean()
            val campoDois = binding.etDois.text.toString().toInt()

            view.findNavController().navigate(PrimeiroFragmentDirections.actionPrimeiroFragmentToSegundoFragment(campoDois,campoUm))
        }
        return binding.root
    }

}