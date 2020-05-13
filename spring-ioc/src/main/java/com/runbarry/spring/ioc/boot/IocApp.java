package com.runbarry.spring.ioc.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author xbuding
 * @version 1.0
 * @since 2020/5/12
 */
@Controller
@SpringBootApplication
public class IocApp {
    public static void main(String[] args) {
        SpringApplication.run(IocApp.class, args);
    }

}
