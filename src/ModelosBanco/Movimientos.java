/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelosBanco;
import Controlador.Controlador;

/**
 *
 * @author JCVELMON
 */
public class Movimientos
{
    private int ID_Movimiento;
    private int Cuenta_ID_Cuenta;
    private String Fecha;
    private double Monto;

    public Movimientos(int Cuenta_ID_Cuenta, String Fecha, double Monto) {
        this.Cuenta_ID_Cuenta = Cuenta_ID_Cuenta;
        this.Fecha = Fecha;
        this.Monto = Monto;
    }

    

    public Movimientos() {
    }

    public int getID_Movimiento() {
        return ID_Movimiento;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public int getCuenta_ID_Cuenta() {
        return Cuenta_ID_Cuenta;
    }

    public void setCuenta_ID_Cuenta(int Cuenta_ID_Cuenta) {
        this.Cuenta_ID_Cuenta = Cuenta_ID_Cuenta;
    }

    public double getMonto() {
        return Monto;
    }

    public void setMonto(double monto) {
        this.Monto = monto;
    }
    
    
    
    public void registrarMovimiento( )
    {
        Controlador query = new Controlador();
        String sql = "INSERT INTO movimientos VALUES"+"("+Fecha+","+Cuenta_ID_Cuenta+","+Monto+")";
        query.insertar(sql);
        
    }
    
    
    
    
    
}
