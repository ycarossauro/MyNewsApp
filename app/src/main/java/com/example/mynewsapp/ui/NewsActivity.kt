package com.example.mynewsapp.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.example.mynewsapp.R
import com.example.mynewsapp.db.ArticleDataBase
import com.example.mynewsapp.repository.NewsRepository
import com.example.mynewsapp.ui.viewModels.NewsViewModel
import com.example.mynewsapp.ui.viewModels.NewsViewModelProvideFactory
import com.google.android.material.bottomnavigation.BottomNavigationView

class NewsActivity : AppCompatActivity() {

    lateinit var viewModel: NewsViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news)

        val newsRepository = NewsRepository(ArticleDataBase(this))
        val viewModelProvideFactory = NewsViewModelProvideFactory(newsRepository)
        viewModel = ViewModelProvider(this, viewModelProvideFactory)[NewsViewModel::class.java]

        // Find the BottomNavigationView
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigationView)
        // Find the NavHostFragment
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.newsNavHostFragment) as NavHostFragment
        // Get the NavController from the NavHostFragment
        val navController = navHostFragment.navController
        // Find the NavHostFragment
        bottomNavigationView.setupWithNavController(navController)
    }
}