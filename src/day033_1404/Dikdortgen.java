package day033_1404;

public class Dikdortgen extends Sekil{

    private double yukseklik;
    private double genislik;

    public Dikdortgen(double yukseklik, double genislik) {
        this.yukseklik = yukseklik;
        this.genislik = genislik;
    }

    public Dikdortgen() {
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
    double alanHesapla() {
        return genislik * yukseklik;
    }

    @Override
    double cevreHesapla() {
        return 2*(genislik + yukseklik);
    }

    @Override
    void ciz() {
        for (int i = 0; i < yukseklik; i++) {
            for (int j = 0; j < genislik; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
    }

    public void bilgiGoster(){
        System.out.printf("Yükseklik : %5.2f\tGenişlik : %5.2f\tÇevre : %5.2f\tAlan : %5.2f\n", yukseklik, genislik,cevreHesapla(),alanHesapla());
    }



}
