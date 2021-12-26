class PlayListImpl : Playlist {
    private var listOfSongs = mutableListOf<Song>()

    override fun addSong(song: Song) {
        listOfSongs.add(song)
    }

    override fun addAlbum(album: Album) {
        listOfSongs.addAll(album.songs)
    }

    override fun shuffle() {
        listOfSongs.shuffle()
    }

    override fun toString(): String {
        return listOfSongs.toString()
    }
}