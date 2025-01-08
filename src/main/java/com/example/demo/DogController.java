package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class DogController {

    @GetMapping("/dog")
    public Map<String, String> dog() {
        Map<String, String> map = new HashMap<>();
        map.put("name", "Max");
        map.put("age", "2");
        return map;
    }
}
