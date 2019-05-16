package com.github.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Todo
 *
 * @Author jiangtao
 * @CreateBy 2019-05-16 14:25
 * @UpdateBy jiangtao
 * @Version v1.0
 */
@RestController
public class HelloController {

    @GetMapping("/")
    public String index() {
        return "hi, tao";
    }

    @GetMapping("/home")
    public String home() {
        return "hi, tao";
    }
}
