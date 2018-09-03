package com.cr6588.mq.rabbit.helloword;

import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.Connection;

import java.util.concurrent.TimeoutException;

import com.rabbitmq.client.Channel;

/**
 * create in 2018年09月03日
 * @category TODO
 * @see https://www.rabbitmq.com/tutorials/tutorial-one-java.html
 * @author chenyi
 */
public class Send {
    private final static String QUEUE_NAME = "hello";

    public static void main(String[] argv)
        throws java.io.IOException, TimeoutException {
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("localhost");
        Connection connection = factory.newConnection();
        Channel channel = connection.createChannel();

        channel.queueDeclare(QUEUE_NAME, false, false, false, null);
        String message = "Hello World!2";
        channel.basicPublish("", QUEUE_NAME, null, message.getBytes());
        System.out.println(" [x] Sent '" + message + "'");

        channel.close();
        connection.close();
    }
}
