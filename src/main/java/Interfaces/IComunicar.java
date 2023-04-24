package Interfaces;

public interface IComunicar {
/*
    Contrato donde se especifican los COMPORTANMIENTOS
    que deben tener las clases

    Para DEFINIRLA, se debe comprender cuál o cuáles comportamientos
    serán compartidos por objetos de distinto tipo (distintas clases)

    Sólo métodos ABSTRACTOS: compuesto sólo por la firma (mod de acceso, tipo de dato, nombre).
    No se le da cuerpo ({})

    Permite HERENCIAS MULTIPLES
 */

    //2 funcionalidad en común las clases que implementes esta inferface

    void recibirMensaje(Mensaje msj, Persona emisor);

    void enviarMensaje(Mensaje msj, Persona destinatario);



}
