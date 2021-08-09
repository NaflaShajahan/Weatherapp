package com.demo.service.aspects;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
@Service
@Aspect
public class LoggingAspect {
private Logger logger=LoggerFactory.getLogger(LoggingAspect.class);
	
	@Around("@annotation(MyLogger)")
	public Object logging(ProceedingJoinPoint joinPoint) throws Throwable {
		
		long start=System.currentTimeMillis();
		Object val= joinPoint.proceed();
		long end=System.currentTimeMillis();
		
		logger.info("method take "+ (end-start)+" to execute..");
		
		return val;
	}


}
