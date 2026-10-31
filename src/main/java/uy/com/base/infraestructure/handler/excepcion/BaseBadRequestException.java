package uy.com.base.infraestructure.handler.excepcion;

public class BaseBadRequestException extends RuntimeException{
    public BaseBadRequestException(String message){
        super(message);
    }
}
