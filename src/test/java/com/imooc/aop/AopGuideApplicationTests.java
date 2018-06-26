package com.imooc.aop;

import com.imooc.aop.benn.Product;
import com.imooc.aop.log.LogService;
import com.imooc.aop.service.DemoService;
import com.imooc.aop.service.MenuService;
import com.imooc.aop.service.ProductService;
import com.imooc.aop.service.sub.SubService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AopGuideApplicationTests {

//    @Autowired
//    ProductService productService;
//
//    @Autowired
//    SubService subService;
//
//    @Autowired
//    LogService logService;
//
//    @Test(expected = Exception.class)
//    public void annoInsertTest() {
//        CurrentUserHolder.set("tom");
//        productService.delete(1L);
//    }
//
//    @Test(expected = Exception.class)
//    public void aminInsert(){
//        CurrentUserHolder.set("admin");
//        productService.delete(1L);
//    }

//    @Test
//    public void test() {
//        System.out.println("###begin test###");
//        productService.findById(1L);
//        productService.findByTwoArgs(1L,"hello");
//        productService.getName();
//        subService.demo();
//        try {
//            productService.exDemo();
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        }
//        logService.log();
//        productService.log();
//        logService.annoArgs(new Product());
//    }

//    @Autowired
//    DemoService demoService;
//    @Test
//    public void testWithoutTransaction(){
//        demoService.adduser("tom");
//    }


    @Autowired
    MenuService menuService;

    @Test
    public void testCache() {
        System.out.println("call:"+menuService.getMenuList());
        System.out.println("call:"+menuService.getMenuList());
    }

}
