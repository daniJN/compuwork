/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test.LogicaNegocio;

import LogicaNegocio.Empleado;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
 *
 * @author Dani
 */
public class EmpleadoTest {
    @Test
    public void testCalcularSalario() {
        Empleado empleado = new Empleado(1, "Laura", "Programadora", 1000.0, "permanente");
        double salarioEsperado = 1100.0;
        double salarioReal = empleado.calcularSalario();

        assertEquals(salarioEsperado, salarioReal, 0.01);
        
    }
}


