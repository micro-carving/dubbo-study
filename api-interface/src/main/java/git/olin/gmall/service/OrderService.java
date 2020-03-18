package git.olin.gmall.service;

/**
 * @program: order-service-consumer
 * @description: this is a OrderService interface
 * @author: OlinH
 * @create: 2020-03-09 19:13
 **/
public interface OrderService {
    /** 
    * @Description: initOrder 
    * @Param: [userId] 
    * @return: void 
    * @Author: OlinH 
    * @Date: 2020/3/9 
    */
    public void initOrder(String userId);
}
