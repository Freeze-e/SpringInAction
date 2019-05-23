package pers.wdj.spring_in_action.config;

import org.springframework.context.annotation.*;
import pers.wdj.spring_in_action.aop.Audience;

/**
 * aop配置
 */
@Configuration
@EnableAspectJAutoProxy //启用自动代理。springboot需要？ todo 验证是否需要
@ComponentScan //Springboot 可忽视的注解
@ImportResource("classpath:aop.xml")
public class ConcertConfig {

    @Bean
    public Audience audience(){
        return new Audience();
    }
}
