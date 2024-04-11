package com.gpi.firstmicorservices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/first")
public class TestController {

    @GetMapping
    public String test()
    {
        return "Hello First Micorservices";
    }
}
