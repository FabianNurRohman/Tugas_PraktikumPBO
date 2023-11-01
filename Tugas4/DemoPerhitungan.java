package Tugas4;

public class DemoPerhitungan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SupPerhitungan Kubus = new Kubus(7);
        System.out.println("Volume Kubus: "+Kubus.VolumeNya());
        System.out.println("Luas Permukaan Kubus: "+Kubus.LuasPermukaanNya());

        SupPerhitungan Balok = new Balok(6, 4, 3);
        System.out.println("\nVolume Balok: "+Balok.VolumeNya());
        System.out.println("Luas Permukaan Balok: "+Balok.LuasPermukaanNya());
	}

}
