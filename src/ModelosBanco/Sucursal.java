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
public class Sucursal 
{
    private int ID_Sucrsal;
    private int ID_Direccion;

    public Sucursal(int ID_Direccion) {
        this.ID_Direccion = ID_Direccion;
    }

    public int getID_Sucrsal() {
        return ID_Sucrsal;
    }

    public int getID_Direccion() {
        return ID_Direccion;
    }
    
    
    
}
