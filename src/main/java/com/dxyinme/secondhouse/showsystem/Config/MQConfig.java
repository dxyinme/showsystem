package com.dxyinme.secondhouse.showsystem.Config;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.jms.Destination;


@Configuration
public class MQConfig {

    @Bean
    public Destination queueInsert() {
        return new ActiveMQQueue("commentInsert");
    }

}