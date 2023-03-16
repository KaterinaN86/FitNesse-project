package org.example.libraryTable;

//Class imported in FitNesse page by using library table.
public class PrintScript {
    //Class variable with initial value.
    String value = "Hello Fitnesse.";

    //constructor.
    public PrintScript() {

    }

    public static void main(String[] args) {

    }

    /**
     * Returns value of class variable.
     *
     * @return String
     */
    public String print() {
        return value;
    }
}
