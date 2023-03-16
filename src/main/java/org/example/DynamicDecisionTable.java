package org.example;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

//Class used to demonstrate performing acceptance test using Dynamic Decision Table
public class DynamicDecisionTable {
    //Class variable used to store coin description and coin value pairs.
    private static Map<String, Integer> COIN_EVAL = new HashMap<String, Integer>();

    //Setting map values for each pair.
    static {
        COIN_EVAL.put("1cent", 1);
        COIN_EVAL.put("2cent", 2);
        COIN_EVAL.put("5cent", 5);
        COIN_EVAL.put("10cent", 10);
        COIN_EVAL.put("20cent", 20);
        COIN_EVAL.put("50cent", 50);
        COIN_EVAL.put("1eur", 100);
        COIN_EVAL.put("2eur", 200);
    }

    //Class variable used to store total value calculated in cents.
    private Integer totalCents = 0;

    //Main class method used to define expected output values used in decision table.
    public static void main(String[] args) {
        DynamicDecisionTable dt = new DynamicDecisionTable();
        dt.set("20cent", 3);
        System.out.println(dt.get("total"));
        dt.reset();
        dt.set("1cent", 5);
        dt.set("2cent", 3);
        dt.set("5cent", 6);
        System.out.println(dt.get("total"));
        System.out.println(dt.get("Eur. total"));
        dt.reset();
        dt.set("1cent", 37);
        dt.set("2cent", 1);
        dt.set("5cent", 1);
        dt.set("20cent", 2);
        dt.set("1eur", 23);
        System.out.println(dt.get("total"));
        System.out.println(dt.get("Eur. total"));
        dt.reset();
        dt.set("1cent", 2384);
        dt.set("1eur", 10);
        System.out.println(dt.get("total"));
        System.out.println(dt.get("Eur. total"));
    }

    /**
     * Method used to reset totalCents value.
     */
    public void reset() {
        this.totalCents = 0;
    }

    //Setting the total value of coins.
    public void set(String coin, Integer amount) {
        //If coin parameter has unexpected value IllegalArgumentException is thrown.
        if (!COIN_EVAL.containsKey(coin)) {
            throw new IllegalArgumentException("Unknown coin type" + coin);
        }
        //calculating totalCents value using matching value for given key (coin).
        totalCents += amount * COIN_EVAL.get(coin);
    }

    //Getting the value of coins to total Euros.
    public String get(String requestedValue) {
        if ("Eur. total".equals(requestedValue)) {
            return String.format(Locale.US, "%2f", totalCents / 100.0);
        }
        return String.format("%d", totalCents);
    }
}
