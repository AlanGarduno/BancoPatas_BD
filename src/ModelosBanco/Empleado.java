package ModelosBanco;

public class Empleado 
{
    private int ID_Empleado;
    private String Nombre;
    private String Apellido_Paterno;
    private String Apellido_Materno;
    private String FechaNac;
    private String CURP;
    private String RFC;
    private int Direccion_Empleado_ID_Direccion;
    private int Sucursal_ID_Sucursal;
    private int TipodeEmpleado_ID_Tipo_Empleado;

    public Empleado(String Nombre, String Apellido_Paterno, String Apellido_Materno, String FechaNac, String CURP, String RFC, int Direccion_Empleado_ID_Direccion, int Sucursal_ID_Sucursal, int TipodeEmpleado_ID_Tipo_Empleado) {
        this.Nombre = Nombre;
        this.Apellido_Paterno = Apellido_Paterno;
        this.Apellido_Materno = Apellido_Materno;
        this.FechaNac = FechaNac;
        this.CURP = CURP;
        this.RFC = RFC;
        this.Direccion_Empleado_ID_Direccion = Direccion_Empleado_ID_Direccion;
        this.Sucursal_ID_Sucursal = Sucursal_ID_Sucursal;
        this.TipodeEmpleado_ID_Tipo_Empleado = TipodeEmpleado_ID_Tipo_Empleado;
    }

    public Empleado() {
    }

    public int getID_Empleado() {
        return ID_Empleado;
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

    public String getFechaNac() {
        return FechaNac;
    }

    public String getCURP() {
        return CURP;
    }

    public String getRFC() {
        return RFC;
    }

    public int getDireccion_Empleado_ID_Direccion() {
        return Direccion_Empleado_ID_Direccion;
    }

    public int getSucursal_ID_Sucursal() {
        return Sucursal_ID_Sucursal;
    }

    public int getTipodeEmpleado_ID_Tipo_Empleado() {
        return TipodeEmpleado_ID_Tipo_Empleado;
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

    public void setFechaNac(String FechaNac) {
        this.FechaNac = FechaNac;
    }

    public void setCURP(String CURP) {
        this.CURP = CURP;
    }

    public void setRFC(String RFC) {
        this.RFC = RFC;
    }
    
    
    
}
