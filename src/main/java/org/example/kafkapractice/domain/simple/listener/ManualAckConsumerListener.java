package org.example.kafkapractice.domain.simple.listener;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class ManualAckConsumerListener {

    @KafkaListener(
        topics = "simple-messages",
        groupId = "manual-ack-group",
        containerFactory = "manualAckKafkaListenerContainerFactory"
    )
    public void consume(ConsumerRecord<String, String> record,
        Acknowledgment ack) {

        String message = record.value();
        log.info("[manual-ack] 받은 메시지: {}", message);
        if (message.equals("error")) {
            throw new RuntimeException("kafka 에러 발생");
        }

        // 여기에서 비즈니스 로직이 수행된다고 가정합니다.
        // 예: DB 저장, API 호출 등

        // 처리에 성공했다고 판단되면 Offset을 Commit합니다.
        ack.acknowledge();
    }
}