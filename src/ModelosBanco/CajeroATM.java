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
public class CajeroATM 
{
    private int ID_CajeroATM;
    private double Dinero_Disponible;
    private int Sucursal_ID;

    public CajeroATM(double Dinero_Disponible, int Sucursal_ID) {
        this.Dinero_Disponible = Dinero_Disponible;
        this.Sucursal_ID = Sucursal_ID;
    }

    public CajeroATM() {
    }

    public int getID_CajeroATM() {
        return ID_CajeroATM;
    }

    public double getDinero_Disponible() {
        return Dinero_Disponible;
    }

    public int getSucursal_ID() {
        return Sucursal_ID;
    }

    public void setDinero_Disponible(double Dinero_Disponible) {
        this.Dinero_Disponible = Dinero_Disponible;
    }
    
    
}
