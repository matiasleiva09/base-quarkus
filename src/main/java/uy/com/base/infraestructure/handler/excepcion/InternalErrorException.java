package uy.com.base.infraestructure.handler.excepcion;

public class InternalErrorException extends RuntimeException{
    public InternalErrorException(String message){
        super(message);
    }
}
