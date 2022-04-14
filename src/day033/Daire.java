package day033;

public class Daire extends Sekil{

    private double yariCap;

    public Daire(double yariCap) {
        this.yariCap = yariCap;
    }

    public Daire() {
    }

    public double getYariCap() {
        return yariCap;
    }
    public void setYariCap(double yariCap) {
        this.yariCap = yariCap;
    }

    @Override
    double alanHesapla() {
        return Math.PI* Math.pow(yariCap,2);
    }

    @Override
    double cevreHesapla() {
        return 2*Math.PI*yariCap;
    }

    @Override
    void ciz() {
        System.out.println("Daire çizildi.");
    }

    @Override
    public String toString() {
        return String.format("Yarıçap : %5.2f\tÇevre : %5.2f\tAlan : %5.2f",yariCap,cevreHesapla(),alanHesapla());
    }
}
