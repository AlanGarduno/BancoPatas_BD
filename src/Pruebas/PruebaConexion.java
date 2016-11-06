
package Pruebas;
import Controlador.*;
import com.mysql.jdbc.Connection;
import ModelosUsuario.Tarjeta;
import java.sql.SQLException;


public class PruebaConexion
{

    public static void main(String[] args) throws SQLException
    {
         Tarjeta tar = new Tarjeta();
         Controlador query = new Controlador();
         query.insertar("Tarjeta", "ID_Tarjeta","1");
         if(query.insertar("Tarjeta", "CVV","560")== true)
         {
             System.out.println("Exito");
         }
         query.insertar("Tarjeta", "Vigencia","07/09/2018");
         query.insertar("Tarjeta", "ID_Cuenta","1");
    }
}
