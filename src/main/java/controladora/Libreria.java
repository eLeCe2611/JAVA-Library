package controladora;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;
import negocio.Libro;
import negocio.LineaVenta;
import negocio.Vendedor;

/**
 *
 * @author Pablo Falcon - Luis Carmona - Ivan Rodriguez
 */
public class Libreria {
    private List<Vendedor> listaVendedores;
    private List<Libro> listaLibros;

    public Libreria() {
        this.listaVendedores = new ArrayList<>();
        this.listaLibros = new ArrayList<>();
        inicializar();
    }
    
    private void inicializar() {
        // Saco el dia de hoy y de ayer como referencias para los libros
        Calendar hoy = Calendar.getInstance();
        Calendar ayer = Calendar.getInstance();
        ayer.add(Calendar.DAY_OF_MONTH, -5);
        
        listaVendedores.add(new Vendedor("1111", "955123123", "pablofalcon@upo.es", "Pablo Falcon"));
        listaVendedores.add(new Vendedor("2222", "955456456", "luiscarmona@upo.es", "Luis Carmona"));
        listaVendedores.add(new Vendedor("3333", "955678678", "ivanrodriguez@upo.es", "Ivan Rodriguez"));
        
        listaLibros.add(new Libro(1, 100, "Fundacion", "Asimov", 6.75, 5.00, hoy, null, obtenerVendedor("1111")));
        listaLibros.add(new Libro(2, 101, "Anochecer", "Asimov", 6.75, 5.00, ayer, null, obtenerVendedor("2222")));
        listaLibros.add(new Libro(3, 102, "Nemesis", "Asimov", 6.75, 5.00, hoy, null, obtenerVendedor("3333")));
    }

    public List<Libro> getListaLibros() {
        return listaLibros;
    }

    public void setListaLibros(List<Libro> listaLibros) {
        this.listaLibros = listaLibros;
    }
    
    public void mostrarVendedores(){
        System.out.println(listaVendedores.toString());
    }
    
    public void mostrarLibros(){
        System.out.println(listaLibros.toString());
    }
 
    public void agregaVendedor(Vendedor vendedor){
        listaVendedores.add(vendedor);
    }
    
    public void agregaLibro(Libro libro){
        listaLibros.add(libro);
    }
    
    public Vendedor obtenerVendedor (String dni){
        Vendedor vendedorDevuelto = new Vendedor();
        for (Vendedor vendedor : listaVendedores) {
            if (vendedor.getDni().equals(dni)) {
                vendedorDevuelto = vendedor;
            }
        }
        return vendedorDevuelto;
    }
    
    
    public Libro obtenerLibro (int idLibro){
        Libro libroDevuelto = new Libro();
        for (Libro libro : listaLibros) {
            if (libro.getIdLibro() == idLibro) {
                libroDevuelto = libro;
            }
        }
        return libroDevuelto;
    }
    
    public void retirarLibros (List<LineaVenta> listaLineasVenta){
        Libro libro;
        
        for (LineaVenta lineaVenta : listaLineasVenta) {
            libro = lineaVenta.getLibro();
            
            // https://stackoverflow.com/questions/54416960/updating-specific-attribute-of-an-arraylist-item
            retiraLibro(libro);
        }
    }
    
    public void agregaBonos (List<LineaVenta> listaLineasVenta){
        Libro libro;
        Vendedor vendedor;
        double importeVenta;
        for (LineaVenta lineaVenta : listaLineasVenta) {
            libro = lineaVenta.getLibro();
            vendedor = libro.getVendedor();
            importeVenta = lineaVenta.getImporteVenta();
            vendedor.incrementaBono(importeVenta);
        }
    }
    
    
    
    public void retiraLibro (Libro libroRetirado) {
        Calendar hoy = Calendar.getInstance();
        
        for (Libro libro: listaLibros) {
            if (libro.getIdLibro() == libroRetirado.getIdLibro()){
                libro.setFechaRetirada(hoy);
            }
        }
    }
    
    
    public void mostrarLibrosPorNombre() {
        // https://jarroba.com/ordenar-un-arraylist-en-java/
        
        List<Libro> nuevaListaLibros = this.listaLibros;
        Collections.sort(nuevaListaLibros, 
                (Libro t, Libro t1) -> t.getTitulo().compareTo(t1.getTitulo()));
        System.out.println(listaLibros.toString());
    }
    
    public void mostrarLibrosPorAntiguedad() {
        List<Libro> nuevaListaLibros = this.listaLibros;
        Collections.sort(nuevaListaLibros, 
                (Libro t, Libro t1) -> t.getFechaDeposito().compareTo(t1.getFechaDeposito()));
        System.out.println(listaLibros.toString());
    }
    
    
}
