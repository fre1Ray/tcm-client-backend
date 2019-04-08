package com.example.tcm;

<<<<<<< HEAD
<<<<<<< HEAD
import org.mybatis.spring.annotation.MapperScan;
<<<<<<< HEAD
import org.springframework.aop.aspectj.AspectJExpressionPointcut;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.interceptor.TransactionInterceptor;

import javax.sql.DataSource;
import java.util.Properties;

@EnableTransactionManagement//开启事务管理
@MapperScan("com.example.tcm.dao")
=======
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement//开启事务管理
>>>>>>> remotes/origin/dev-int-spring1-xgq
@SpringBootApplication
@ComponentScan("com.example.tcm")//扫描注解元素
@MapperScan("com.example.tcm.dao")//Mybatis的DAO所在包
public class TcmClientBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(TcmClientBackendApplication.class, args);
    }

    @Autowired
    private DataSource dataSource;

    private String transactionExecution = "execution(* com.test.sdk.admin.service..*(..))";

    @Bean
    public DefaultPointcutAdvisor defaultPointcutAdvisor() {
        AspectJExpressionPointcut pointcut = new AspectJExpressionPointcut();
        pointcut.setExpression(transactionExecution);
        DefaultPointcutAdvisor advisor = new DefaultPointcutAdvisor();
        advisor.setPointcut(pointcut);
        Properties attributes = new Properties();
        attributes.setProperty("get*", "PROPAGATION_SUPPORTS,ISOLATION_DEFAULT,readOnly");
        attributes.setProperty("add*", "PROPAGATION_REQUIRED,-Exception");
        attributes.setProperty("update*", "PROPAGATION_REQUIRED,-Exception");
        attributes.setProperty("delete*", "PROPAGATION_REQUIRED,-Exception");
        TransactionInterceptor txAdvice = new TransactionInterceptor(new DataSourceTransactionManager(dataSource), attributes);
        advisor.setAdvice(txAdvice);
        return advisor;
    }
=======
=======
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.aop.aspectj.AspectJExpressionPointcut;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.beans.factory.annotation.Autowired;
>>>>>>> remotes/origin/dev-int-sprint1-xiaoqiang
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.interceptor.TransactionInterceptor;

import javax.sql.DataSource;
import java.util.Properties;

@SpringBootApplication
@EnableTransactionManagement //开启事务管理
@MapperScan("com.example.tcm.dao") //Mybatis的DAO所在包
public class TcmClientBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(TcmClientBackendApplication.class, args);
	}

<<<<<<< HEAD
>>>>>>> remotes/origin/dev-int-spring1-hjy
=======
	@Autowired
	private DataSource dataSource;   // *** 引入配置文件中的dataSources
	// 定义切点表达式
	private String transactionExecution ="execution(* com.test.springboot.demo.service..*(..))";
	@Bean
	public DefaultPointcutAdvisor defaultPointcutAdvisor() {
		AspectJExpressionPointcut pointcut = new AspectJExpressionPointcut();
		pointcut.setExpression(transactionExecution);
		DefaultPointcutAdvisor advisor = new DefaultPointcutAdvisor();
		advisor.setPointcut(pointcut);
		Properties attributes = new Properties();
		attributes.setProperty("get*", "PROPAGATION_SUPPORTS,ISOLATION_DEFAULT,readOnly");
		attributes.setProperty("add*", "PROPAGATION_REQUIRED,-Exception");
		attributes.setProperty("update*", "PROPAGATION_REQUIRED,-Exception");
		attributes.setProperty("delete*", "PROPAGATION_REQUIRED,-Exception");
		TransactionInterceptor txAdvice = new TransactionInterceptor(new DataSourceTransactionManager(dataSource), attributes);
		advisor.setAdvice(txAdvice);
		return advisor;
	}
>>>>>>> remotes/origin/dev-int-sprint1-xiaoqiang
}
