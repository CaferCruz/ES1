/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package contas;

/**
 *
 * @author Romulo
 */
public class ContaPoupanca extends Conta {
    
    private float taxaDeRendimento;

    public ContaPoupanca(int idConta, int digito, String dataDeCriacao, float saldo, float taxaDeManutencao) {
        super(idConta, digito, dataDeCriacao, saldo, taxaDeManutencao);
    }

    public float getTaxaDeRendimento() {
        return taxaDeRendimento;
    }

    public void setTaxaDeRendimento(float taxaDeRendimento) {
        this.taxaDeRendimento = taxaDeRendimento;
    }    
    
}
