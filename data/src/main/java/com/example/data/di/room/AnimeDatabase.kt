package com.example.data.di.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.data.datastore.room.FavoritesDao
import com.example.data.dto.favorite.FavoritesDbModel

@Database(entities = [FavoritesDbModel::class], version = 1, exportSchema = false)
abstract class AnimeDatabase : RoomDatabase() {

    abstract fun favoritesDao(): FavoritesDao
}