package br.andrew.webhook.mongo

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController()
@RequestMapping("/")
class IndexController(val repository: Repository) {

    @GetMapping("")
    fun index() : String{
        return "index";
    }

    @PostMapping("")
    fun getWebHook(@RequestBody inputData : Map<String, Object>){
        repository.save(inputData)
    }
}