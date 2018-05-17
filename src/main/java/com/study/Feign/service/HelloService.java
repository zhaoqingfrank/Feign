package com.study.Feign.service;


import com.study.Feign.model.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient("hello-service")
public interface HelloService {


    @RequestMapping(value="/hello",method = RequestMethod.GET)
    public String hello();


    @RequestMapping(value="/hello1",method = RequestMethod.GET)
    public String hello1( @RequestParam("name") String name);
    @RequestMapping(value="/hello2",method = RequestMethod.GET)
    public String hello2(@RequestHeader("name") String name,@RequestParam("age") Integer age);
    @RequestMapping(value="/hello3",method = RequestMethod.POST)
    public String hello3(@RequestBody User user);


}
