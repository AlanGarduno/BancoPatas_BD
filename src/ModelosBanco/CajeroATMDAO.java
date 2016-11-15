/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelosBanco;
import Controlador.*;
import ModelosUsuario.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author fernando
 */
public class CajeroATMDAO {
    Conexion  conexion=new Conexion();
    
    public void CajeroATMDAO(){
        
    }
    public Tarjeta Login(String tarj, String Cont){
        
        
        Tarjeta tarjeta = null ;
        System.out.println("1");
        Connection Conexion = conexion.getConnection();
         System.out.println("2");
         try{
             PreparedStatement ps = Conexion.prepareStatement("SELECT ID_Tarjeta, PIN from tarjeta WHERE Tarjeta=? and Contraseña=?");
             ps.setString(1, tarj);
             ps.setString(2, Cont);
             ResultSet rs =ps.executeQuery();
             if(rs.next()){
                 tarjeta = new Tarjeta();
                 tarjeta.setID_Tarjeta(rs.getInt(1));
                 tarjeta.setCVV(rs.getInt(2));
                 tarjeta.setVigencia(rs.getString(3));
                 tarjeta.setID_Cuenta(rs.getInt(4));
                 tarjeta.setPIN(rs.getInt(5));                 
                 return tarjeta ;
             }
             
         }catch (SQLException e){
             
             
                
         }
         return tarjeta;
    }




    
    
}
