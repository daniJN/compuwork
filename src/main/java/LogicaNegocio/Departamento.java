/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LogicaNegocio;

import java.util.ArrayList;

/**
 *
 * @author Dani
 */
   
public class Departamento {
    private int id;
    private String nombre;
    private ArrayList<Empleado> listaDeEmpleados;

    public Departamento(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.listaDeEmpleados = new ArrayList<>();
    }

    public Departamento() {
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

    public ArrayList<Empleado> getListaDeEmpleados() {
        return listaDeEmpleados;
    }

    // Metodos
    
    public void setListaDeEmpleados(ArrayList<Empleado> listaDeEmpleados) {
        this.listaDeEmpleados = listaDeEmpleados;
    }
    
    
    public void creacionDepartamentos() {
        System.out.println("Departamento creado: " + nombre);
    }

    public void modificarDepartamentos(String nuevoNombre) {
        this.nombre = nuevoNombre;
    }

    public void eliminacionDepartamentos() {
        System.out.println("Departamento eliminado: " + nombre);
    }

    public void agregarEmpleado(Empleado e) throws Exception {
        if (e == null) throw new Exception("Empleado inválido.");
        listaDeEmpleados.add(e);
        System.out.println("Empleado " + e.nombre + " agregado al departamento " + nombre);
    }

    /*public void visualizarEmpleadosPorDepto() {
        System.out.println("Empleados del departamento " + nombre + ":");
        for (Empleado e : listaDeEmpleados) {
            System.out.println("- " + e.nombre + " (" + e.tipoEmpleado + ")");
        }
    }  
}   */
     public String visualizarEmpleadosPorDepto() { 
      StringBuilder sb = new StringBuilder();
      sb.append("Empleados del departamento ").append(nombre).append(":\n");

      if (listaDeEmpleados.isEmpty()) {
        sb.append("No hay empleados registrados.\n");
       } else {
         for (Empleado e : listaDeEmpleados) {
            sb.append("- ").append(e.getNombre())
              .append(" (").append(e.getTipoEmpleado()).append(")\n");
        }
    }
            return sb.toString();
  }
    
}    
  

