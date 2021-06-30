package com.sciue.learnmall.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * Mybatis配置类
 */

@Configuration
@MapperScan("com.sciue.learnmall.mbg.mapper")
public class MyBatisConfig {
}
