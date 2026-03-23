package negocio;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author Pablo Falcon - Luis Carmona - Ivan Rodriguez
 */
public class Libro {
    private int idLibro;
    private int isbn;
    private String titulo;
    private String autor;
    private double precioMax;
    private double precioMin;
    private Calendar fechaDeposito;
    private Calendar fechaRetirada;
    private Vendedor vendedor;

    public Libro(int idLibro, int isbn, String titulo, String autor, 
            double precioMax, double precioMin, 
            Calendar fechaDeposito, Calendar fechaRetirada, 
            Vendedor vendedor) {
        this.idLibro = idLibro;
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.precioMax = precioMax;
        this.precioMin = precioMin;
        this.fechaDeposito = fechaDeposito;
        this.fechaRetirada = fechaRetirada;
        this.vendedor = vendedor;
    }
    
    

    public Libro() {
        this.idLibro = 0;
        this.isbn = 0;
        this.titulo = "";
        this.autor = "";
        this.precioMax = 0.0;
        this.precioMin = 0.0;
        this.fechaDeposito = null;
        this.fechaRetirada = null;
        this.vendedor = null;
    }
    
    

    public int getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(int idLibro) {
        this.idLibro = idLibro;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPrecioMax() {
        return precioMax;
    }

    public void setPrecioMax(double precioMax) {
        this.precioMax = precioMax;
    }

    public double getPrecioMin() {
        return precioMin;
    }

    public void setPrecioMin(double precioMin) {
        this.precioMin = precioMin;
    }

    public Calendar getFechaDeposito() {
        return fechaDeposito;
    }

    public void setFechaDeposito(Calendar fechaDeposito) {
        this.fechaDeposito = fechaDeposito;
    }

    public Calendar getFechaRetirada() {
        return fechaRetirada;
    }

    public void setFechaRetirada(Calendar fechaRetirada) {
        this.fechaRetirada = fechaRetirada;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }
    
    

    @Override
    public String toString() {
        SimpleDateFormat formatoCalendario = new SimpleDateFormat("dd-MM-yyyy");
        String cadenaFechaDeposito = formatoCalendario.format(fechaDeposito.getTime());
        
        String cadenaFechaRetirada =" ";
        if (fechaRetirada == null) {
            cadenaFechaRetirada = "null";
        } else {
            cadenaFechaRetirada = formatoCalendario.format(fechaRetirada.getTime());
        }
        
        
        return "libro{" + "idLibro=" + idLibro + ", isbn=" + isbn 
                + ", titulo=" + titulo + ", autor=" + autor 
                + ", precioMax=" + precioMax + ", precioMin=" + precioMin 
                + ", fechaDeposito=" + cadenaFechaDeposito 
                + ", fechaRetirada=" + cadenaFechaRetirada 
                + ", Vendedor=" + vendedor.getNombre()+ "}\n";
    }
    
    
    
    
}
