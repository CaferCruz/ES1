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
    
    //--------------------- Construtor -----------------------------------------

    public ContaCorrente(int idConta, int digito, String dataDeCriacao, float saldo, float taxaDeManutencao) {
        super(idConta, digito, dataDeCriacao, saldo, taxaDeManutencao);
    }
    
    
    //--------------------- Metodos --------------------------------------------
    
    public static Conta le(RandomAccessFile in) throws IOException {
        return new ContaCorrente(in.readInt(), in.readInt(), in.readUTF(), in.readFloat(), in.readFloat());
    }

    @Override
    public void salva(RandomAccessFile out) throws IOException {
        out.writeInt(this.getIdConta());
        out.writeInt(this.getDigito());
        out.writeUTF(this.getDataDeCriacao());
        out.writeFloat(this.getSaldo());
        out.writeFloat(this.getTaxaDeManutencao());
    }
     
}
