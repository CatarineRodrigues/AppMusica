package br.com.zup.minhamusicafavorita.ui.home.view.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import br.com.zup.minhamusicafavorita.ui.album.view.AlbumFragment
import br.com.zup.minhamusicafavorita.ui.info.view.InfoFragment

class HomePagerAdapter(
    fragmentManager: FragmentManager,
    lifecycle: Lifecycle,
    private var listaTopicos: List<String>
) : FragmentStateAdapter(fragmentManager, lifecycle) {

    override fun getItemCount() = listaTopicos.size

    override fun createFragment(position: Int): Fragment {
        when (position) {
            0 -> return InfoFragment()
            1 -> return AlbumFragment()
        }
        return InfoFragment()
    }
}