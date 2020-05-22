package com.runbarry.spring.ioc.boot.async;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Administrator
 * @date 2020/5/22 14:21
 */
@Slf4j
@Component
public class BService {

    @Autowired
    private AsyncService asyncService;

    public void async() {
        asyncService.async();
    }
}
