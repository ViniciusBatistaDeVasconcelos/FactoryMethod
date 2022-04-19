package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ServicoCaminhaoTest {

    @Test
    void deveEfetuarEntrega() {
        IServico servico = ServicoFactory.obterServico("Caminhao");
        assertEquals("O caminhão saiu para entrega!", servico.entregar());
    }

    @Test
    void deveEncerrarEntrega() {
        IServico servico = ServicoFactory.obterServico("Caminhao");
        assertEquals("O caminhão chegou ao destino!", servico.entregaFinalizada());
    }
}