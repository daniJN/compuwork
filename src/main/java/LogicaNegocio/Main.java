/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LogicaNegocio;

import CapaPresentacion.VentanaPrincipal;

/**
 *
 * @author Dani
 */
public class Main {
    public static void main(String[] args) {
        
        VentanaPrincipal ventana = new VentanaPrincipal();
        ventana.setVisible(true);
        
        try {
            // Crear empleados
            Permanente emp1 = new Permanente(1, "Laura Gómez", "Analista", 3000, "Contrato 2024", 3500);
            Temporal emp2 = new Temporal(2, "Carlos Ruiz", "Soporte", 2000, "Contrato Semestral", 160);

            // Crear departamento y asignar empleados
            Departamento depto = new Departamento(101, "TI");
            depto.creacionDepartamentos();
            depto.agregarEmpleado(emp1);
            depto.agregarEmpleado(emp2);
            depto.visualizarEmpleadosPorDepto();

            // Generar Reporte
            ReporteDesempeno reporte = new ReporteDesempeno(1, emp1.id, depto.getId());
            reporte.generarReportePorEmpleado(emp1);
            reporte.generarReportePorDepto(depto);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
