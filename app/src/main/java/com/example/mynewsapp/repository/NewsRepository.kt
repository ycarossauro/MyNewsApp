package com.example.mynewsapp.repository

import com.example.mynewsapp.db.ArticleDataBase
import com.example.mynewsapp.ui.api.RetrofitInstance

class NewsRepository(
    val db: ArticleDataBase
) {
    suspend fun getBreakingNews(countryCode: String, pageNumber: Int) =
        RetrofitInstance.api.getBreakingNews(countryCode, pageNumber)

    suspend fun searchNews(searchQuery: String, pageNumber: Int) =
        RetrofitInstance.api.searchForNews(searchQuery, pageNumber)
}
