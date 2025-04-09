package com.exemplo.adapter.adapter;

public class TransportadoraExternaAdapter implements ITransportadora {
    private TransportadoraExternaAPI externaAPI = new TransportadoraExternaAPI();

    @Override
    public double calcularFreteTerceirizado(double peso) {
        return externaAPI.getPrecoFrete(peso);
    }
}
