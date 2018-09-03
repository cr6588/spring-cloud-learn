package com.cr6588.mq.rocket;

import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.remoting.common.RemotingHelper;

/**
 * create in 2018年09月03日
 * @category TODO
 * @author chenyi
 */
public class SyncProducer {
    public static void main(String[] args) throws Exception {
        //Instantiate with a producer group name.
        DefaultMQProducer producer = new
            DefaultMQProducer("SyncProducer");
        // Specify name server addresses.
        producer.setNamesrvAddr("mq.cr6588.com:9876");
        //Launch the instance.
        producer.start();
        System.out.println("##############start");
        for (int i = 0; i < 1; i++) {
            //Create a message instance, specifying topic, tag and message body.
            Message msg = new Message("TopicTest" /* Topic */,
                "TagA" /* Tag */,
                ("Hello RocketMQ " +
                    i).getBytes(RemotingHelper.DEFAULT_CHARSET) /* Message body */
            );
            //Call send message to deliver message to one of brokers.
            SendResult sendResult = producer.send(msg);
            System.out.printf("%s%n", sendResult);
        }
        System.out.println("##############end");
        //Shut down once the producer instance is not longer in use.
        producer.shutdown();
    }
}
