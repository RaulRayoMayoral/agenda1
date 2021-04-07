package com.company;

public class Eliminar {
    void mostrar(){
        Titulo titulo = new Titulo();

        System.out.println("Eliminar contactos");
        System.out.println("¿A quien quieres eliminar?");
        String contacto =  Main.scanner.nextLine();

        for (Comtacto comtacto : Main.guardarcontactos.comtactos) {
            if (contacto.equals(comtacto.apellido)){
                comtacto.nombre=null;
                comtacto.apellido= null;
                comtacto.segapellido= null;
                comtacto.edad= null;
            Mensaje mensaje = new Mensaje();
            mensaje.mostra("Contacto eliminado correctamente");
            }
        }
    }

}
