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
public class ContaCorrente extends Conta {   
    
    //--------------------- Construtores ---------------------------------------

    public ContaCorrente(int idConta, float limite, String dataDeCriacao, float saldo, float taxaDeManutencao) {
        super(idConta, limite, dataDeCriacao, saldo, taxaDeManutencao);
    }    

    public ContaCorrente() { }    
    
    
    //--------------------- Metodos --------------------------------------------
    
    @Override
    public void le(RandomAccessFile in) throws IOException {
        setIdConta(in.readInt());
        setLimite(in.readFloat());
        setDataDeCriacao(in.readUTF());
        setSaldo(in.readFloat());
        setTaxaDeManutencao(in.readFloat());
    }

    @Override
    public void salva(RandomAccessFile out) throws IOException {
        out.writeInt(getIdConta());
        out.writeFloat(getLimite());
        out.writeUTF(getDataDeCriacao());
        out.writeFloat(getSaldo());
        out.writeFloat(getTaxaDeManutencao());
    }
    
    @Override
    public String toString() {
        return super.toString();
    }
     
}
