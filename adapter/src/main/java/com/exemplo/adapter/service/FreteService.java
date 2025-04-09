package com.exemplo.adapter.service;

import com.exemplo.adapter.strategy.*;
import com.exemplo.adapter.adapter.*;
import com.exemplo.adapter.observer.*;

public class FreteService {
    public double calcularFrete(double peso, String modalidade) {
        FreteStrategy strategy;

        switch (modalidade.toLowerCase()) {
            case "expressa":
                strategy = new EntregaExpressa();
                break;
            case "economica":
                strategy = new EntregaEconomica();
                break;
            case "terceirizada":
                ITransportadora adapter = new TransportadoraExternaAdapter();
                strategy = new TransportadoraTerceirizada(adapter);
                break;
            default:
                throw new IllegalArgumentException("Modalidade inválida");
        }

        double valorFrete = strategy.calcularFrete(peso);

        EntregaSubject entrega = new EntregaSubject();
        entrega.adicionarObservador(new ClienteObserver());
        entrega.adicionarObservador(new InternoObserver());
        entrega.notificarTodos("Entrega processada com sucesso.");

        return valorFrete;
    }
}