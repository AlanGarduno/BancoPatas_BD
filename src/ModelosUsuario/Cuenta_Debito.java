/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelosUsuario;

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
    
    
    
}
