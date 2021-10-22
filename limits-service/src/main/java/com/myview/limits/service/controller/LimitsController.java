package com.myview.limits.service.controller;

import com.myview.limits.service.bean.Limits;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {

    @GetMapping("/limits")
    public Limits getLimits(){
        return new Limits(1,1000);
    }
}
