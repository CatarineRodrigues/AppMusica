package br.com.zup.minhamusicafavorita.ui.home.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.zup.minhamusicafavorita.databinding.ActivityHomeBinding
import br.com.zup.minhamusicafavorita.ui.detail.view.ViewPagerActivity

class HomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnDetalhes.setOnClickListener {
            val intent = Intent(this, ViewPagerActivity::class.java)
            startActivity(intent)
        }
    }
}