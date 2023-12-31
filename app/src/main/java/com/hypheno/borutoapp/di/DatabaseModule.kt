package com.hypheno.borutoapp.di

import android.content.Context
import androidx.room.Room
import com.hypheno.borutoapp.data.local.BorutoDatabase
import com.hypheno.borutoapp.data.repository.LocalDataSourceImpl
import com.hypheno.borutoapp.domain.repository.LocalDataSource
import com.hypheno.borutoapp.util.Constants.BORUTO_DATABASE
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Named
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Provides
    @Singleton
    @Named("main_db")
    fun provideDatabase(
        @ApplicationContext context: Context
    ) = Room.databaseBuilder(
        context,
        BorutoDatabase::class.java,
        BORUTO_DATABASE
    ).build()

    @Provides
    @Singleton
    fun provideLocalDataSource(
        @Named("main_db") database: BorutoDatabase
    ): LocalDataSource {
        return LocalDataSourceImpl(
            borutoDatabase = database
        )
    }

}