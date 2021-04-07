package com.company;

public class Crear {
void mostrar(String nota){
    Titulo titulo = new Titulo();
    titulo.mostrar("Crear contacto");

    comtacto comtacto = new comtacto();
    Campocontacto campoDeTexto = new Campocontacto();

    comtacto.nombre = campoDeTexto.pedir("Nombre de la persona", true);
    comtacto.apellido = campoDeTexto.pedir("Apellido de la persona");
    comtacto.segapellido = campoDeTexto.pedir("Segundo apellido de la persona");
    comtacto.edad = campoDeTexto.pedir("Dime la edad de la persona");
    Main.guardarcontactos.comtactos.add(comtacto);

    }
}
