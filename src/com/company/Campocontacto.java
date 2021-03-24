package com.company;

public class Campocontacto {
    String pedir(String prompt) {
        return pedir(prompt, false);
    }

    String pedir(String prompt, boolean obligatiorio){
        System.out.println( prompt );

        if(!obligatiorio){
            return Main.scanner.nextLine();
        } else {

            while(true){
                String texto = Main.scanner.nextLine();
                if(!texto.isEmpty()){
                    return texto;
                } else {
                    mensaje mensaje =new mensaje();
                    mensaje.mostrarError("Introduzca el nombre");
                }

            }
        }
    }
}
