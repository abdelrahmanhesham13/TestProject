package com.example.tmdbpeople.dagger.component

import com.example.tmdbpeople.dagger.modules.ContextModule
import com.example.tmdbpeople.dagger.modules.OnItemClickModule
import com.example.tmdbpeople.views.activities.PopularPersonsActivity
import com.example.tmdbpeople.views.activities.SearchPersonsActivity
import com.example.tmdbpeople.views.adapters.PersonAdapter
import dagger.Component

@Component(modules = [ContextModule::class, OnItemClickModule::class])
interface PersonAdapterComponent {

    fun getPersonAdapter() : PersonAdapter

}