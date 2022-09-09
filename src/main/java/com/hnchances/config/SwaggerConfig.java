package com.hnchances.config;

import io.swagger.annotations.Api;
import io.swagger.annotations.Contact;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.env.Profiles;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

import static springfox.documentation.service.ApiInfo.DEFAULT_CONTACT;
/**
 * @Description swagger2 配置文件
 * @Author qinghong
 * @Date 2022/9/9 22:23
 * @param
 * @return
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket docket(Environment environment){
        //设置要显示的swagger环境
        Profiles profiles = Profiles.of("dev", "test");
        //通过environment.acceptsProfiles判断当前环境是否处于自己设置的环境中
        boolean b = environment.acceptsProfiles(profiles);

        return new Docket(DocumentationType.SWAGGER_2).groupName("琪鸿组")
                .apiInfo(apiInfo())
                .enable(true) //默认开启
                .select()//过滤
                .apis(RequestHandlerSelectors.basePackage("com.hnchances.controller"))
                .build()
                ;
    }

    private ApiInfo apiInfo(){
//        return new ApiInfo("湖南创思测试API文档",
//                "用于系统接口管理",
//                "v1.0",
//                "https://github.com/",
//                contact,
//                "Apache2.0",
//                "http://www,apache.org/licenses/LICENSE-2.0",
//                new ArrayList()
//        );
        return new ApiInfo("湖南创思测试API文档",
                "用于系统接口管理",
                "1.0",
                "urn:tos",
                DEFAULT_CONTACT,
                "Apache 2.0",
                "http://www.apache.org/licenses/LICENSE-2.0",
                new ArrayList());
    }
}
