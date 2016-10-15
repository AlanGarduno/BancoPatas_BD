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
public class Cliente 
{
    private int ID_Cliente;
    private String Nombre;
    private String Apellido_Paterno;
    private String Apellido_Materno;
    private Date FechaNac;
    private String CURP;
    private String RFC;
    private int ID_Direccion_Cliente;
    private int ID_Sucursal;

    public Cliente(String Nombre, String Apellido_Paterno, String Apellido_Materno, Date FechaNac, String CURP, String RFC) {
        this.Nombre = Nombre;
        this.Apellido_Paterno = Apellido_Paterno;
        this.Apellido_Materno = Apellido_Materno;
        this.FechaNac = FechaNac;
        this.CURP = CURP;
        this.RFC = RFC;
    }

    public Cliente() {
    }

    public int getID_Cliente() {
        return ID_Cliente;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellido_Paterno() {
        return Apellido_Paterno;
    }

    public String getApellido_Materno() {
        return Apellido_Materno;
    }

    public Date getFechaNac() {
        return FechaNac;
    }

    public String getCURP() {
        return CURP;
    }

    public String getRFC() {
        return RFC;
    }

    public int getID_Direccion_Cliente() {
        return ID_Direccion_Cliente;
    }

    public int getID_Sucursal() {
        return ID_Sucursal;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setApellido_Paterno(String Apellido_Paterno) {
        this.Apellido_Paterno = Apellido_Paterno;
    }

    public void setApellido_Materno(String Apellido_Materno) {
        this.Apellido_Materno = Apellido_Materno;
    }

    public void setFechaNac(Date FechaNac) {
        this.FechaNac = FechaNac;
    }

    public void setCURP(String CURP) {
        this.CURP = CURP;
    }

    public void setRFC(String RFC) {
        this.RFC = RFC;
    }
    
    
    
    
    
    
}
