package day030_1104;

public class MainApp {
    public static void main(String[] args) {

        Araba araba1=new Araba();
        Araba araba2;                  // Stackte bir adres tanımlandı ama içerisi null.                                    * Referans tiplerde değer HEAP'te tutulur.
        araba2=new Araba();            // Heap'te nesne create edildi ve baslangıc adresi stack'e yazıldı.(Stacak'te referans tutulur değer tutulmaz.) * Değer HEAP'te tutulur.

        araba1.setModelYili(2017);
        System.out.println("Model Yılı : "+araba1.getModelYili());

        System.out.println();


        Personel p1=new Personel();
        p1.setAdi("Alkan");
        p1.setSoyadi("Tuncer");
        p1.setYasi(29);
        p1.setMaasi(15300);

        System.out.println("Personelin Adı-Soyadı : "+p1.getAdi()+" "+p1.getSoyadi());
        System.out.println("Personelin Yaşı : "+p1.getYasi());
        System.out.println("Personelin Maaşı : "+p1.getMaasi());
        p1.calis();
        p1.evrakImzala();

        Personel p2=new Personel();
        p2.setAdi("Dante");
        p2.setSoyadi("Jugking");
        p2.setYasi(53);
        p2.setMaasi(5300);

        p2.bilgileriGoster();

        System.out.println();

        // KARE NESNESİ
        Square kare1=new Square();

        kare1.setSideLength(5);

        System.out.println("Alan = "+kare1.countArea());
        System.out.println("Çevre = "+kare1.countPerimeter());

        kare1.showInfos();
    }
}
