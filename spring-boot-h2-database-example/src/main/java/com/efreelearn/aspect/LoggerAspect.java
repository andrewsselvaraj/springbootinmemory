package com.efreelearn.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.AfterThrowing;
import org.springframework.stereotype.Component;
@Aspect  
@Component  
public class LoggerAspect {
	@Before(value = "execution(* com.efreelearn.service.StudentService.*(..)) and args(id)")  
	public void beforeAdvice(JoinPoint joinPoint,int id) {  
	System.out.println("Method Called" + joinPoint.getSignature());  
	//System.out.println("Creating Employee with first name - "+id);  
	} 
	
	@After(value = "execution(* com.efreelearn.service.StudentService.*(..)) and args(id)")  
	public void afterAdvice(JoinPoint joinPoint,int id) {  
	System.out.println("Method Successfully implemented" + joinPoint.getSignature());  
	//System.out.println("Creating Employee with first name - "+id);  
	}
	
	@AfterThrowing(value = "execution(* com.efreelearn.service.StudentService.*(..)) and args(id)")  
	public void afterThrowing(JoinPoint joinPoint,int id) {  
	System.out.println("afterThrowing " + joinPoint.getSignature());  
	//System.out.println("Creating Employee with first name - "+id);  
	}
}
