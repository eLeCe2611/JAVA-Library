package negocio;
/**
 *
 * @author Pablo Falcon - Luis Carmona - Ivan Rodriguez
 */
public class LineaVenta {
    private double importeVenta;
    private Libro libro;

    public LineaVenta(double importeVenta, Libro libro) {
        this.importeVenta = importeVenta;
        this.libro = libro;
    }

    public double getImporteVenta() {
        return importeVenta;
    }

    public void setImporteVenta(double importeVenta) {
        this.importeVenta = importeVenta;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    
    @Override
    public String toString() {
        return "{" + "importeVenta=" + importeVenta + ", libro=" + libro + '}';
    }
    
    
}
