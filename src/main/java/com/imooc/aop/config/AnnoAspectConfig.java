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
public class AnnoAspectConfig {
//    @Pointcut("@annotation(com.imooc.aop.anno.AdminOnly)")
//    @Pointcut("@within(com.imooc.aop.anno.NeedSecured) && within(com.imooc..*)")
@Pointcut("@args(com.imooc.aop.anno.NeedSecured) && within(com.imooc..*)")
public void matchAnno(){}
    @Before("matchAnno()")
    public void before(){
        System.out.println("");
        System.out.println("AnnoAspectConfig");
    }
}
