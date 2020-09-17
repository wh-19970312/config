package com.eshore.config;

import com.baomidou.mybatisplus.extension.plugins.inner.OptimisticLockerInnerInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Wen Hao
 * @Date 2020/9/11 14:35
 */
@Configuration
@MapperScan("com.eshore.mapper")
public class MybatisConfig {
    /**
     * 最新的乐观锁的插件已经被弃用，只用配置这个就好
     * @return
     */
    @Bean
    public OptimisticLockerInnerInterceptor optimisticLockerInterceptor() {
        return new OptimisticLockerInnerInterceptor();
    }
}
