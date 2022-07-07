package br.com.zup.minhamusicafavorita.ui.detail.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import br.com.zup.minhamusicafavorita.R
import br.com.zup.minhamusicafavorita.databinding.ActivityDetalhesBinding
import br.com.zup.minhamusicafavorita.ui.home.view.adapter.HomePagerAdapter
import com.google.android.material.tabs.TabLayoutMediator

class ViewPagerActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetalhesBinding
    private val listaTopicos = listOf("Informações", "Álbuns")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetalhesBinding.inflate(layoutInflater)
        setContentView(binding.root)
        acessarActionBar()
        exibirViewPagerTabLayout()
    }

    private fun exibirViewPagerTabLayout() {
        val homePagerAdapter =
            HomePagerAdapter(supportFragmentManager, lifecycle, listaTopicos)
        binding.vpDetalhe.adapter = homePagerAdapter
        TabLayoutMediator(binding.tlDetalhe, binding.vpDetalhe) { tab, position ->
            tab.text = listaTopicos[position]
        }.attach()
    }

    private fun acessarActionBar() {
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setTitle(R.string.detalhe_da_banda)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home) {
            this.onBackPressed()
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}