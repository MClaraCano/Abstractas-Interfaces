package Interfaces;

public class Main {
    public static void main(String[] args) {
        Persona perso = new Persona("Clara", "34092760", 34);
        Mensaje msj = new Mensaje();
        Celular celu = new Celular("45621", "Motorola");

        perso.recibirMensaje(msj, perso);

        celu.recibirMensaje(msj, perso);
    }
}
