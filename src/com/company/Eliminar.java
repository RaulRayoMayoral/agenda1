package com.company;

public class Eliminar {
    void mostrar(){
        Titulo titulo = new Titulo();

        System.out.println("Eliminar contactos");
        System.out.println("Dime el primer apellido de la persona por favor");
        String contacto =  Main.scanner.nextLine();

        for (Comtacto comtacto : Main.guardarcontactos.comtactos) {
            if (contacto.equals(comtacto.apellido)){
                comtacto.nombre=" ";
                comtacto.apellido= " ";
                comtacto.segapellido= " ";
                comtacto.edad= " ";
                comtacto.ciudad= " ";
                Mensaje mensaje = new Mensaje();
                mensaje.mostra("Contacto eliminado correctamente");
            }else if (!contacto.equals(comtacto.apellido)){
                Mensaje mensaje = new Mensaje();
                mensaje.mostra("No se ha encontrado el contacto");
            }
        }
    }

}