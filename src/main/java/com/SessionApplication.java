package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

/**
 * @author zmf
 * @version 1.0
 * @ClassName SessionApplication
 * @Description: 通过SpringBoot实现session共享
 * @date 2019/12/19 16:47
 */
@SpringBootApplication
@EnableRedisHttpSession
public class SessionApplication {

    public static void main(String[] args) {
        SpringApplication.run(SessionApplication.class, args);
    }
}
