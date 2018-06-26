package com.imooc.aop.log;

import com.imooc.aop.anno.AdminOnly;
import com.imooc.aop.benn.Product;
import org.springframework.stereotype.Component;

/**
 * create by maoxiangyu
 */
@Component
public class LogService implements Loggable{
    @AdminOnly
//    @Override
    public void log(){
        System.out.println("log from LogService");
    }
    public void annoArgs(Product product){
        System.out.println("execute Log Service annoArgs");
    }
}
