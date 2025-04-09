package com.exemplo.adapter.strategy;

public class EntregaExpressa implements FreteStrategy {
    @Override
    public double calcularFrete(double peso) {
        return peso * 1.5 + 10;
    }
}
