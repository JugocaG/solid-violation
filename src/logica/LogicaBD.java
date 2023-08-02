package logica;

public class LogicaBD {
    private IBD bd;
    public LogicaBD(IBD bd){
        this.bd = bd;
    }
    public void registrarEnvio(Envio envios){
        bd.crearTipoEnvio();
    }
}
