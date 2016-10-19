package Controlador;
import com.mysql.jdbc.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Controlador
{
    
    private String tabla;
    private String campo;
    private static Statement stm;
    private static ResultSet rs;
    

    public Controlador() 
    {
        
    }
    
    Conexion conn = new Conexion();
    Connection con = conn.getConnection();
    
    public String getTabla() {
        return tabla;
    }

    public void setTabla(String tabla) {
        this.tabla = tabla;
    }

    public String getCampo() {
        return campo;
    }

    public void setCampo(String campo) {
        this.campo = campo;
    }
    
    public boolean insertar(String tabla, String campo, double valor) throws SQLException
    {
        String sql = "INSERT INTO "+tabla+"("+campo+")"+"VALUES"+"("+valor+")";
        stm = con.createStatement();
        if(stm.execute(sql))
        {
            return true;
        }
        return false;
    }
    
        
    public boolean insertar(String tabla, String campo, String valor) throws SQLException
    {
        String sql = "INSERT INTO "+tabla+"("+campo+")"+"VALUES"+"("+valor+")";
        stm = con.createStatement();
        if(stm.execute(sql))
        {
            return true;
        }
        return false;
    }
    
    public boolean consultar(String tabla, String campo) throws SQLException
    {
        String sql = "SELECT FROM"+campo+" FROM"+tabla;
        stm = con.createStatement();
        if(stm.execute(sql))
        {
            return true;
        }
        return false;
        
    }
    
    public boolean buscar(String tabla, String campo, String condicion) throws SQLException
    {
        String sql = "SELECT "+campo+"FROM "+tabla+" WHERE "+condicion;
        if(stm.execute(sql))
        {
            return true;
        }
        return false;
    }

}
