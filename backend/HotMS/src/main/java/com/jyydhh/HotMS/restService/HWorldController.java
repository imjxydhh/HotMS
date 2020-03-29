package com.jyydhh.HotMS.restService;

import java.util.concurrent.atomic.*;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HWorldController {
    private static final String template = "%s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting")
    public HWorld hWorld(@RequestParam(value = "message", defaultValue = "Hello world") String message){
        return new HWorld(counter.incrementAndGet(), String.format(template, message));
    }
}
