/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contas;

import Observer.Observer;

/**
 *
 * @author Cafer
 */
public class Historico implements Observer {

    private String logOperacoes;
    private String logDados;
    private final Conta conta;

    public Historico(Conta conta) {
        this.conta = conta;
    }

    @Override
    public void update() {
        if (conta.getTipoUpdate() == Conta.ESTRUTURAL) {
            logDados += "\n" + conta.getUpdate();
        } else {
            logOperacoes += "\n" + conta.getUpdate();
        }

    }

    public String getLogOperacoes() {
        return logOperacoes;
    }

    public String getLogDados() {
        return logDados;
    }

}
