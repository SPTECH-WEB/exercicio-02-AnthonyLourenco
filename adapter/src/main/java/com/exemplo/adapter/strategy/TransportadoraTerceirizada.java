package com.exemplo.adapter.strategy;

import com.exemplo.adapter.adapter.ITransportadora;

public class TransportadoraTerceirizada implements FreteStrategy {
    private ITransportadora transportadora;

    public TransportadoraTerceirizada(ITransportadora transportadora) {
        this.transportadora = transportadora;
    }

    @Override
    public double calcularFrete(double peso) {
        return transportadora.calcularFreteTerceirizado(peso);
    }
}
