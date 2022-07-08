package br.com.zup.minhamusicafavorita.domain.model

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize

@Parcelize
@Entity(tableName = "albuns")
data class Album(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "cod_album")
    var codAlbum: Long = 1,

    @ColumnInfo(name = "imagem")
    private var imagem: Int,

    @ColumnInfo(name = "album")
    private var nomeAlbum: String,

    @ColumnInfo(name = "descricao")
    private var descricaoAlbum: String,

    @ColumnInfo(name = "artista")
    private var artista: String,

    @ColumnInfo(name = "lancamento")
    private var lancamento: Int,

    @ColumnInfo(name = "gravadora")
    private var gravadora: String,

    @ColumnInfo(name = "estudio")
    private var estudio: String,

    @ColumnInfo(name = "formato")
    private var formato: String,

    @ColumnInfo(name = "genero")
    private var genero: String,

    @ColumnInfo(name = "favoritado")
    var isFavorite: Boolean = false

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