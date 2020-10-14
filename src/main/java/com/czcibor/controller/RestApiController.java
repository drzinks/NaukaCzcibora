package com.czcibor.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api")
public class RestApiController {

    @RequestMapping(value="/welcome", method = RequestMethod.GET)
    public String getMessage(){
        return "Pierwsza rest api napisana przez Czcibora!";
    }

}
