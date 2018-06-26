package com.imooc.aop.dynamic;

import com.imooc.aop.pattern.RealSubject;
import com.imooc.aop.pattern.Subject;
import org.springframework.cglib.core.DebuggingClassWriter;

import java.lang.reflect.Proxy;

/**
 * System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
 */
public class Client {

    public static void main(String[] args){
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        Subject subject = (Subject) Proxy.newProxyInstance(Client.class.getClassLoader(),new Class[]{Subject.class},new JdkProxySubject(new RealSubject()));
        subject.hello();
;
    }
}
