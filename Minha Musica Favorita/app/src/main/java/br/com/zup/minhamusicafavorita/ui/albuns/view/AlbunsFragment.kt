package br.com.zup.minhamusicafavorita.ui.albuns.view

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import br.com.zup.minhamusicafavorita.*
import br.com.zup.minhamusicafavorita.databinding.FragmentFotosBinding
import br.com.zup.minhamusicafavorita.ui.albuns.view.adapter.AlbumAdapter
import br.com.zup.minhamusicafavorita.domain.model.Album
import br.com.zup.minhamusicafavorita.ui.albuns.AlbunsActivity

class AlbunsFragment : Fragment() {
    private lateinit var binding: FragmentFotosBinding
    private val albumAdapter: AlbumAdapter by lazy {
        AlbumAdapter(arrayListOf(), ::irParaDetalheAlbum)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFotosBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        adicionarItensListaAlbum()
        exibirRecyclerView()
    }

    private fun adicionarItensListaAlbum() {
        val listaNovaAlbum = mutableListOf<Album>()
        listaNovaAlbum.add(
            Album(
                ALBUM1_IMAGEM,
                ALBUM1_NOME_ALBUM,
                ALBUM1_DESCICAO_ALBUM,
                ALBUM1_ARTISTA,
                ALBUM1_LANCAMENTO,
                ALBUM1_GRAVADORA,
                ALBUM1_ESTUDIO,
                ALBUM1_FORMATO,
                ALBUM1_GENERO
            )
        )
        listaNovaAlbum.add(
            Album(
                ALBUM2_IMAGEM,
                ALBUM2_NOME_ALBUM,
                ALBUM2_DESCICAO_ALBUM,
                ALBUM2_ARTISTA,
                ALBUM2_LANCAMENTO,
                ALBUM2_GRAVADORA,
                ALBUM2_ESTUDIO,
                ALBUM2_FORMATO,
                ALBUM2_GENERO
            )
        )
        listaNovaAlbum.add(
            Album(
                ALBUM3_IMAGEM,
                ALBUM3_NOME_ALBUM,
                ALBUM3_DESCICAO_ALBUM,
                ALBUM3_ARTISTA,
                ALBUM3_LANCAMENTO,
                ALBUM3_GRAVADORA,
                ALBUM3_ESTUDIO,
                ALBUM3_FORMATO,
                ALBUM3_GENERO
            )
        )
        listaNovaAlbum.add(
            Album(
                ALBUM4_IMAGEM,
                ALBUM4_NOME_ALBUM,
                ALBUM4_DESCICAO_ALBUM,
                ALBUM4_ARTISTA,
                ALBUM4_LANCAMENTO,
                ALBUM4_GRAVADORA,
                ALBUM4_ESTUDIO,
                ALBUM4_FORMATO,
                ALBUM4_GENERO
            )
        )
        listaNovaAlbum.add(
            Album(
                ALBUM5_IMAGEM,
                ALBUM5_NOME_ALBUM,
                ALBUM5_DESCICAO_ALBUM,
                ALBUM5_ARTISTA,
                ALBUM5_LANCAMENTO,
                ALBUM5_GRAVADORA,
                ALBUM5_ESTUDIO,
                ALBUM5_FORMATO,
                ALBUM5_GENERO
            )
        )
        listaNovaAlbum.add(
            Album(
                ALBUM6_IMAGEM,
                ALBUM6_NOME_ALBUM,
                ALBUM6_DESCICAO_ALBUM,
                ALBUM6_ARTISTA,
                ALBUM6_LANCAMENTO,
                ALBUM6_GRAVADORA,
                ALBUM6_ESTUDIO,
                ALBUM6_FORMATO,
                ALBUM6_GENERO
            )
        )
        listaNovaAlbum.add(
            Album(
                ALBUM7_IMAGEM,
                ALBUM7_NOME_ALBUM,
                ALBUM7_DESCICAO_ALBUM,
                ALBUM7_ARTISTA,
                ALBUM7_LANCAMENTO,
                ALBUM7_GRAVADORA,
                ALBUM7_ESTUDIO,
                ALBUM7_FORMATO,
                ALBUM7_GENERO
            )
        )
        listaNovaAlbum.add(
            Album(
                ALBUM8_IMAGEM,
                ALBUM8_NOME_ALBUM,
                ALBUM8_DESCICAO_ALBUM,
                ALBUM8_ARTISTA,
                ALBUM8_LANCAMENTO,
                ALBUM8_GRAVADORA,
                ALBUM8_ESTUDIO,
                ALBUM8_FORMATO,
                ALBUM8_GENERO
            )
        )
        listaNovaAlbum.add(
            Album(
                ALBUM9_IMAGEM,
                ALBUM9_NOME_ALBUM,
                ALBUM9_DESCICAO_ALBUM,
                ALBUM9_ARTISTA,
                ALBUM9_LANCAMENTO,
                ALBUM9_GRAVADORA,
                ALBUM9_ESTUDIO,
                ALBUM9_FORMATO,
                ALBUM9_GENERO
            )
        )
        albumAdapter.atualizarListaAlbum(listaNovaAlbum)
    }

    private fun exibirRecyclerView() {
        binding.rvListaAlbums.adapter = albumAdapter
        binding.rvListaAlbums.layoutManager = GridLayoutManager(context, 2)
    }

    private fun irParaDetalheAlbum(album: Album) {
        val intent = Intent(context, AlbunsActivity::class.java).apply {
            putExtra(ALBUM_KEY, album)
        }
        startActivity(intent)
    }
}