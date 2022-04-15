package day033_1404;

public abstract class Sekil {   // abstract sınıf - soyut sınıf

    public void bilgiGoster(){
        System.out.println("Geometrik şekil oluşturuldu.");
    }

    abstract double alanHesapla();       // hepsi yazılmadığı halde public'tir.
    abstract double cevreHesapla();
    abstract void ciz();

}
