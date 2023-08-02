package logica;

public class Municipal extends Envio {
    @Override
    public String tipoEnvio() {
        return "Municipal";
    }

    @Override
    public int precioEnvio() {
        return 5000;
    }
}
