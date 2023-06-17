package com.example.test4.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test")
    public String test(){
        String testStr = "Hi~~!";
        System.out.println(testStr);

        String testNum = "1234~~";
        System.out.println(testNum);

        return testNum;
    }


}
