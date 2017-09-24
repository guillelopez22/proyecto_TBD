package base.de.datos.pkg1;


public class Clientes {
    int id_Cliente;
    String Primer_nombre;
    String Segundo_nombre;
    String Primer_apellido;
    String Segundo_Apellido;
    String Usuario;
    String Contraseña;
    String Direccion;
    int telefono;
    String email;
    int placa_automovil;

    public Clientes(int id_Cliente, String Primer_nombre, String Segundo_nombre, String Primer_apellido, String Segundo_Apellido, String Usuario, String Contraseña, String Direccion, int telefono, String email) {
        this.id_Cliente = id_Cliente;
        this.Primer_nombre = Primer_nombre;
        this.Segundo_nombre = Segundo_nombre;
        this.Primer_apellido = Primer_apellido;
        this.Segundo_Apellido = Segundo_Apellido;
        this.Usuario = Usuario;
        this.Contraseña = Contraseña;
        this.Direccion = Direccion;
        this.telefono = telefono;
        this.email = email;
    }

    public Clientes(int id_Cliente, String Primer_nombre, String Segundo_nombre, String Primer_apellido, String Segundo_Apellido, String Usuario, String Contraseña, String Direccion, int telefono, String email, int placa_automovil) {
        this.id_Cliente = id_Cliente;
        this.Primer_nombre = Primer_nombre;
        this.Segundo_nombre = Segundo_nombre;
        this.Primer_apellido = Primer_apellido;
        this.Segundo_Apellido = Segundo_Apellido;
        this.Usuario = Usuario;
        this.Contraseña = Contraseña;
        this.Direccion = Direccion;
        this.telefono = telefono;
        this.email = email;
        this.placa_automovil = placa_automovil;
    }

    public int getId_Cliente() {
        return id_Cliente;
    }

    public void setId_Cliente(int id_Cliente) {
        this.id_Cliente = id_Cliente;
    }

    public String getPrimer_nombre() {
        return Primer_nombre;
    }

    public void setPrimer_nombre(String Primer_nombre) {
        this.Primer_nombre = Primer_nombre;
    }

    public String getSegundo_nombre() {
        return Segundo_nombre;
    }

    public void setSegundo_nombre(String Segundo_nombre) {
        this.Segundo_nombre = Segundo_nombre;
    }

    public String getPrimer_apellido() {
        return Primer_apellido;
    }

    public void setPrimer_apellido(String Primer_apellido) {
        this.Primer_apellido = Primer_apellido;
    }

    public String getSegundo_Apellido() {
        return Segundo_Apellido;
    }

    public void setSegundo_Apellido(String Segundo_Apellido) {
        this.Segundo_Apellido = Segundo_Apellido;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPlaca_automovil() {
        return placa_automovil;
    }

    public void setPlaca_automovil(int placa_automovil) {
        this.placa_automovil = placa_automovil;
    }

    @Override
    public String toString() {
        return "Clientes{" + "id_Cliente=" + id_Cliente + ", Primer_nombre=" + Primer_nombre + ", Segundo_nombre=" + Segundo_nombre + ", Primer_apellido=" + Primer_apellido + ", Segundo_Apellido=" + Segundo_Apellido + ", Usuario=" + Usuario + ", Contrase\u00f1a=" + Contraseña + ", Direccion=" + Direccion + ", telefono=" + telefono + ", email=" + email + ", placa_automovil=" + placa_automovil + '}';
    }
    
    
}//Fin de la clase
