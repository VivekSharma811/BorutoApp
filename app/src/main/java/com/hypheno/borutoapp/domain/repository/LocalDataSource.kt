package com.hypheno.borutoapp.domain.repository

import com.hypheno.borutoapp.domain.model.Hero

interface LocalDataSource {
    suspend fun getSelectedHero(heroId: Int): Hero
}