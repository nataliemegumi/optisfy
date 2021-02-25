package com.nataliexmg.optisfy.controller;

import com.nataliexmg.optisfy.service.service;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/helloWorld")
public class controller {

    @GetMapping("/greeting")
    public String helloWorldMethod(){
        return service.doMagic();
    }

}


