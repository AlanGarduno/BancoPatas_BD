/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelosUsuario;
import java.sql.*;
import Controlador.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author JCVELMON
 */
public class Tarjeta 
{
    
    private int ID_Tarjeta;
    private int CVV;   
    private String Vigencia;
    private int ID_Cuenta;
    private int PIN;
    
    public Tarjeta(){
        ID_Tarjeta =0;
        CVV= 0;
        Vigencia="";
        ID_Cuenta=0;
        PIN=0;
    }

    public Tarjeta(int ID_Tarjeta,int CVV, String Vigencia, int ID_Cuenta, int PIN) {
        this.ID_Tarjeta = ID_Tarjeta;
        this.CVV = CVV;
        this.Vigencia = Vigencia;
        this.ID_Cuenta = ID_Cuenta;
        this.PIN = PIN;
        
    }

    
    
     public void setCVV(int CVV) {
        this.CVV = CVV;
    }


    public void setID_Tarjeta(int ID_Tarjeta) {
        this.ID_Tarjeta = ID_Tarjeta;
    }

 
    
    

    public void setID_Cuenta(int ID_Cuenta) {
        this.ID_Cuenta = ID_Cuenta;
    }


    public int getID_Tarjeta() {
        return ID_Tarjeta;
    }
    
    public int getCVV() {
        return CVV;
    }

    public String getVigencia() {
        return Vigencia;
    }

    public int getID_Cuenta() {
        return ID_Cuenta;
    }

    public void setVigencia(String Vigencia) {
        this.Vigencia = Vigencia;   
    }

    public int getPIN() {
        return PIN;
    }

    public void setPIN(int PIN) {
        this.PIN = PIN;
    }
    
    public void registrarTarjeta()
    {
        Controlador query = new Controlador();
        String sql = "INSERT INTO tarjeta VALUES" +"(" +ID_Tarjeta+","+CVV+","+Vigencia+","+ID_Cuenta+","+PIN+")";
        query.insertar(sql);
    }
    
    public void cambiarNIP(int nipActual, int nipNuevo)
    {
        int camp = 0;
        String update = null;
        ResultSet rs;
        Controlador query = new Controlador();
        String sql = "SELECT * FROM tarjeta WHERE PIN ='"+nipActual+"'";
        rs = query.consultar(sql);
        try {
            while(rs.next())
            {
                camp =rs.getInt("PIN");
            }
            if(camp == nipActual)
            {
                update = "UPDATE tarjeta SET PIN ='"+nipNuevo+"' WHERE PIN = '"+nipActual+"'";
                query.insertar(update);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Tarjeta.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
}
