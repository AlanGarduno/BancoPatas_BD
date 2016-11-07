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
public class Seguro_Inmoviliario 
{
    private int ID_Seguro;
    private int ID_cliente;
    private int ID_Direccion;

    public Seguro_Inmoviliario(int ID_Seguro, int ID_cliente, int ID_Direccion) {
        this.ID_Seguro = ID_Seguro;
        this.ID_cliente = ID_cliente;
        this.ID_Direccion = ID_Direccion;
    }

    public Seguro_Inmoviliario() {
    }

    public int getID_Seguro() {
        return ID_Seguro;
    }

    public int getID_cliente() {
        return ID_cliente;
    }

    public int getID_Direccion() {
        return ID_Direccion;
    }
    
    
    
}
