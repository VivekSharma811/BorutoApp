package com.hypheno.borutoapp.data.repository

import com.hypheno.borutoapp.data.local.BorutoDatabase
import com.hypheno.borutoapp.domain.model.Hero
import com.hypheno.borutoapp.domain.repository.LocalDataSource

class LocalDataSourceImpl(borutoDatabase: BorutoDatabase): LocalDataSource {

    private val heroDao = borutoDatabase.heroDao()

    override suspend fun getSelectedHero(heroId: Int): Hero {
        return heroDao.getSelectedHero(heroId = heroId)
    }
}