package com.learningspring.springbootlearning.controller;


import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//@Component  //so that it can eb identified as a component in the conatiner

//@Controller  //already includes the component annotation as well

@RestController //as we are making a RESTful API setup

public class HelloController {

    @RequestMapping(value="/", method= RequestMethod.GET)
    public String function1(){
        return "welcome to new york by taylor swift ";
    }
}
