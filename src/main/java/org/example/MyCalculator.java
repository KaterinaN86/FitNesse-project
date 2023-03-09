package org.example;

import java.util.List;

public class MyCalculator {
    private double value1;
    private double value2;
    private String operator;

    private String words;

    public MyCalculator() {
    }

    public double getValue1()
    {
        return value1;
    }

    public void setValue1(double value1)
    {
        this.value1 = value1;
    }

    public void setWords(String words) {
        this.words = words;
    }

    public double getValue2()
    {
        return value2;
    }

    public void setValue2(double value2)
    {
        this.value2 = value2;
    }

    public String getOperator()
    {
        return operator;
    }

    public void setOperator(String operator)
    {
        this.operator = operator;
    }

    public double calculate()
    {
        double calculate;

        if(operator.equals("+"))
        {
            calculate = value1 + value2;
        }
        else if(operator.equals("-"))
        {
            calculate = value1 - value2;
        }
        else if(operator.equals("*"))
        {
            calculate = value1 * value2;
        }
        else
        {
            calculate = value1 / value2;
        }

        return calculate;
    }

    public String listWords(){
       String result = "";
       List<String>  wordsList = List.of(words.split(","));
       for (String word: wordsList){
           result+=word+ ":";
       }
        return  result;
    }

    public static void main(String[] args)
    {
        MyCalculator cp = new MyCalculator();
        cp.setValue1(3.0);
        cp.setOperator("+");
        cp.setValue2(5.0);
cp.setWords("Mouse,Cat");
        System.out.println(cp.calculate());
        System.out.println(cp.listWords());
    }
}
