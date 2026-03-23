package vista;

import controladora.Libreria;
import controladora.Tpv;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;
import negocio.Libro;
import negocio.LineaVenta;
import negocio.Vendedor;
import negocio.Venta;

/**
 *
 * @author Pablo Falcon - Luis Carmona - Ivan Rodriguez
 */
public class Pantalla {
    
    private static Libreria libreria;
    private static Tpv tpv;
    
    public static void main(String[] args) {
        libreria = new Libreria();
        tpv = new Tpv();
        gestionMenus();
    }    
    
    public static void gestionMenus() {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        while (opcion != 5) {
            menuPrincipal();
            opcion = sc.nextInt();

            
            if (opcion == 1) {
                libreria.mostrarVendedores();
                menuVendedores();
            }
            
            if (opcion == 2) {
                libreria.mostrarLibros();
                menuLibros();
            }
            
            if (opcion == 3) {
                libreria.mostrarLibros();
                menuVenta();
            }
            
            if (opcion == 4) {
                libreria.mostrarLibros();
                menuListados();
            }
        }
        
        sc.close();
        System.out.println("FIN DEL PROGRAMA ");
    }
    
    public static void menuPrincipal() {
        System.out.println("### MENU PRINCIPAL ###");
        System.out.println("1. Vendedores ");
        System.out.println("2. Libros ");
        System.out.println("3. Venta ");
        System.out.println("4. Listados ");
        System.out.println("5. Salir ");
        System.out.println("######################");
        System.out.println("Teclee Opcion ");
    }
    
    public static void menuVendedores() {
        System.out.println("### MENU VENDEDORES ###");
        System.out.println("1. Alta Vendedor ");
        System.out.println("2. Ver bonos ");
        System.out.println("3. Cambiar porcentaje Bono ");
        System.out.println("4. Salir ");
        System.out.println("######################");
        System.out.println("Teclee Opcion ");
        
        Scanner sc = new Scanner(System.in);
        int opcion = sc.nextInt();
        if (opcion == 1) {
            altaVendedor(); 
        }
        if (opcion == 2) {
            verBonos(); 
        }
        if (opcion == 3) {
            cambiarPorcentajeBono(); 
        }
    }
    
    public static void menuLibros() {
        System.out.println("### MENU LIBROS ###");
        System.out.println("1. Alta Libro ");
        System.out.println("2. Retirar Libro ");
        System.out.println("3. Salir ");
        System.out.println("######################");
        
        Scanner sc = new Scanner(System.in);
        int opcion = sc.nextInt();
        if (opcion == 1) {
            altaLibro(); 
        }
        if (opcion == 2) {
            retirarLibro(); 
        }
    }
    
    public static void menuVenta() {
        System.out.println("### MENU VENTA ###");
        System.out.println("1. Realizar Venta ");
        System.out.println("2. Mostrar Ventas ");
        System.out.println("3. Salir ");
        System.out.println("######################");
        
        Scanner sc = new Scanner(System.in);
        int opcion = sc.nextInt();
        if (opcion == 1) {
            altaVenta(); 
        }
        if (opcion == 2) {
            tpv.mostrarVentas(); 
        }
    }
    
    public static void altaVendedor() {
        
        System.out.println("### ALTA VENDEDOR ###");
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Teclee dni");
        String dni = sc.next();
        System.out.println("Teclee telefono");
        String telefono = sc.next();
        System.out.println("Teclee email");
        String email = sc.next();
        System.out.println("Teclee nombre");
        String nombre = sc.next();

        Vendedor nuevoVendedor = new Vendedor(dni, telefono, email, nombre);
        System.out.println("Datos Vendedor: ");
        System.out.println(nuevoVendedor);
        libreria.agregaVendedor(nuevoVendedor);
        //sc.close();
    }
    
    public static void verBonos() {
        System.out.println("### VER BONOS ###");
        Scanner sc = new Scanner(System.in);
        System.out.println("Teclee dni del Vendedor");
        String dni = sc.next();
        Vendedor vendedor = libreria.obtenerVendedor(dni);
        System.out.println("El vendedor tiene este bono: " + vendedor.getTotalBono() + " Euros");
    }
    
