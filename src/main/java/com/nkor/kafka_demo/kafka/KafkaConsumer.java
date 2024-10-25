package com.nkor.kafka_demo.kafka;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@EnableKafka
@Service
public class KafkaConsumer {

    @KafkaListener(topics = "course", groupId = "my_consumer")
    public void listener(String massage) {
        log.info("Massage: {}", massage);
    }
}
