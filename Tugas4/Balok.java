package Tugas4;

public class Balok extends SupPerhitungan {
	private double p, l, t;

    public Balok(double p, double l, double t) {
        this.p = p;
        this.l = l;
        this.t = t;
    }

    public double VolumeNya() {
        return p * l * t;
    }

    public double LuasPermukaanNya() {
        return 2 * (p * l + p * t + l * t);
    }
}
