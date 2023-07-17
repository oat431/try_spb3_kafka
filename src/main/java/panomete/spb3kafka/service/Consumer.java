package panomete.spb3kafka.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class Consumer {
    @KafkaListener(topics = "kafka-test-topic", groupId = "myGroup")
    public void consume(String message) {
        log.info(String.format("#### -> Consumed message -> %s", message));
    }
}
