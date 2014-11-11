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

    public float getTaxaDeRendimento() {
        return taxaDeRendimento;
    }

    public void setTaxaDeRendimento(float taxaDeRendimento) {
        this.taxaDeRendimento = taxaDeRendimento;
    }    
    
    // --------------------- Metodos -------------------------------------------
    
    public static Conta le(RandomAccessFile in) throws IOException {
        return new ContaPoupanca(in.readInt(), in.readInt(), in.readUTF(), in.readFloat(), in.readFloat(), in.readFloat());
    }

    @Override
    public void salva(RandomAccessFile out) throws IOException{
        out.writeInt(this.getIdConta());
        out.writeInt(this.getDigito());
        out.writeUTF(this.getDataDeCriacao());
        out.writeFloat(this.getSaldo());
        out.writeFloat(this.getTaxaDeManutencao());
        out.writeFloat(this.getTaxaDeRendimento());
    }
    
}
