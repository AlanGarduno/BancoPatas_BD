package Controlador;
import com.mysql.jdbc.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Controlador
{
    
    private String tabla;
    private String campo;
    private Conexion conexion = new Conexion(); 
    private Connection conn;
    private Statement stm;
    private ResultSet rs;
    

    public Controlador() 
    {
       try
       {
           if((conn=conexion.getConnection()) == null)
           {
             JOptionPane.showMessageDialog(null,"ERROR");
           }
           stm = conn.createStatement();
       }catch(Exception e)
       {
           e.printStackTrace();
       }
    }
    

    
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
    
    public boolean insertar(String sql)
    {
        try
        {
            stm.executeUpdate(sql);
            return true;
        }catch(Exception e)
        {
            e.printStackTrace();
            return false;
        }
    }
        
    
    public ResultSet consultar(String sql)
    {
        try
        {
            rs = stm.executeQuery(sql);
            return rs;
        }catch(Exception e)
        {
            e.printStackTrace();
            return null;
        }
        
    }
    

}
