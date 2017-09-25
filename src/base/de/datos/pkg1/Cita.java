/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package base.de.datos.pkg1;

import java.sql.Date;

/**
 *
 * @author Guillermo
 */
public class Cita {
    private String Id_Cita;
    private String Nombre_Cliente;
    private String Tipo_Cita;
    private Date Fecha_Entrada;
    private int hora;
    private Date Fecha_Entrega;
    private String Estado;
    private String Cliente_Id_Cliente;
    private String Id_empleado_cita;
    private String Automovil_Placa;
    private String id_CitaMantenimiento;
    private String id_CitaReparacion;

    public Cita(String Id_Cita, String Nombre_Cliente, String Tipo_Cita, Date Fecha_Entrada, Date Fecha_Entrega, String Estado, String Cliente_Id_Cliente, String Id_empleado_cita, String Automovil_Placa, String id_CitaMantenimiento, String id_CitaReparacion) {
        this.Id_Cita = Id_Cita;
        this.Nombre_Cliente = Nombre_Cliente;
        this.Tipo_Cita = Tipo_Cita;
        this.Fecha_Entrada = Fecha_Entrada;
        this.Fecha_Entrega = Fecha_Entrega;
        this.Estado = Estado;
        this.Cliente_Id_Cliente = Cliente_Id_Cliente;
        this.Id_empleado_cita = Id_empleado_cita;
        this.Automovil_Placa = Automovil_Placa;
        this.id_CitaMantenimiento = id_CitaMantenimiento;
        this.id_CitaReparacion = id_CitaReparacion;
    }

    public String getId_Cita() {
        return Id_Cita;
    }

    public void setId_Cita(String Id_Cita) {
        this.Id_Cita = Id_Cita;
    }

    public String getNombre_Cliente() {
        return Nombre_Cliente;
    }

    public void setNombre_Cliente(String Nombre_Cliente) {
        this.Nombre_Cliente = Nombre_Cliente;
    }

    public String getTipo_Cita() {
        return Tipo_Cita;
    }

    public void setTipo_Cita(String Tipo_Cita) {
        this.Tipo_Cita = Tipo_Cita;
    }

    public Date getFecha_Entrada() {
        return Fecha_Entrada;
    }

    public void setFecha_Entrada(Date Fecha_Entrada) {
        this.Fecha_Entrada = Fecha_Entrada;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public Date getFecha_Entrega() {
        return Fecha_Entrega;
    }

    public void setFecha_Entrega(Date Fecha_Entrega) {
        this.Fecha_Entrega = Fecha_Entrega;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public String getCliente_Id_Cliente() {
        return Cliente_Id_Cliente;
    }

    public void setCliente_Id_Cliente(String Cliente_Id_Cliente) {
        this.Cliente_Id_Cliente = Cliente_Id_Cliente;
    }

    public String getId_empleado_cita() {
        return Id_empleado_cita;
    }

    public void setId_empleado_cita(String Id_empleado_cita) {
        this.Id_empleado_cita = Id_empleado_cita;
    }

    public String getAutomovil_Placa() {
        return Automovil_Placa;
    }

    public void setAutomovil_Placa(String Automovil_Placa) {
        this.Automovil_Placa = Automovil_Placa;
    }

    public String getId_CitaMantenimiento() {
        return id_CitaMantenimiento;
    }

    public void setId_CitaMantenimiento(String id_CitaMantenimiento) {
        this.id_CitaMantenimiento = id_CitaMantenimiento;
    }

    public String getId_CitaReparacion() {
        return id_CitaReparacion;
    }

    public void setId_CitaReparacion(String id_CitaReparacion) {
        this.id_CitaReparacion = id_CitaReparacion;
    }

    @Override
    public String toString() {
        return Id_Cita;
    }

    
    
    
    
    
    
}
