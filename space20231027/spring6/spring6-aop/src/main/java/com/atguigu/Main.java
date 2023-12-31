package com.atguigu;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

import java.util.Arrays;

public class Main {
    /*
    AOP (Aspect Oriented Programming) 是一种设计思想，是软件设计领域中的面向切面编程，它是面向对象编程的一种补充和完善，它以通过预编译方式
    和运行期动态代理方式实现，在不修改源代码的情况下，给程序动态统添加额外功能的一种技术。利用AOP可以对业务逻辑的各个部分进行隔离，从而使得业务逻辑
    各部分之间的耦合度降低，提高程序的可重用性，同时提高了开发的效率。
     */
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}
