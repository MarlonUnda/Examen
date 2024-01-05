/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examen;
import java.util.ArrayList;
/**
 *
 * @author Marloon
 */
public class IlustradoresGraficos extends Trabajadores {
    private final ArrayList<String> habilidades;

    
    public IlustradoresGraficos(String nombre, int idEmpleado, int edad, String email, String telefono) {
        super(nombre, "Ilustrador Gráfico", idEmpleado, edad, email, telefono);
        habilidades = new ArrayList<>();
    }

   
    public ArrayList<String> getHabilidades() {
        return habilidades;
    }

    public void agregarHabilidad(String habilidad) {
        habilidades.add(habilidad);
    }

  
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Habilidades: " + habilidades);
    }
}
