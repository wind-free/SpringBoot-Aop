package com.imooc.aop.config;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * 匹配ProductService类里面的所有方法 @Pointcut(com.imooc.aop.service.ProductService)
 *
 * 匹配com.imooc包及子包下所有类的方法@Pointcut("within(com.imooc.aop..*)")
 * create by maoxiangyu
 */
@Aspect
@Component
public class PkgTypeAspectConfig {
    @Pointcut("within(com.imooc.aop.service.ProductService)")
//    @Pointcut("within(com.imooc.aop.service.sub.*)")
    public void matchType(){}
    @Before("matchType()")
    public void before(){
        System.out.println("");
        System.out.println("##before");
    }
}
