/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelosBanco;
import Controlador.Conexion;
import java.sql.*;

/**
 *
 * @author fernando
 */
public class CajeroATMDAO {
    public void  login(CajeroATM Ncajero){
         Conexion conexion = new Conexion(); 
         try{
             Statement estado= conexion.getConnection().createStatement();
             estado.executeUpdate("INSERT INTO CajeroATM Values ('"+Ncajero.getDinero_Disponible()+ "','"+Ncajero.getSucursal_ID()+"')");
         }catch (SQLException e){
                
         }
    }
    
}
