package com.example.flo

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface SongDao {
    @Insert
    fun insert(song: Song)

    @Update
    fun update(song: Song)

    @Delete
    fun delete(song: Song)

    @Query("select * from SongTable")
    fun getSongs(): List<Song>

    @Query("select * from SongTable where id= :id")
    fun getSong(id: Int): Song

    @Query("update songtable set isLike= :isLike where id = :id")
    fun updateIsLikeById(isLike: Boolean, id: Int)
}