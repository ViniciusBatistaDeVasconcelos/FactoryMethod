package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ServicoCarroTest {

    @Test
    void deveEfetuarEntrega() {
        IServico servico = ServicoFactory.obterServico("Carro");
        assertEquals("O carro saiu para entrega!", servico.entregar());
    }

    @Test
    void deveEncerrarEntrega() {
        IServico servico = ServicoFactory.obterServico("Carro");
        assertEquals("O carro chegou ao destino!", servico.entregaFinalizada());
    }
}