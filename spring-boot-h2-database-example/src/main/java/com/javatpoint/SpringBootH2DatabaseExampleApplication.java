package com.javatpoint;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass=true)  
public class SpringBootH2DatabaseExampleApplication 
{
public static void main(String[] args) 
{
SpringApplication.run(SpringBootH2DatabaseExampleApplication.class, args);
}
}
