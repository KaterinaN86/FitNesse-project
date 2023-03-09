package org.example;

public class TrigonometricFunction {
    static Double result;
    Double arg1;

    public TrigonometricFunction() {
    }

    public Double sine(Double arg1) {
        result = Math.asin(Math.toRadians(arg1));
        return result;
    }
    public Double cosine(Double arg1) {
        result = Math.acos(Math.toRadians(arg1));
        return result;
    }
    public Double tangent(Double arg1) {
        result = Math.atan((Math.toRadians(arg1)));
        return result;
    }
}
