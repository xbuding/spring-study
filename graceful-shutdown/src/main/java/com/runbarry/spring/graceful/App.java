package com.runbarry.spring.graceful;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 如果使用 kill -9 将暴力的将应用杀掉，达不到 优雅停机的目的
 * 1. kill -2 ？？？.jar （kill -2 相当于快捷键 Ctrl + C 会触发 Java 的 ShutdownHook 事件处理）
 * 2. POST 请求 /actuator/shutdown 即可执行优雅关机。
 *
 * @author Administrator
 * @date 2020/5/22 16:41
 */
@SpringBootApplication
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
