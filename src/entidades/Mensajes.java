package entidades;

public enum Mensajes {
    MENSAJE_PETICION_HORAS("ingrese la horas trabajadas."),
    MENSAJE_PETICION_VALOR_HORA ("ingrese el valor de la hora trabajada."),
    MENSAJE_SALARIO_PAGAR("El salario apagar  es");

    //atributo

    private String mensaje;

    Mensajes(String s) {
        this.mensaje = s ;
    }

    public String getMensajes() {
        return mensaje;
    }
}
