package com.Employee.EmployeeSystem.Error;

public class EmployeeFoundException extends Exception{
    public EmployeeFoundException() {
        super();
    }

    public EmployeeFoundException(String message) {
        super(message);
    }

    public EmployeeFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public EmployeeFoundException(Throwable cause) {
        super(cause);
    }

    protected EmployeeFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
