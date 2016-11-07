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
public class Seguro_Automovil 
{
    private String Placas;
    private int ID_Seguro;
    private int ID_Cliente;

    public Seguro_Automovil(String Placas, int ID_Seguro, int ID_Cliente) {
        this.Placas = Placas;
        this.ID_Seguro = ID_Seguro;
        this.ID_Cliente = ID_Cliente;
    }

    public Seguro_Automovil() {
    }

    public String getPlacas() {
        return Placas;
    }

    public int getID_Seguro() {
        return ID_Seguro;
    }

    public int getID_Cliente() {
        return ID_Cliente;
    }

    public void setPlacas(String Placas) {
        this.Placas = Placas;
    }
    
    
    
}
