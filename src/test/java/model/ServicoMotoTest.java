package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ServicoMotoTest {

    @Test
    void deveEfetuarEntrega() {
        IServico servico = ServicoFactory.obterServico("Moto");
        assertEquals("A moto saiu para entrega!", servico.entregar());
    }

    @Test
    void deveEncerrarEntrega() {
        IServico servico = ServicoFactory.obterServico("Moto");
        assertEquals("A moto chegou ao destino!", servico.entregaFinalizada());
    }
}