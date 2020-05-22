package com.runbarry.spring.graceful;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 如果使用 kill -9 将暴力的将应用杀掉，达不到 优雅停机的目的
 * 1. kill -2 ???.jar （kill -2 相当于快捷键 Ctrl + C 会触发 Java 的 ShutdownHook 事件处理）
 * 2. POST 请求 /actuator/shutdown 即可执行优雅关机。
 *
 * 模拟：
 *  1. 请求：http://localhost:8082/sleep?timeout=15
 *  2. 请求：http://localhost:8082/sleep?timeout=30
 *  3. kill -2 ???.jar
 *  4. 观察结果
 * 2020-05-22 17:01:01.431  INFO 15172 --- [nio-8082-exec-1] o.s.web.servlet.DispatcherServlet        : Initializing Servlet 'dispatcherServlet'
 * 2020-05-22 17:01:01.445  INFO 15172 --- [nio-8082-exec-1] o.s.web.servlet.DispatcherServlet        : Completed initialization in 13 ms
 * 2020-05-22 17:01:03.063  INFO 15172 --- [nio-8082-exec-2] c.r.spring.graceful.KillerController     : begin sleep:15
 * 2020-05-22 17:01:05.024  INFO 15172 --- [nio-8082-exec-3] c.r.spring.graceful.KillerController     : begin sleep:30
 * 2020-05-22 17:01:11.373  INFO 15172 --- [extShutdownHook] o.s.b.w.e.tomcat.GracefulShutdown        : Commencing graceful shutdown. Waiting for active requests to complete
 * 2020-05-22 17:01:18.065  INFO 15172 --- [nio-8082-exec-2] c.r.spring.graceful.KillerController     : end sleep:15
 * 2020-05-22 17:01:31.375  INFO 15172 --- [extShutdownHook] o.s.c.support.DefaultLifecycleProcessor  : Failed to shut down 1 bean with phase value 2147483647 within timeout of 20000: [webServerGracefulShutdown]
 * 2020-05-22 17:01:31.415  INFO 15172 --- [tomcat-shutdown] o.s.b.w.e.tomcat.GracefulShutdown        : Graceful shutdown aborted with one or more requests still active
 * java.lang.InterruptedException: sleep interrupted
 *         at java.lang.Thread.sleep(Native Method)
 *         at java.lang.Thread.sleep(Unknown Source)
 * @author Administrator
 * @date 2020/5/22 16:41
 */
@SpringBootApplication
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
