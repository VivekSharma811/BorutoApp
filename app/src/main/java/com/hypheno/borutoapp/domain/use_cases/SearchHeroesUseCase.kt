package com.hypheno.borutoapp.domain.use_cases

import androidx.paging.PagingData
import com.hypheno.borutoapp.data.repository.Repository
import com.hypheno.borutoapp.domain.model.Hero
import kotlinx.coroutines.flow.Flow

class SearchHeroesUseCase(
    private val repository: Repository
) {
    operator fun invoke(query: String): Flow<PagingData<Hero>> {
        return repository.searchHeroes(query = query)
    }
}