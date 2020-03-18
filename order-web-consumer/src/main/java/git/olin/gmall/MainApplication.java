package git.olin.gmall;

import git.olin.gmall.service.OrderService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @program: order-service-consumer
 * @description: this is a MainApplication class
 * @author: OlinH
 * @create: 2020-03-10 22:55
 **/
public class MainApplication {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("dubbo-consumer.xml");
        OrderService orderService = applicationContext.getBean(OrderService.class);
        orderService.initOrder("1");
        System.out.println("远程过程调用已完成！");
        // 为了不让程序终止，阻塞读取一个字符
        System.in.read();
    }
}
