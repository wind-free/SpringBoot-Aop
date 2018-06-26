package com.imooc.aop.config;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * create by maoxiangyu
 */
@Aspect
@Component
public class ExecutionAspectConfig {
//    @Pointcut("execution(public * com.imooc.aop.service..*Sservice.*(..) " +
//              "throws java.lang..IllegalAccessException)")
//    public void matchCondition(){
//    }
//    @Before("matchCondition()")
//    public void before(){
//        System.out.println("");
//        System.out.println("##before");
//    }

}
