
package Pruebas;
import Controlador.Conexion;
import com.mysql.jdbc.Connection;


public class PruebaConexion
{

    public static void main(String[] args)
    {
         Conexion conn = new Conexion();
         Connection ref = conn.getConnection();
    }
}
