package com.zendron.service

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

@RequestMapping
class Hello {

    @GetMapping("/hello")
    fun hello(): String {
        return "Ola Mundo"
    }

}