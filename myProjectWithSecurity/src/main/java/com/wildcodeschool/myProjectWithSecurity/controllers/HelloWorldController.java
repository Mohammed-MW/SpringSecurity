package com.wildcodeschool.myProjectWithSecurity.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/")
    public String welcome() {
        return ("Welcome to the SHIELD <a href=\\avengers/assemble>Are you a champ ?</a> <a href=\\secret-bases>Nick its you ??</a> <a href=\\logout>Log Out<a>");
    }

    @GetMapping("/avengers/assemble")

    public String assemble() {

        return "Avengers... Assemble <a href=\\>Go home</a> <a href=\\logout>Log Out</a>";

    }
    @GetMapping("/secret-bases")

    public String secret() {

        return "Avengers... Assemble <a href=\\>Go home</a> <a href=\\logout>Log Out</a>";

    }
}
