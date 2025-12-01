package org.example.kafkapractice.domain.simple.model.kafka;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class SimpleEvent {

    //
    private String type;

    // 실제 메시지 내용
    private String message;

    // 이벤트 생성 시각
    private LocalDateTime createdAt;

    public SimpleEvent(String message) {
        this.type = "이런저런타입";
        this.message = message;
        this.createdAt = LocalDateTime.now();
    }
}