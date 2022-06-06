package br.com.zup.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.com.zup.myapplication.databinding.FragmentPrimeiroBinding
import br.com.zup.myapplication.databinding.FragmentSegundoBinding

class SegundoFragment : Fragment() {

    private lateinit var binding: FragmentSegundoBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentSegundoBinding.inflate(layoutInflater)
        val args = SegundoFragmentArgs.fromBundle(requireArguments())
        binding.resultado2.text = args.valorInt.toString() + args.valorBoolean
        return binding.root



    }
}