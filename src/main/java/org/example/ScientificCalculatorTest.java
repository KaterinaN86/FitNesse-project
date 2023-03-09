package org.example;

public class ScientificCalculatorTest {

    String firstArgument;

    public void setFirstArgument(String firstArgument) {
        this.firstArgument = firstArgument;
    }

    public String sineTest(){
        TrigonometricFunction calculator=new TrigonometricFunction();
        Double result = calculator.sine(Double.parseDouble(firstArgument));
        return String.valueOf(result);
    }
    public String cosineTest(){
        TrigonometricFunction calculator=new TrigonometricFunction();
        Double result = calculator.cosine(Double.parseDouble(firstArgument));
        return String.valueOf(result);
    }
    public String tangentTest(){
        TrigonometricFunction calculator=new TrigonometricFunction();
        Double result = calculator.tangent(Double.parseDouble(firstArgument));
        return String.valueOf(result);
    }
    public String logarithm10Test(){
        LogarithmicFunction calculator=new LogarithmicFunction();
        Double result = calculator.logarithm10(Double.parseDouble(firstArgument));
        return String.valueOf(result);
    }
    public String logarithmTest(){
        LogarithmicFunction calculator=new LogarithmicFunction();
        Double result = calculator.logarithmexp(Double.parseDouble(firstArgument));
        return String.valueOf(result);
    }
}
