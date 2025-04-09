package com.exemplo.adapter.strategy;

public class EntregaEconomica implements FreteStrategy {
    @Override
    public double calcularFrete(double peso) {
        return peso * 1.0 + 5;
    }
}
