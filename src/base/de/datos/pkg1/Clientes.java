package base.de.datos.pkg1;


public class Clientes {
    String id_Cliente;
    String Primer_nombre;
    String Segundo_nombre;
    String Primer_apellido;
    String Segundo_Apellido;
    String codigo_seguimiento;
    String Direccion;
    String telefono;
    String email;
    String placa_automovil;

    public Clientes(String id_Cliente, String Primer_nombre, String Segundo_nombre, String Primer_apellido, String Segundo_Apellido, String codigo_seguimiento, String Direccion, String telefono, String email, String placa_automovil) {
        this.id_Cliente = id_Cliente;
        this.Primer_nombre = Primer_nombre;
        this.Segundo_nombre = Segundo_nombre;
        this.Primer_apellido = Primer_apellido;
        this.Segundo_Apellido = Segundo_Apellido;
        this.codigo_seguimiento = codigo_seguimiento;
        this.Direccion = Direccion;
        this.telefono = telefono;
        this.email = email;
        this.placa_automovil = placa_automovil;
    }

    public Clientes(String id_Cliente, String Primer_nombre, String Segundo_nombre, String Primer_apellido, String Segundo_Apellido, String codigo_seguimiento, String Direccion, String telefono, String email) {
        this.id_Cliente = id_Cliente;
        this.Primer_nombre = Primer_nombre;
        this.Segundo_nombre = Segundo_nombre;
        this.Primer_apellido = Primer_apellido;
        this.Segundo_Apellido = Segundo_Apellido;
        this.codigo_seguimiento = codigo_seguimiento;
        this.Direccion = Direccion;
        this.telefono = telefono;
        this.email = email;
    }
    

    public String getId_Cliente() {
        return id_Cliente;
    }

    public void setId_Cliente(String id_Cliente) {
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

    public String getCodigo_seguimiento() {
        return codigo_seguimiento;
    }

    public void setCodigo_seguimiento(String codigo_seguimiento) {
        this.codigo_seguimiento = codigo_seguimiento;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
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

    public String getPlaca_automovil() {
        return placa_automovil;
    }

    public void setPlaca_automovil(String placa_automovil) {
        this.placa_automovil = placa_automovil;
    }

    @Override
    public String toString() {
        return id_Cliente+" "+Primer_nombre+" "+Primer_apellido;
    }
  
    
    
}//Fin de la clase
