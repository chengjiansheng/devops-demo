package com.cjs.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ChengJianSheng
 * @date 2020-05-05
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("/index")
    public String index() {
        return "Hello";
    }
}
