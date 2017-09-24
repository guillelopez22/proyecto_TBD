/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package base.de.datos.pkg1;

/**
 *
 * @author Guillermo
 */
public class Empleado {
    private String id_Empleado;
    private String id_asesor;
    private String primer_nombre;
    private String segundo_nombre;
    private String primer_apellido;
    private String segundo_apellido;
    private String telefono_asigando;

    public Empleado(String id_Empleado, String id_asesor, String primer_nombre, String segundo_nombre, String primer_apellido, String segundo_apellido, String telefono_asigando) {
        this.id_Empleado = id_Empleado;
        this.id_asesor = id_asesor;
        this.primer_nombre = primer_nombre;
        this.segundo_nombre = segundo_nombre;
        this.primer_apellido = primer_apellido;
        this.segundo_apellido = segundo_apellido;
        this.telefono_asigando = telefono_asigando;
    }

    public String getId_Empleado() {
        return id_Empleado;
    }

    public void setId_Empleado(String id_Empleado) {
        this.id_Empleado = id_Empleado;
    }

    public String getId_asesor() {
        return id_asesor;
    }

    public void setId_asesor(String id_asesor) {
        this.id_asesor = id_asesor;
    }

    public String getPrimer_nombre() {
        return primer_nombre;
    }

    public void setPrimer_nombre(String primer_nombre) {
        this.primer_nombre = primer_nombre;
    }

    public String getSegundo_nombre() {
        return segundo_nombre;
    }

    public void setSegundo_nombre(String segundo_nombre) {
        this.segundo_nombre = segundo_nombre;
    }

    public String getPrimer_apellido() {
        return primer_apellido;
    }

    public void setPrimer_apellido(String primer_apellido) {
        this.primer_apellido = primer_apellido;
    }

    public String getSegundo_apellido() {
        return segundo_apellido;
    }

    public void setSegundo_apellido(String segundo_apellido) {
        this.segundo_apellido = segundo_apellido;
    }

    public String getTelefono_asigando() {
        return telefono_asigando;
    }

    public void setTelefono_asigando(String telefono_asigando) {
        this.telefono_asigando = telefono_asigando;
    }
    
    
}
