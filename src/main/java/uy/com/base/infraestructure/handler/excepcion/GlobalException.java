package uy.com.base.infraestructure.handler.excepcion;


import uy.com.base.infraestructure.handler.response.ExceptionDetails;

public class GlobalException extends Exception {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    private final ExceptionDetails exceptionDetails;

    public GlobalException(ExceptionDetails exceptionDetails) {
        super(exceptionDetails.getCause());
        this.exceptionDetails = exceptionDetails;
    }

  
    public ExceptionDetails getExceptionDetails() {
        return exceptionDetails;
    }

    @Override
    public String getMessage() {
        return exceptionDetails.getCause();
    }
}
