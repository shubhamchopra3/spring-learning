package com.spring.demo.aop;

import java.util.ArrayList;
import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectManager {

	// declaring a pointcut expression , we can give any method name
	@Pointcut("execution(* addAccount*())")
	private void daoPointCut() {
	}

	// using the declared pointcut on the advice by just referencing the method
	// name, now the same method reference can be used on multiple advices
	@Before("daoPointCut()")
	public void beforeAddAccountAdvice(JoinPoint joinPoint) {

		

		System.out.println("Executing @before advice on addAccount()");
	}

//	@AfterReturning(pointcut = "execution(* com.spring.demo.aop.AccountDao.findAccounts(..))", returning ="result")
//	public void afterReturningAddAccountAdvice(JoinPoint joinPoint, List<Account> result) {
//		
//		result = new ArrayList<Account>();
//		result.add(new Account());
//		System.out.println("after advice"+result);
//
//	}
	
	@Around("execution(* com.spring.demo.aop.AccountDao.findAccounts(..))")
	public Object aroundAddAccountAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		
		 System.out.println("Executing @Around method");
		 
		//begin timestamp
		long begin = System.currentTimeMillis();
		
		//lets execute the method
		Object result = proceedingJoinPoint.proceed();
		
		//get end timestamp
		long end = System.currentTimeMillis();
		
		//compute duration and display it
		long duration = end-begin;
		
		System.out.println("execution time "+duration);
		
		return result;

	}

}
