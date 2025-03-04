package com.example.mynewsapp.ui.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.mynewsapp.R
import com.example.mynewsapp.ui.NewsActivity
import com.example.mynewsapp.ui.viewModels.NewsViewModel

// The Fragments needs to inherit from FRAGMENT
class BreakingNewsFragment : Fragment(R.layout.fragment_breaking_news) {

    private lateinit var viewModel: NewsViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = (activity as NewsActivity).viewModel
    }

}