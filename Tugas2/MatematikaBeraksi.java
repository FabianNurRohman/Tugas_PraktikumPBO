package Tugas2;

public class MatematikaBeraksi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Matematika MTK = new Matematika();
		int Pertambahan = MTK.pertambahan(20, 10);
		int Pengurangan = MTK.pengurangan(10, 5);
		int Perkalian = MTK.perkalian(10, 3);
		double Pembagian = MTK.pembagian(21, 2);
		
		System.out.println("Pertambahan: 20 + 10 = "+Pertambahan);
		System.out.println("Pengurangan: 20 - 5 = "+Pengurangan);
		System.out.println("Perkalian: 10 x 3 = "+Perkalian);
		System.out.println("Pembagian: 21 / 2 = "+Pembagian);
	}

}
