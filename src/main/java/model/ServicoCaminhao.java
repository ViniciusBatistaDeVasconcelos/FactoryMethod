package model;

public class ServicoCaminhao implements IServico {

    public String entregar() {
        return "O caminhão saiu para entrega!";
    }

    public String entregaFinalizada() {
        return "O caminhão chegou ao destino!";
    }
}
