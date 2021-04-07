package com.company;

public class Contactos {
    void mostrar() {
        Titulo titulo = new Titulo();
        System.out.println("Lista de contactos");
        for (comtacto comtacto : Main.guardarcontactos.comtactos ) {
            System.out.println("Nombre:"+" "+comtacto.nombre);
            System.out.println("Apellido:"+" "+comtacto.apellido);

        }
    }
}
