package pl.alx.szkolenie.kalkulator;

class LogikaKalkulatora {

    static double oblicz(String operacja, double arg1, double arg2) {
        switch(operacja){
            case "+" : return arg1 + arg2;
            case "-" : return arg1 - arg2;
            case "*" : return arg1 * arg2;
            case "/" : return arg1 / arg2;
            default  : throw new IllegalArgumentException("Nieopsługiwana operacja: " + operacja);
        }
    }
}
