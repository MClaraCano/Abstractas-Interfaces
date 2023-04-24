package Interfaces;

public class Mensaje {

    private String saludoBienvenida;

    private String saludoDespedida;

    public String getSaludoBienvenida() {
        return "Hola! Cómo estás ";
    }

    public void setSaludoBienvenida(String saludoBienvenida) {
        this.saludoBienvenida = saludoBienvenida;
    }

    public String getSaludoDespedida() {
        return "Adiós! ";
    }

    public void setSaludoDespedida(String saludoDespedida) {
        this.saludoDespedida = saludoDespedida;
    }
}
