package Interfaces;

public class Celular implements IComunicar {

    private String numero;
    private String modelo;

    public Celular(String numero, String modelo) {
        this.numero = numero;
        this.modelo = modelo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public void recibirMensaje(Mensaje msj, Persona emisor) {
        System.out.println("Mensaje recibido por " + emisor.getNombre() + ": " + msj.getSaludoBienvenida());
    }

    @Override
    public void enviarMensaje(Mensaje msj, Persona destinatario) {

    }
}
