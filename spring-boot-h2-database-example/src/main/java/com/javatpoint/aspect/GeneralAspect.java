package com.javatpoint.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
@Aspect  
@Component  
public class GeneralAspect {
	@Before(value = "execution(* com.javatpoint.service.StudentService.*(..)) and args(id)")  
	public void beforeAdvice(JoinPoint joinPoint,int id) {  
	System.out.println("Before method:" + joinPoint.getSignature());  
	System.out.println("Creating Employee with first name - "+id);  
	} 
	
	@After(value = "execution(* com.javatpoint.service.StudentService.*(..)) and args(id)")  
	public void afterAdvice(JoinPoint joinPoint,int id) {  
	System.out.println("After method:" + joinPoint.getSignature());  
	System.out.println("Creating Employee with first name - "+id);  
	} 
}
