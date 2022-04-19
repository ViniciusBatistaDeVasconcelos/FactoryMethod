package model;

public class ServicoMoto implements IServico {

    public String entregar() {
        return "A moto saiu para entrega!";
    }

    public String entregaFinalizada() {
        return "A moto chegou ao destino!";
    }
}
