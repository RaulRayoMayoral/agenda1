package com.company;

public class Crear {
void mostrar(String nota){
    Titulo titulo = new Titulo();
    titulo.mostrar("Crear contacto");

    comtacto comtacto = new comtacto();
    Campocontacto campoDeTexto = new Campocontacto();

    comtacto.nombre = campoDeTexto.pedir("Nombre de la persona", true);
    comtacto.apellido = campoDeTexto.pedir("Apellido de la persona");

    Main.guardarcontactos.comtactos.add(comtacto);

    }
}
