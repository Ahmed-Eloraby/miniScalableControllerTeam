package com.example.scalesquad.config;

import com.rabbitmq.client.AMQP;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.QueueBuilder;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j

public class RabbitMQConfig {

    @Bean
    public Queue testQueue() {
        return new Queue("q.balabizo");
    }
}
