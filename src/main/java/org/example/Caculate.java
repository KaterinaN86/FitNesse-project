package org.example;

public class Caculate {
    public static void main(String[] args) {
        TestMath math = new TestMath();
        math.setFirstNum(9);
        math.setSecondNum(8);
        System.out.println(math.add());
        CalculatorTest ct = new CalculatorTest();
        ct.setFirstArgument(String.valueOf(9.0));
        ct.setSecondArgument(String.valueOf(2.0));
        System.out.println(ct.additionTest());
        ScientificCalculatorTest scientificCalculatorTest = new ScientificCalculatorTest();
        scientificCalculatorTest.setFirstArgument("10");
        System.out.print("First operand: " + scientificCalculatorTest.sineTest() + " " + scientificCalculatorTest.cosineTest() + ", " + scientificCalculatorTest.tangentTest() + "\n");
        System.out.print("First operand: " + scientificCalculatorTest.logarithm10Test() + " " + scientificCalculatorTest.logarithmTest()  + "\n");
        scientificCalculatorTest.setFirstArgument("2");
        System.out.print("Second operand: " + scientificCalculatorTest.sineTest() + " " + scientificCalculatorTest.cosineTest() + ", " + scientificCalculatorTest.tangentTest() + "\n");
        System.out.print("Second operand: " + scientificCalculatorTest.logarithm10Test() + " " + scientificCalculatorTest.logarithmTest()  + "\n");
        scientificCalculatorTest.setFirstArgument("-10");
        System.out.print("Third operand: " + scientificCalculatorTest.sineTest() + " " + scientificCalculatorTest.cosineTest() + ", " + scientificCalculatorTest.tangentTest() + "\n");
        scientificCalculatorTest.setFirstArgument("-20");
        System.out.print("Third operand: " + scientificCalculatorTest.sineTest() + " " + scientificCalculatorTest.cosineTest() + ", " + scientificCalculatorTest.tangentTest() + "\n");
    }
}
