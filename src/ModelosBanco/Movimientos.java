/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelosBanco;

import java.sql.Date;

/**
 *
 * @author JCVELMON
 */
public class Movimientos
{
    private int ID_Movimiento;
    private Date Fecha;

    public Movimientos(Date Fecha) {
        this.Fecha = Fecha;
    }

    public Movimientos() {
    }

    public int getID_Movimiento() {
        return ID_Movimiento;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }
    
    
}
