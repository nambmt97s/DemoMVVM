package com.example.demomvvm.data.repository

import com.example.demomvvm.data.api.ApiHelper
import com.example.demomvvm.data.model.User
import io.reactivex.Single

class MainRepository(private val apiHelper: ApiHelper) {

    fun getUsers(): Single<List<User>> {
        return apiHelper.getUsers()
    }
}
