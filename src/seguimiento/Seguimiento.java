package seguimiento;
import logica.Envio;
import logica.IEnvio;

public class Seguimiento implements IEnvio{
    public void cargarMercancia() {
        //Cargando mercancia
    }

    public void rastrearPaquete() {
        //rastreando paquete
    }



    public boolean permitidoEnAvion(Envio envio) {
        if (("Internacional").equals(envio.tipoEnvio())) {
            if (100 > envio.precioEnvio()) {
                return true;
            } else {
                return false;
            }
        }
        throw new IllegalArgumentException("no es posible cargar en avion un envio que no sea internacional");
    }

}
