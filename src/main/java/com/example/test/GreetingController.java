package com.example.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RefreshScope
@RequestMapping("/api")
public class GreetingController {

//    @Value("${my.greeting: default value}")
//    private String greetingMessage;
//
//    @Value("some static message")
//    private String staticMessage;
//
//    @Value("${my.list.values}")
//    private List<String> val;
//
//    @GetMapping("/greeting")
//    private String greeting(){
//        return greetingMessage + " " +staticMessage +val;
//    }
    @Value("${configA}")
    private String configA;

    @Value("${configB}")
    private String configB;

    @Value("${configC}")
    private String configC;


    @GetMapping("/configs")
    public Map<String, Object> getConfigData() {
        Map<String, Object> objectMap = new HashMap<>();
        objectMap.put("configA", configA);
        objectMap.put("configB", configB);
        objectMap.put("configC", configC);
        return objectMap;
    }
}
