package Tugas3;
import Tugas2.Matematika;
public class Matematika2 extends Matematika {
	Matematika mtk = new Matematika();
    public double Pembagian(int a, int b) {
        if (b == 0) {
            return Double.NaN;
        }
        return (double) a / b;
    }
    public int modulus(int a, int b) {
        return a % b;
    }
}
