package panomete.spb3kafka.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import panomete.spb3kafka.service.Producer;

@RestController
@RequiredArgsConstructor
@RequestMapping("/kafka")
public class DemoKafkaController {
    private final Producer producer;

    @GetMapping("/publish")
    public void sendMessageToKafkaTopic(
            @RequestParam("message") String message
    ) {
        producer.sendMessage(message);
    }
}
