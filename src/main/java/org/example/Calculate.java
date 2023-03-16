package org.example;

//Helper class used to calculate expected results for decision tables on ScientificCalculator FitNesse page.
public class Calculate {
    public static void main(String[] args) {

        CalculatorTest ct = new CalculatorTest();
        //Setting values of first and second argument using CalculatorTest object setters.
        ct.setFirstArgument(String.valueOf(9.0));
        ct.setSecondArgument(String.valueOf(2.0));
        System.out.println("Addition test.");
        System.out.println(ct.additionTest());
        //Setting first argument value using ScientificCalculatorTest object.
        ScientificCalculatorTest scientificCalculatorTest = new ScientificCalculatorTest();
        scientificCalculatorTest.setFirstArgument("10");
        System.out.println("Calculating sine and cosine.");
        System.out.print("First operand: " + scientificCalculatorTest.sineTest() + " " + scientificCalculatorTest.cosineTest() + ", " + scientificCalculatorTest.tangentTest() + "\n");
        System.out.println("Calculating logarithm10 and logarithm.");
        System.out.print("First operand: " + scientificCalculatorTest.logarithm10Test() + " " + scientificCalculatorTest.logarithmTest() + "\n");
        System.out.println("Changing value of argument.");
        scientificCalculatorTest.setFirstArgument("2");
        System.out.println("Calculating sine and cosine for value 2.");
        System.out.print("Second operand: " + scientificCalculatorTest.sineTest() + " " + scientificCalculatorTest.cosineTest() + ", " + scientificCalculatorTest.tangentTest() + "\n");
        System.out.println("Calculating logarithm10 and logarithm.");
        System.out.print("Second operand: " + scientificCalculatorTest.logarithm10Test() + " " + scientificCalculatorTest.logarithmTest() + "\n");
        System.out.println("Changing value of argument.");
        scientificCalculatorTest.setFirstArgument("-10");
        System.out.println("Calculating sine and cosine for value -10.");
        System.out.print("Third operand: " + scientificCalculatorTest.sineTest() + " " + scientificCalculatorTest.cosineTest() + ", " + scientificCalculatorTest.tangentTest() + "\n");
        System.out.println("Changing value of argument.");
        scientificCalculatorTest.setFirstArgument("-20");
        System.out.println("Calculating sine and cosine for value -20.");
        System.out.print("Third operand: " + scientificCalculatorTest.sineTest() + " " + scientificCalculatorTest.cosineTest() + ", " + scientificCalculatorTest.tangentTest() + "\n");
    }
}
