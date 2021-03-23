package com.dubbo.dubbo.provider.service;

import org.springframework.stereotype.Component;
import service.DubboService;

/**
 * @author Administrator
 * @class DubboServiceImpl
 * @date 2021/3/23:23:25
 * @decs TODO
 */

@Component
@org.apache.dubbo.config.annotation.DubboService
public class DubboServiceImpl implements DubboService {
    @Override
    public String test() {
        return "访问成功";
    }
}
