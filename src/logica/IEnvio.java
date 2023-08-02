package logica;

public interface IEnvio {

  void cargarMercancia();

  void rastrearPaquete();

  boolean permitidoEnAvion(Envio envio);
}
