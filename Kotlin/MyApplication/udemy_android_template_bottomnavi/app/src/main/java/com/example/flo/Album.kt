package com.example.flo

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey
import androidx.room.Relation

//@Entity(tableName = "AlbumTable",
//    foreignKeys = [
//        ForeignKey(
//            entity = Song::class,
//            parentColumns = ["id"],
//            childColumns = ["albumIdx"]
//        )
//    ])
@Entity(tableName = "AlbumTable")
data class Album(
    @PrimaryKey(autoGenerate = false) var id: Int = 0,
    var title: String? = "",
    var singer: String? = "",
    var coverImg: Int? = null,
//    @Relation(
//        parentColumn = "id",
//        entityColumn = "albumIdx"
//    )
//    var songs: List<Song>? = null
)