package com.example.mynewsapp.ui.viewModels

import androidx.lifecycle.ViewModel
import com.example.mynewsapp.repository.NewsRepository

class NewsViewModel(
    val newsRepository: NewsRepository
) : ViewModel() {

}