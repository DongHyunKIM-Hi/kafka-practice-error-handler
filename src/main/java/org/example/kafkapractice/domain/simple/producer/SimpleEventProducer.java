package org.example.kafkapractice.domain.simple.producer;

import lombok.RequiredArgsConstructor;
import org.example.kafkapractice.domain.simple.model.kafka.SimpleEvent;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SimpleEventProducer {

    private static final String TOPIC = "simple-events";

    private final KafkaTemplate<String, SimpleEvent> eventKafkaTemplate;

    public void send(SimpleEvent event) {
        eventKafkaTemplate.send(TOPIC, event);
    }
}