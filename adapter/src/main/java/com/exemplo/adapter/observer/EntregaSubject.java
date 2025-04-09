package com.exemplo.adapter.observer;

import java.util.ArrayList;
import java.util.List;

public class EntregaSubject {
    private List<Notificador> observadores = new ArrayList<>();

    public void adicionarObservador(Notificador obs) {
        observadores.add(obs);
    }

    public void notificarTodos(String mensagem) {
        for (Notificador obs : observadores) {
            obs.atualizar(mensagem);
        }
    }
}