/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelosBanco;

/**
 *
 * @author JCVELMON
 */
public class Seguro 
{
    private int ID_Seguro;
    private int Poliza;
    private int ID_Cliente;
    private int ID_Direccion;
    private double Monto_Aegurado;

    public Seguro(int Poliza, double Monto_Aegurado) {
        this.Poliza = Poliza;
        this.Monto_Aegurado = Monto_Aegurado;
    }
    
    public void setPoliza(int Poliza) {
        this.Poliza = Poliza;
    }

    public void setMonto_Aegurado(double Monto_Aegurado) {
        this.Monto_Aegurado = Monto_Aegurado;
    }

    public int getID_Seguro() {
        return ID_Seguro;
    }

    public int getPoliza() {
        return Poliza;
    }

    public double getMonto_Aegurado() {
        return Monto_Aegurado;
    }

    public int getID_Cliente() {
        return ID_Cliente;
    }

    public int getID_Direccion() {
        return ID_Direccion;
    }
    
    
    
    
    
    
    
    
    
}
