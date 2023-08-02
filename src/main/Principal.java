package main;
import bd.BDMySQL;
import logica.*;
import seguimiento.Seguimiento;

public class Principal {

  public static void main(String[] args) {

    imprimirTiempoDeEnvio(new Internacional());
    imprimirTiempoDeEnvio(new Municipal());
    LogicaBD logicaBD = new LogicaBD(new BDMySQL());
    logicaBD.registrarEnvio(new Municipal());
    logicaBD.registrarEnvio(new Internacional());
    LogicaAvion logicaAvion = new LogicaAvion(new Seguimiento());
    logicaAvion.verificarPrecio(new Internacional());
    logicaAvion.verificarPrecio(new Municipal());

  }

  public static void imprimirTiempoDeEnvio(Envio envios){
    System.out.println(envios.precioEnvio());
    System.out.println(envios.tipoEnvio());
    if(("Municipal").equals(envios.tipoEnvio())) System.out.println("Tiempo envio 12 horas");
    if(("Internacional").equals(envios.tipoEnvio())) System.out.println("Tiempo envio 190 horas");

  }
}
