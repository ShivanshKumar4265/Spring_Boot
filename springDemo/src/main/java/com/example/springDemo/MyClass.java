package com.example.springDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MyClass {

    @Autowired // if is do not put this will return teh null pointer exception, coz this annotation create object as we do it like  "new Dog()"
    public  Dog dog;

    @GetMapping("idriver/abc")
    public String sayHello() {
        return dog.fun();
    }
}
