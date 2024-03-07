package com.tech.multimodule

import android.app.Application
import com.tech.data.BaseRepository
import com.tech.domain.Repository
import com.tech.presentation.MainViewModel
import com.tech.presentation.ProvideViewModel

class MultiModuleApp : Application(), ProvideViewModel {

    private lateinit var viewModel: MainViewModel
    override fun onCreate() {
        super.onCreate()
        val repository: Repository = BaseRepository()
        viewModel = MainViewModel(repository)
    }

    override fun viewModel(): MainViewModel {
        return viewModel
    }
}