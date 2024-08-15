package com.siqueira76.rest_kafka.controller;

import com.siqueira76.rest_kafka.data.PedidoData;
import com.siqueira76.rest_kafka.service.RegistraEventoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class PedidosController {

    private final RegistraEventoService registraEventoService;

    @PostMapping("api/salvar-pedido")
    public ResponseEntity<String> salvaPedido(@RequestBody PedidoData pedidoData) {
        registraEventoService.adicionaEvento("SalvarPedido", pedidoData);
        return ResponseEntity.ok("Pedido salvo com sucesso!");
    }
}