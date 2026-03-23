package controladora;

import java.util.ArrayList;
import java.util.List;
import negocio.Venta;
/**
 *
 * @author Pablo Falcon - Luis Carmona - Ivan Rodriguez
 */
public class Tpv {
    private List<Venta> listaVentas;
    
    public Tpv() {
        this.listaVentas = new ArrayList<>();
    }
    
    public void mostrarVentas(){
        System.out.println("Lista de Ventas");
        System.out.println(listaVentas);
    }
    
    public void agregaVenta(Venta venta){
        listaVentas.add(venta);
    }

    @Override
    public String toString() {
        return "Tpv{" + "listaVentas=" + listaVentas + '}';
    }

}