    public static void cambiarPorcentajeBono() {
        System.out.println("### CAMBIAR PORCENTAJE BONO ###");
        Scanner sc = new Scanner(System.in);
        System.out.println("Teclee dni del Vendedor");
        String dni = sc.next();
        Vendedor vendedor = libreria.obtenerVendedor(dni);
        System.out.println("Vendedor a Modificar:");
        System.out.println(vendedor);
        System.out.println("Teclee nuevo porcentaje (ej: 15,50 para 15.50%) :");
        int nuevoPorcentaje = sc.nextInt();
        vendedor.setPorcentajeBono(nuevoPorcentaje);
        System.out.println("El nuevo porcentaje de bono es: " + vendedor.getTotalBono() + " Euros");
    }
    
    public static void altaLibro() {
        System.out.println("### ALTA LIBRO ###");
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Teclee idLibro");
        int idLibro = sc.nextInt();
        System.out.println("Teclee ISBN");
        int isbn = sc.nextInt();
        System.out.println("Teclee Titulo");
        String titulo = sc.next();
        System.out.println("Teclee autor");
        String autor = sc.next();
        System.out.println("Teclee Precio Maximo (ej: 6,75)");
        double precioMax = sc.nextDouble();
        System.out.println("Teclee Precio Minimo (ej: 5,75)");
        double precioMin = sc.nextDouble();
        
        System.out.println("Teclee dni del Vendedor");
        String dni = sc.next();
        Vendedor vendedor = libreria.obtenerVendedor(dni);
        
        Calendar hoy = Calendar.getInstance();
        Libro nuevoLibro = new Libro(idLibro, isbn, titulo, autor, precioMax, precioMin, hoy, null, vendedor);
        libreria.agregaLibro(nuevoLibro);
        //sc.close();
    }
    
    public static void retirarLibro(){
        System.out.println("### RETIRAR VENTA ###");
        Scanner sc = new Scanner(System.in);
        System.out.println("Teclee ID Libro");
        int idLibro = sc.nextInt();
        Libro libro = libreria.obtenerLibro(idLibro);
        libreria.retiraLibro(libro);
    }
    
    public static void altaVenta() {
        System.out.println("### ALTA VENTA ###");
        Scanner sc = new Scanner(System.in);
        System.out.println("Teclee idVenta");
        int idVenta = sc.nextInt();
        Calendar hoy = Calendar.getInstance();
        
        System.out.println("#### LINEAS DE VENTA ####");
        List<LineaVenta> listaLineasVenta = new ArrayList<>();
        int opcion = 1;
        while (opcion != 0){
            boolean libroVendible = false;
            Libro libro;
            
            while(!libroVendible) {
                System.out.println("Teclee ID Libro");
                int idLibro = sc.nextInt();
                libro = libreria.obtenerLibro(idLibro);  
                if(libro.getFechaRetirada()== null){
                    libroVendible = true;
                    System.out.println("Teclee Importe Venta");
                    double importeVenta = sc.nextDouble();
                    LineaVenta lineaVenta = new LineaVenta(importeVenta, libro);
                    listaLineasVenta.add(lineaVenta);
                } else {
                    System.out.println("ATENCION! Libro Vendido!");
                }
            }

            System.out.println("Teclee 1 para seguir");
            System.out.println("Teclee 0 para salir");
            opcion = sc.nextInt();
        }
        
        double importeTotal = 0;
        for(int i = 0; i < listaLineasVenta.size(); i++) {
            importeTotal += listaLineasVenta.get(i).getImporteVenta();
        }
        
        
        System.out.println("Pulse 1 para confirmar la venta");
        System.out.println("Pulse 0 para rechazar la venta");
        int opcionVenta = sc.nextInt();
        
        if(opcionVenta == 1){
            Venta venta = new Venta(idVenta, hoy, importeTotal, listaLineasVenta);
            tpv.agregaVenta(venta);
            
            libreria.retirarLibros(listaLineasVenta);
            libreria.agregaBonos(listaLineasVenta);
            
            System.out.print("\nVenta Actual: \n" + venta);
            System.out.println("Lineas de Venta: ");
            System.out.println(listaLineasVenta);
            System.out.println();
        }
        //sc.close();
    }
    
    public static void menuListados (){
        System.out.println("### MENU LISTADOS ###");
        System.out.println("1. Listar Libros por Orden alfabetico ");
        System.out.println("2. Listar Libros por Orden de Antiguedad ");
        System.out.println("3. Salir ");
        System.out.println("######################");
        
        Scanner sc = new Scanner(System.in);
        int opcion = sc.nextInt();
        if (opcion == 1) {
            libreria.mostrarLibrosPorNombre();
            
        }
        if (opcion == 2) {
            libreria.mostrarLibrosPorAntiguedad();
        }
    }
}
