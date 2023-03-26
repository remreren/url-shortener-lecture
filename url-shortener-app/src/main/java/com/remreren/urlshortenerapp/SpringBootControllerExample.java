package com.remreren.urlshortenerapp;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/example")
public class SpringBootControllerExample {

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("/greet")
    public String greet(@RequestParam("name") String name) {
        return "selam, " + name;
    }

    @GetMapping("/{selamlayan}/selam/{selamialan}")
    public String greetTwoPeople(@PathVariable("selamlayan") String selamlayan, @PathVariable("selamialan") String selamialan) {
        return selamlayan + " selamlıyor seni, " + selamialan;
    }
}
