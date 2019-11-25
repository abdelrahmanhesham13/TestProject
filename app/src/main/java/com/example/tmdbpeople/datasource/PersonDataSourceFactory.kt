package com.example.tmdbpeople.datasource

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.paging.DataSource
import androidx.paging.PageKeyedDataSource
import com.example.tmdbpeople.models.PersonModel
import com.example.tmdbpeople.networkutils.LoadCallback

class PersonDataSourceFactory(private val loadCallback: LoadCallback,private val requestType: String , private val query : String?) :
    DataSource.Factory<Int?, PersonModel?>() {
    val itemLiveDataSource =
        MutableLiveData<PageKeyedDataSource<Int?, PersonModel?>>()

    override fun create(): DataSource<Int?, PersonModel?> {
        val personDataSource = PersonDataSource(loadCallback)
        itemLiveDataSource.postValue(personDataSource)
        return personDataSource
    }

}