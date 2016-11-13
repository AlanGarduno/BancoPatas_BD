
package Pruebas;

import Controlador.*;
import ModelosBanco.*;
import com.mysql.jdbc.Connection;
import ModelosUsuario.*;
import java.sql.SQLException;
import vista.ATM.*;

public class PruebaConexion
{

    public static void main(String[] args) throws SQLException
    {
        Conexion conn = new Conexion();
        Connection ref = conn.getConnection();
       // Cuenta c = new Cuenta();
        //Tarjeta tar = new Tarjeta( 23 ,589,"1999"+"12"+"07",46,6123);
        //tar.registrarTarjeta();
        ATM_ses ATMlog = new ATM_ses();
        CajeroATMDAO cajerodao= new CajeroATMDAO();
        ControladorATM controlcajero = new ControladorATM(ATMlog, cajerodao);
        ATMlog.setVisible(true);
        
    }
}
