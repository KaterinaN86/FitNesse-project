package org.example.libraryTable;

//Class used to demonstrate usage of Library Table.
public class LibraryTableMyFixture {
    //Class variable.
    String value = "Success";

    //Constructor.
    public LibraryTableMyFixture() {

    }

    public static void main(String[] args) {
        PrintScript printScript = new PrintScript();
        System.out.println(printScript.print());
    }

    /**
     * Simply returns value of class variable.
     * @return String.
     */
    public String doBusinessLogicHere() {
        return value;
    }
}
