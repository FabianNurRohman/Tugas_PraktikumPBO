package Tugas3;

public class KonversiSuhu2 extends KonversiSuhu {
    public double FahrenheitToReamur(double Fahrenheit) {
        double Celsius = (Fahrenheit - 32) * 5/9;
        return Celsius * 4/5;
    }
}
