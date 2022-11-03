package Exceptions;

import Models.Symbol;

public class DuplicateSymbolException extends RuntimeException{

    public DuplicateSymbolException(Character character){
        System.out.println("Symbol "+character+ " is repeated twice !");
    }
}
