package com.company.exceptions;

public class NoGroupException extends Exception {
    public String toString() {
        return "There are no groups in faculty";
    }
}
