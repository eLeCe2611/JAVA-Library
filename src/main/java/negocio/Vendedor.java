package negocio;
/**
 *
 * @author Pablo Falcon - Luis Carmona - Ivan Rodriguez
 */
public class Vendedor {
    private String dni;
    private String telefono;
    private String email;
    private String nombre;
    private double totalBono;
    private double porcentajeBono;

    public Vendedor() {
        this.dni = "";
        this.telefono = "";
        this.email = "";
        this.nombre = "";
        this.totalBono = 0.0;
        this.porcentajeBono = 15.0;
    }

    public Vendedor(String dni, String telefono, 
            String email, String nombre) {
        this.dni = dni;
        this.telefono = telefono;
        this.email = email;
        this.nombre = nombre;
        this.totalBono = 0.0;
        this.porcentajeBono = 15.0;
    }
    
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getTotalBono() {
        return totalBono;
    }

    public void setTotalBono(double totalBono) {
        this.totalBono = totalBono;
    }
    
    public void incrementaBono(double importeVenta) {
        double porcentajeAplicable = this.porcentajeBono / 100;
        double bono = importeVenta * porcentajeAplicable;
        this.totalBono += bono;
    }

    public double getPorcentajeBono() {
        return porcentajeBono;
    }

    public void setPorcentajeBono(double porcentajeBono) {
        this.porcentajeBono = porcentajeBono;
    }
    
    

    @Override
    public String toString() {
        return "Vendedor{" + "dni=" + dni + ", telefono=" + telefono 
                + ", email=" + email + ", nombre=" + nombre  + "}\n";
    }

}
