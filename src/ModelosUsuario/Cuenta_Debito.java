/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelosUsuario;
import Controlador.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author JCVELMON
 */
public class Cuenta_Debito 
{
    private double Monto;
    private int ID_Cuenta;

    public Cuenta_Debito(double Monto, int ID_Cuenta) {
        this.Monto = Monto;
        this.ID_Cuenta = ID_Cuenta;
    }

    public Cuenta_Debito() {
    }

    public double getMonto() {
        return Monto;
    }

    public int getID_Cuenta() {
        return ID_Cuenta;
    }

    public void setMonto(double Monto) {
        this.Monto = Monto;
    }

    public void setID_Cuenta(int ID_Cuenta) {
        this.ID_Cuenta = ID_Cuenta;
    }
    
    public double consultaSaldo(Tarjeta tar)
    {
        double monto = 0;
        ResultSet rs;
        Controlador query = new Controlador();
        String sql = "SELECT * FROM cuenta_debito WHERE Cuenta_ID_Cuenta = '"+tar.getID_Cuenta()+"' ";
        rs = query.consultar(sql);
        try 
        {
            while(rs.next())
            {
                monto = rs.getDouble("Monto");
            }
            return monto;
        } catch (SQLException ex) 
        {
             Logger.getLogger(Tarjeta.class.getName()).log(Level.SEVERE, null, ex);
        }
         
        return 0;
    }
    
    public void retiroEfectivo(double monto,Tarjeta tar)
    {
        double saldo = 0;
        ResultSet rs;
        Controlador query = new Controlador();
        Cuenta cs = new Cuenta();
        String sql = "SELECT * FROM cuenta_debito WHERE Cuenta_ID_Cuenta = '"+tar.getID_Cuenta()+"' ";
        rs = query.consultar(sql);
        try 
        {
            while(rs.next())
            {
                saldo = rs.getDouble("Monto");
            }
            if(saldo >= monto)
            {
                double res;
                res=saldo-monto;
                String update = "UPDATE cuenta_debito  SET Monto = '"+res+"' WHERE Cuenta_ID_Cuenta = '"+tar.getID_Cuenta()+"'";
                query.insertar(update);
            }
            else
            {
                JOptionPane.showConfirmDialog(null, "No se cuenta con el saldo suficiente");
            }
        } catch (SQLException ex) 
        {
             Logger.getLogger(Tarjeta.class.getName()).log(Level.SEVERE, null, ex);
        }
         
        
    }
    
}
