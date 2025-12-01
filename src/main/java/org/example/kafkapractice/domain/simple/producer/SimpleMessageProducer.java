package org.example.kafkapractice.domain.simple.producer;

import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SimpleMessageProducer {

    private static final String TOPIC_SIMPLE = "simple-messages";
    private static final String TOPIC_ORDER = "order";

    private final KafkaTemplate<String, String> stringStringKafkaTemplate;

    public void send(String message) {
        stringStringKafkaTemplate.send(TOPIC_SIMPLE, message);
    }
}
