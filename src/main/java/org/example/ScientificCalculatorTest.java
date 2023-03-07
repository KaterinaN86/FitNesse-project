package org.example;

public class CalculatorTest {

    String firstArgument;
    String secondArgument;

    public void setFirstArgument(String firstArgument) {
        this.firstArgument = firstArgument;
    }

    public void setSecondArgument(String secondArgument) {
        this.secondArgument = secondArgument;
    }

    public String additionTest(){
        Calculator calculator=new Calculator();
        Double result = calculator.addition(Double.parseDouble(firstArgument), Double.parseDouble(secondArgument));
        return String.valueOf(result);
    }
    public String subtractionTest(){
        Calculator calculator=new Calculator();
        Double result = calculator.subtraction(Double.parseDouble(firstArgument), Double.parseDouble(secondArgument));
        return String.valueOf(result);
    }
    public String multiplicationTest(){
        Calculator calculator=new Calculator();
        Double result = calculator.multiplication(Double.parseDouble(firstArgument), Double.parseDouble(secondArgument));
        return String.valueOf(result);
    }
    public String divisionTest(){
        Calculator calculator=new Calculator();
        Double result = calculator.division(Double.parseDouble(firstArgument), Double.parseDouble(secondArgument));
        return String.valueOf(result);
    }
}
