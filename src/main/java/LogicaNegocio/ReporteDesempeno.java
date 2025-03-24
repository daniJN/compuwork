/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LogicaNegocio;

import java.util.Date;

/**
 *
 * @author Dani
 */
public class ReporteDesempeno {
    
    private int id;
    private int idEmpleado;
    private int idDepartamento;
    private Date fechaIntervaloDesempenoEmpleado;
    
    public ReporteDesempeno(int id, int idEmpleado, int idDepartamento) {
        this.id = id;
        this.idEmpleado = idEmpleado;
        this.idDepartamento = idDepartamento;
        this.fechaIntervaloDesempenoEmpleado = new Date(); // Fecha actual
    
        
  }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public int getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(int idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    public Date getFechaIntervaloDesempeñoEmpleado() {
        return fechaIntervaloDesempenoEmpleado;
    }

    public void setFechaIntervaloDesempeñoEmpleado(Date fechaIntervaloDesempenoEmpleado) {
        this.fechaIntervaloDesempenoEmpleado = fechaIntervaloDesempenoEmpleado;
    }
    
    public String generarReportePorEmpleado(Empleado empleado) { 
    String reporte = "Reporte de desempeño del empleado: " + empleado.getNombre();
    return reporte;
    }
    public void generarReporteIndividual(Empleado empleado) {
        System.out.println("Reporte individual de: " + empleado.nombre);
    }

    public void generarReportePorDepto(Departamento depto) {
        System.out.println("Reporte por departamento: " + depto.getNombre());
    }

}