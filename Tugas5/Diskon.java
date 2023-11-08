package Tugas5;
import java.util.Scanner;
public class Diskon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Total Pembelian: ");
		int totpem = input.nextInt();
		int diskon, jumlah;
		if(totpem>=50000) {
			diskon=totpem*20/100;
			System.out.println("Besarnya Potongan: "+diskon);
		}else {
			diskon=totpem*5/100;
			System.out.println("Besarnya Potongan: "+diskon);
		}
		jumlah=totpem-diskon;
		System.out.println("Jumlah Yang harus dibayar: "+jumlah);
	}

}
