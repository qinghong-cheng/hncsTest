package com.hnchances.controller;

import com.hnchances.entity.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(description = "test控制类")
@RestController
public class TestController {

    @ApiOperation("哈喽测试")
    @GetMapping("/test")
    public String test(){
        return "hello";
    }

    @ApiOperation("参数测试")
    @GetMapping("/test2")
    public String test2(@ApiParam("用户名") String s){
        return "hello"+s;
    }
}
