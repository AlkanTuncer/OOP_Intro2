package day034_OOPMiniTekrar1504;

public class Sekil3B {

    private double derinlik;
    private double yukseklik;
    private double genislik;

    public Sekil3B(double derinlik, double yukseklik, double genislik) {
        this.derinlik = derinlik;
        this.yukseklik = yukseklik;
        this.genislik = genislik;
    }

    public Sekil3B() {
    }

    public double getDerinlik() {
        return derinlik;
    }
    public void setDerinlik(double derinlik) {
        this.derinlik = derinlik;
    }

    public double getYukseklik() {
        return yukseklik;
    }
    public void setYukseklik(double yukseklik) {
        this.yukseklik = yukseklik;
    }

    public double getGenislik() {
        return genislik;
    }
    public void setGenislik(double genislik) {
        this.genislik = genislik;
    }


    @Override
    public String toString() {
        return String.format("(%5.2f x %5.2f x %5.2f )",derinlik,yukseklik,genislik);
    }
}
