package com.company.exceptions;

public class NoStudentException extends Exception{
    public String toString(){
        return "There are no students in group";
    }

}
