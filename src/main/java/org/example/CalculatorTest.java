package org.example;

//Fixture class for CalculatorSystems FitNesse test page
public class CalculatorTest {

    //Class variables.
    String firstArgument;
    String secondArgument;

    //Setters
    public void setFirstArgument(String firstArgument) {
        this.firstArgument = firstArgument;
    }

    public void setSecondArgument(String secondArgument) {
        this.secondArgument = secondArgument;
    }

    /**
     * Method that performs simple addition by using Calculator object.
     * @return String result from operation, calculated as Double and converted to String for presentation in decision table.
     */
    public String additionTest(){
        Calculator calculator=new Calculator();
        Double result = calculator.addition(Double.parseDouble(firstArgument), Double.parseDouble(secondArgument));
        return String.valueOf(result);
    }
    /**
     * Method that performs simple subtraction by using Calculator object.
     * @return String result from operation, calculated as Double and converted to String for presentation in decision table.
     */
    public String subtractionTest(){
        Calculator calculator=new Calculator();
        Double result = calculator.subtraction(Double.parseDouble(firstArgument), Double.parseDouble(secondArgument));
        return String.valueOf(result);
    }
    /**
     * Method that performs simple multiplication by using Calculator object.
     * @return String result from operation, calculated as Double and converted to String for presentation in decision table.
     */
    public String multiplicationTest(){
        Calculator calculator=new Calculator();
        Double result = calculator.multiplication(Double.parseDouble(firstArgument), Double.parseDouble(secondArgument));
        return String.valueOf(result);
    }
    /**
     * Method that performs simple division by using Calculator object.
     * @return String result from operation, calculated as Double and converted to String for presentation in decision table.
     */
    public String divisionTest(){
        Calculator calculator=new Calculator();
        Double result = calculator.division(Double.parseDouble(firstArgument), Double.parseDouble(secondArgument));
        return String.valueOf(result);
    }
}
