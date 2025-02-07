package com.example.features.authentication.registration.data.mappers

import com.example.core.data.database.model.UserDbModel
import com.example.core.data.model.User

fun mapDbModelToModel(dbModel: UserDbModel): User =
    User(
        id = dbModel.id,
        nickname = dbModel.nickname,
        password = dbModel.password,
        confirmWord = dbModel.confirmWord
    )

fun mapModelToDbModel(user: User): UserDbModel =
    UserDbModel(
        id = user.id,
        nickname = user.nickname,
        password = user.password,
        confirmWord = user.confirmWord
    )