package br.com.zup.minhamusicafavorita.ui.home.view.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import br.com.zup.minhamusicafavorita.ui.albuns.view.AlbunsFragment
import br.com.zup.minhamusicafavorita.ui.informacoes.view.InformacoesFragment

class DetalhesPagerAdapter(
    fragmentManager: FragmentManager,
    lifecycle: Lifecycle,
    private var listaTopicos: List<String>
) : FragmentStateAdapter(fragmentManager, lifecycle) {

    override fun getItemCount() = listaTopicos.size

    override fun createFragment(position: Int): Fragment {
        when (position) {
            0 -> return InformacoesFragment()
            1 -> return AlbunsFragment()
        }
        return InformacoesFragment()
    }
}