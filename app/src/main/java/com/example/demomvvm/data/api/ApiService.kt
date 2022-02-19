package com.example.demomvvm.data.api

import com.example.demomvvm.data.model.User
import io.reactivex.Single

interface ApiService {

    fun getUsers(): Single<List<User>>

}