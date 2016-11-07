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
public class Direccion_Empleado 
{
    private int ID_Direccion;
    private int Numero;
    private String Calle;
    private String Delegacion;

    public Direccion_Empleado(int ID_Direccion, int Numero, String Calle, String Delegacion) {
        this.ID_Direccion = ID_Direccion;
        this.Numero = Numero;
        this.Calle = Calle;
        this.Delegacion = Delegacion;
    }

    public Direccion_Empleado() {
    }

    public int getID_Direccion() {
        return ID_Direccion;
    }

    public void setID_Direccion(int ID_Direccion) {
        this.ID_Direccion = ID_Direccion;
    }

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

    public String getCalle() {
        return Calle;
    }

    public void setCalle(String Calle) {
        this.Calle = Calle;
    }

    public String getDelegacion() {
        return Delegacion;
    }

    public void setDelegacion(String Delegacion) {
        this.Delegacion = Delegacion;
    }
    
    
    
    
}
