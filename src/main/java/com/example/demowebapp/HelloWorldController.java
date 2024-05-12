package com.example.demowebapp;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1")
public class HelloWorldController {
    @RequestMapping(method = RequestMethod.GET, path = "/helloWorld")
    public String helloworld() {
        return "Hello World!";
    }

    @GetMapping(path = "/ciaov/{id}")
    public User ciaov(
            @PathVariable long id,
            @RequestParam(required = true) String nome,
            @RequestParam(required = false, defaultValue = "") String cognome) {
        return new User(id, nome, cognome);
    }
}
