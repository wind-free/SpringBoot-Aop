package com.imooc.aop.anno;

import java.lang.annotation.*;


@Retention(RetentionPolicy.CLASS)
@Target(ElementType.TYPE)
@Inherited
public @interface NeedSecuredClass {
}
