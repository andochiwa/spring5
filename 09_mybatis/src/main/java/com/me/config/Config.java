package com.me.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;

@Configuration // 完全注解配置，无需xml的方法
@ComponentScan(basePackages = "com.me")
public class Config {

    @Bean // 设置数据库连接池
    public DataSource dataSource() {
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setPassword("root");
        druidDataSource.setUsername("root");
        druidDataSource.setUrl("jdbc:mysql://localhost:3306/mybatis?serverTimezone=Japan&rewriteBatchedStatements=true");
        return druidDataSource;
    }

    @Bean // 设置SqlSessionFactory的实例，来获取dao对象
    public SqlSessionFactoryBean sqlSessionFactoryBean(DataSource dataSource) {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);
        sqlSessionFactoryBean.setConfigLocation(new PathMatchingResourcePatternResolver().getResource("classpath:mybatis.xml"));
        return sqlSessionFactoryBean;
    }

    // MapperScannerConfigurer会自动扫描com.me.dao的所有接口，执行getMapper()方法获取所有dao对象
    // 得到的dao对象会放进ioc容器中，通过控制反转可以直接用@Autowired注解以自动装配dao对象
    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer() {
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        mapperScannerConfigurer.setSqlSessionFactoryBeanName("sqlSessionFactoryBean");
        mapperScannerConfigurer.setBasePackage("com.me.dao");
        return mapperScannerConfigurer;
    }
}
