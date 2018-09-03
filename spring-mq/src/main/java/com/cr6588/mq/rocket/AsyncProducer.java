package com.cr6588.mq.rocket;

import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.client.producer.SendCallback;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.remoting.common.RemotingHelper;

/**
 * create in 2018年09月03日
 * @category TODO
 * @author chenyi
 */
public class AsyncProducer {

    public static void main(String[] args) throws Exception {
        // Instantiate with a producer group name.
        DefaultMQProducer producer = new DefaultMQProducer("AsyncProducer");
        // Specify name server addresses.
        producer.setNamesrvAddr("mq.cr6588.com:9876");
        // Launch the instance.
        producer.start();
        producer.setRetryTimesWhenSendAsyncFailed(0);
        for (int i = 0; i < 10; i++) {
            final int index = i;
            // Create a message instance, specifying topic, tag and message
            // body.
            Message msg = new Message("TopicTest", "TagA", "OrderID188",
                "Hello world".getBytes(RemotingHelper.DEFAULT_CHARSET));
            producer.send(msg, new SendCallback() {

                @Override
                public void onSuccess(SendResult sendResult) {
                    System.out.printf("%-10d OK %s %n", index, sendResult.getMsgId());
                }

                @Override
                public void onException(Throwable e) {
                    System.out.printf("%-10d Exception %s %n", index, e);
                    e.printStackTrace();
                }
            });
        }
        // Shut down once the producer instance is not longer in use.
        producer.shutdown();
    }
}
