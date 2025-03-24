/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LogicaNegocio;

/**
 *
 * @author Dani
 */
    public class Permanente extends Empleado {
    private String contratoAnual;
    private double sueldo;

    public Permanente(int id, String nombre, String cargo, double salario, String contratoAnual, int sueldo) {
        super(id, nombre, cargo, salario, "Permanente");
        this.contratoAnual = contratoAnual;
        this.sueldo = sueldo;
    }

    public String getContratoAnual() {
        return contratoAnual;
    }

    public void setContratoAnual(String contratoAnual) {
        this.contratoAnual = contratoAnual;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    
    public void aceptarContrato() {
        System.out.println("Contrato anual aceptado: " + contratoAnual);
    }
    
   
   
}
