package com.example.tmdbpeople.dagger.modules

import com.example.tmdbpeople.views.adapters.PersonAdapter
import dagger.Module
import dagger.Provides

@Module
class OnItemClickModule(var onItemClicked: PersonAdapter.OnItemClicked) {

    @Provides
    fun provideOnItemClicked(): PersonAdapter.OnItemClicked {
        return onItemClicked
    }

}