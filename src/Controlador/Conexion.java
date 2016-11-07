package Controlador;

//Se conecta a Mysql 

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class Conexion 
{
    private static Connection conn;
    private static final String driver="com.mysql.jdbc.Driver";
    private static final String user = "root";
    private static final String pass = "0709";
    private static final String url = "jdbc:mysql://localhost:3306/banco_cdmx";
    public Conexion ()
    {
        conn = null;
        try
        {
          Class.forName(driver);
          conn = (Connection) DriverManager.getConnection(url, user, pass);
          if(conn != null)
          {
              System.out.println("Conexion establecida");
          }
        }
        catch(ClassNotFoundException | SQLException e)
        {
            System.out.println("Error al conectar"+e);
        }
    }
    
    public Connection getConnection()
    {
        return conn;
    }
    
    public void desconectar()
    {
        conn = null;
        if(conn == null)
        {
            System.out.println("Conexion terminada");
        }
    }
}
