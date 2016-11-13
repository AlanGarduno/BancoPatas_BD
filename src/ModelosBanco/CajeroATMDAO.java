/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelosBanco;
import Controlador.*;
import ModelosUsuario.*;
import java.sql.*;

/**
 *
 * @author fernando
 */
public class CajeroATMDAO {
    Conexion  conexion;
    
    public void CajeroATMDAO(){
        conexion=new Conexion();
    }
    public void Login(String tarj, String Cont){
        Tarjeta tarjeta;
        tarjeta = null;
         Connection Conexion = conexion.getConnection();
         try{
             PreparedStatement ps = Conexion.prepareStatement("SELECT ID_Tarjeta, PIN from tarjeta WHERE Tarjeta=? and Contraseña=?");
             ps.setString(1, tarj);
             ps.setString(2, Cont);
             ResultSet rs =ps.executeQuery();
             if(rs.next()){
                 tarjeta= new Tarjeta();
                 tarjeta.setID_Tarjeta(rs.getInt(1));
                 tarjeta.setCVV(rs.getInt(2));
                 tarjeta.setVigencia(rs.getString(3));
                 tarjeta.setID_Cuenta(rs.getInt(4));
                 tarjeta.setPIN(rs.getInt(5));                 
                // return tarjeta;
             }
             
         }catch (SQLException e){
                
         }
        //return tarjeta;
    }

//    public Tarjeta Login(String tarjeta, String conttraseña) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

 //   public CajeroATM login(String tarjeta, String contraseña) {
     //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   // }


    
    
}
