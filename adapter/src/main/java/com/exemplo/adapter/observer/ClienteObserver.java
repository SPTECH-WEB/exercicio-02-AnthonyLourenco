package com.exemplo.adapter.observer;

public class ClienteObserver implements Notificador {
    @Override
    public void atualizar(String mensagem) {
        System.out.println("Notificação para cliente: " + mensagem);
    }
}