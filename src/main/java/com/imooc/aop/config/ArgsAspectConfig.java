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
public class ArgsAspectConfig {
//    @Pointcut("args(Long)&&@within(com.imooc.aop.service.*)")
      @Pointcut("args(Long..)&&@within(com.imooc.aop.service.*)")
public void matchArgs(){}
    @Before("matchArgs()")
    public void before(){
        System.out.println("");
        System.out.println("##beforematchArgs");
    }
}
