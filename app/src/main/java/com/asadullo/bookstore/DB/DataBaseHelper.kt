package com.asadullo.bookstore.DB

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.asadullo.bookstore.Models.Users

@Database(entities = [Users::class], version = 1)
abstract class DataBaseHelper:RoomDatabase() {
    abstract fun dao(): DataBaseInterface

    companion object{
        var instance: DataBaseHelper? = null

        @Synchronized
        fun getIns(context: Context): DataBaseHelper {

            if (instance == null){
                instance = Room.databaseBuilder(
                    context,
                    DataBaseHelper::class.java,
                    "my_db"
                )
                    .fallbackToDestructiveMigration()
                    .allowMainThreadQueries()
                    .build()
            }

            return instance!!
        }
    }
}