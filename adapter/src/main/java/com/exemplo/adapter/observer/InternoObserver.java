package com.exemplo.adapter.observer;

public class InternoObserver implements Notificador {
    @Override
    public void atualizar(String mensagem) {
        System.out.println("Notificação para equipe interna: " + mensagem);
    }
}
