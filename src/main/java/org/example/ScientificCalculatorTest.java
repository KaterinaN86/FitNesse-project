package org.example;

//Fixture class for TrigonometricFunction FitNesse test page
public class ScientificCalculatorTest {

    //Class variable
    String firstArgument;

    //Setter method
    public void setFirstArgument(String firstArgument) {
        this.firstArgument = firstArgument;
    }

    /**
     * Method that uses TrigonometricFunction object to calculate sine given firstArgument value as parameter.
     *
     * @return String result from function call, calculated as Double and converted to String for presentation in decision table.
     */
    public String sineTest() {
        TrigonometricFunction calculator = new TrigonometricFunction();
        Double result = calculator.sine(Double.parseDouble(firstArgument));
        return String.valueOf(result);
    }

    /**
     * Method that uses TrigonometricFunction object to calculate cosine given firstArgument value as parameter.
     *
     * @return String result from function call, calculated as Double and converted to String for presentation in decision table.
     */
    public String cosineTest() {
        TrigonometricFunction calculator = new TrigonometricFunction();
        Double result = calculator.cosine(Double.parseDouble(firstArgument));
        return String.valueOf(result);
    }

    /**
     * Method that uses TrigonometricFunction object to calculate tangent given firstArgument value as parameter.
     *
     * @return String result from function call, calculated as Double and converted to String for presentation in decision table.
     */
    public String tangentTest() {
        TrigonometricFunction calculator = new TrigonometricFunction();
        Double result = calculator.tangent(Double.parseDouble(firstArgument));
        return String.valueOf(result);
    }

    /**
     * Method that uses LogarithmicFunction object to calculate logarithm10 given firstArgument value as parameter.
     *
     * @return String result from function call, calculated as Double and converted to String for presentation in decision table.
     */
    public String logarithm10Test() {
        LogarithmicFunction calculator = new LogarithmicFunction();
        Double result = calculator.logarithm10(Double.parseDouble(firstArgument));
        return String.valueOf(result);
    }

    /**
     * Method that uses LogarithmicFunction object to calculate logarithm given firstArgument value as parameter.
     *
     * @return String result from function call, calculated as Double and converted to String for presentation in decision table.
     */
    public String logarithmTest() {
        LogarithmicFunction calculator = new LogarithmicFunction();
        Double result = calculator.logarithmexp(Double.parseDouble(firstArgument));
        return String.valueOf(result);
    }
}
