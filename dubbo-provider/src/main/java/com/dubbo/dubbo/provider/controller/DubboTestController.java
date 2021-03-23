package com.dubbo.dubbo.provider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 * @class DubboTestController
 * @date 2021/3/22:13:13
 * @decs TODO
 */
@RestController
public class DubboTestController {

    @GetMapping("/test")
    public String test(){

        return "访问成功";
    }
}
