package com.study.Feign.controller;


import com.study.Feign.model.User;
import com.study.Feign.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ComsumeController {
    @Autowired
    HelloService helloService;


    @RequestMapping(value = "/feign-consumer",method = RequestMethod.GET)
    public String helloConsumer(){

        return  helloService.hello();

    }
    @RequestMapping(value = "/feign-consumer1",method = RequestMethod.GET)
    public String helloConsumer1(){
       StringBuilder str= new StringBuilder();
       str.append(helloService.hello3(new User("aaaa",111)));
       //append(helloService.hello1("aaa")).append(helloService.hello2("aaaaa",11)).
        return str.toString();

    }






}
