package eccepciones;

public class OperacionExcepcion extends RuntimeException{
    public OperacionExcepcion(String mensaje){
        super(mensaje);
    }
}
