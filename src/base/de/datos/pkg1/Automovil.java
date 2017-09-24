package base.de.datos.pkg1;

public class Automovil {
    String Placa;
    String modelo;
    int num_motor;
    String id_cliente;

    public Automovil(String Placa, String modelo, int num_motor, String id_cliente) {
        this.Placa = Placa;
        this.modelo = modelo;
        this.num_motor = num_motor;
        this.id_cliente = id_cliente;
    }

    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String Placa) {
        this.Placa = Placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNum_motor() {
        return num_motor;
    }

    public void setNum_motor(int num_motor) {
        this.num_motor = num_motor;
    }

    public String getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(String id_cliente) {
        this.id_cliente = id_cliente;
    }

    @Override
    public String toString() {
        return "Automovil{" + "Placa=" + Placa + ", modelo=" + modelo + ", num_motor=" + num_motor + ", id_cliente=" + id_cliente + '}';
    }
    
}//Fin de la clase