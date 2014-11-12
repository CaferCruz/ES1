/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contas;

import Operacoes.Operacao;
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
        update = "Taxa de rendimento alterada.\n" + "Taxa anterior: " + this.taxaDeRendimento + "Taxa atual: " + taxaDeRendimento
                + "Data da modificação: " + Operacao.pegaData();
        tipoUpdate = Conta.ESTRUTURAL;
        this.taxaDeRendimento = taxaDeRendimento;
    }

    // --------------------- Metodos -------------------------------------------
    @Override
    public void le(RandomAccessFile in) throws IOException {
//        setIdConta(in.readInt());
//        setLimite(in.readFloat());
//        setDataDeCriacao(in.readUTF());
//        setSaldo(in.readFloat());
//        setTaxaDeManutencao(in.readFloat());
//        setTaxaDeRendimento(in.readFloat());
    }
    @Override
    public void salva(RandomAccessFile out) throws IOException {
        out.writeInt(getIdConta());
        out.writeFloat(getLimite());
        out.writeUTF(getDataDeCriacao());
        out.writeFloat(getSaldo());
        out.writeFloat(getTaxaDeManutencao());
        out.writeFloat(taxaDeRendimento);
    }

    //--------------------- toString -------------------------------------------
    @Override
    public String toString() {
        return super.toString() + " | "
                + "Taxa de Rendimento: " + taxaDeRendimento;
    }

}
