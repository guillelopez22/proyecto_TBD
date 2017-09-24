package base.de.datos.pkg1;

import java.sql.Connection;
import java.sql.DriverManager;


public class Conexion {
    String IP;
    String Puerto;
    String BD;
    String Usuario;
    String Clave;
    public Connection conn;

    public Conexion() {
        this.IP = "";
        this.Puerto = "";
        this.BD = "";
        this.Usuario = "";
        this.Clave = "";
        this.conn = null;
    }//Fin del constructor

    public Connection mkConnRe() throws Exception {
        try {
            /*Datos de la BD*/
            this.IP = "localhost";
            this.Puerto = "33066";
            this.BD = "DB_Taller";
            this.Usuario = "root";
            this.Clave = "7874Sbby";
            String driver = "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://" + this.IP + ":" + this.Puerto + "/" + this.BD
                    + "?noAccessToProcedureBodies=false&amp;zeroDateTimeBehavior=convertToNull";
            Class.forName(driver).newInstance();
            this.conn = DriverManager.getConnection(url, this.Usuario, this.Clave);
        } catch (Exception e) {
            e.printStackTrace();
        }//Fin del try catch
        return this.conn;
    }//Fin de la conexion
    
}//Fin de la clase
