package org.example.libraryTable;

public class LibraryTableMyFixture {
    String value = "Success";

    public LibraryTableMyFixture() {

    }
    public String doBusinessLogicHere(){
        return value;
    }

    public static void main(String[] args) {
        PrintScript printScript = new PrintScript();
        System.out.println(printScript.print());
    }
}
