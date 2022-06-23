package com.lun.bito.api.demo.web;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

public class BitoApiController {

    @RestController
    public class GreetingController {

        private static final String template = "Hello, %s!";
        private final AtomicLong counter = new AtomicLong();

        @PostMapping("/greeting")
        public void greeting(@RequestParam(value = "name", defaultValue = "World") String name) {

            //return new String(counter.incrementAndGet(), String.format(template, name));

        }

    }
}
