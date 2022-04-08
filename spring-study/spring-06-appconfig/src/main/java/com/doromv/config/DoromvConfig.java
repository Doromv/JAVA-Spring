package com.doromv.config;

import com.doromv.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author shkstart
 * @create 2022-02-28-14:33
 */
@Configuration
@ComponentScan("com.doromv.pojo")
@Import(DoromvConfig01.class)
public class DoromvConfig {
    @Bean
    public User user(){
        return new User();
    }
}
