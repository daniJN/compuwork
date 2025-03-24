/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LogicaNegocio;

/**
 *
 * @author Dani
 */
    public class Temporal extends Empleado{
       private String contratoSemestral;
       private int horasTrabajo;

    // Constructor corregido usando double en salario
    public Temporal(int id, String nombre, String cargo, double salario, String contratoSemestral, int horasTrabajo) {
        super(id, nombre, cargo, salario, "Temporal"); 
        this.contratoSemestral = contratoSemestral;
        this.horasTrabajo = horasTrabajo;
    }

    // Getters y Setters
    public String getContratoSemestral() {
        return contratoSemestral;
    }

    public void setContratoSemestral(String contratoSemestral) {
        this.contratoSemestral = contratoSemestral;
    }

    public int getHorasTrabajo() {
        return horasTrabajo;
    }

    public void setHorasTrabajo(int horasTrabajo) {
        this.horasTrabajo = horasTrabajo;
    }

    // Método para mostrar la información
    @Override
    public String toString() {
        return super.toString() + 
               "\nContrato Semestral: " + contratoSemestral +
               "\nHoras de Trabajo: " + horasTrabajo;
    }
}
