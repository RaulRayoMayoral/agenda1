package com.company;

public class Contactos {
    void mostrar() {
        Titulo titulo = new Titulo();
        titulo.mostrar("Lista de contactos");
        for (Comtacto comtacto : Main.guardarcontactos.comtactos ) {
            System.out.println("-------------------------");
            System.out.println("Nombre:"+" "+comtacto.nombre);
            System.out.println("Apellido:"+" "+comtacto.apellido);
            System.out.println("Segundo apellido:"+" "+comtacto.segapellido);
            System.out.println("Edad:"+" "+ comtacto.edad);
            System.out.println("Ciudad:"+" "+comtacto.ciudad);
            System.out.println("-------------------------");
        }
    }
}
