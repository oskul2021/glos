package com.gloswitch.config_server;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {
    @GetMapping("/test")
    public String isRunning(){
        return "Config server is running";
    }
}
