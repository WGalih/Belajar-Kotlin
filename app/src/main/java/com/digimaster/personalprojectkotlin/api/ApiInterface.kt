package com.digimaster.personalprojectkotlin.api

import com.digimaster.personalprojectkotlin.model.LoginResponseModel
import io.reactivex.Single
import retrofit2.Call
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

interface ApiInterface {
    @GET("user/login")
    fun login(
        @Query("email") email: String,
        @Query("password") password: String): Single<LoginResponseModel>

    @FormUrlEncoded
    @POST("user/register")
    fun register(
        @Query("email") email: String, @Query("name") name: String,
        @Query("address") address: String, @Query("dob") dob: String,
        @Query("password") password: String
    ): Single<LoginResponseModel>
}