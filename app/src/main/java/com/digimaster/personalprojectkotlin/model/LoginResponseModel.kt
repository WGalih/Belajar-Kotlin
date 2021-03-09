package com.digimaster.personalprojectkotlin.model

data class LoginResponseModel (
    // static final = val
    val status: String,
    val userModel: UserModel
)