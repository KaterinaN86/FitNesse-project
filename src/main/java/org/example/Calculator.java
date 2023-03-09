package org.example;

public class Calculator {
    public Double arg1;
    public Double arg2;
    public Double result;

    public Calculator() {
    }

    public Double addition(Double arg1, Double arg2){
        result= arg1+arg2;
        return result;
    }
    public Double subtraction(Double arg1, Double arg2){
        result= arg1-arg2;
        return result;
    }
    public Double multiplication(Double arg1, Double arg2){
        result= arg1*arg2;
        return result;
    }
    public Double division(Double arg1, Double arg2){
        result= arg1/arg2;
        return result;
    }
}
