package com.runbarry.spring.ioc.boot.async;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.core.task.AsyncTaskExecutor;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Service;

/**
 * @author Administrator
 * @date 2020/5/21 14:39
 */
@EnableAsync
@Slf4j
@Service
public class AsyncService {
    /**
     * 当出现循环依赖时。@Async 将导致 org.springframework.beans.factory.BeanCurrentlyInCreationException:
     *
     * @throws org.springframework.beans.factory.BeanCurrentlyInCreationException:
     */
    @Autowired
    private BService bService;

    @Async
    public void async() {
        log.info("async ----");
    }

    @Bean
    public AsyncTaskExecutor taskExecutor() {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setThreadNamePrefix("Anno-Executor");
        executor.setMaxPoolSize(100);

        // 设置拒绝策略
        executor.setRejectedExecutionHandler((r, executor1) -> {
            // .....
        });
        // 使用预定义的异常处理类
        // executor.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());

        return executor;
    }
}
