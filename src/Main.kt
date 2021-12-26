fun main()
{
    val song1 = Song("First", SongGenre.RAP, Artist("First_Artist"))
    val song2 = Song("Second", SongGenre.ROCK, Artist("Second_Artist"))
    val song3 = Song("Third", SongGenre.CLASSICAL, Artist("Third"))
    val song4 = Song("Fourth", SongGenre.BLUES, Artist("Fourth"))
    val album1 = Album("Album1", songs = listOf(song1,song2))
    val album2 = Album("Album2", songs = listOf(song3,song4,song3,song4))

    val playList = PlayListImpl()
    // add songs to play ist
    playList.addSong(song1)
    playList.addSong(song2)
    // add albums to playlist
    playList.addAlbum(album1)
    playList.addAlbum(album2)
    playList.shuffle()
    println(playList.toString())
    playList.shuffle()
    println(playList.toString())

}