package com.learn.daggerexamplefakeapi.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.learn.daggerexamplefakeapi.models.Products

@Database(entities = [Products::class], version = 1)
abstract class FakerDB: RoomDatabase() {

    abstract fun getFakerDAO(): FakerDAO

}