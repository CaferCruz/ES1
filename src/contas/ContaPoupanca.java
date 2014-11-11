/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package contas;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *
 * @author Romulo
 */
public class ContaPoupanca extends Conta {
    
    private float taxaDeRendimento;
    
    // ----------------- Construtores ------------------------------------------

    public ContaPoupanca(int idConta, int digito, String dataDeCriacao, float saldo, float taxaDeManutencao, float taxaDeRendimento) {
        super(idConta, digito, dataDeCriacao, saldo, taxaDeManutencao);
        this.taxaDeRendimento = taxaDeRendimento;
    }
    
    // ------------------ Getters e Setters ------------------------------------

    public ContaPoupanca(int idConta, int digito, String dataDeCriacao, float saldo, float taxaDeManutencao) {
        super(idConta, digito, dataDeCriacao, saldo, taxaDeManutencao);
    }

    public float getTaxaDeRendimento() {
        return taxaDeRendimento;
    }

    public void setTaxaDeRendimento(float taxaDeRendimento) {
        this.taxaDeRendimento = taxaDeRendimento;
    }    
    
    // --------------------- Metodos -------------------------------------------
    
    @Override
    public void le(RandomAccessFile out) throws IOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void salva(RandomAccessFile out) throws IOException {
        out.writeInt(getIdConta());
        out.writeInt(getDigito());
        out.writeUTF(getDataDeCriacao());
        out.writeFloat(getSaldo());
        out.writeFloat(getTaxaDeManutencao());
        out.writeFloat(taxaDeRendimento);
    }
    
    //--------------------- toString -------------------------------------------
    
    @Override
    public String toString() {
        return super.toString() + " | " +
                "Taxa de Rendimento: " + taxaDeRendimento;
    }
    
}
