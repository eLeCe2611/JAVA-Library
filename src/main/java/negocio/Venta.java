package negocio;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
/**
 *
 * @author Pablo Falcon - Luis Carmona - Ivan Rodriguez
 */
public class Venta {
    private int idVenta;
    private Calendar fechaVenta;
    private double importeTotal;
    private List<LineaVenta> listaLineasVenta;

    public Venta(int idVenta, Calendar fecha, double importeTotal, 
            List<LineaVenta> listaLineasVenta) {
        this.idVenta = idVenta;
        this.fechaVenta = fecha;
        this.importeTotal = importeTotal;
        this.listaLineasVenta = new ArrayList<>();
    }

    @Override
    public String toString() {
        SimpleDateFormat formatoCalendario = new SimpleDateFormat("dd-MM-yyyy");
        String cadenaFechaVenta = formatoCalendario.format(fechaVenta.getTime());
        return "{" + "idVenta=" + idVenta + ", fecha=" + cadenaFechaVenta 
                + ", importeTotal=" + importeTotal + "}\n";
    }

}
