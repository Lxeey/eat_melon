package com.eat.melon;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author lixinyi03
 * @version 1.0
 * @date 2023/8/30 15:49
 * @Description
 */
@SpringBootApplication
@MapperScan("com.eat.melon.**.mapper")
public class EatMelonApp {
    public static void main(String[] args) {
        SpringApplication.run(EatMelonApp.class,args);
    }
}
