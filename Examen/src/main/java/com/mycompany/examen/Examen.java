/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.examen;

/**
 *
 * @author Marloon
 */
public class Examen {
        public static void main(String[] args) {
        // Crear un programador
        Programadores programador = new Programadores("Bryan Programador", 001, 25, "lex_2@email.com", "0987923523");
        programador.agregarHabilidad("Java");
        programador.agregarHabilidad("Python");

        
        IlustradoresGraficos ilustrador = new IlustradoresGraficos("Maria Ilustrador", 002, 30, "maria@email.com", "0986546221");
        ilustrador.agregarHabilidad("Diseño digital");
        ilustrador.agregarHabilidad("Ilustración tradicional");

        
        Gerentes gerente = new Gerentes("Lycia Gerente", 003, 35, "arla@email.com", "0991123344");
        gerente.agregarEmpleadoACargo(programador);
        gerente.agregarEmpleadoACargo(ilustrador);

        Editores editor = new Editores("lucas Editor", 004, 28, "luca@email.com", "09754312223", true);

     
        System.out.println("Información del Programador:");
        programador.mostrarInformacion();

        System.out.println("\nInformación del Ilustrador Gráfico:");
        ilustrador.mostrarInformacion();

        System.out.println("\nInformación del Gerente:");
        gerente.mostrarInformacion();

        System.out.println("\nInformación del Editor:");
        editor.mostrarInformacion();
    }
}