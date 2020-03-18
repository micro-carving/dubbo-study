/*
 * Copyright (c) 2020
 * File:UserServiceImpl.java
 * Date:2020-03-13 17:39:13
 */

package git.olin.gmall.service.impl;



import git.olin.gmall.bean.UserAddress;
import git.olin.gmall.service.UserService;

import java.util.Arrays;
import java.util.List;


/**
 * @program: order-service-consumer
 * @description: this is a UserServiceImpl class
 * @author: OlinH
 * @create: 2020-03-13 16:35
 **/
public class RefactorUserServiceImpl implements UserService {
    /** 
    * @Description: getUserAddressList 
    * @Param: [userId] 
    * @return: java.util.List<git.olin.UserAddress> 
    * @Author: OlinH 
    * @Date: 2020/3/13 
    */
    public List<UserAddress> getUserAddressList(String userId) {
        System.out.println("UserServiceImpl....V2.0....");
        UserAddress userAddress1 = new UserAddress(1,"广州","1","小丽","18385201334","Y");
        UserAddress userAddress2 = new UserAddress(2,"深圳","2","小刚","183878327020","N");
        // 此处休眠是为了消费者配置中的timeout属性效果演示
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return Arrays.asList(userAddress1,userAddress2);
    }
}
