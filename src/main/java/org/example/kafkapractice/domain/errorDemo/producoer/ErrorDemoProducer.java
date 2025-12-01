package org.example.kafkapractice.domain.errorDemo.producoer;

import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ErrorDemoProducer {

    private static final String TOPIC = "error-demo";

    private final KafkaTemplate<String, String> stringKafkaTemplate;

    public void send(String message) {
        stringKafkaTemplate.send(TOPIC, message);
    }
}