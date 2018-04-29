package com.springboot.class01;

import com.springboot.class01.dao.UserDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.springboot.class01")
public class SpringConfig {
    @Bean
    public UserDao getUserDao(){
        return new UserDao();
    }
}

/** 說明: @Configuration   @Bean
 *       用來設定(取代之前的xml-)
 *
 */

