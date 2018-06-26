package com.imooc.aop.cglib;

import com.imooc.aop.pattern.RealSubject;
import com.imooc.aop.pattern.Subject;
import org.springframework.cglib.proxy.Enhancer;


public class Client {

    public static void main(String[] args){
         Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(RealSubject.class);
        enhancer.setCallback(new DemoMethodInterceptor());
        Subject subject = (Subject) enhancer.create();
        subject.hello();
    }
}
