package base.de.datos.pkg1;


public class Asesor {
    int id_Asesor;
    String Primer_nombre;
    String Segundo_nombre;
    String Primer_apellido;
    String Segundo_Apellido;
    String Usuario;
    String Contraseña;
    int tel_asignado;
    int Id_cita;

    public Asesor(int id_Asesor, String Primer_nombre, String Segundo_nombre, String Primer_apellido, String Segundo_Apellido, String Usuario, String Contraseña, int tel_asignado) {
        this.id_Asesor = id_Asesor;
        this.Primer_nombre = Primer_nombre;
        this.Segundo_nombre = Segundo_nombre;
        this.Primer_apellido = Primer_apellido;
        this.Segundo_Apellido = Segundo_Apellido;
        this.Usuario = Usuario;
        this.Contraseña = Contraseña;
        this.tel_asignado = tel_asignado;
    }

    public Asesor(int id_Asesor, String Primer_nombre, String Segundo_nombre, String Primer_apellido, String Segundo_Apellido, String Usuario, String Contraseña, int tel_asignado, int Id_cita) {
        this.id_Asesor = id_Asesor;
        this.Primer_nombre = Primer_nombre;
        this.Segundo_nombre = Segundo_nombre;
        this.Primer_apellido = Primer_apellido;
        this.Segundo_Apellido = Segundo_Apellido;
        this.Usuario = Usuario;
        this.Contraseña = Contraseña;
        this.tel_asignado = tel_asignado;
        this.Id_cita = Id_cita;
    }

    public int getId_Asesor() {
        return id_Asesor;
    }

    public void setId_Asesor(int id_Asesor) {
        this.id_Asesor = id_Asesor;
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

    public int getTel_asignado() {
        return tel_asignado;
    }

    public void setTel_asignado(int tel_asignado) {
        this.tel_asignado = tel_asignado;
    }

    public int getId_cita() {
        return Id_cita;
    }

    public void setId_cita(int Id_cita) {
        this.Id_cita = Id_cita;
    }

    @Override
    public String toString() {
        return "Asesor{" + "id_Asesor=" + id_Asesor + ", Primer_nombre=" + Primer_nombre + ", Segundo_nombre=" + Segundo_nombre + ", Primer_apellido=" + Primer_apellido + ", Segundo_Apellido=" + Segundo_Apellido + ", Usuario=" + Usuario + ", Contrase\u00f1a=" + Contraseña + ", tel_asignado=" + tel_asignado + ", Id_cita=" + Id_cita + '}';
    }
    
}//Fin de la clase
