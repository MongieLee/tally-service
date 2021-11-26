package cn.mgl.tally.controller;

import cn.mgl.tally.entity.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class BaseController {
    private AtomicLong counter = new AtomicLong();

    @GetMapping("v1/{name}")
    public Object say(@PathVariable("name") String name, @RequestParam(name = "age", required = false) Integer age) {
        return new Greeting(counter.incrementAndGet(), String.format("hello %s", name));
    }
}
