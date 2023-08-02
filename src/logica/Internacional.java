package logica;

public class Internacional extends Envio {
    @Override
    public String tipoEnvio() {
        return "Internacional";
    }

    @Override
    public int precioEnvio() {
        return 25000;
    }
}
