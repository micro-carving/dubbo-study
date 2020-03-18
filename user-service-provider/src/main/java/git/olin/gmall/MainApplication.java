/*
 * Copyright (c) 2020
 * File:MainApplication.java
 * Date:2020-03-10 17:02:10
 */

package git.olin.gmall;


import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @program: user-service-provider
 * @description: this is a MainApplication class
 * @author: OlinH
 * @create: 2020-03-10 17:02
 **/
public class MainApplication {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("dubbo-provider.xml");
        ioc.start();
        System.out.println("服务已启动！");
        // 为了不让程序终止，阻塞读取一个字符
        System.in.read();
    }
}
