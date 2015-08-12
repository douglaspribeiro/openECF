package com.openECF.printer;

/**
 * Created by douglas.ribeiro on 12/08/2015.
 */
public interface Printer {

    void retornoImpressora();

    void leituraX();

    void reducaoZ();

    void abreDia(float valor);

    void abreCupom(String s);

    void informaPagamento(String tipo, String valor);

    void fechaCupomResumido();

    void horarioVerao();

    void memoriaFiscalPorData(String data1, String data2);

    void memoriaFiscalPorReducao(String red1, String red2);

    void cancelaCupom();

    void vendeItem(String codigo, String descricao, String aliquota,
                   String tipoQtde, String qtde,
                   int casasDecimais, String vlrUnitario, String tipoDesconto, String vlrDesconto);

    void cancelaItemAnterior();

    void cancelaItemGenerico(String item);

    void programaAliquota(String aliquota);

    void iniciaFechamento();

    void finalizaFechamento(String mensagem);


}
