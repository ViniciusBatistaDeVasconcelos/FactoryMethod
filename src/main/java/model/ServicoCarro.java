package model;

public class ServicoCarro implements IServico {
    public String entregar() {
        return "O carro saiu para entrega!";
    }

    public String entregaFinalizada() {
        return "O carro chegou ao destino!";
    }
}
