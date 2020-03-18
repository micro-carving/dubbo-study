package git.olin.gmall.service.impl;



import git.olin.gmall.bean.UserAddress;
import git.olin.gmall.service.OrderService;
import git.olin.gmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 1.将服务提供者注册到中心（暴露服务）
 * 1）、导入dubbo依赖（2.6.2）和操作zookeeper的客户端（curator）
 * 2）、配置服务提供者
 * 2.让服务消费者去注册中心订阅服务提供者的服务地址
 *
 * @program: order-service-consumer
 * @description: this is a OrderServiceImpl class
 * @author: OlinH
 * @create: 2020-03-09 19:17
 **/
@Service // 暴露服务
public class OrderServiceImpl implements OrderService {
    @Autowired // 自动装配进来
            UserService userService;

    public void initOrder(String userId) {
        System.out.println("用户id:" + userId);
        // 1、查询用户的收货地址
        List<UserAddress> addressList = userService.getUserAddressList(userId);
        for (UserAddress userAddress : addressList) {
            System.out.println(userAddress.getUserAddress());
        }
    }
}
