/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LogicaNegocio;

/**
 *
 * @author Dani
 */
public class Empleado {
    public int id;
    public String nombre;
    public String cargo;
    public double salario;
    public String tipoEmpleado;
    
    
    
    public Empleado(int id, String nombre, String cargo, double salario, String tipoEmpleado) {
        this.id = id;
        this.nombre = nombre;
        this.cargo = cargo;
        this.salario = salario;
        this.tipoEmpleado = tipoEmpleado;
    }

    public Empleado(int id, String nombre, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.salario = salario;
    }
    
    


   public void crearEmpleado() {
        System.out.println("Empleado creado: " + nombre);
    }

    public void actualizarEmpleado(String nuevoCargo, double nuevoSalario) {
        this.cargo = nuevoCargo;
        this.salario = nuevoSalario;
    }

    public void eliminarEmpleado() {
        System.out.println("Empleado eliminado: " + nombre);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getTipoEmpleado() {
        return tipoEmpleado;
    }

    public void setTipoEmpleado(String tipoEmpleado) {
        this.tipoEmpleado = tipoEmpleado;
    }
    
    public double calcularSalario() {
    double salarioFinal = salario;

    if (tipoEmpleado != null) {
        switch (tipoEmpleado.toLowerCase()) {
            case "tiempocompleto":
                salarioFinal += salario * 0.10; // 10% bono
                break;
            case "mediotiempo":
                salarioFinal += salario * 0.05; // 5% bono
                break;
            case "contratista":
                // Sin bono
                break;
            default:
                System.out.println("Tipo de empleado no reconocido.");
                break;
        }
    }

    return salarioFinal;
}
    public double calcularSalarioConBono() {
    double bono = 0;

    if (tipoEmpleado != null) {
        switch (tipoEmpleado.toLowerCase()) {
            case "temporal":
                bono = 0.10; // 10%
                break;
            case "permanente":
                bono = 0.20; // 20%
                break;
            default:
                bono = 0.05; // Otro tipo, 5%
                break;
        }
    }

    return salario + (salario * bono);
}


}
