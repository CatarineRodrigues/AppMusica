package br.com.zup.minhamusicafavorita.ui.info.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import br.com.zup.minhamusicafavorita.databinding.FragmentInformacoesBinding

class InfoFragment : Fragment() {
    private lateinit var binding: FragmentInformacoesBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentInformacoesBinding.inflate(inflater, container, false)
        return binding.root
    }
}