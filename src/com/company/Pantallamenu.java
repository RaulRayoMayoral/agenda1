package com.company;

public class Pantallamenu {
    boolean mostrar() {
        Titulo titulo = new Titulo();
        titulo.mostrar("Agenda de contactos ");

        Menu menu = new Menu();
        String[] opciones = {"Crear", "Contactos", "Eliminar"};
        String opcion = menu.elegirOpcion(opciones);

        if ("1".equals(opcion)) {
            Crear pantallaCrear = new Crear();
            pantallaCrear.mostrar("Crear contacto");
        } else if("2".equals(opcion)){
            Contactos pantallaListar = new Contactos();
            pantallaListar.mostrar();
        } else if("3".equals(opcion)){
            Eliminar pantallaeliminar = new Eliminar();
            pantallaeliminar.mostrar();
            return false;
        }
        return true;
    }

    }
//
