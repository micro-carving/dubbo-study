package git.olin.gmall.service.impl;

import git.olin.gmall.bean.UserAddress;
import git.olin.gmall.service.UserService;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * @program: dubbo-study
 * @description: this is a UserServiceStub class
 * @author: OlinH
 * @create: 2020-03-17 14:41
 **/
public class UserServiceStub implements UserService {
    private final UserService userService;

    /** 
    * @Description: 传入的是userService远程的代理对象 
    * @Param: [userService] 
    * @return:  
    * @Author: OlinH 
    * @Date: 2020/3/17 
    */
    public UserServiceStub(UserService userService) {
        this.userService = userService;
    }

    @Override
    public List<UserAddress> getUserAddressList(String userId) {
        System.out.println("UserServiceStub被调用！");
        if(StringUtils.isEmpty(userId)){
            return userService.getUserAddressList(userId);
        }
        return null;
    }
}
