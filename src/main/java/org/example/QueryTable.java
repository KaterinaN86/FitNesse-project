package org.example;

import java.util.Date;
import java.util.List;

import static java.util.Arrays.asList;

public class QueryTable {

    public QueryTable(Date date) {

    }
public void table(List<List<List<String>>> table){

}
    public static void main(String[] args) {

    }
//Method that returns a list with data for each query table row.
   public List<List<List<String>>> query() {
        return
                asList( //Table level
                        asList(//Row level
                                asList("company ID", "AD1"),//Cell column company ID, value
                                asList("employee ID", "308251"),//Cell column employee ID, value
                                asList("first name", "Jane"),//Cell column first name, value
                                asList("last name", "Doe"),//Cell column last name, value
                                asList("hire date", "17-Oct-2022"),//Cell column hire date, value
                                asList("department", "Research")////Cell column department, value
                        ),
                        asList(//Row level
                                asList("company ID", "AD1"),//Cell company ID, value
                                asList("employee ID", "308252"),
                                asList("first name", "John"),
                                asList("last name", "Smith"),
                                asList("hire date", "19-Sep-2022"),
                                asList("department", "Quality Analyst")
                        )
                );
    }
}

