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
public class Tipo_Empleado 
{
    private int ID_Tipo_Empleado;
    private double salario;

    public Tipo_Empleado(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getID_Tipo_Empleado() {
        return ID_Tipo_Empleado;
    }
    
    
    
}
