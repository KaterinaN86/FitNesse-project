package org.example;

/**
 * Class used as fixture for acceptance tests on page MyCalculator
 */
public class MyCalculator {

    //Class variables.
    private double value1;
    private double value2;
    private String operator;

    private String words;

    //Constructor.
    public MyCalculator() {
    }

    public static void main(String[] args) {

    }
    //Getters and setters
    public double getValue1() {
        return value1;
    }

    public void setValue1(double value1) {
        this.value1 = value1;
    }

    public void setWords(String words) {
        this.words = words;
    }

    public double getValue2() {
        return value2;
    }

    public void setValue2(double value2) {
        this.value2 = value2;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    /**
     * Performs simple calculation based on the set operator, using set operands.
     *
     * @return double result value from performed operation.
     */
    public double calculate() {
        double calculate;

        if (operator.equals("+")) {
            calculate = value1 + value2;
        } else if (operator.equals("-")) {
            calculate = value1 - value2;
        } else if (operator.equals("*")) {
            calculate = value1 * value2;
        } else {
            calculate = value1 / value2;
        }

        return calculate;
    }

    /**
     * Transforms class variable words by replacing comma separator with space.
     *
     * @return String modified words variable.
     */
    public String listWords() {
        String result = words.replace(',', ' ');
        return result;
    }
}
