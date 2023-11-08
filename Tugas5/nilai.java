package Tugas5;
import java.util.Scanner;
public class nilai {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String npm, nama, grade = null, ket = null;
		int nKehadiran, nTugas, nUTS, nUAS;
		double nAkhir, nRata2;
		Scanner input = new Scanner(System.in);
		System.out.print("NPM: ");
		npm = input.nextLine();
		System.out.print("Nama Mahasiswa: ");
		nama = input.nextLine();
		System.out.print("Nilai Kehadiran: ");
		nKehadiran = input.nextInt();
		System.out.print("Nilai Tugas: ");
		nTugas = input.nextInt();
		System.out.print("Nilai UTS: ");
		nUTS = input.nextInt();
		System.out.print("Nilai UAS: ");
		nUAS = input.nextInt();
		
		nRata2 = (nKehadiran + nTugas + nUTS + nUAS) / 4;
		nAkhir = (0.1*nKehadiran) + (0.2*nTugas) + (0.3*nUTS) + (0.4*nUAS);
		if(nAkhir <= 45) {
			grade = "E";
			ket = "KURANG SEKALI";
		} else if(nAkhir <= 55) {
			grade = "D";
			ket = "KURANG";
		} else if(nAkhir <= 65) {
			grade = "C";
			ket = "CUKUP";
		} else if(nAkhir <= 75) {
			grade = "B";
			ket = "BAIK";
		} else if(nAkhir <= 100) {
			grade = "A";
			ket = "ISTIMEWA";
		}
		
		System.out.println();
		System.out.println("NPM Mahasiswa    : " + npm);
        System.out.println("Nama Mahasiswa   : " + nama);
        System.out.println("Nilai Rata-Rata  : " + nRata2);
        System.out.println("Grade            : " + grade);
        System.out.println("Keterangan       : " + ket);
        System.out.println("Nilai Akhir      : " + nAkhir);
	}

}