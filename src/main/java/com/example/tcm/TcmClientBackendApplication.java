package com.example.tcm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement//开启事务管理
@SpringBootApplication
@ComponentScan("com.example.tcm")//扫描注解元素
@MapperScan("com.example.tcm.dao")//Mybatis的DAO所在包
public class TcmClientBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(TcmClientBackendApplication.class, args);
	}

}
