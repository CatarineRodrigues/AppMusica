package br.com.zup.minhamusicafavorita.domain.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class Album(
    private var imagem: Int,
    private var nomeAlbum: String,
    private var descricaoAlbum: String,
    private var artista: String,
    private var lancamento: Int,
    private var gravadora: String,
    private var estudio: String,
    private var formato: String,
    private var genero: String
) : Parcelable {
    fun getImagem() = this.imagem
    fun getNomeAlbum() = this.nomeAlbum
    fun getDescricaoAlbum() = this.descricaoAlbum
    fun getArtista() = this.artista
    fun getLancamento() = this.lancamento
    fun getGravadora() = this.gravadora
    fun getEstudio() = this.estudio
    fun getFormato() = this.formato
    fun getGenero() = this.genero
}