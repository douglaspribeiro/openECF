package com.openECF.printer.bematech;

import com.openECF.printer.Printer;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


/**
 * Created by douglas.ribeiro on 08/04/2016.
 */
public class BematechPrinterTest {

    Printer printer;

    @Before
    public void before() throws Exception {
        System.out.println("Iniciando Test bematech");
        printer = new BematechPrinter();
    }

    @After
    public void after() throws Exception {
        System.out.println("Finalizando Test bematech");
    }

    /**
     * Method: retornoImpressora()
     */
    //@Test
    public void testRetornoImpressora() throws Exception {
        Assert.fail("not Implemented");
    }

    /**
     * Method: leituraX()
     */
    //@Test
    public void testLeituraX() throws Exception {
        Assert.fail("not Implemented");
    }

    /**
     * Method: reducaoZ()
     */
    //@Test
    public void testReducaoZ() throws Exception {
        Assert.fail("not Implemented");
    }

    /**
     * Method: abreDia(final float valor)
     */
    //@Test
    public void testAbreDia() throws Exception {
        Assert.fail("not Implemented");
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
    //@Test
    public void testInformaPagamento() throws Exception {
        Assert.fail("not Implemented");
    }

    /**
     * Method: fechaCupomResumido()
     */
    //@Test
    public void testFechaCupomResumido() throws Exception {
        Assert.fail("not Implemented");
    }

    /**
     * Method: horarioVerao()
     */
    //@Test
    public void testHorarioVerao() throws Exception {
        Assert.fail("not Implemented");
    }

    /**
     * Method: memoriaFiscalPorData(final String data1, final String data2)
     */
    //@Test
    public void testMemoriaFiscalPorData() throws Exception {
        Assert.fail("not Implemented");
    }

    /**
     * Method: memoriaFiscalPorReducao(final String red1, final String red2)
     */
    //@Test
    public void testMemoriaFiscalPorReducao() throws Exception {
        Assert.fail("not Implemented");
    }

    /**
     * Method: cancelaCupom()
     */
    //@Test
    public void testCancelaCupom() throws Exception {
        Assert.fail("not Implemented");
    }

    /**
     * Method: vendeItem(final String codigo, final String descricao, final String aliquota, final String tipoQtde, final String qtde, final int casasDecimais, final String vlrUnitario, final String tipoDesconto, final String vlrDesconto)
     */
    //@Test
    public void testVendeItem() throws Exception {
        Assert.fail("not Implemented");
    }

    /**
     * Method: cancelaItemAnterior()
     */
    //@Test
    public void testCancelaItemAnterior() throws Exception {
        Assert.fail("not Implemented");
    }

    /**
     * Method: cancelaItemGenerico(final String item)
     */
    //@Test
    public void testCancelaItemGenerico() throws Exception {
        Assert.fail("not Implemented");
    }

    /**
     * Method: programaAliquota(final String aliquota)
     */
    //@Test
    public void testProgramaAliquota() throws Exception {
        Assert.fail("not Implemented");
    }

    /**
     * Method: iniciaFechamento()
     */
    //@Test
    public void testIniciaFechamento() throws Exception {
        Assert.fail("not Implemented");
    }

    /**
     * Method: finalizaFechamento(final String mensagem)
     */
    //@Test
    public void testFinalizaFechamento() throws Exception {
        Assert.fail("not Implemented");
    }


}
