package com.dubbo.dubbo.cunsumer.controller;

import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import service.DubboService;

/**
 * @author Administrator
 * @class ConsumerController
 * @date 2021/3/23:23:45
 * @decs TODO
 */
@RestController
public class ConsumerController {


    @DubboReference
    private DubboService dubboService;


    @GetMapping("/test")
    public String test(){
        String test = dubboService.test();
        return test;
    }
}
