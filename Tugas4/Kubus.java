package Tugas4;

public class Kubus extends SupPerhitungan {
	 private double s;

	    public Kubus(double s) {
	        this.s = s;
	    }

	    public double VolumeNya() {
	        return s*s*s;
	    }

	    public double LuasPermukaanNya() {
	        return 6 * s * s;
	    }
}
