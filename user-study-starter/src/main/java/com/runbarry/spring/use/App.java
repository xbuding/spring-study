package com.runbarry.spring.use;

import com.runbarry.spring.starter.StudyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @Autowired
    private StudyService studyService;

    @GetMapping("ironman")
    public String ironman() {
        return studyService.snapFinger();
    }
}
