package com.hypheno.borutoapp.di

import android.content.Context
import androidx.room.Room
import com.hypheno.borutoapp.data.local.BorutoDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Named
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)

object DatabaseModuleTest {

    @Provides
    @Singleton
    @Named("test_db")
    fun provideTestDb(@ApplicationContext context: Context): BorutoDatabase {
        return Room.inMemoryDatabaseBuilder(context, BorutoDatabase::class.java).allowMainThreadQueries().build()
    }
}