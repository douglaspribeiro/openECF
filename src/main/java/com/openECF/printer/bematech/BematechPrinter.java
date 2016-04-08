package com.openECF.printer.bematech;

import com.openECF.printer.Printer;

/**
 * Created by douglas.ribeiro on 08/04/2016.
 */
public class BematechPrinter implements Printer {
    @Override
    public void retornoImpressora() {

    }

    @Override
    public void leituraX() {

    }

    @Override
    public void reducaoZ() {

    }

    @Override
    public void abreDia(final float valor) {

    }

    @Override
    public void abreCupom(final String messagem) {
        System.out.println("Realizando a abertura de cupom message: " + messagem);
    }

    @Override
    public void informaPagamento(final String tipo, final String valor) {

    }

    @Override
    public void fechaCupomResumido() {

    }

    @Override
    public void horarioVerao() {

    }

    @Override
    public void memoriaFiscalPorData(final String data1, final String data2) {

    }

    @Override
    public void memoriaFiscalPorReducao(final String red1, final String red2) {

    }

    @Override
    public void cancelaCupom() {

    }

    @Override
    public void vendeItem(final String codigo, final String descricao, final String aliquota, final String tipoQtde, final String qtde, final int casasDecimais, final String vlrUnitario, final String tipoDesconto, final String vlrDesconto) {

    }

    @Override
    public void cancelaItemAnterior() {

    }

    @Override
    public void cancelaItemGenerico(final String item) {

    }

    @Override
    public void programaAliquota(final String aliquota) {

    }

    @Override
    public void iniciaFechamento() {

    }

    @Override
    public void finalizaFechamento(final String mensagem) {

    }
}