package com.hazerta.richardson.exception;

public class NoEncontradoException extends RuntimeException{

    public NoEncontradoException(){
         super("recurso no encontrado");
    }
}
