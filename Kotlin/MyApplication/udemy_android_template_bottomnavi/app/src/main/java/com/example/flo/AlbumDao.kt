package com.example.flo

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface AlbumDao {

    @Insert
    fun insert(album: Album)

    @Query("select * from AlbumTable")
    fun getAlbums(): List<Album>

    @Insert
    fun likeAlbum(like: Like)

    @Query("select id from LikeTable where userId = :userId and albumId =:albumId")
    fun isLikedAlbum(userId: Int, albumId: Int): Int?

    @Query("delete from LikeTable where userId = :userId and albumId =:albumId")
    fun disLikedAlbum(userId: Int, albumId: Int)

    @Query("select at.* from LikeTable as lt left join AlbumTable as at on lt.albumId = at.id where lt.userId = :userId")
    fun getLikedAlbums(userId: Int): List<Album>
}