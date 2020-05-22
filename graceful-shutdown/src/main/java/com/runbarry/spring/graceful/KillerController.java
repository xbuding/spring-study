package com.runbarry.spring.graceful;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * @author Administrator
 * @date 2020/5/22 16:42
 */
@Slf4j
@RestController
@Component
public class KillerController {

    @GetMapping("kill")
    public String hello() {
        return "I killed trump";
    }

    @GetMapping("sleep")
    public String sleep(Integer timeout) {
        try {
            log.info("start sleep timeout:{}", timeout);
            TimeUnit.SECONDS.sleep(timeout);
            log.info("end sleep timeout:{}", timeout);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "sleep over:" + timeout;
    }
}
