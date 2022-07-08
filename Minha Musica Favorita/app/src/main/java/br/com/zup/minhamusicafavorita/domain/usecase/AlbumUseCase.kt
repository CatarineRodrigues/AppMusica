import android.app.Application
import br.com.zup.minhamusicafavorita.domain.model.Album
import br.com.zup.minhamusicafavorita.ui.viewstate.ViewState

class AlbumUseCase(application: Application) {
    private val albumDao = AlbumDatabase.getDatabase(application).albumDao()
    private val albumRepository = AlbumRepository(albumDao)

    suspend fun getAllAlbums(): ViewState<List<Album>> {
        return try {
            val listAlbum = albumRepository.getAllAlbums()
            ViewState.Success(listAlbum)
        } catch (ex: Exception) {
            ViewState.Error(Exception("Não foi possível carregar a lista de filmes!"))
        }
    }

    suspend fun insertAlbum(album: Album): ViewState<Album> {
        return try {
            albumRepository.insertAlbum(album)
            ViewState.Success(album)
        } catch (ex: Exception) {
            ViewState.Error(Exception("Não foi possível inserir o filme!"))
        }
    }
}