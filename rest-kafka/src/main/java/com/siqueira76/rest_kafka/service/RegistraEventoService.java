package com.siqueira76.rest_kafka.service;

import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RegistraEventoService {

    private final KafkaTemplate<Object , Object> kafkaTemplate;

    public <T> void adicionaEvento(String topico, T dados) {
        kafkaTemplate.send(topico, dados);
    }
}
