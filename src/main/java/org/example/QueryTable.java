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

   public List<List<List<String>>> query() {
        return
                asList( //Table level
                        asList(//Row level
                                asList("company ID", "AD1"),//Cell column name, value
                                asList("employee ID", "308251"),
                                asList("first name", "Jane"),
                                asList("last name", "Doe"),
                                asList("hire date", "17-Oct-2022"),
                                asList("department", "Research")
                        ),
                        asList(//Row level
                                asList("company ID", "AD1"),//Cell column name, value
                                asList("employee ID", "308252"),
                                asList("first name", "John"),
                                asList("last name", "Smith"),
                                asList("hire date", "19-Sep-2022"),
                                asList("department", "Quality Analyst")
                        )
                );
    }
}

