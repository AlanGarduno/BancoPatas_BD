/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelosUsuario;

import java.sql.Date;

/**
 *
 * @author JCVELMON
 */
public class Cuenta_Credito 
{
    private double Monto; //Lo correcto seria saldo 
    private double Limite_Credito;
    private String Fecha_Corte;
    private int ID_Cuenta;

    public Cuenta_Credito(double Monto, double Limite_Credito, String Fecha_Corte, int ID_Cuenta) {
        this.Monto = Monto;
        this.Limite_Credito = Limite_Credito;
        this.Fecha_Corte = Fecha_Corte;
        this.ID_Cuenta = ID_Cuenta;
    }

    public Cuenta_Credito() {
    }

    public double getMonto() {
        return Monto;
    }

    public double getLimite_Credito() {
        return Limite_Credito;
    }

    public String getFecha_Corte() {
        return Fecha_Corte;
    }

    public int getID_Cuenta() {
        return ID_Cuenta;
    }

    public void setMonto(double Monto) {
        this.Monto = Monto;
    }

    public void setLimite_Credito(double Limite_Credito) {
        this.Limite_Credito = Limite_Credito;
    }

    public void setFecha_Corte(String Fecha_Corte) {
        this.Fecha_Corte = Fecha_Corte;
    }

    public void setID_Cuenta(int ID_Cuenta) {
        this.ID_Cuenta = ID_Cuenta;
    }
    
    
    
}
