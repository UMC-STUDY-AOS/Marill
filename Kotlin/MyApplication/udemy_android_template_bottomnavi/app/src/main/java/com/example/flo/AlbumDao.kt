package com.example.flo

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface AlbumDao {

    @Insert
    fun insert(album: Album)

    @Update
    fun update(album: Album)

    @Delete
    fun delete(album: Album)

    @Query("select * from AlbumTable")
    fun getAlbums(): List<Album>

    @Query("select * from AlbumTable where id = :id")
    fun getAlbum(id: Int): Album
}