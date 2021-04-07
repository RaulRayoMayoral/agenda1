package com.company;

public class Eliminar {
    void mostrar(){
        Titulo titulo = new Titulo();
        System.out.println("Eliminar contactos");
        System.out.println("¿A quien quieres eliminar?");
        String contacto =  Main.scanner.nextLine();

        for (comtacto comtacto : Main.guardarcontactos.comtactos) {
            if (contacto.equals(comtacto.apellido)){

            }
        }
    }

}
