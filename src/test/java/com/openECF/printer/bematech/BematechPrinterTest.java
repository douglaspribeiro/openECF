package com.openECF.printer.bematech;

import com.openECF.printer.Printer;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


/**
 * Created by douglas.ribeiro on 08/04/2016.
 */
public class BematechPrinterTest {

    Printer printer;

    @Before
    public void before() throws Exception {
        printer = new BematechPrinter();
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: retornoImpressora()
     */
    @Test
    public void testRetornoImpressora() throws Exception {
//TODO: Test goes here...
    }

    /**
     * Method: leituraX()
     */
    @Test
    public void testLeituraX() throws Exception {

    }

    /**
     * Method: reducaoZ()
     */
    @Test
    public void testReducaoZ() throws Exception {
//TODO: Test goes here...
    }

    /**
     * Method: abreDia(final float valor)
     */
    @Test
    public void testAbreDia() throws Exception {
//TODO: Test goes here...
    }

    /**
     * Method: abreCupom(final String s)
     */
    @Test
    public void testAbreCupom() throws Exception {

        printer.abreCupom("Mensagem Abertura do Cupom");
    }

    /**
     * Method: informaPagamento(final String tipo, final String valor)
     */
    @Test
    public void testInformaPagamento() throws Exception {
//TODO: Test goes here...
    }

    /**
     * Method: fechaCupomResumido()
     */
    @Test
    public void testFechaCupomResumido() throws Exception {
//TODO: Test goes here...
    }

    /**
     * Method: horarioVerao()
     */
    @Test
    public void testHorarioVerao() throws Exception {
//TODO: Test goes here...
    }

    /**
     * Method: memoriaFiscalPorData(final String data1, final String data2)
     */
    @Test
    public void testMemoriaFiscalPorData() throws Exception {
//TODO: Test goes here...
    }

    /**
     * Method: memoriaFiscalPorReducao(final String red1, final String red2)
     */
    @Test
    public void testMemoriaFiscalPorReducao() throws Exception {
//TODO: Test goes here...
    }

    /**
     * Method: cancelaCupom()
     */
    @Test
    public void testCancelaCupom() throws Exception {
//TODO: Test goes here...
    }

    /**
     * Method: vendeItem(final String codigo, final String descricao, final String aliquota, final String tipoQtde, final String qtde, final int casasDecimais, final String vlrUnitario, final String tipoDesconto, final String vlrDesconto)
     */
    @Test
    public void testVendeItem() throws Exception {
//TODO: Test goes here...
    }

    /**
     * Method: cancelaItemAnterior()
     */
    @Test
    public void testCancelaItemAnterior() throws Exception {
//TODO: Test goes here...
    }

    /**
     * Method: cancelaItemGenerico(final String item)
     */
    @Test
    public void testCancelaItemGenerico() throws Exception {
//TODO: Test goes here...
    }

    /**
     * Method: programaAliquota(final String aliquota)
     */
    @Test
    public void testProgramaAliquota() throws Exception {
//TODO: Test goes here...
    }

    /**
     * Method: iniciaFechamento()
     */
    @Test
    public void testIniciaFechamento() throws Exception {
//TODO: Test goes here...
    }

    /**
     * Method: finalizaFechamento(final String mensagem)
     */
    @Test
    public void testFinalizaFechamento() throws Exception {
//TODO: Test goes here...
    }


}
