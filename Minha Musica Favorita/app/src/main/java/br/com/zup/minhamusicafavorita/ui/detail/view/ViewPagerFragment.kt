package br.com.zup.minhamusicafavorita.ui.detail.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.com.zup.minhamusicafavorita.R
import br.com.zup.minhamusicafavorita.databinding.FragmentInfoBinding
import br.com.zup.minhamusicafavorita.databinding.FragmentViewPagerBinding
import br.com.zup.minhamusicafavorita.ui.home.view.adapter.HomePagerAdapter
import com.google.android.material.tabs.TabLayoutMediator

class ViewPagerFragment : Fragment() {

    private lateinit var binding: FragmentViewPagerBinding
    private val listaTopicos = listOf("Informações", "Álbuns")

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding = FragmentViewPagerBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        (activity as ViewPagerActivity).supportActionBar?.title = getString(R.string.detalhe_da_banda)
        exibirViewPagerTabLayout()
    }

    private fun exibirViewPagerTabLayout() {
        val homePagerAdapter =
            HomePagerAdapter((activity as ViewPagerActivity).supportFragmentManager,
                lifecycle,
                listaTopicos)
        binding.vpDetalhe.adapter = homePagerAdapter
        TabLayoutMediator(binding.tlDetalhe, binding.vpDetalhe) { tab, position ->
            tab.text = listaTopicos[position]
        }.attach()
    }
}