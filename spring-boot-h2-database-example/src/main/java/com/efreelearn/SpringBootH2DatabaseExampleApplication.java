package com.efreelearn;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass=true) 
//@ComponentScan("com.efreelearn.*")
public class SpringBootH2DatabaseExampleApplication 
{
public static void main(String[] args) 
{
SpringApplication.run(SpringBootH2DatabaseExampleApplication.class, args);
}
}
