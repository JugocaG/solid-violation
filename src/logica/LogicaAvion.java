package logica;

public class LogicaAvion {
    private IEnvio avion;
    public LogicaAvion(IEnvio avion){
        this.avion = avion;
    }

    public void verificarPrecio(Envio envio){
        avion.permitidoEnAvion(envio);
    }
}
