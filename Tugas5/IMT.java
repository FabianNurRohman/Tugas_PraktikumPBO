package Tugas5;
import java.util.Scanner;
public class IMT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double BB, TB, IMT;
		String ket;
		System.out.println("_________________________________ ");
		System.out.println("_NILAI IMT____|_KRITERIA_________|");
        System.out.println("   <18.5      |Berat Badan Kurang|");
        System.out.println(" 18.5-24.9    |Berat Badan Ideal |");
        System.out.println("  25-29.9     |Berat Badan Lebih |");
        System.out.println("  30-39.9     |       Gemuk      |");
        System.out.println("   >=40       |   Sangat Gemuk   |");
        System.out.println("______________|__________________|");
        
        System.out.print("\nMasukkan Berat Badan (kg): ");
        BB = input.nextDouble();
        System.out.print("Masukkan Tinggi Badan (m): ");
        TB = input.nextDouble();
        
        IMT = BB / (TB * TB);
        
        if (IMT < 18.5) {
            ket = "Berat Badan Kurang";
        } else if (IMT < 25) {
            ket = "Berat Badan Ideal";
        } else if (IMT < 30) {
            ket = "Berat Badan Lebih";
        } else if (IMT < 40) {
            ket = "Gemuk";
        } else {
            ket = "Sangat Gemuk";
        }
        
        System.out.println("\nIMT Anda adalah          : " + IMT);
        System.out.println("Kriteria                 : " + ket);
	}

}
