package com.bs.chat_server.service

import com.bs.chat_server.data.UserInfoDTO
import org.springframework.stereotype.Service

@Service
class RegistrationService {

    val hsmUUIDList : HashMap<String,String>? = null
    var userData : UserInfoDTO? = null

    fun getID(strUUID:String) {
        hsmUUIDList?: when(val strID = hsmUUIDList?.get(strUUID)){
            "" -> "없음"
            null -> "없음"
            else -> strID
        }
    }

    fun signIn(userInfo : UserInfoDTO){
        userData = userInfo
    }

    fun getUserInfo(strID:String):String {
        return userData?.strID + " "+ userData?.strName +" "+ userData?.strAge
    }

}