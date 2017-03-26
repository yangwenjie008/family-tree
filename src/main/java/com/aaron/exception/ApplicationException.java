package com.aaron.exception;

/**
 * @author Created by yangwj5 on 2017/3/26 at 16:53.
 */
public class ApplicationException extends Exception{

    public ApplicationException(String message) {
        super(message);
    }

    public ApplicationException(String message, Throwable cause) {
        super(message, cause);
    }
}
