package org.example.kafkapractice.domain.simple.listener;

import lombok.extern.slf4j.Slf4j;
import org.example.kafkapractice.domain.simple.model.kafka.SimpleEvent;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class SimpleEventListener {

    @KafkaListener(
        topics = "simple-events",
        groupId = "simple-event-group",
        containerFactory = "eventKafkaListenerContainerFactory"
    )
    public void consumeA1(SimpleEvent event) {
        log.info("받은 이벤트: {}", event);
    }

    @KafkaListener(
        topics = "simple-events",
        groupId = "simple-event-group",
        containerFactory = "eventKafkaListenerContainerFactory"
    )
    public void consumeA2(SimpleEvent event) {
        log.info("받은 이벤트: {}", event);
    }

    @KafkaListener(
        topics = "simple-events",
        groupId = "simple-event-group",
        containerFactory = "eventKafkaListenerContainerFactory"
    )
    public void consumeA3(SimpleEvent event) {
        log.info("받은 이벤트: {}", event);
    }

    @KafkaListener(
        topics = "simple-events",
        groupId = "simple-event-group2",
        containerFactory = "eventKafkaListenerContainerFactory2"
    )
    public void consumeB1(SimpleEvent event) {
        log.info("받은 이벤트: {}", event);
    }

    @KafkaListener(
        topics = "simple-events",
        groupId = "simple-event-group2",
        containerFactory = "eventKafkaListenerContainerFactory2"
    )
    public void consumeB2(SimpleEvent event) {
        log.info("받은 이벤트: {}", event);
    }

    @KafkaListener(
        topics = "simple-events",
        groupId = "simple-event-group2",
        containerFactory = "eventKafkaListenerContainerFactory2"
    )
    public void consumeB3(SimpleEvent event) {
        log.info("받은 이벤트: {}", event);
    }

}
