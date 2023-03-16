package org.example;
//Helper class for performing logarithmic functions
public class LogarithmicFunction {
    static Double result;
    Double arg1;

    public LogarithmicFunction() {
    }

    public Double logarithm10(Double arg1) {
        result = Math.log10(arg1);
        return result;
    }
    public Double logarithmexp(Double arg1) {
        result = Math.log(arg1);
        return result;
    }
}
