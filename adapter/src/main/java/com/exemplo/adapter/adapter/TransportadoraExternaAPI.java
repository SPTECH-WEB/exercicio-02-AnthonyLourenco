package com.exemplo.adapter.adapter;

public class TransportadoraExternaAPI {
    public double getPrecoFrete(double pesoKg) {
        return pesoKg * 1.2 + 7;
    }
}
