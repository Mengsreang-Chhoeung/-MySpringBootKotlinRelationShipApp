package com.cubetiqs.relationshipapp

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/")
class TestController {

    @GetMapping
    fun testPage(): String {
        return "<h1 align='center'>Hello Test Page</h1>"
    }

}