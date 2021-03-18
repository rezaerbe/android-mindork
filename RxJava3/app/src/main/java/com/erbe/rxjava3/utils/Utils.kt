package com.erbe.rxjava3.utils

import com.erbe.rxjava3.model.ApiUser
import com.erbe.rxjava3.model.User
import java.util.*

object Utils {

    fun getApiUserList(): List<ApiUser> {

        val apiUserList = ArrayList<ApiUser>()

        val apiUserOne = ApiUser(firstname = "Amit", lastname = "Shekhar")
        apiUserList.add(apiUserOne)

        val apiUserTwo = ApiUser(firstname = "Janishar", lastname = "Ali")
        apiUserList.add(apiUserTwo)

        val apiUserThree = ApiUser(firstname = "Anand", lastname = "Gaurav")
        apiUserList.add(apiUserThree)

        return apiUserList
    }


    fun getUserListWhoLovesCricket(): List<User> {

        val userList = ArrayList<User>()

        val userOne = User(id = 1, firstname = "Amit", lastname = "Shekhar")
        userList.add(userOne)

        val userTwo = User(id = 2, firstname = "Janishar", lastname = "Ali")
        userList.add(userTwo)

        return userList
    }


    fun getUserListWhoLovesFootball(): List<User> {

        val userList = ArrayList<User>()

        val userOne = User(id = 1, firstname = "Amit", lastname = "Shekhar")
        userList.add(userOne)

        val userTwo = User(id = 3, firstname = "Janishar", lastname = "Ali")
        userList.add(userTwo)

        return userList
    }

    fun convertApiUserListToUserList(apiUserList: List<ApiUser>): List<User> {

        val userList = ArrayList<User>()

        for (apiUser in apiUserList) {
            val user = User(apiUser.id, apiUser.firstname, apiUser.lastname)
            userList.add(user)
        }

        return userList
    }

    fun filterUserWhoLovesBoth(cricketFans: List<User>, footballFans: List<User>): List<User> {
        val userWhoLovesBoth = ArrayList<User>()

        for (footballFan in footballFans) {
            if (cricketFans.contains(footballFan)) {
                userWhoLovesBoth.add(footballFan)
            }
        }

        return userWhoLovesBoth
    }
}
