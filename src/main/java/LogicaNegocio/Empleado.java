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
    
    
}
