import com.peelsannaw.mq.abstarct.Publisher;
import com.peelsannaw.mq.abstarct.Subscriber;
import com.peelsannaw.mq.entity.Channel;
import com.peelsannaw.mq.entity.Message;
import com.peelsannaw.mq.service.OrderService;
import com.peelsannaw.mq.service.RepertoryService;
import com.peelsannaw.mq.service.UserService;

import java.math.BigDecimal;

/**
 * @Author peelsannaw
 * @create 22/02/2023 15:03
 */
public class PubSubTest {

    public static void main(String[] args) {
        simpleTest();
    }

    public static void simpleTest() {
        Channel channel = new Channel();

        Publisher publisher = null;
        publisher.bindChannel(channel);

        Subscriber userServiceSubscriber = null;
        Subscriber repertoryServiceSubscriber = null;

        userServiceSubscriber.subscribeChannel(channel);
        repertoryServiceSubscriber.subscribeChannel(channel);

        OrderService orderService = new OrderService(publisher);
        orderService.place("o001","c001",12, BigDecimal.valueOf(99.9),"peelsannaw");
    }
}
