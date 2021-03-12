package com.jpop.learning.dockerhelloworld.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/")
public class TestResources {

    @GetMapping("hello-world")
    public String getHello(){
        return "Hello World!";
    }

}
