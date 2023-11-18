package com.hypheno.borutoapp.domain.use_cases

import com.hypheno.borutoapp.data.repository.Repository
import com.hypheno.borutoapp.domain.model.Hero

class GetSelectedHeroUseCase(
    private val repository: Repository
) {
    suspend operator fun invoke(heroId: Int): Hero {
        return repository.getSelectedHero(heroId = heroId)
    }
}