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
public class Tarjeta 
{
    
    private int ID_Tarjeta;
    private int CVV;
    private Date Vigencia;
    private int ID_Cuenta;

    public Tarjeta(int CVV, Date Vigencia, int ID_Cuenta) {
        this.CVV = CVV;
        this.Vigencia = Vigencia;
        this.ID_Cuenta = ID_Cuenta;
    }

    public int getID_Tarjeta() {
        return ID_Tarjeta;
    }

    public int getCVV() {
        return CVV;
    }

    public Date getVigencia() {
        return Vigencia;
    }

    public int getID_Cuenta() {
        return ID_Cuenta;
    }

    public void setVigencia(Date Vigencia) {
        this.Vigencia = Vigencia;
    }
    
    
    
    
}
