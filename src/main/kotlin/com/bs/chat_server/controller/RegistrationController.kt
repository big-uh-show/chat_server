package com.bs.chat_server.controller

import com.bs.chat_server.data.UserInfoDTO
import com.bs.chat_server.service.RegistrationService
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/hi")
class RegistrationController(val registrationService : RegistrationService) {

    @GetMapping("/getUserInfo")
    fun getUserInfo(@RequestParam(required =  true) strID:String): ResponseEntity<String> {
        return ResponseEntity<String>(registrationService.getUserInfo(strID), HttpStatus.OK)
    }

    @PutMapping("/registration")
    fun registration(@RequestBody(required =  true) userInfo:UserInfoDTO): ResponseEntity<String> {
        registrationService.signIn(userInfo)
        return ResponseEntity<String>("RegistrationComplete!", HttpStatus.OK)
    }
}